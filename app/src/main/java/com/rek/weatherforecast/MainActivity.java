package com.rek.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView addIv,moreIv;
    LinearLayout pointLl;
    ViewPager mainVp;

    //ViewPager的数据源
    List<Fragment> fragmentList=new ArrayList<>();
    //要显示的城市的集合，后面改用数据库
    List<String> cityList=new ArrayList<>();
    //表示ViewPager的页数指示器的显示List（下方小点）
    List<ImageView> viewPagerPointList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addIv=findViewById(R.id.main_iv_add);
        moreIv=findViewById(R.id.main_iv_more);
        pointLl=findViewById(R.id.main_layout_point);
        mainVp=findViewById(R.id.main_vp);

        if(cityList.isEmpty()){
            cityList.add("北京");
        }
        initViewPager();
    }

    private void initViewPager() {
        for(String city:cityList){
            CityWeatherFragment cwFragment=CityWeatherFragment.newInstance(city);
            fragmentList.add(cwFragment);
        }
        CityWeatherFragmentPagerAdapter cwPagerAdapter=new CityWeatherFragmentPagerAdapter(getSupportFragmentManager(),
                fragmentList,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mainVp.setAdapter(cwPagerAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_iv_add:

                break;
            case R.id.main_iv_more:

                break;
            default:
                break;
        }
    }
}
package com.rek.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView addIv,moreIv;
    LinearLayout pointLinearLayout;
    ViewPager mainVp;

    //ViewPager的数据源
    List<Fragment> cityFragmentList =new ArrayList<>();
    //要显示的城市的集合，后面改用数据库
    List<String[]> cityList=new ArrayList<>();
    //表示ViewPager的页数指示器的显示List（下方小点）
    List<ImageView> pointIvList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addIv=findViewById(R.id.main_iv_add);
        moreIv=findViewById(R.id.main_iv_more);
        pointLinearLayout =findViewById(R.id.main_layout_point);
        mainVp=findViewById(R.id.main_vp);

        if(cityList.isEmpty()){
            cityList.add(new String[]{"北京","北京"});
            cityList.add(new String[]{"上海","上海"});
            cityList.add(new String[]{"广东","深圳"});
        }

        initViewPager();
        initPoints();
        //把当前显示的vp设置为最后一个添加的fragment
        mainVp.setCurrentItem(cityFragmentList.size()-1);
    }

    /**
     *
     */
    private void initViewPager() {
        for(String[] city:cityList){
            CityWeatherFragment cwFragment=CityWeatherFragment.newInstance(city);
            cityFragmentList.add(cwFragment);
        }
        CityWeatherFragmentPagerAdapter cwPagerAdapter=new CityWeatherFragmentPagerAdapter(getSupportFragmentManager(),
                cityFragmentList,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mainVp.setAdapter(cwPagerAdapter);
    }

    private void initPoints(){
        for(int i = 0; i< cityFragmentList.size(); i++){
            ImageView pointsIv=new ImageView(this);
            pointsIv.setImageResource(R.mipmap.a1);
            pointsIv.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            LinearLayout.LayoutParams lp=(LinearLayout.LayoutParams) pointsIv.getLayoutParams();
            lp.setMargins(0,0,20,20);
            pointIvList.add(pointsIv);
            pointLinearLayout.addView(pointsIv);
        }
        setVpListener();
    }

    private void setVpListener(){
        //setOnPageChangeListener过时了，原来是改成add了，啊这
        mainVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for(int i=0;i< pointIvList.size();i++){
                    ImageView curIv=pointIvList.get(i);
                    if(i==position){
                        curIv.setImageResource(R.mipmap.a2);
                    }else {
                        curIv.setImageResource(R.mipmap.a1);
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
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
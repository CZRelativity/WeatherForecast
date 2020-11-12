package com.rek.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.rek.weatherforecast.db.DBManager;
import com.rek.weatherforecast.manager.CityManagerActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView addIv, moreIv;
    LinearLayout pointLinearLayout;
    ViewPager mainVp;

    //ViewPager的数据源
    List<Fragment> cityFragmentList = new ArrayList<>();
    //要显示的城市的集合，后面改用数据库
    List<String> cityList = new ArrayList<>();
    //表示ViewPager的页数指示器的显示List（下方小点）
    List<ImageView> pointIvList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addIv = findViewById(R.id.main_iv_add);
        moreIv = findViewById(R.id.main_iv_more);
        pointLinearLayout = findViewById(R.id.main_layout_point);
        mainVp = findViewById(R.id.main_vp);
        addIv.setOnClickListener(this);
        moreIv.setOnClickListener(this);

        //获取数据库当中已经存储的数据库列表
        cityList = DBManager.queryAllCity();
        //如果没有获取到的话，也可以返回一个空的ArrayList
        if (cityList.isEmpty()) {
            cityList.add("北京");
            cityList.add("上海");
            cityList.add("深圳");
        }
        /* 当从search中通过返回Intent传递数据的时候,在这里进行判断,
        但是当第一次进入的时候需要判空，否则数据库查询的时候查null直接报错闪退 */
        Intent intent = getIntent();
        String addCity = intent.getStringExtra("addCity");
        if (addCity != null) {
            if (cityList.remove(addCity)) {
                DBManager.deleteCityInfo(addCity);
            }
            cityList.add(addCity);
        }
        while (cityList.size() > 3) {
            cityList.remove(0);
        }
        initViewPager();
        initPoints();
        /* 把当前显示的vp设置为最后一个添加的fragment：cityFragmentList.size()-1
         * 第一个 0 */
        mainVp.setCurrentItem(cityFragmentList.size() - 1);
    }

    /**
     *
     */
    private void initViewPager() {
        for (String city : cityList) {
            CityWeatherFragment cwFragment = CityWeatherFragment.newInstance(city);
            cityFragmentList.add(cwFragment);
        }
        CityWeatherFragmentPagerAdapter cwPagerAdapter = new CityWeatherFragmentPagerAdapter(getSupportFragmentManager(),
                cityFragmentList, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mainVp.setAdapter(cwPagerAdapter);
    }

    private void initPoints() {
        for (int i = 0; i < cityFragmentList.size(); i++) {
            //new一个view，传入，在什么上面new这个view，一般是Activity
            ImageView pointsIv = new ImageView(this);
            pointsIv.setImageResource(R.mipmap.a1);
            //各种姿势设置参数
            pointsIv.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            //setMargins的姿势
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) pointsIv.getLayoutParams();
            lp.setMargins(0, 0, 20, 20);
            //都需要add
            pointIvList.add(pointsIv);
            pointLinearLayout.addView(pointsIv);
        }
        setVpListener();
    }

    private void setVpListener() {
        //setOnPageChangeListener过时了，原来是改成add了，啊这
        mainVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            /* View滚动的时候被调用，不管是程序自动滚动的还是用户手动滚动的，有当前View的position，也有滚动了多少，精确到像素 */
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            //用得比较多的，切换View的时候调用，传入切换的View的Position
            public void onPageSelected(int position) {
                for (int i = 0; i < pointIvList.size(); i++) {
                    //遍历小圆点，全都变白咯，然后把当前position对应的小白点变黑就好
                    ImageView curIv = pointIvList.get(i);
                    if (i == position) {
                        curIv.setImageResource(R.mipmap.a2);
                    } else {
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
        //因为下一个按钮也涉及到跳转，所以我们都写一个统一的Intent
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.main_iv_add:
                intent.setClass(this, CityManagerActivity.class);
                break;
            case R.id.main_iv_more:
                break;
            default:
                break;
        }
        startActivity(intent);
    }
}
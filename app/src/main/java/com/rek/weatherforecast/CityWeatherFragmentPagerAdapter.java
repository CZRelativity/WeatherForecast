package com.rek.weatherforecast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/*把Fragment通过Adapter加载进ViewPager，再把ViewPager加载进MainActivity*/
/*作为ViewPager加载Fragment的Adapter有两种选择
* 一是FragmentStatePagerAdapter，对前一个和后一个页面没有缓存，立即销毁，只保留当前界面
* 二是FragmentPagerAdapter，一般情况下我们选择这种，对前后两个界面有所缓存，不会立即销毁，支持返回功能*/
class CityWeatherFragmentPagerAdapter extends FragmentPagerAdapter {

    //通过构造方法进行传递
    List<Fragment> fragmentList;

    public CityWeatherFragmentPagerAdapter(@NonNull FragmentManager fm,List<Fragment> fragmentList, int behavior) {
        super(fm, behavior);
        this.fragmentList=fragmentList;
    }


    /**
     * @param position 位置
     * @return 指定位置对应List中的Fragment
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }


    @Override
    public int getCount() {
        return fragmentList.size();
    }
}

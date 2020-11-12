package com.rek.weatherforecast;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.gson.Gson;
import com.rek.weatherforecast.base.BaseFragment;
import com.rek.weatherforecast.bean.TencentWeatherBean;
import com.rek.weatherforecast.bean.TencentWeatherBeanUtil;
import com.rek.weatherforecast.db.DBManager;
import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CityWeatherFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CityWeatherFragment extends BaseFragment implements View.OnClickListener {

    TextView tv_temp, tv_city, tv_weather, tv_date, tv_wind,
            tv_tempRange, tv_index_wearing, tv_index_carWashing, tv_index_flu,
            tv_index_sport, tv_index_light;
    ImageView iv_weather;
    LinearLayout future_layout;
    private static final String uriProvince = "https://wis.qq.com/weather/common?source=pc&weather_type=observe|index|rise|alarm|air|tips|forecast_24h&province=";
    private static final String uriCity = "&city=";


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String CITY = "CITY";
    //private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mCity;
    TencentWeatherBean.DataBean.IndexBean indexBean;
    //private String mParam2;

    public CityWeatherFragment() {
        // Required empty public constructor
    }

    /**
     * 通过newInstance传值获取到了当前Fragment需要加载的是哪个城市的天气
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param city 城市，通过省市map适配腾讯天气api
     * @return A new instance of fragment CityWeatherFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CityWeatherFragment newInstance(String city){
        CityWeatherFragment fragment = new CityWeatherFragment();
        Bundle args = new Bundle();
        //Bundle().putString(key,value)
        args.putString(CITY, city);
        //args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            //getArguments().getString(key)
            mCity = getArguments().getString(CITY);
            //mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_city_weather, container, false);
        initiateView(view);
        // 拼接uri，通过传入xutils框架发出http请求
        String uri = uriProvince + TencentWeatherBeanUtil.getProvince(mCity) + uriCity + mCity;
        loadData(uri);
        return view;
    }

    public void initiateView(View view) {
        tv_temp = view.findViewById(R.id.frag_tv_temp);
        tv_city = view.findViewById(R.id.frag_tv_city);
        tv_weather = view.findViewById(R.id.frag_tv_weather);
        tv_date = view.findViewById(R.id.frag_tv_date);
        tv_wind = view.findViewById(R.id.frag_tv_wind);
        tv_tempRange = view.findViewById(R.id.frag_tv_tempRange);
        tv_index_wearing = view.findViewById(R.id.frag_tv_index_wearing);
        tv_index_wearing.setOnClickListener(this);
        tv_index_carWashing = view.findViewById(R.id.frag_tv_index_carWashing);
        tv_index_carWashing.setOnClickListener(this);
        tv_index_flu = view.findViewById(R.id.frag_tv_index_flu);
        tv_index_flu.setOnClickListener(this);
        tv_index_sport = view.findViewById(R.id.frag_tv_index_sport);
        tv_index_sport.setOnClickListener(this);
        tv_index_light = view.findViewById(R.id.frag_tv_index_light);
        tv_index_light.setOnClickListener(this);
        iv_weather = view.findViewById(R.id.frag_iv_weather);
        future_layout = view.findViewById(R.id.frag_layout);
    }

    //继承View.OnClickListener然后重写onClick()方法的机制失效？！没失效，忘了要setOnClickListener(this)了！
    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        String msg;
        switch (v.getId()) {
            case R.id.frag_tv_index_wearing:
                builder.setTitle("穿衣指数");
                msg = indexBean.getClothes().getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.frag_tv_index_carWashing:
                builder.setTitle("洗车指数");
                msg = indexBean.getCarwash().getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.frag_tv_index_flu:
                builder.setTitle("感冒指数");
                msg = indexBean.getCold().getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.frag_tv_index_sport:
                builder.setTitle("运动指数");
                msg = indexBean.getSports().getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.frag_tv_index_light:
                builder.setTitle("紫外线指数");
                msg = indexBean.getSunscreen().getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            default:
                break;
        }
        builder.create().show();
    }

    //以下为CommonCallBack接口所有需要实现的抽象方法

    //获取数据成功时会回调的接口方法
    @Override
    public void onSuccess(String result) {
        //解析并展示数据
        parseShowData(result);
        /* 在获取数据成功的时候，把获取到的信息也插入到数据库当中，就相当于注册了这个城市，下次
        * 再获取这个城市的时候，如果成功获取了就对数据库进行更新，如果没有成功获取也没关系，可以直接
        * 从数据库中提取之前的数据了，因此我们需要写更新的方法，也需要写提取的方法 */
        int updateFeedBack=DBManager.updateInfoByCity(mCity,result);
        //表示更新失败，即表中不存在这个city的行，改为添加
        if(updateFeedBack<=0){
            DBManager.addCityInfo(mCity,result);
        }
    }

    public void parseShowData(String result) {

        //使用Gson解析数据，完全不能改动GsonFormat生成的类，行吧
        TencentWeatherBean tencentWeatherBean = new Gson().fromJson(result, TencentWeatherBean.class);

        TencentWeatherBean.DataBean.Forecast24hBean weekForecast = tencentWeatherBean.getData().getForecast_24h();
        //腾讯天气api，day0居然是昨天，我？？？
        TencentWeatherBean.DataBean.Forecast24hBean._$1Bean dayForecast = weekForecast.get_$1();
        TencentWeatherBean.DataBean.ObserveBean currentObserve = tencentWeatherBean.getData().getObserve();

        //获取指数信息集合列表
        indexBean = tencentWeatherBean.getData().getIndex();
//
//        //设置TextView
        tv_date.setText(dayForecast.getTime());
        tv_city.setText(mCity);
        tv_tempRange.setText(dayForecast.getMin_degree() + "℃~" + dayForecast.getMax_degree() + "℃");
        tv_weather.setText(dayForecast.getDay_weather());
        tv_wind.setText(dayForecast.getDay_wind_direction());

//        //从WeatherDataBean.date获取实时温度情况，需要用String.split()方法处理字符串
//        String[] split=todayDataBean.getDate().split("：");
//        //使用String.replace(target,replacement)方法替换为空字符串""，可以实现删除字符串任意指定部分的效果
//        tv_currentTemperature.setText(split[1].replace(")",""));

        tv_temp.setText(currentObserve.getDegree() + "℃");

        //设置显示的天气图片，Picasso框架，with(context).load(uri/path).into(view)
        Picasso.with(getActivity()).load(TencentWeatherBeanUtil.getWeatherPictureUrl(dayForecast.getDay_weather())).into(iv_weather);

        parseDay2(weekForecast);
        parseDay3(weekForecast);
        parseDay4(weekForecast);
        //获取未来三天的天气情况，加载到Layout当中
//        List<TencentWeatherBean.ResultsBean.WeatherDataBean> futureWeatherList=resultsBean.getWeather_data();
//        //第一天的已经显示在上面了，我们要未来三天的
////        futureWeatherList.remove(0);
//        //遍历List，把自定义的View加入到布局
//        for(int i=1;i<4;i++){

//        }
    }

    /*GsonFormatBean不能改，没有公共父类，子类方法完全是分开的，无奈手动遍历*/
    private void parseDay1(TencentWeatherBean.DataBean.Forecast24hBean weekForecast) {
        /*day1*/

        //这不就是根据我们写的item_layout生成自定义的View嘛
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        //你甚至可以这样修改View的属性。。。
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        //甚至可以这样添加View到Layout
        future_layout.addView(view);
        TextView center_tv_day = view.findViewById(R.id.item_center_tv_day);
        TextView center_tv_temperature = view.findViewById(R.id.item_center_tv_temp);
        TextView center_tv_weather = view.findViewById(R.id.item_center_tv_weather);
        ImageView center_iv = view.findViewById(R.id.item_center_iv);
//            TencentWeatherBean.ResultsBean.WeatherDataBean itemDataBean = futureWeatherList.get(i);
        TencentWeatherBean.DataBean.Forecast24hBean._$1Bean day1Bean = weekForecast.get_$1();
        center_tv_day.setText(day1Bean.getTime());
        center_tv_weather.setText(day1Bean.getDay_weather());
        center_tv_temperature.setText(day1Bean.getMin_degree() + "℃~" + day1Bean.getMax_degree() + "℃");
        Picasso.with(getActivity()).load(TencentWeatherBeanUtil.getWeatherPictureUrl(day1Bean.getDay_weather())).into(center_iv);

    }

    public void parseDay2(TencentWeatherBean.DataBean.Forecast24hBean weekForecast) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        //你甚至可以这样修改View的属性。。。
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        //甚至可以这样添加View到Layout
        future_layout.addView(view);
        TextView center_tv_day = view.findViewById(R.id.item_center_tv_day);
        TextView center_tv_temperature = view.findViewById(R.id.item_center_tv_temp);
        TextView center_tv_weather = view.findViewById(R.id.item_center_tv_weather);
        ImageView center_iv = view.findViewById(R.id.item_center_iv);
        TencentWeatherBean.DataBean.Forecast24hBean._$2Bean day2Bean = weekForecast.get_$2();
        center_tv_day.setText(day2Bean.getTime());
        center_tv_weather.setText(day2Bean.getDay_weather());
        center_tv_temperature.setText(day2Bean.getMin_degree() + "℃~" + day2Bean.getMax_degree() + "℃");
        Picasso.with(getActivity()).load(TencentWeatherBeanUtil.getWeatherPictureUrl(day2Bean.getDay_weather())).into(center_iv);
    }

    public void parseDay3(TencentWeatherBean.DataBean.Forecast24hBean weekForecast) {
        /*day3*/

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        //你甚至可以这样修改View的属性。。。
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        //甚至可以这样添加View到Layout
        future_layout.addView(view);
        TextView center_tv_day = view.findViewById(R.id.item_center_tv_day);
        TextView center_tv_temperature = view.findViewById(R.id.item_center_tv_temp);
        TextView center_tv_weather = view.findViewById(R.id.item_center_tv_weather);
        ImageView center_iv = view.findViewById(R.id.item_center_iv);
        TencentWeatherBean.DataBean.Forecast24hBean._$3Bean day3Bean = weekForecast.get_$3();
        center_tv_day.setText(day3Bean.getTime());
        center_tv_weather.setText(day3Bean.getDay_weather());
        center_tv_temperature.setText(day3Bean.getMin_degree() + "℃~" + day3Bean.getMax_degree() + "℃");
        Picasso.with(getActivity()).load(TencentWeatherBeanUtil.getWeatherPictureUrl(day3Bean.getDay_weather())).into(center_iv);
    }

    public void parseDay4(TencentWeatherBean.DataBean.Forecast24hBean weekForecast) {
        /*day4*/

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        //你甚至可以这样修改View的属性。。。
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        //甚至可以这样添加View到Layout
        future_layout.addView(view);
        TextView center_tv_day = view.findViewById(R.id.item_center_tv_day);
        TextView center_tv_temperature = view.findViewById(R.id.item_center_tv_temp);
        TextView center_tv_weather = view.findViewById(R.id.item_center_tv_weather);
        ImageView center_iv = view.findViewById(R.id.item_center_iv);
        TencentWeatherBean.DataBean.Forecast24hBean._$4Bean day4Bean = weekForecast.get_$4();
        center_tv_day.setText(day4Bean.getTime());
        center_tv_weather.setText(day4Bean.getDay_weather());
        center_tv_temperature.setText(day4Bean.getMin_degree() + "℃~" + day4Bean.getMax_degree() + "℃");
        Picasso.with(getActivity()).load(TencentWeatherBeanUtil.getWeatherPictureUrl(day4Bean.getDay_weather())).into(center_iv);
    }


    //获取数据失败时会回调的接口方法，服务器错误、本身错误等,此时应该尽量从数据库中获取上次存储的对应city的result，避免展示为空
    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        String queryFeedBack = DBManager.queryInfoByCity(mCity);
        //判空
        if(queryFeedBack!=null){
            parseShowData(queryFeedBack);
        }
    }

    //取消请求时会回调的接口方法
    @Override
    public void onCancelled(CancelledException cex) {

    }

    //完成请求时会回调的接口方法
    @Override
    public void onFinished() {

    }

}
package com.rek.weatherforecast.bean;

import java.util.HashMap;
import java.util.Map;

public class TencentWeatherBeanUtil {

    //这个图片又是从百度天气api piao的[笑哭]，改成map优雅多了，咋早没想到呢
    public static String getWeatherPictureUrl(String weather) {
        StringBuilder url = new StringBuilder("http://api.map.baidu.com/images/weather/day/");
        return url.append(weatherMap.get(weather)).append(".png").toString();
    }

    private static Map<String, String> weatherMap = new HashMap<String, String>() {{
        put("晴", "qing");
        put("阴", "yin");
        put("多云", "duoyun");
        put("小雨", "xiaoyu");
        put("中雨", "zhongyu");
        put("大雨", "dayu");
    }};

    private static Map<String, String> cityMap = new HashMap<String, String>() {{
        put("北京", "北京");
        put("上海", "上海");
        put("深圳", "广东");
        put("广州", "广东");
        put("天津", "天津");
        put("重庆", "重庆");
        put("成都", "四川");
        put("杭州", "浙江");
        put("南京", "江苏");
        put("合肥", "安徽");
        put("长沙", "湖南");
        put("济南", "山东");
        put("厦门", "福建");
        put("青岛", "山东");
        put("贵阳", "贵州");
        put("昆明", "云南");
        put("沈阳", "辽宁");
        put("长春", "吉林");
        put("哈尔滨", "黑龙江");
    }};

    public static void addCity(String city, String province) {
        cityMap.put(city, province);
    }

    public static String[] getCityArr() {
        return cityMap.keySet().toArray(new String[0]);
    }

    public static String getProvince(String city) {
        return cityMap.get(city);
    }
}

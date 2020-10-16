package com.rek.weatherforecast.bean;

public class TencentWeatherBeanUtil {

    //这个图片又是从百度天气api piao的[笑哭]
    public static String getWeatherPictureUrl(String weather){
        StringBuilder url=new StringBuilder("http://api.map.baidu.com/images/weather/day/");
        String s="";
        switch(weather){
            case "晴":
                s="qing";
                break;
            case "阴":
                s="yin";
                break;
            case "多云":
                s="duoyun";
                break;
            case "小雨":
                s="xiaoyu";
                break;
            case "中雨":
                s="zhongyu";
                break;
            case "大雨":
                s="dayu";
                break;
            default:
                break;
        }
        return url.append(s).append(".png").toString();
    }

}

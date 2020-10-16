package com.rek.weatherforecast.bean;

import com.google.gson.annotations.SerializedName;

public class TencentWeatherBean {

    /**
     * data : {"air":{"aqi":14,"aqi_level":1,"aqi_name":"优","co":"0.6","no2":"27","o3":"25","pm10":"14","pm2.5":"9","so2":"6","update_time":"20201015130000"},"alarm":{},"forecast_24h":{"0":{"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"西风","day_wind_direction_code":"6","day_wind_power":"3","day_wind_power_code":"0","max_degree":"19","min_degree":"15","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-14"},"1":{"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"西风","day_wind_direction_code":"6","day_wind_power":"3","day_wind_power_code":"0","max_degree":"16","min_degree":"14","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-15"},"2":{"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"3","day_wind_power_code":"0","max_degree":"15","min_degree":"14","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-16"},"3":{"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"东北风","day_wind_direction_code":"1","day_wind_power":"3","day_wind_power_code":"0","max_degree":"16","min_degree":"13","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"南风","night_wind_direction_code":"4","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-17"},"4":{"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"17","min_degree":"12","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-18"},"5":{"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"东风","day_wind_direction_code":"2","day_wind_power":"3","day_wind_power_code":"0","max_degree":"17","min_degree":"14","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"东北风","night_wind_direction_code":"1","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-19"},"6":{"day_weather":"阴","day_weather_code":"02","day_weather_short":"阴","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"18","min_degree":"14","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"南风","night_wind_direction_code":"4","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-20"},"7":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"东北风","day_wind_direction_code":"1","day_wind_power":"3","day_wind_power_code":"0","max_degree":"19","min_degree":"15","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"东北风","night_wind_direction_code":"1","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-21"}},"index":{"airconditioner":{"detail":"您将感到很舒适，一般不需要开启空调。","info":"较少开启","name":"空调开启"},"allergy":{"detail":"天气条件易诱发过敏，有降水，最好穿长衣长裤，预防感冒可能引发的过敏。","info":"易发","name":"过敏"},"carwash":{"detail":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。","info":"不宜","name":"洗车"},"chill":{"detail":"温度未达到风寒所需的低温，稍作防寒准备即可。","info":"无","name":"风寒"},"clothes":{"detail":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","info":"较冷","name":"穿衣"},"cold":{"detail":"易发生感冒，体质较弱的朋友请注意适当防护。","info":"易发","name":"感冒"},"comfort":{"detail":"白天会有降雨，人们会感到有些凉意，但大部分人完全可以接受。","info":"较舒适","name":"舒适度"},"diffusion":{"detail":"气象条件有利于空气污染物稀释、扩散和清除。","info":"良","name":"空气污染扩散条件"},"dry":{"detail":"有降水，路面潮湿，车辆易打滑，请小心驾驶。","info":"潮湿","name":"路况"},"drying":{"detail":"有降水，不适宜晾晒。若需要晾晒，请在室内准备出充足的空间。","info":"不宜","name":"晾晒"},"fish":{"detail":"天气不好，有风，不适合垂钓。","info":"不宜","name":"钓鱼"},"heatstroke":{"detail":"天气舒适，令人神清气爽的一天，不用担心中暑的困扰。","info":"无中暑风险","name":"中暑"},"makeup":{"detail":"风力不大，建议用中性保湿型霜类化妆品，无需选用防晒化妆品。","info":"保湿","name":"化妆"},"mood":{"detail":"有降水，雨水可能会使心绪无端地挂上轻愁，与其因下雨而无精打采，不如放松心情，好好欣赏一下雨景。你会发现雨中的世界是那般洁净温和、清新葱郁。","info":"较差","name":"心情"},"morning":{"detail":"有较强降水，风力稍大，请避免户外晨练，建议在室内做适当锻炼，保持身体健康。","info":"不宜","name":"晨练"},"sports":{"detail":"有降水，推荐您在室内进行各种健身休闲运动，若坚持户外运动，须注意保暖并携带雨具。","info":"较不宜","name":"运动"},"sunglasses":{"detail":"白天有降水天气，视线较差，不需要佩戴太阳镜","info":"不需要","name":"太阳镜"},"sunscreen":{"detail":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","info":"弱","name":"防晒"},"time":"20201015","tourism":{"detail":"温度适宜，又有较弱降水和微风作伴，会给您的旅行带来意想不到的景象，适宜旅游，可不要错过机会呦！","info":"适宜","name":"旅游"},"traffic":{"detail":"有降水，路面湿滑，刹车距离延长，事故易发期，注意车距，务必小心驾驶。","info":"一般","name":"交通"},"ultraviolet":{"detail":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","info":"最弱","name":"紫外线强度"},"umbrella":{"detail":"有降水，请带上雨伞，如果你喜欢雨中漫步，享受大自然给予的温馨和快乐，在短时间外出可收起雨伞。","info":"带伞","name":"雨伞"}},"observe":{"degree":"17","humidity":"88","precipitation":"0.3","pressure":"991.0","update_time":"202010151330","weather":"雨","weather_code":"301","weather_short":"雨","wind_direction":"3","wind_power":"1"},"rise":{"0":{"sunrise":"06:55","sunset":"18:23","time":"20201015"},"1":{"sunrise":"06:56","sunset":"18:22","time":"20201016"},"10":{"sunrise":"07:02","sunset":"18:13","time":"20201025"},"11":{"sunrise":"07:02","sunset":"18:12","time":"20201026"},"12":{"sunrise":"07:03","sunset":"18:11","time":"20201027"},"13":{"sunrise":"07:04","sunset":"18:10","time":"20201028"},"14":{"sunrise":"07:05","sunset":"18:09","time":"20201029"},"15":{"sunrise":"","sunset":"","time":"20201014"},"2":{"sunrise":"06:56","sunset":"18:21","time":"20201017"},"3":{"sunrise":"06:57","sunset":"18:20","time":"20201018"},"4":{"sunrise":"06:58","sunset":"18:19","time":"20201019"},"5":{"sunrise":"06:58","sunset":"18:18","time":"20201020"},"6":{"sunrise":"06:59","sunset":"18:17","time":"20201021"},"7":{"sunrise":"07:00","sunset":"18:16","time":"20201022"},"8":{"sunrise":"07:00","sunset":"18:15","time":"20201023"},"9":{"sunrise":"07:01","sunset":"18:14","time":"20201024"}},"tips":{"observe":{"0":"下雨了，出门记得带伞~","1":"现在的温度比较凉爽~"}}}
     * message : OK
     * status : 200
     */

    private DataBean data;
    private String message;
    private int status;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * air : {"aqi":14,"aqi_level":1,"aqi_name":"优","co":"0.6","no2":"27","o3":"25","pm10":"14","pm2.5":"9","so2":"6","update_time":"20201015130000"}
         * alarm : {}
         * forecast_24h : {"0":{"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"西风","day_wind_direction_code":"6","day_wind_power":"3","day_wind_power_code":"0","max_degree":"19","min_degree":"15","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-14"},"1":{"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"西风","day_wind_direction_code":"6","day_wind_power":"3","day_wind_power_code":"0","max_degree":"16","min_degree":"14","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-15"},"2":{"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"3","day_wind_power_code":"0","max_degree":"15","min_degree":"14","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-16"},"3":{"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"东北风","day_wind_direction_code":"1","day_wind_power":"3","day_wind_power_code":"0","max_degree":"16","min_degree":"13","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"南风","night_wind_direction_code":"4","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-17"},"4":{"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"17","min_degree":"12","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-18"},"5":{"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"东风","day_wind_direction_code":"2","day_wind_power":"3","day_wind_power_code":"0","max_degree":"17","min_degree":"14","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"东北风","night_wind_direction_code":"1","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-19"},"6":{"day_weather":"阴","day_weather_code":"02","day_weather_short":"阴","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"18","min_degree":"14","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"南风","night_wind_direction_code":"4","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-20"},"7":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"东北风","day_wind_direction_code":"1","day_wind_power":"3","day_wind_power_code":"0","max_degree":"19","min_degree":"15","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"东北风","night_wind_direction_code":"1","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-21"}}
         * index : {"airconditioner":{"detail":"您将感到很舒适，一般不需要开启空调。","info":"较少开启","name":"空调开启"},"allergy":{"detail":"天气条件易诱发过敏，有降水，最好穿长衣长裤，预防感冒可能引发的过敏。","info":"易发","name":"过敏"},"carwash":{"detail":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。","info":"不宜","name":"洗车"},"chill":{"detail":"温度未达到风寒所需的低温，稍作防寒准备即可。","info":"无","name":"风寒"},"clothes":{"detail":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","info":"较冷","name":"穿衣"},"cold":{"detail":"易发生感冒，体质较弱的朋友请注意适当防护。","info":"易发","name":"感冒"},"comfort":{"detail":"白天会有降雨，人们会感到有些凉意，但大部分人完全可以接受。","info":"较舒适","name":"舒适度"},"diffusion":{"detail":"气象条件有利于空气污染物稀释、扩散和清除。","info":"良","name":"空气污染扩散条件"},"dry":{"detail":"有降水，路面潮湿，车辆易打滑，请小心驾驶。","info":"潮湿","name":"路况"},"drying":{"detail":"有降水，不适宜晾晒。若需要晾晒，请在室内准备出充足的空间。","info":"不宜","name":"晾晒"},"fish":{"detail":"天气不好，有风，不适合垂钓。","info":"不宜","name":"钓鱼"},"heatstroke":{"detail":"天气舒适，令人神清气爽的一天，不用担心中暑的困扰。","info":"无中暑风险","name":"中暑"},"makeup":{"detail":"风力不大，建议用中性保湿型霜类化妆品，无需选用防晒化妆品。","info":"保湿","name":"化妆"},"mood":{"detail":"有降水，雨水可能会使心绪无端地挂上轻愁，与其因下雨而无精打采，不如放松心情，好好欣赏一下雨景。你会发现雨中的世界是那般洁净温和、清新葱郁。","info":"较差","name":"心情"},"morning":{"detail":"有较强降水，风力稍大，请避免户外晨练，建议在室内做适当锻炼，保持身体健康。","info":"不宜","name":"晨练"},"sports":{"detail":"有降水，推荐您在室内进行各种健身休闲运动，若坚持户外运动，须注意保暖并携带雨具。","info":"较不宜","name":"运动"},"sunglasses":{"detail":"白天有降水天气，视线较差，不需要佩戴太阳镜","info":"不需要","name":"太阳镜"},"sunscreen":{"detail":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","info":"弱","name":"防晒"},"time":"20201015","tourism":{"detail":"温度适宜，又有较弱降水和微风作伴，会给您的旅行带来意想不到的景象，适宜旅游，可不要错过机会呦！","info":"适宜","name":"旅游"},"traffic":{"detail":"有降水，路面湿滑，刹车距离延长，事故易发期，注意车距，务必小心驾驶。","info":"一般","name":"交通"},"ultraviolet":{"detail":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","info":"最弱","name":"紫外线强度"},"umbrella":{"detail":"有降水，请带上雨伞，如果你喜欢雨中漫步，享受大自然给予的温馨和快乐，在短时间外出可收起雨伞。","info":"带伞","name":"雨伞"}}
         * observe : {"degree":"17","humidity":"88","precipitation":"0.3","pressure":"991.0","update_time":"202010151330","weather":"雨","weather_code":"301","weather_short":"雨","wind_direction":"3","wind_power":"1"}
         * rise : {"0":{"sunrise":"06:55","sunset":"18:23","time":"20201015"},"1":{"sunrise":"06:56","sunset":"18:22","time":"20201016"},"10":{"sunrise":"07:02","sunset":"18:13","time":"20201025"},"11":{"sunrise":"07:02","sunset":"18:12","time":"20201026"},"12":{"sunrise":"07:03","sunset":"18:11","time":"20201027"},"13":{"sunrise":"07:04","sunset":"18:10","time":"20201028"},"14":{"sunrise":"07:05","sunset":"18:09","time":"20201029"},"15":{"sunrise":"","sunset":"","time":"20201014"},"2":{"sunrise":"06:56","sunset":"18:21","time":"20201017"},"3":{"sunrise":"06:57","sunset":"18:20","time":"20201018"},"4":{"sunrise":"06:58","sunset":"18:19","time":"20201019"},"5":{"sunrise":"06:58","sunset":"18:18","time":"20201020"},"6":{"sunrise":"06:59","sunset":"18:17","time":"20201021"},"7":{"sunrise":"07:00","sunset":"18:16","time":"20201022"},"8":{"sunrise":"07:00","sunset":"18:15","time":"20201023"},"9":{"sunrise":"07:01","sunset":"18:14","time":"20201024"}}
         * tips : {"observe":{"0":"下雨了，出门记得带伞~","1":"现在的温度比较凉爽~"}}
         */

        private AirBean air;
        private AlarmBean alarm;
        private Forecast24hBean forecast_24h;
        private IndexBean index;
        private ObserveBean observe;
        private RiseBean rise;
        private TipsBean tips;

        public AirBean getAir() {
            return air;
        }

        public void setAir(AirBean air) {
            this.air = air;
        }

        public AlarmBean getAlarm() {
            return alarm;
        }

        public void setAlarm(AlarmBean alarm) {
            this.alarm = alarm;
        }

        public Forecast24hBean getForecast_24h() {
            return forecast_24h;
        }

        public void setForecast_24h(Forecast24hBean forecast_24h) {
            this.forecast_24h = forecast_24h;
        }

        public IndexBean getIndex() {
            return index;
        }

        public void setIndex(IndexBean index) {
            this.index = index;
        }

        public ObserveBean getObserve() {
            return observe;
        }

        public void setObserve(ObserveBean observe) {
            this.observe = observe;
        }

        public RiseBean getRise() {
            return rise;
        }

        public void setRise(RiseBean rise) {
            this.rise = rise;
        }

        public TipsBean getTips() {
            return tips;
        }

        public void setTips(TipsBean tips) {
            this.tips = tips;
        }

        public static class AirBean {
        }

        public static class AlarmBean {
        }

        public static class Forecast24hBean {
            /**
             * 0 : {"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"西风","day_wind_direction_code":"6","day_wind_power":"3","day_wind_power_code":"0","max_degree":"19","min_degree":"15","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-14"}
             * 1 : {"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"西风","day_wind_direction_code":"6","day_wind_power":"3","day_wind_power_code":"0","max_degree":"16","min_degree":"14","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-15"}
             * 2 : {"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"3","day_wind_power_code":"0","max_degree":"15","min_degree":"14","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-16"}
             * 3 : {"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"东北风","day_wind_direction_code":"1","day_wind_power":"3","day_wind_power_code":"0","max_degree":"16","min_degree":"13","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"南风","night_wind_direction_code":"4","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-17"}
             * 4 : {"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"17","min_degree":"12","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-18"}
             * 5 : {"day_weather":"小雨","day_weather_code":"07","day_weather_short":"小雨","day_wind_direction":"东风","day_wind_direction_code":"2","day_wind_power":"3","day_wind_power_code":"0","max_degree":"17","min_degree":"14","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"东北风","night_wind_direction_code":"1","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-19"}
             * 6 : {"day_weather":"阴","day_weather_code":"02","day_weather_short":"阴","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"18","min_degree":"14","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"南风","night_wind_direction_code":"4","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-20"}
             * 7 : {"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"东北风","day_wind_direction_code":"1","day_wind_power":"3","day_wind_power_code":"0","max_degree":"19","min_degree":"15","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"东北风","night_wind_direction_code":"1","night_wind_power":"3","night_wind_power_code":"0","time":"2020-10-21"}
             */

            @SerializedName("0")
            private _$0Bean _$0;
            @SerializedName("1")
            private _$1Bean _$1;
            @SerializedName("2")
            private _$2Bean _$2;
            @SerializedName("3")
            private _$3Bean _$3;
            @SerializedName("4")
            private _$4Bean _$4;
            @SerializedName("5")
            private _$5Bean _$5;
            @SerializedName("6")
            private _$6Bean _$6;
            @SerializedName("7")
            private _$7Bean _$7;

            public _$0Bean get_$0() {
                return _$0;
            }

            public void set_$0(_$0Bean _$0) {
                this._$0 = _$0;
            }

            public _$1Bean get_$1() {
                return _$1;
            }

            public void set_$1(_$1Bean _$1) {
                this._$1 = _$1;
            }

            public _$2Bean get_$2() {
                return _$2;
            }

            public void set_$2(_$2Bean _$2) {
                this._$2 = _$2;
            }

            public _$3Bean get_$3() {
                return _$3;
            }

            public void set_$3(_$3Bean _$3) {
                this._$3 = _$3;
            }

            public _$4Bean get_$4() {
                return _$4;
            }

            public void set_$4(_$4Bean _$4) {
                this._$4 = _$4;
            }

            public _$5Bean get_$5() {
                return _$5;
            }

            public void set_$5(_$5Bean _$5) {
                this._$5 = _$5;
            }

            public _$6Bean get_$6() {
                return _$6;
            }

            public void set_$6(_$6Bean _$6) {
                this._$6 = _$6;
            }

            public _$7Bean get_$7() {
                return _$7;
            }

            public void set_$7(_$7Bean _$7) {
                this._$7 = _$7;
            }

            public static class _$0Bean {
                /**
                 * day_weather : 小雨
                 * day_weather_code : 07
                 * day_weather_short : 小雨
                 * day_wind_direction : 西风
                 * day_wind_direction_code : 6
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 19
                 * min_degree : 15
                 * night_weather : 小雨
                 * night_weather_code : 07
                 * night_weather_short : 小雨
                 * night_wind_direction : 西南风
                 * night_wind_direction_code : 5
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-10-14
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$1Bean {
                /**
                 * day_weather : 小雨
                 * day_weather_code : 07
                 * day_weather_short : 小雨
                 * day_wind_direction : 西风
                 * day_wind_direction_code : 6
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 16
                 * min_degree : 14
                 * night_weather : 小雨
                 * night_weather_code : 07
                 * night_weather_short : 小雨
                 * night_wind_direction : 西南风
                 * night_wind_direction_code : 5
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-10-15
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$2Bean {
                /**
                 * day_weather : 小雨
                 * day_weather_code : 07
                 * day_weather_short : 小雨
                 * day_wind_direction : 西北风
                 * day_wind_direction_code : 7
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 15
                 * min_degree : 14
                 * night_weather : 小雨
                 * night_weather_code : 07
                 * night_weather_short : 小雨
                 * night_wind_direction : 西南风
                 * night_wind_direction_code : 5
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-10-16
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$3Bean {
                /**
                 * day_weather : 小雨
                 * day_weather_code : 07
                 * day_weather_short : 小雨
                 * day_wind_direction : 东北风
                 * day_wind_direction_code : 1
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 16
                 * min_degree : 13
                 * night_weather : 小雨
                 * night_weather_code : 07
                 * night_weather_short : 小雨
                 * night_wind_direction : 南风
                 * night_wind_direction_code : 4
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-10-17
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$4Bean {
                /**
                 * day_weather : 小雨
                 * day_weather_code : 07
                 * day_weather_short : 小雨
                 * day_wind_direction : 西南风
                 * day_wind_direction_code : 5
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 17
                 * min_degree : 12
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 西南风
                 * night_wind_direction_code : 5
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-10-18
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$5Bean {
                /**
                 * day_weather : 小雨
                 * day_weather_code : 07
                 * day_weather_short : 小雨
                 * day_wind_direction : 东风
                 * day_wind_direction_code : 2
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 17
                 * min_degree : 14
                 * night_weather : 小雨
                 * night_weather_code : 07
                 * night_weather_short : 小雨
                 * night_wind_direction : 东北风
                 * night_wind_direction_code : 1
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-10-19
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$6Bean {
                /**
                 * day_weather : 阴
                 * day_weather_code : 02
                 * day_weather_short : 阴
                 * day_wind_direction : 南风
                 * day_wind_direction_code : 4
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 18
                 * min_degree : 14
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 南风
                 * night_wind_direction_code : 4
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-10-20
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$7Bean {
                /**
                 * day_weather : 多云
                 * day_weather_code : 01
                 * day_weather_short : 多云
                 * day_wind_direction : 东北风
                 * day_wind_direction_code : 1
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 19
                 * min_degree : 15
                 * night_weather : 晴
                 * night_weather_code : 00
                 * night_weather_short : 晴
                 * night_wind_direction : 东北风
                 * night_wind_direction_code : 1
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-10-21
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }
        }

        public static class IndexBean {
            /**
             * airconditioner : {"detail":"您将感到很舒适，一般不需要开启空调。","info":"较少开启","name":"空调开启"}
             * allergy : {"detail":"天气条件易诱发过敏，有降水，最好穿长衣长裤，预防感冒可能引发的过敏。","info":"易发","name":"过敏"}
             * carwash : {"detail":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。","info":"不宜","name":"洗车"}
             * chill : {"detail":"温度未达到风寒所需的低温，稍作防寒准备即可。","info":"无","name":"风寒"}
             * clothes : {"detail":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","info":"较冷","name":"穿衣"}
             * cold : {"detail":"易发生感冒，体质较弱的朋友请注意适当防护。","info":"易发","name":"感冒"}
             * comfort : {"detail":"白天会有降雨，人们会感到有些凉意，但大部分人完全可以接受。","info":"较舒适","name":"舒适度"}
             * diffusion : {"detail":"气象条件有利于空气污染物稀释、扩散和清除。","info":"良","name":"空气污染扩散条件"}
             * dry : {"detail":"有降水，路面潮湿，车辆易打滑，请小心驾驶。","info":"潮湿","name":"路况"}
             * drying : {"detail":"有降水，不适宜晾晒。若需要晾晒，请在室内准备出充足的空间。","info":"不宜","name":"晾晒"}
             * fish : {"detail":"天气不好，有风，不适合垂钓。","info":"不宜","name":"钓鱼"}
             * heatstroke : {"detail":"天气舒适，令人神清气爽的一天，不用担心中暑的困扰。","info":"无中暑风险","name":"中暑"}
             * makeup : {"detail":"风力不大，建议用中性保湿型霜类化妆品，无需选用防晒化妆品。","info":"保湿","name":"化妆"}
             * mood : {"detail":"有降水，雨水可能会使心绪无端地挂上轻愁，与其因下雨而无精打采，不如放松心情，好好欣赏一下雨景。你会发现雨中的世界是那般洁净温和、清新葱郁。","info":"较差","name":"心情"}
             * morning : {"detail":"有较强降水，风力稍大，请避免户外晨练，建议在室内做适当锻炼，保持身体健康。","info":"不宜","name":"晨练"}
             * sports : {"detail":"有降水，推荐您在室内进行各种健身休闲运动，若坚持户外运动，须注意保暖并携带雨具。","info":"较不宜","name":"运动"}
             * sunglasses : {"detail":"白天有降水天气，视线较差，不需要佩戴太阳镜","info":"不需要","name":"太阳镜"}
             * sunscreen : {"detail":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","info":"弱","name":"防晒"}
             * time : 20201015
             * tourism : {"detail":"温度适宜，又有较弱降水和微风作伴，会给您的旅行带来意想不到的景象，适宜旅游，可不要错过机会呦！","info":"适宜","name":"旅游"}
             * traffic : {"detail":"有降水，路面湿滑，刹车距离延长，事故易发期，注意车距，务必小心驾驶。","info":"一般","name":"交通"}
             * ultraviolet : {"detail":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","info":"最弱","name":"紫外线强度"}
             * umbrella : {"detail":"有降水，请带上雨伞，如果你喜欢雨中漫步，享受大自然给予的温馨和快乐，在短时间外出可收起雨伞。","info":"带伞","name":"雨伞"}
             */

            private AirconditionerBean airconditioner;
            private AllergyBean allergy;
            private CarwashBean carwash;
            private ChillBean chill;
            private ClothesBean clothes;
            private ColdBean cold;
            private ComfortBean comfort;
            private DiffusionBean diffusion;
            private DryBean dry;
            private DryingBean drying;
            private FishBean fish;
            private HeatstrokeBean heatstroke;
            private MakeupBean makeup;
            private MoodBean mood;
            private MorningBean morning;
            private SportsBean sports;
            private SunglassesBean sunglasses;
            private SunscreenBean sunscreen;
            private String time;
            private TourismBean tourism;
            private TrafficBean traffic;
            private UltravioletBean ultraviolet;
            private UmbrellaBean umbrella;

            public AirconditionerBean getAirconditioner() {
                return airconditioner;
            }

            public void setAirconditioner(AirconditionerBean airconditioner) {
                this.airconditioner = airconditioner;
            }

            public AllergyBean getAllergy() {
                return allergy;
            }

            public void setAllergy(AllergyBean allergy) {
                this.allergy = allergy;
            }

            public CarwashBean getCarwash() {
                return carwash;
            }

            public void setCarwash(CarwashBean carwash) {
                this.carwash = carwash;
            }

            public ChillBean getChill() {
                return chill;
            }

            public void setChill(ChillBean chill) {
                this.chill = chill;
            }

            public ClothesBean getClothes() {
                return clothes;
            }

            public void setClothes(ClothesBean clothes) {
                this.clothes = clothes;
            }

            public ColdBean getCold() {
                return cold;
            }

            public void setCold(ColdBean cold) {
                this.cold = cold;
            }

            public ComfortBean getComfort() {
                return comfort;
            }

            public void setComfort(ComfortBean comfort) {
                this.comfort = comfort;
            }

            public DiffusionBean getDiffusion() {
                return diffusion;
            }

            public void setDiffusion(DiffusionBean diffusion) {
                this.diffusion = diffusion;
            }

            public DryBean getDry() {
                return dry;
            }

            public void setDry(DryBean dry) {
                this.dry = dry;
            }

            public DryingBean getDrying() {
                return drying;
            }

            public void setDrying(DryingBean drying) {
                this.drying = drying;
            }

            public FishBean getFish() {
                return fish;
            }

            public void setFish(FishBean fish) {
                this.fish = fish;
            }

            public HeatstrokeBean getHeatstroke() {
                return heatstroke;
            }

            public void setHeatstroke(HeatstrokeBean heatstroke) {
                this.heatstroke = heatstroke;
            }

            public MakeupBean getMakeup() {
                return makeup;
            }

            public void setMakeup(MakeupBean makeup) {
                this.makeup = makeup;
            }

            public MoodBean getMood() {
                return mood;
            }

            public void setMood(MoodBean mood) {
                this.mood = mood;
            }

            public MorningBean getMorning() {
                return morning;
            }

            public void setMorning(MorningBean morning) {
                this.morning = morning;
            }

            public SportsBean getSports() {
                return sports;
            }

            public void setSports(SportsBean sports) {
                this.sports = sports;
            }

            public SunglassesBean getSunglasses() {
                return sunglasses;
            }

            public void setSunglasses(SunglassesBean sunglasses) {
                this.sunglasses = sunglasses;
            }

            public SunscreenBean getSunscreen() {
                return sunscreen;
            }

            public void setSunscreen(SunscreenBean sunscreen) {
                this.sunscreen = sunscreen;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public TourismBean getTourism() {
                return tourism;
            }

            public void setTourism(TourismBean tourism) {
                this.tourism = tourism;
            }

            public TrafficBean getTraffic() {
                return traffic;
            }

            public void setTraffic(TrafficBean traffic) {
                this.traffic = traffic;
            }

            public UltravioletBean getUltraviolet() {
                return ultraviolet;
            }

            public void setUltraviolet(UltravioletBean ultraviolet) {
                this.ultraviolet = ultraviolet;
            }

            public UmbrellaBean getUmbrella() {
                return umbrella;
            }

            public void setUmbrella(UmbrellaBean umbrella) {
                this.umbrella = umbrella;
            }

            public static class AirconditionerBean {
                /**
                 * detail : 您将感到很舒适，一般不需要开启空调。
                 * info : 较少开启
                 * name : 空调开启
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class AllergyBean {
                /**
                 * detail : 天气条件易诱发过敏，有降水，最好穿长衣长裤，预防感冒可能引发的过敏。
                 * info : 易发
                 * name : 过敏
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class CarwashBean {
                /**
                 * detail : 不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。
                 * info : 不宜
                 * name : 洗车
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ChillBean {
                /**
                 * detail : 温度未达到风寒所需的低温，稍作防寒准备即可。
                 * info : 无
                 * name : 风寒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ClothesBean {
                /**
                 * detail : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
                 * info : 较冷
                 * name : 穿衣
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ColdBean {
                /**
                 * detail : 易发生感冒，体质较弱的朋友请注意适当防护。
                 * info : 易发
                 * name : 感冒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ComfortBean {
                /**
                 * detail : 白天会有降雨，人们会感到有些凉意，但大部分人完全可以接受。
                 * info : 较舒适
                 * name : 舒适度
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DiffusionBean {
                /**
                 * detail : 气象条件有利于空气污染物稀释、扩散和清除。
                 * info : 良
                 * name : 空气污染扩散条件
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DryBean {
                /**
                 * detail : 有降水，路面潮湿，车辆易打滑，请小心驾驶。
                 * info : 潮湿
                 * name : 路况
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DryingBean {
                /**
                 * detail : 有降水，不适宜晾晒。若需要晾晒，请在室内准备出充足的空间。
                 * info : 不宜
                 * name : 晾晒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class FishBean {
                /**
                 * detail : 天气不好，有风，不适合垂钓。
                 * info : 不宜
                 * name : 钓鱼
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class HeatstrokeBean {
                /**
                 * detail : 天气舒适，令人神清气爽的一天，不用担心中暑的困扰。
                 * info : 无中暑风险
                 * name : 中暑
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MakeupBean {
                /**
                 * detail : 风力不大，建议用中性保湿型霜类化妆品，无需选用防晒化妆品。
                 * info : 保湿
                 * name : 化妆
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MoodBean {
                /**
                 * detail : 有降水，雨水可能会使心绪无端地挂上轻愁，与其因下雨而无精打采，不如放松心情，好好欣赏一下雨景。你会发现雨中的世界是那般洁净温和、清新葱郁。
                 * info : 较差
                 * name : 心情
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MorningBean {
                /**
                 * detail : 有较强降水，风力稍大，请避免户外晨练，建议在室内做适当锻炼，保持身体健康。
                 * info : 不宜
                 * name : 晨练
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SportsBean {
                /**
                 * detail : 有降水，推荐您在室内进行各种健身休闲运动，若坚持户外运动，须注意保暖并携带雨具。
                 * info : 较不宜
                 * name : 运动
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SunglassesBean {
                /**
                 * detail : 白天有降水天气，视线较差，不需要佩戴太阳镜
                 * info : 不需要
                 * name : 太阳镜
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SunscreenBean {
                /**
                 * detail : 属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。
                 * info : 弱
                 * name : 防晒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class TourismBean {
                /**
                 * detail : 温度适宜，又有较弱降水和微风作伴，会给您的旅行带来意想不到的景象，适宜旅游，可不要错过机会呦！
                 * info : 适宜
                 * name : 旅游
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class TrafficBean {
                /**
                 * detail : 有降水，路面湿滑，刹车距离延长，事故易发期，注意车距，务必小心驾驶。
                 * info : 一般
                 * name : 交通
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class UltravioletBean {
                /**
                 * detail : 属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。
                 * info : 最弱
                 * name : 紫外线强度
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class UmbrellaBean {
                /**
                 * detail : 有降水，请带上雨伞，如果你喜欢雨中漫步，享受大自然给予的温馨和快乐，在短时间外出可收起雨伞。
                 * info : 带伞
                 * name : 雨伞
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class ObserveBean {
            /**
             * degree : 17
             * humidity : 88
             * precipitation : 0.3
             * pressure : 991.0
             * update_time : 202010151330
             * weather : 雨
             * weather_code : 301
             * weather_short : 雨
             * wind_direction : 3
             * wind_power : 1
             */

            private String degree;
            private String humidity;
            private String precipitation;
            private String pressure;
            private String update_time;
            private String weather;
            private String weather_code;
            private String weather_short;
            private String wind_direction;
            private String wind_power;

            public String getDegree() {
                return degree;
            }

            public void setDegree(String degree) {
                this.degree = degree;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(String precipitation) {
                this.precipitation = precipitation;
            }

            public String getPressure() {
                return pressure;
            }

            public void setPressure(String pressure) {
                this.pressure = pressure;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getWeather_code() {
                return weather_code;
            }

            public void setWeather_code(String weather_code) {
                this.weather_code = weather_code;
            }

            public String getWeather_short() {
                return weather_short;
            }

            public void setWeather_short(String weather_short) {
                this.weather_short = weather_short;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_power() {
                return wind_power;
            }

            public void setWind_power(String wind_power) {
                this.wind_power = wind_power;
            }
        }

        public static class RiseBean {
            /**
             * 0 : {"sunrise":"06:55","sunset":"18:23","time":"20201015"}
             * 1 : {"sunrise":"06:56","sunset":"18:22","time":"20201016"}
             * 10 : {"sunrise":"07:02","sunset":"18:13","time":"20201025"}
             * 11 : {"sunrise":"07:02","sunset":"18:12","time":"20201026"}
             * 12 : {"sunrise":"07:03","sunset":"18:11","time":"20201027"}
             * 13 : {"sunrise":"07:04","sunset":"18:10","time":"20201028"}
             * 14 : {"sunrise":"07:05","sunset":"18:09","time":"20201029"}
             * 15 : {"sunrise":"","sunset":"","time":"20201014"}
             * 2 : {"sunrise":"06:56","sunset":"18:21","time":"20201017"}
             * 3 : {"sunrise":"06:57","sunset":"18:20","time":"20201018"}
             * 4 : {"sunrise":"06:58","sunset":"18:19","time":"20201019"}
             * 5 : {"sunrise":"06:58","sunset":"18:18","time":"20201020"}
             * 6 : {"sunrise":"06:59","sunset":"18:17","time":"20201021"}
             * 7 : {"sunrise":"07:00","sunset":"18:16","time":"20201022"}
             * 8 : {"sunrise":"07:00","sunset":"18:15","time":"20201023"}
             * 9 : {"sunrise":"07:01","sunset":"18:14","time":"20201024"}
             */

            @SerializedName("0")
            private _$0BeanX _$0;
            @SerializedName("1")
            private _$1BeanX _$1;
            @SerializedName("10")
            private _$10Bean _$10;
            @SerializedName("11")
            private _$11Bean _$11;
            @SerializedName("12")
            private _$12Bean _$12;
            @SerializedName("13")
            private _$13Bean _$13;
            @SerializedName("14")
            private _$14Bean _$14;
            @SerializedName("15")
            private _$15Bean _$15;
            @SerializedName("2")
            private _$2BeanX _$2;
            @SerializedName("3")
            private _$3BeanX _$3;
            @SerializedName("4")
            private _$4BeanX _$4;
            @SerializedName("5")
            private _$5BeanX _$5;
            @SerializedName("6")
            private _$6BeanX _$6;
            @SerializedName("7")
            private _$7BeanX _$7;
            @SerializedName("8")
            private _$8Bean _$8;
            @SerializedName("9")
            private _$9Bean _$9;

            public _$0BeanX get_$0() {
                return _$0;
            }

            public void set_$0(_$0BeanX _$0) {
                this._$0 = _$0;
            }

            public _$1BeanX get_$1() {
                return _$1;
            }

            public void set_$1(_$1BeanX _$1) {
                this._$1 = _$1;
            }

            public _$10Bean get_$10() {
                return _$10;
            }

            public void set_$10(_$10Bean _$10) {
                this._$10 = _$10;
            }

            public _$11Bean get_$11() {
                return _$11;
            }

            public void set_$11(_$11Bean _$11) {
                this._$11 = _$11;
            }

            public _$12Bean get_$12() {
                return _$12;
            }

            public void set_$12(_$12Bean _$12) {
                this._$12 = _$12;
            }

            public _$13Bean get_$13() {
                return _$13;
            }

            public void set_$13(_$13Bean _$13) {
                this._$13 = _$13;
            }

            public _$14Bean get_$14() {
                return _$14;
            }

            public void set_$14(_$14Bean _$14) {
                this._$14 = _$14;
            }

            public _$15Bean get_$15() {
                return _$15;
            }

            public void set_$15(_$15Bean _$15) {
                this._$15 = _$15;
            }

            public _$2BeanX get_$2() {
                return _$2;
            }

            public void set_$2(_$2BeanX _$2) {
                this._$2 = _$2;
            }

            public _$3BeanX get_$3() {
                return _$3;
            }

            public void set_$3(_$3BeanX _$3) {
                this._$3 = _$3;
            }

            public _$4BeanX get_$4() {
                return _$4;
            }

            public void set_$4(_$4BeanX _$4) {
                this._$4 = _$4;
            }

            public _$5BeanX get_$5() {
                return _$5;
            }

            public void set_$5(_$5BeanX _$5) {
                this._$5 = _$5;
            }

            public _$6BeanX get_$6() {
                return _$6;
            }

            public void set_$6(_$6BeanX _$6) {
                this._$6 = _$6;
            }

            public _$7BeanX get_$7() {
                return _$7;
            }

            public void set_$7(_$7BeanX _$7) {
                this._$7 = _$7;
            }

            public _$8Bean get_$8() {
                return _$8;
            }

            public void set_$8(_$8Bean _$8) {
                this._$8 = _$8;
            }

            public _$9Bean get_$9() {
                return _$9;
            }

            public void set_$9(_$9Bean _$9) {
                this._$9 = _$9;
            }

            public static class _$0BeanX {
                /**
                 * sunrise : 06:55
                 * sunset : 18:23
                 * time : 20201015
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$1BeanX {
                /**
                 * sunrise : 06:56
                 * sunset : 18:22
                 * time : 20201016
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$10Bean {
                /**
                 * sunrise : 07:02
                 * sunset : 18:13
                 * time : 20201025
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$11Bean {
                /**
                 * sunrise : 07:02
                 * sunset : 18:12
                 * time : 20201026
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$12Bean {
                /**
                 * sunrise : 07:03
                 * sunset : 18:11
                 * time : 20201027
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$13Bean {
                /**
                 * sunrise : 07:04
                 * sunset : 18:10
                 * time : 20201028
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$14Bean {
                /**
                 * sunrise : 07:05
                 * sunset : 18:09
                 * time : 20201029
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$15Bean {
                /**
                 * sunrise :
                 * sunset :
                 * time : 20201014
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$2BeanX {
                /**
                 * sunrise : 06:56
                 * sunset : 18:21
                 * time : 20201017
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$3BeanX {
                /**
                 * sunrise : 06:57
                 * sunset : 18:20
                 * time : 20201018
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$4BeanX {
                /**
                 * sunrise : 06:58
                 * sunset : 18:19
                 * time : 20201019
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$5BeanX {
                /**
                 * sunrise : 06:58
                 * sunset : 18:18
                 * time : 20201020
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$6BeanX {
                /**
                 * sunrise : 06:59
                 * sunset : 18:17
                 * time : 20201021
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$7BeanX {
                /**
                 * sunrise : 07:00
                 * sunset : 18:16
                 * time : 20201022
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$8Bean {
                /**
                 * sunrise : 07:00
                 * sunset : 18:15
                 * time : 20201023
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$9Bean {
                /**
                 * sunrise : 07:01
                 * sunset : 18:14
                 * time : 20201024
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }
        }

        public static class TipsBean {
            /**
             * observe : {"0":"下雨了，出门记得带伞~","1":"现在的温度比较凉爽~"}
             */

            private ObserveBeanX observe;

            public ObserveBeanX getObserve() {
                return observe;
            }

            public void setObserve(ObserveBeanX observe) {
                this.observe = observe;
            }

            public static class ObserveBeanX {
                /**
                 * 0 : 下雨了，出门记得带伞~
                 * 1 : 现在的温度比较凉爽~
                 */

                @SerializedName("0")
                private String _$0;
                @SerializedName("1")
                private String _$1;

                public String get_$0() {
                    return _$0;
                }

                public void set_$0(String _$0) {
                    this._$0 = _$0;
                }

                public String get_$1() {
                    return _$1;
                }

                public void set_$1(String _$1) {
                    this._$1 = _$1;
                }
            }
        }
    }
}
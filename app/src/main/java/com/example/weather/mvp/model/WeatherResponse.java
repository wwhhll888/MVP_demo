package com.example.weather.mvp.model;

/**
 * Created by whl on 2017/4/5.
 */

public class WeatherResponse {


    /**
     * date : 20131012
     * cityName : 北京
     * areaID : 101010100
     * temp : 21℃
     * tempF : 69.8℉
     * wd : 东风
     * ws : 3级
     * sd : 39%
     * time : 15:10
     * sm : 暂无实况
     */

    private SkInfoEntity sk_info;

    public SkInfoEntity getSk_info() {
        return sk_info;
    }

    public void setSk_info(SkInfoEntity sk_info) {
        this.sk_info = sk_info;
    }

    public static class SkInfoEntity {
        private String date;
        private String cityName;
        private String areaID;
        private String temp;
        private String tempF;
        private String wd;
        private String ws;
        private String sd;
        private String time;
        private String sm;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getAreaID() {
            return areaID;
        }

        public void setAreaID(String areaID) {
            this.areaID = areaID;
        }

        public String getTemp() {
            return temp;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public String getTempF() {
            return tempF;
        }

        public void setTempF(String tempF) {
            this.tempF = tempF;
        }

        public String getWd() {
            return wd;
        }

        public void setWd(String wd) {
            this.wd = wd;
        }

        public String getWs() {
            return ws;
        }

        public void setWs(String ws) {
            this.ws = ws;
        }

        public String getSd() {
            return sd;
        }

        @Override
        public String toString() {
            return "SkInfoEntity{" +
                    "date='" + date + '\'' +
                    ", cityName='" + cityName + '\'' +
                    ", areaID='" + areaID + '\'' +
                    ", temp='" + temp + '\'' +
                    ", tempF='" + tempF + '\'' +
                    ", wd='" + wd + '\'' +
                    ", ws='" + ws + '\'' +
                    ", sd='" + sd + '\'' +
                    ", time='" + time + '\'' +
                    ", sm='" + sm + '\'' +
                    '}';
        }

        public void setSd(String sd) {
            this.sd = sd;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getSm() {
            return sm;
        }

        public void setSm(String sm) {
            this.sm = sm;
        }
    }
}

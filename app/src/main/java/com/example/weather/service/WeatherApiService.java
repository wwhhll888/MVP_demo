package com.example.weather.service;

import com.example.weather.mvp.model.WeatherResponse;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by whl on 2017/4/5.
 */

public interface WeatherApiService {

    //获取天气信息
    @GET("/data/sk/101010100.html")
    Observable<WeatherResponse> getWeatherInfo();

}

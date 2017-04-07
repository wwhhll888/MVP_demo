package com.example.weather.di.module;

import com.example.weather.di.scope.PerActivity;
import com.example.weather.mvp.view.MainView;
import com.example.weather.service.WeatherApiService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by whl on 2017/4/5.
 */
@Module
public class ApiModule {

    private MainView mView;

    public ApiModule(MainView view) {
        mView = view;
    }

    @Provides
    @PerActivity
    WeatherApiService provideWeatherApiService(Retrofit retrofit){
        return retrofit.create(WeatherApiService.class);
    }


    @Provides
    @PerActivity
    MainView provideView() {
        return mView;
    }


}

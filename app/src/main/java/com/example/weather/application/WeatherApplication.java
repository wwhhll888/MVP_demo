package com.example.weather.application;

import android.app.Application;

import com.example.weather.di.component.ApiComponent;
import com.example.weather.di.component.DaggerApiComponent;
import com.example.weather.di.component.DaggerNetComponent;
import com.example.weather.di.component.NetComponent;
import com.example.weather.di.module.NetModule;
import com.example.weather.mvp.model.Contants;

/**
 * Created by whl on 2017/4/5.
 */

public class WeatherApplication extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        resolveDependency();
    }

    private void resolveDependency() {
        mNetComponent = DaggerNetComponent.builder()
                .netModule(new NetModule(Contants.BASE_URL))
                .build();
    }


    public NetComponent getNetComponent() {
        return mNetComponent;
    }

}

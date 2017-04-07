package com.example.weather.di.component;

import com.example.weather.modules.MainActivity;
import com.example.weather.di.module.ApiModule;
import com.example.weather.di.scope.PerActivity;

import dagger.Component;

/**
 * Created by whl on 2017/4/5.
 */
@PerActivity
@Component(modules = ApiModule.class,dependencies = NetComponent.class)
public interface ApiComponent {

    void inject(MainActivity mainActivity);

}

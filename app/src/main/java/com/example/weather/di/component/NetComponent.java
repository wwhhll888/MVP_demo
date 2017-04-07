package com.example.weather.di.component;

import com.example.weather.di.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by whl on 2017/4/5.
 * 网络请求工具
 *
 */
@Singleton
@Component(modules = NetModule.class)
public interface NetComponent {

    Retrofit provideRetrofit();

}

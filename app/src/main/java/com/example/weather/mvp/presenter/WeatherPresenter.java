package com.example.weather.mvp.presenter;

import com.example.weather.mvp.model.WeatherResponse;
import com.example.weather.mvp.view.MainView;
import com.example.weather.service.WeatherApiService;

import javax.inject.Inject;

import retrofit2.http.GET;
import rx.Observable;
import rx.Observer;

/**
 * Created by whl on 2017/4/5.
 */

public class WeatherPresenter extends BasePresenter<MainView> implements Observer<WeatherResponse> {

    @Inject
    protected WeatherApiService mApiService;

    @Inject
    public WeatherPresenter() {

    }

    public void getWeatherInfo() {
        getView().onShowDialog("请求数据中...");
        Observable<WeatherResponse> weatherResponseObservable = mApiService.getWeatherInfo();
        subscribe(weatherResponseObservable,this);
    }

    @Override
    public void onCompleted() {
        getView().onHideDialog();
    }

    @Override
    public void onError(Throwable e) {
        getView().onHideDialog();
    }

    @Override
    public void onNext(WeatherResponse weatherResponse) {
        getView().onHideDialog();
        getView().onWeatherInfoLoaded(weatherResponse);
    }
}

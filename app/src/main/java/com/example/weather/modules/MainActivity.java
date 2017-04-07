package com.example.weather.modules;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.weather.R;
import com.example.weather.di.component.DaggerApiComponent;
import com.example.weather.di.module.ApiModule;
import com.example.weather.mvp.model.WeatherResponse;
import com.example.weather.mvp.presenter.WeatherPresenter;
import com.example.weather.mvp.view.MainView;
import com.example.weather.utils.NetworkUtils;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements MainView {

    @Bind(R.id.text)
    protected TextView mTextView;

    @Inject
    protected WeatherPresenter mPresenter;

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        netGetWeatherInfo();
    }

    private void netGetWeatherInfo() {
        if(NetworkUtils.isNetAvailable(this)) {
            mPresenter.getWeatherInfo();
        }
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void resolveDaggerDependency() {
        DaggerApiComponent.builder()
                .netComponent(getNetComponent())
                .apiModule(new ApiModule(this))
                .build().inject(this);
    }

    @Override
    public void onWeatherInfoLoaded(WeatherResponse weatherResponse) {
        hideDialog();
        mTextView.setText(weatherResponse.getSk_info().toString());
    }

    @Override
    public void onShowDialog(String message) {
        showDialog(message);
    }

    @Override
    public void onHideDialog() {
        hideDialog();
    }
}

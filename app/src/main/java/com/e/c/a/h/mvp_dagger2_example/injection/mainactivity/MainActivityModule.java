package com.e.c.a.h.mvp_dagger2_example.injection.mainactivity;

import com.e.c.a.h.mvp_dagger2_example.view.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hugoa on 5/3/2017.
 */

@Module
public class MainActivityModule {

    @Provides
    public MainActivityPresenter provideMainActivityPresenter() {
        return new MainActivityPresenter();
    }
}

package com.e.c.a.h.mvp_dagger2_example.injection.mainactivity;

import com.e.c.a.h.mvp_dagger2_example.view.mainactivity.MainActivity;

import dagger.Component;

/**
 * Created by hugoa on 5/3/2017.
 */

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}

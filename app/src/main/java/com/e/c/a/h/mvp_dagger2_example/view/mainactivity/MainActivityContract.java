package com.e.c.a.h.mvp_dagger2_example.view.mainactivity;

/**
 * Created by hugoa on 5/3/2017.
 */

public interface MainActivityContract {

    interface View {
        void updateView(String log);
    }

    interface Presenter<V extends View> {
        void addView(V view);
        void doCalculation(String log);
    }
}

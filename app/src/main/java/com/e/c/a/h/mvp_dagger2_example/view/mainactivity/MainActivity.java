package com.e.c.a.h.mvp_dagger2_example.view.mainactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.e.c.a.h.mvp_dagger2_example.R;
import com.e.c.a.h.mvp_dagger2_example.injection.mainactivity.DaggerMainActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private static final String TAG = "HACE:";
    TextView textView;

    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivityComponent.create().inject(this);

        textView = (TextView) findViewById(R.id.textView);

        presenter.addView(this);
        presenter.doCalculation("Hello dagger 2");
    }


    @Override
    public void updateView(String log) {
        textView.setText(log);
        Log.d(TAG, "updateView: the log is:" + log);
    }
}

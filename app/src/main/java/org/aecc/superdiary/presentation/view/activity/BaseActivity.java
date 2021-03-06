package org.aecc.superdiary.presentation.view.activity;

import android.app.Activity;
import android.widget.Toast;

import org.aecc.superdiary.presentation.AndroidApplication;
import org.aecc.superdiary.presentation.internal.di.components.ApplicationComponent;
import org.aecc.superdiary.presentation.internal.di.modules.ActivityModule;
import org.aecc.superdiary.presentation.navigator.Navigator;

import javax.inject.Inject;


public class BaseActivity extends Activity {

    @Inject
    Navigator navigator;

    protected ApplicationComponent getApplicationComponent() {
        return ((AndroidApplication) getApplication()).getApplicationComponent();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    protected void showToastMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}

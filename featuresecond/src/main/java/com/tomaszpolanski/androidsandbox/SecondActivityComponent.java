package com.tomaszpolanski.androidsandbox;

import com.tomaszpolanski.androidsandbox.injection.activity.BaseActivityComponent;
import com.tomaszpolanski.androidsandbox.injection.activity.BaseActivityModule;
import com.tomaszpolanski.androidsandbox.injection.activity.PerActivity;
import com.tomaszpolanski.androidsandbox.injection.app.BaseApplicationComponent;

import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {BaseActivityModule.class})
public interface SecondActivityComponent extends BaseActivityComponent {

    void inject(final SecondActivity activity);
}



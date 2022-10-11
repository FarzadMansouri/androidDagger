package com.example.android.dagger.di.components

import com.example.android.dagger.di.scope.ActivityScope
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface UserComponent {

    @Subcomponent.Factory
    interface Factory{
        fun create():UserComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)
}
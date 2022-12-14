package com.example.android.dagger.di.components

import android.content.Context
import com.example.android.dagger.di.modules.StorageModule
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class,AppSubComponent::class])
interface AppComponent {

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context):AppComponent
    }

    fun registrationComponent():RegistrationComponent.Factory
    fun loginComponent():LoginComponent.Factory
    fun userManager(): UserManager

}
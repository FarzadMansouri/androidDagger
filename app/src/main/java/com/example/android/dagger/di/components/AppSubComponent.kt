package com.example.android.dagger.di.components

import dagger.Module
import dagger.Subcomponent

@Module(subcomponents = [RegistrationComponent::class,LoginComponent::class,UserComponent::class])
class AppSubComponent {
}
package com.example.myapplication


import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class EngineModule {

    //매개변수를 컴포넌트에 넘겨주는 방법에는 Binds 어노테이션이 있음.
    @Binds
    abstract fun bindBEngine(e : BEngine) : com.example.myapplication.Engine

}
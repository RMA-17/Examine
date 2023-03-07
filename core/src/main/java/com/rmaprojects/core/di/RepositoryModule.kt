package com.rmaprojects.core.di

import com.rmaprojects.core.data.repository.ExamineRepositoryImpl
import com.rmaprojects.core.domain.ExamineRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [NetworkModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideRepository(repositoryImpl: ExamineRepositoryImpl): ExamineRepository
}
package com.corouties.core.di

import com.corouties.core.arch.repo.LocalRepository
import com.corouties.core.arch.repo.RemoteRepository
import com.corouties.core.arch.repo.Repository
import okhttp3.OkHttpClient
import org.koin.core.KoinComponent
import org.koin.core.inject
import org.koin.dsl.module

val netModule = module {
    single { OkHttpClient() }
    single { OkHttpClient() }
}

val dataModule = module {
    single { LocalRepository() }
    single { Repository(get(), get()) }
    single { RemoteRepository(get()) }
}

class Application : KoinComponent {
    val repository: Repository by inject()
}
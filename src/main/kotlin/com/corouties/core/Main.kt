package com.corouties.core

import com.corouties.core.di.Application
import com.corouties.core.di.dataModule
import com.corouties.core.di.netModule
import org.koin.core.context.startKoin


fun main(args: Array<String>) {
    println("Hello world!")
    init()
    Application().repository
}

fun init() {
    startKoin {
        val list = mutableListOf(netModule, dataModule)
        modules(list)
    }
}
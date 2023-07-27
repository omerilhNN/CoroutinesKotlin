package com.omrilhn.coroutineskotlin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class DispatchersCoroutine {
    fun main()
    {
        //Dispatchers.Default -> CPU Intensive
        //Dispatchers.IO -> Input Output - Networking processes(Getting image from internet etc.)
        //Dispatchers.Main -> UI ile alakalı işlemler
        //Dispatchers.Unconfined -> Inherited dispatcher
        runBlocking {
            launch(Dispatchers.Main){
                println("Main Thread : ${Thread.currentThread().name}")
            }
            launch(Dispatchers.IO){
                println("IO Thread : ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Unconfined){
                println("Unconfined Thread : ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Default){
                println("Default Thread : ${Thread.currentThread().name}")
            }
        }
    }
}
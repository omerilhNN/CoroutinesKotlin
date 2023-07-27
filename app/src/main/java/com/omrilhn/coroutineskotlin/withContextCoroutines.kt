package com.omrilhn.coroutineskotlin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main()
{
    runBlocking {
        //reference from one launch to another
        launch (Dispatchers.Default){
            println("Context: ${coroutineContext}")
            withContext(Dispatchers.IO)
            {
                println("Context: ${coroutineContext}")
            }
        }
    }
}
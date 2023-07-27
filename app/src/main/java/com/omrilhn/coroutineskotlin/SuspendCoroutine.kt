package com.omrilhn.coroutineskotlin

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main()
{
    GlobalScope.launch {
        myFunction()//you can call suspend fun in another coroutine scope, if not then you cannot call suspend fun out of it
    }
}
suspend fun myFunction()
{
    coroutineScope {
        delay(50000)
        println("delay succesfully")
    }
}
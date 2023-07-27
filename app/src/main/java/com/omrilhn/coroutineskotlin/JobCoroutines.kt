package com.omrilhn.coroutineskotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()
{
    runBlocking {
        val job = launch {
            delay(2000)
            println("job")
            val secondJob = launch {
                println("job2")
            }
        }
        job.invokeOnCompletion {
            println("Job has ended you can do smth")
        }
        job.cancel() // Cancel whatever inside of the "job" and print "job2" in onCompletion
    }

}
package com.omrilhn.coroutineskotlin

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()
{
    var userName =""
    var userAge = 0

    runBlocking {
        //Wait for getting values with "async" and asign them to the variables
        val downloadedName = async {
            downloadName()
        }
        val downloadedAge = async {
            downloadAge()
        }
        userName = downloadedName.await()
        userAge = downloadedAge.await()

        println("${userName} ${userAge}")
    }
}

suspend fun downloadName() : String //it is suspend because we use Coroutine elements in this function
{
    delay(2000)
    val username = "omer"
    println("username downloaded")
    return username
}
suspend fun downloadAge:Int
{
    delay(4000)
    val userage = 21
    println("userage downloaded")
    return userage
}
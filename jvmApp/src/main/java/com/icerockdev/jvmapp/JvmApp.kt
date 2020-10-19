package com.icerockdev.jvmapp

import com.icerockdev.kmmapplicationtest.shared.Greeting
import com.icerockdev.kmmapplicationtest.shared.Platform

fun main(args: Array<String>) {
    val g = Greeting()
    val p = Platform()
    println(g.greeting())
}

package com.example.coroutine_progress

class Test {

    fun test (){
        val a = 20
        val b = 30
        val c = a.times()


    }
    fun Int.times(): Int{
        return this * this
    }

    fun String_Add() {
        val a = "Sherman"
        val b = a.plus("Hello")

    }
    fun String.plus(other: String): String {
        return this + other
    }
}
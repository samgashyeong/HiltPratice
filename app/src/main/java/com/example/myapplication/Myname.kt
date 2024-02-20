package com.example.myapplication

import javax.inject.Inject

class Myname @Inject constructor(){
    override fun toString(): String {
        return "hilt 연습"
    }
}
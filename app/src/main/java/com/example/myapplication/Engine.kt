package com.example.myapplication

import javax.inject.Inject


interface Engine
class AEngine @Inject constructor() : Engine{

}

class BEngine @Inject constructor(): Engine{

}
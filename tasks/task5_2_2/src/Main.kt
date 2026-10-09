// Task 5.2.2: conversion of marks into grades, using a function

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size == 0) {
        println("ERROR: Please enter the marks!")
        exitProcess(1)
    }

    for (mark in args) {
        println("$mark is a ${grade(mark.toInt())}")
    }

}

fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}
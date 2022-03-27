package ch03.varargs

import java.util.Arrays

fun main(args: Array<String>) {
    val list = listOf("args: ", *args)
    println(list)
}

fun <T> listOf(vararg values: T): List<T> {
    return Arrays.asList(*values)
}

package ch03.strings

//fun String.lastChar(): Char = this[this.length - 1]
fun String.lastChar(): Char = this[length - 1]

val String.lastChar: Char
    get() = get(length - 1)

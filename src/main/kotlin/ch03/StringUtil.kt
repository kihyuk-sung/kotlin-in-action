@file:JvmName("StringFunctions")

package ch03

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "[",
    postfix: String = "]",
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}


@JvmOverloads
fun <T> joinToStringOverloads(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "[",
    postfix: String = "]",
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}


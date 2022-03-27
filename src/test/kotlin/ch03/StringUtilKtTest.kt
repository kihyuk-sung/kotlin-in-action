package ch03

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import ch03.strings.lastChar as last

internal class StringUtilKtTest {
    private val separator = "; "
    private val prefix = "("
    private val postfix = ")"

    @Test
    fun joinToString() {
        val list = listOf(1, 2, 3)

        assertThat(joinToString(list, separator = separator, prefix = prefix, postfix = postfix))
            .isEqualTo("(1; 2; 3)")
    }

    @Test
    fun joinToStringWithDefault() {
        val list = listOf(1, 2, 3)

        assertThat(joinToString(list))
            .isEqualTo("[1, 2, 3]")
    }

    @Test
    fun joinToStringWithOverloads() {
        val list = listOf(1, 2, 3)

        assertThat(joinToStringOverloads(list))
            .isEqualTo("[1, 2, 3]")
    }

    @Test
    fun joinToStringJava() {
        val list = listOf(1, 2, 3)
        assertThat(StringUtilJava.joinToString(list, separator, prefix, postfix))
            .isEqualTo("(1; 2; 3)")
    }

    @Test
    fun importMethod() {
        assertThat("Kotlin".last()).isEqualTo('n')
    }

    @Test
    fun parsePath() {
        val path = "/Users/yole/kotlin-book/chapter.adoc"
        val directory = path.substringBeforeLast("/")
        val fullName = path.substringAfterLast("/")
        val fileName = fullName.substringBeforeLast(".")
        val extension = fullName.substringAfterLast(".")

        assertThat(directory).isEqualTo("/Users/yole/kotlin-book")
        assertThat(fullName).isEqualTo("chapter.adoc")
        assertThat(fileName).isEqualTo("chapter")
        assertThat(extension).isEqualTo("adoc")
    }

    @Test
    fun parsePathRegex() {
        val path = "/Users/yole/kotlin-book/chapter.adoc"
        val regex = """(.+)/(.+)\.(.+)""".toRegex()
        val matchResult = regex.matchEntire(path)!!

        val (directory, fileName, extension) = matchResult.destructured

        assertThat(directory).isEqualTo("/Users/yole/kotlin-book")
        assertThat(fileName).isEqualTo("chapter")
        assertThat(extension).isEqualTo("adoc")
    }

    @Test
    fun stringLiteral() {
        val kotlinLogo = """|  //
                           .| //
                           .|/ \"""
        println(kotlinLogo.trimMargin("."))
    }
}

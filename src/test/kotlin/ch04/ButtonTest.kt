package ch04

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.NotSerializableException
import java.io.ObjectOutputStream

internal class ButtonTest {
    @Test
    fun test() {
        val b = ButtonJava()
        val s = b.getCurrentState()
        val os = ObjectOutputStream(ByteArrayOutputStream())
        Assertions.assertThatThrownBy { os.writeObject(s) }.isInstanceOf(NotSerializableException::class.java)
    }
}

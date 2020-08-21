import PersonOuterClass.*
import java.io.File

fun main() {
    writeGoogleOldValue()
}

fun writeGoogleOldValue() {
    val readBytes = File("google1").readBytes()
    val person1 = Person.parseFrom(readBytes)
    println(person1.name)
}
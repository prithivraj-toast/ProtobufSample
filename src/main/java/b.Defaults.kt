import PersonOuterClass.*
import java.io.File

fun main() {
    writeGooglePartial()
    readGooglePartial()
}

fun writeGooglePartial() {
    val person = Person.newBuilder().apply {
        name = "Raj"
        phone = "007"
    }.build()
    val byteArray = person.toByteArray()
    File("google1").writeBytes(byteArray)
}

fun readGooglePartial() {
    val readBytes = File("google1").readBytes()
    val person1 = Person.parseFrom(readBytes)
    println(person1.id)
}
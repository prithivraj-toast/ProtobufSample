import PersonOuterClass.*
import java.io.File

private fun main() {
    writeGoogle()
    readGoogle()
}

private fun writeGoogle() {
    val person = Person.newBuilder().apply {
        name = "Raj"
        id = 1
        phone = "007"
        phoneType = PhoneType.MOBILE
    }.build()
    val byteArray = person.toByteArray()
    File("google1").writeBytes(byteArray)
}

private fun readGoogle() {
    val readBytes = File("google1").readBytes()
    val person1 = Person.parseFrom(readBytes)
    println(person1)
}
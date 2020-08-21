import PersonOuterClass.Person
import java.io.File

fun main() {
    writeGoogleWithoutEnum()
}

fun writeGoogleWithoutEnum() {
    val readBytes = File("google1").readBytes()
    val person1 = Person.parseFrom(readBytes)
    println(person1.phoneType)
}
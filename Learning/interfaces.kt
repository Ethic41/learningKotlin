import java.io.InputStream
import java.io.OutputStream

/*
Author: Dahir Muhammad Dahir
Date: 04-04-2019 01:17 AM
*/

/* INTERFACES */

interface Document {
    val version: Long
    val size: Long

    val name: String
    get() = "NoName"

    fun save(input: InputStream)
    fun load(stream: OutputStream)
    fun getDescription(): String {
        return "Document $name has $size byte(-s) of $version"
    }
}

class DocumentImpl : Document {
    override val size: Long
    get() = 0

    override fun load(stream: OutputStream){
        //code here
    }

    override fun save(input: InputStream){
        //implementation
    }

    override val version: Long
    get() = 0
}

fun main(){
    //main entry point OEP

}
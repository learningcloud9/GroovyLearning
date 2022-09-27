import java.io.File

class IOExample {

    /*

    Java Util Package also available to use

    java.io.File
    java.io.InputStream
    java.io.OutputSteam
    java.io.Reader
    java.io.Writer

    */

    static void main(String[] args) {
        // eachline is inbuild on Groovy
        new File("ReadWriteFile.txt").eachLine {
            line -> println "line : $line"
        }
    }

}

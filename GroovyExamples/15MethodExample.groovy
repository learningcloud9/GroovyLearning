class MethodExample {

    // by default all methods are public
    // def will be used only when there is no return type

    // simple method
    static def DisplayInformation() {
        println('Welcome')
        println('Groovy Examples')

        // private method calling
        helloPrivate()
    }
    // private method
    private static def helloPrivate() {
        println('I am very private method')
    }

    // Paramaterised Method Example
    static def paramaterisedMethod(int para1, int para2, int para3, int para4) {
        println('Passed Parameter Value of para 1 is ' + para1)
        println('Passed Parameter Value of para 2 is ' + para2)
        println('Passed Parameter Value of para 3 is ' + para3)
        println('Passed Parameter Value of para 4 is ' + para4)
    }

   // Default Parameter Methods - To be checked, how to pass only 3 parater value at runtime
   /*
   static def defaultParameterisedMethod(int para1=100, String para2='Hello Groovy', int para3=10, int para4=11) {
        println('Value of para1 is ' + para1)
        println('Value of para2 is ' + para2)
        println('Value of para3 is ' + para3)
        println('Value of para4 is ' + para4)
   }
    */

    // Default Parameter Methods
    static def defaultParameterisedMethod(int para1=100, String para2='Hello Groovy', int para3) {
        println('Value of para1 is ' + para1)
        println('Value of para2 is ' + para2)
        println('Value of para3 is ' + para3)
    }

    // Method with return value
    static int sum(int a, int b) {
        int c = a + b
        return c
    }

    static void main(String[] args) {
        DisplayInformation()
        paramaterisedMethod(0, 1, 2, 3)
        // defaultParameterisedMethod(1, , , )
        defaultParameterisedMethod(1, 1001)
        println(sum(10, 20))
    }

}

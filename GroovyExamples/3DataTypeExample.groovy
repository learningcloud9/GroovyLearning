class DataTypeExample {

    static void main(String[] args) {
        // -128 to 127
        byte b = 127

        //    -32,768 to 32,767
        short s = 32767

        // -2,147,483,648 to 2,147,483,647
        int i = 2147483647

        // -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
        long l = 9223372036854775807

        // 1.40129846432481707e-45 to 3.40282346638528860e+38
        float f = 3.40282346638528860e+38

        // 4.94065645841246544e-324d to 1.79769313486231570e+308d
        double d = 1.79769313486231570e+308d

        char c = 'c'

        Boolean bl = false

        String st = 'This is Groovy Saying'

        println(b)
        println(s)
        println(i)
        println(l)
        println(f)
        println(d)
        println(c)
        println(bl)
        println(st)
        println('Is this Groovy saying ?? ' + bl)
    }

}

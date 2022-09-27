class ForInLoopExample {

    static void main(String[] args) {
        // using array
        int[] array = [0, 1, 2, 3, 4, 5]
        for (int i in array) {
            println(i)
        }
        println("Another Example")
        // using internal range counter
        for (int i in 1..5) {
            println(i)
        }
        println("Another Example")
        // Using Map
        def employee = ["groovy": 21, "learning": 22, "fun": 23]
        for (emp in employee){
            println(emp)
        }
    }

}

class BreakStatementExample {

    static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            println(i)
            if (i == 4) {
                println('value of i reached to ' + i + ', Breaking the system')
                break
            }
        }

    }
}

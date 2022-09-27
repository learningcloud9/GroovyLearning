class ContinueStatementExample {

    static void main(String[] args) {
        for (int i in 1..10) {
            if (i == 2 || i == 4 || i == 6 || i == 8 || i == 10) {
                continue
            }
            println(i)
        }
    }

}

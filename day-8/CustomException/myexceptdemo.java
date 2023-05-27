class myexceptdemo {
    static void compute() throws myexcept {
        System.out.println("Called compute");
        throw new myexcept();
        // System.out.println("End of compute");
    }

    public static void main(String data[]) {
        try {
            compute();
        } catch (myexcept e) {
            System.out.println("Caught: " + e);
        }
        System.out.println("End of program");

        System.out.println("\n^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
        TestThrowResearch.checkNum(-3);
    }
}
class myexcept extends Exception {

    myexcept() {
        System.out.println("From const");
    }

    public String toString() {
        return "This is my exception.";
    }
}
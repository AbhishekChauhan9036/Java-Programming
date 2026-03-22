class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class CustomException {
    public static void main(String[] args) throws Exception {
        throw new MyException("My Custom Exception");
    }
}
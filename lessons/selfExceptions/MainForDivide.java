package lessons.selfExceptions;

public class MainForDivide {
//    public static void main(String[] args) {
//        System.out.println("Start working");
//        try {
//            throw new DivideByZeroException();
//        } catch (DivideByZeroException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws DivideByZeroException {
        System.out.println("Start");
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            throw new DivideByZeroException(e);
        }
    }
}

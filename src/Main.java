public class Main {
    public static void main(String[] args) {

        try {
            SecurityUtils.check("Player1", "qaz12345*6", "qaz123456");
        } catch (WrongPasswordException e) {
            System.out.println("Error!");
        }
    }
}
public class Main {
    public static void main(String[] args) {

        try {
            SecurityUtils.check("Player1", "qaz123456", "qaz123456");
            System.out.println("Все отлично");
        } catch (Exception e) {
            System.out.println("Error!");
        }

    }
}
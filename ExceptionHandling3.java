//interview type question.
public class ExceptionHandling3 {
    static int add() {
        try {
            return 10 + 20;
        } catch (Exception ee) {
        } finally {
            return 30+10;  
        }
    }

    public static void main(String[] args) {
        System.out.println(add());
    }
}
import java.util.*;

public class InputOutput{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        System.out.printf("%d\n%d\n%d",a,b,c);
        input.close();
}
}

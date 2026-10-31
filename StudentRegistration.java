import java.util.*;

public class StudentRegistration{
    public static void main(String[] args){

        HashSet<Integer> rno = new HashSet<>();

        rno.add(1);
        rno.add(2);
        rno.add(3);
        rno.add(4);
        rno.add(5);
        rno.add(6);
        rno.add(7);
        rno.add(8);
        rno.add(9);
        rno.add(10);

        System.out.println(rno);

        rno.add(1);
        rno.add(2);
        rno.add(3);
        rno.add(4);

        System.out.println(rno);

        HashSet<Integer> rno2 = new HashSet<>();
        
        rno2.addAll(rno);

        System.out.println(rno.contains(3));

        System.out.println(rno.containsAll(rno2));

        rno.remove(6);

        HashSet<Integer> rno3 = new HashSet<>();

        rno3.add(3);
        rno3.add(1);
        rno3.add(6);
        rno3.add(9);


        
    }
}
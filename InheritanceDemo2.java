// class SuperClass1 {
//     double calculate(int a) {
//         return Math.pow(10, a);
//     }
// }

// class SuperClass2 {
//     double calculate(int a) {
//         return Math.abs(a);
//     }
// }

// interface first{
//     public abstract double calculate(int a);    //public abstract are keywords.
// }
// interface second{
//     double calculate(int a);
// }
// class SubClass implements first, second  {
//     public double calculate(int a){
//         return Math.pow(10,a);
//     }
// }
class A{

}
class B extends A{
    double calculate(int a){
        return Math.pow(10,a);
    }
}
interface C{
    double calculate(int a);
}
class D extends B implements C{
    public double calculate(int a){
        return 0.0;
    }
}
public class InheritanceDemo2 {
    public static void main(String[] args) {
        D sb1 = new D();
        System.out.println("Result =" + sb1.calculate(3));
    }
}
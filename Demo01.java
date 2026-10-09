interface Operations {
    int compute(int num1, int num2);
}

// class BasicCalculator implements Operations {
//     @Override
//     public int compute(int num1, int num2) {
//         return num1 + num2;
//     }
// }

// class PowCalc implements Operations {
//     @Override
//     public int compute(int num1, int num2) {
//         return (int) Math.pow(num1, num2);
//     }
// }

public class Demo01 {
    public static void main(String[] args) {
        Operations obj4 = new Operations(){
            @Override
            public int compute(int num1, int num2){
                return Math.abs(num1-num2);
            }
        };
        System.out.println("Result: "+obj4.compute(12,42));
        Operations obj5 = new Operations(){
            @Override
            public int compute(int num1, int num2){
                return num1*num2;
            }
        };
        System.out.println("Result: "+obj5.compute(1234,5123));
    }
}
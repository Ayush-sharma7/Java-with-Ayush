class A {
    int money;
    private int pocketMoney;

    A(){
        System.out.println("A Class Const.");
    }

    A(int a, int b){
        System.out.println("A Class Parameterized Const.");
    }

    void fill(int money, int pocketMoney) {
        this.money = money;
        this.pocketMoney = pocketMoney;
    }

    public int getPocketMoney() {
        return pocketMoney - 400;
    }
}

class B extends A {
    int total;

    B(){
        super(10,20);    //way to call parameterized super class constructor. it acts as a place holder for super class.
        System.out.println("B class Const.");
    }

    void sum() {
        total = money + getPocketMoney();   // wont run because pocketMoney is private element.
    }
}

public class InheritanceDemo1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.fill(1000, 500);
        obj.sum();
        System.out.println(obj.total);
    }
}
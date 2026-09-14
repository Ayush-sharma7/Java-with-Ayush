class A {
    int money;
    private int pocketMoney;

    void fill(int money, int pocketMoney) {
        this.money = money;
        this.pocketMoney = pocketMoney;
    }
    public int getPocketMoney(){
        return pocketMoney-400;
    }
}

class B extends A {
    int total;

    void sum() {
        total = money + getPocketMoney(); // wont run because pocketMoney is private element.
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
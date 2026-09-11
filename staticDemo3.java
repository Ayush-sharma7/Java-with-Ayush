class Sample1 {
    int x;
    static int y;

    void setX(int x) {
        this.x = x;
    }

    static void setY(int y) {
        Sample1.y = y;
    }

    int getX() {
        return this.x;
    }

    static int getY() {
        return Sample1.y;
    }
}

public class staticDemo3 {
    public static void main(String[] args) {
        Sample1.setY(200);
        System.out.println("Y = " + Sample1.getY());

        Sample1 obj = new Sample1();
        obj.setX(100);
        System.out.println("X = " + obj.getX());
        System.out.println("Y = " + Sample1.getY());
    }
}
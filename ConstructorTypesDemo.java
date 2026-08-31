class Product{
    int pid;
    String pname;
    int pprice;

    //default constructors
    Product(){
        System.out.println("\nDefault constructor.");
        pid=0;pname="Product";pprice=0;
    }
    Product(int id, String name){
        System.out.println("\nParameterized constructor 1");
        pid = id;
        pname = name;
        pprice = 0;
    }
    Product(int id, String name, int price){
        System.out.println("\nParameterized constructor 2");
        pid= id;
        pname = name;
        pprice = price;
    }
    Product(Product p ){
        System.out.println("\nCopy constructor");
        pid = p.pid;
        pname = p.pname;
        pprice = p.pprice;
    }

    void getInfo(){
        System.out.println("Product details" );
        System.out.println(pid + "/"+pname+"/"+pprice);
    }
}
public class ConstructorTypesDemo{
    public static void main(String[] args){
        Product p1= new Product();
        System.out.println("Product p1: ");
        p1.getInfo();
    }
}
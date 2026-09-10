// static block
// static method


class Vehicle{
    int id;
    String name;
    static String manufacturer;

    static{
        System.out.println("This is static block.");
        Vehicle.manufacturer = "Maruti";
    }
    Vehicle(int id, String name){
        this.id = id;
        this.name = name;
    }
    void getInfo(){
        System.out.println("\nID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Manufacturer: "+manufacturer+"\n");
    }
}
public class StaticDemo2 {
    public static void main(String[] args){
        Vehicle vehicle1 = new Vehicle(1001,"car");
        Vehicle vehicle2 = new Vehicle(1002,"bike");
        Vehicle vehicle3 = new Vehicle(1003,"cycle");
        
        vehicle1.getInfo();
        Vehicle.manufacturer="Honda";
        vehicle2.getInfo();
        vehicle3.getInfo();
    }
}

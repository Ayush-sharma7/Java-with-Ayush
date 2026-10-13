// import java.util.*;

class RestaurantEmployee {
    void performduty() {
        System.out.println("Emp: Performs General Duties");
    }
}

class Chef extends RestaurantEmployee {
    void performduty(){
        System.out.println("Chef: Performs general duty" );
    }
}

class Cashier extends RestaurantEmployee {
    void performduty(){
        System.out.println("Cashier: Handles billing and payments");
    }
}

class Waiter extends RestaurantEmployee {
    void performduty(){
        System.out.println("Waiter: Performs general duty");
    }
}

public class RestaurantEmployeeDutyManagement {
    public static void main(String[] args) {
        Chef ch = new Chef();
        ch.performduty();
    }
}
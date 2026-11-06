class Customer {
    int customerId;
    String name;
    String mobileNumber;
    String email;
    String address;

    Customer(int customerId,
            String name,
            String mobileNumber,
            String email,
            String address) {
        this.customerId = customerId;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    void updateName(String name) {
        this.name = name;
    }

    void updateMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    void updateAddress(String address) {
        this.address = address;
    }

    void updateEmail(String email) {
        this.email = email;
    }

    void displayDetails() {
        System.out.println("Customer Id: " + customerId);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
        System.out.println("Customer Mobile Number: " + mobileNumber);
        System.out.println("Customer Address: " + address);
    }
}

public class CustomerProfile {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Ayush", "7505922273", "ayushhsharmaa7@gmail.com", "Mathura");
        c1.displayDetails();
        c1.updateName("Ayush Sharma");
        c1.updateMobileNumber("9528126975");
        c1.updateEmail("ayushsharma@gmail.com");
        c1.updateAddress("Maholi Road");
        c1.displayDetails();
    }
}
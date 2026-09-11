class Book{

    private int bid;
    private String bname;

    public Book(int bid, String bname){
        this.bid = bid;
        this.bname = bname;
    }

    static class Publisher{
        private int pid;
        private String pname;

        public Publisher(int pid, String pname){
            this.pid = pid;
            this.pname = pname;
        }

        void getInfo(){
            System.out.println("publisher: ");
            System.out.println("ID: "+pid);
            System.out.println("Name: "+pname);
        }
    }
        
        void getInfo(){
            System.out.println("Book: ");
            System.out.println("Book ID: "+bid);
            System.out.println("Book Name: "+bname);
    }
}

public class StaticDemo4{
    public static void main(String[] args){
        Book book1 = new Book(1001,"Java");
        Book book2 = new Book(1002,"Python");

        Book.Publisher publisher1 = new Book.Publisher(11,"SM");

        publisher1.getInfo();
        book1.getInfo();
        book2.getInfo();
    }
}

import java.util.*;

class Library{
    ArrayList<String> Titles;

    public Library(ArrayList<String> Titles){
        this.Titles = Titles;
    }
    void addBook(String title){
        Titles.add(title);
    }
    void insertBook(int index, String title){
        Titles.add(index, title);
    }
    void updateBook(String oldTitle, String newTitle){
        int index = Titles.indexOf(oldTitle);
        Titles.set(index,newTitle);
    }
    void removeBook(String title){
        if(Titles.contains(title)){
            Titles.remove(title);
        }
    }
    int searchBook(String title){
        return Titles.indexOf(title);
    }
    void displayBooks(){
        System.out.println(Titles);
    }
    int getTotalBooks(){
        return Titles.size();
    }
}

public class LibraryBookManagement{
    public static void main(String[] args){

        ArrayList<String> l1 = new ArrayList<>();

        l1.add("abcd");
        l1.add("jaklsdjf");
        l1.add("jadkr");
        l1.add("ja;ldjf");
        l1.add("ja;jdf");
        l1.add("lkjca;");

        Library lib1 = new Library(l1);

        lib1.displayBooks();

        lib1.addBook("OOPs");
        lib1.displayBooks();
        lib1.insertBook(1,"Maths");
        lib1.displayBooks();
        lib1.updateBook("abcd","xyz");
        lib1.displayBooks();
        lib1.removeBook("OOPs");
        lib1.displayBooks();
        lib1.searchBook("Maths");
        lib1.displayBooks();
        System.out.println(lib1.getTotalBooks());
        
    }
}
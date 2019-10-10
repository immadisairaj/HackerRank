import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {
    private int Price; // Declare the price instance variable
    
    MyBook(String title, String author, int Price){  // Day13
        super(title,author);
        this.Price = Price;
    }
    
    public void display() {
        System.out.println("Title: "+super.title);
        System.out.println("Author: "+super.author);
        System.out.println("Price: "+Price);
    }
    
}

public class Day13 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}

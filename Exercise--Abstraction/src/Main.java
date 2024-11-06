import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Testing Book Class");
        System.out.println("-------------------------------");


        Book book = new Book();
        Book book1 = new Book("Thinking Fast and Slow",68.99,"Daniel");
        Book book2 = new Book("Atomic Habits",100,"James Clear");
        Book book3 = new Book("The Power Of regret",56.00,"Daniel H. Pink");
        Book book4 = new Book("The Murder on the Links",60.90,"Agatha Christie");


        book1.setName("Java");
        System.out.println("Book1 Name: " + book1.getName());
        System.out.println("-----");
        System.out.println(book2.toString());
        System.out.println("Book Original Price: " + book2.getPrice()  + "\nPrice After 20% Discounts: " + book2.getDiscount() );
        System.out.println("------------");
        System.out.println(book3.toString());

        System.out.println(book4.toString());
        System.out.println("Book Original Price: " + book4.getPrice() + "\nPrice After 20% Discounts: " + book4.getDiscount());
        System.out.println("------------");

        System.out.println("-------------------------------");

//---------------------------------------------------------
        System.out.println("Testing Movie Class");
        System.out.println("-------------------------------");

        Movie movie1 = new Movie("Harry Potter and the Chamber of Secrets",55.90,"Chris Columbus");
        Movie movie2 = new Movie("Harry Potter and the Sorcerer's Stone", 99.00,"Alfonso");

        System.out.println(movie1.toString());
        System.out.println("Movie Original Price: " + movie1.getPrice() + "\nPrice After 40% Discounts:  " + movie1.getDiscount());

        System.out.println("------------");

        System.out.println(movie2.toString());
        System.out.println("Movie Original Price: " + movie2.getPrice() + "\nPrice After 40% Discounts: " + movie2.getDiscount());




    }
}
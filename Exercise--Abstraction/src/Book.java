public class Book extends Product{

    private String author;


    Book(){

    }
    public Book(String author) {
        this.author = author;
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }


    @Override
    public double getDiscount() {
       double priceAfterDiscount = getPrice() * 20 /100;
        return getPrice() - priceAfterDiscount  ;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "Book Name :  " + getName() + "\nBook Price: " + getPrice() + "SAR" + "\nAuthor Name: " + author + "\n-------------";

    }

}

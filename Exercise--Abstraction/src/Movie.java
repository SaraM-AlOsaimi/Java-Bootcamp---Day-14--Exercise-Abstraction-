public class Movie extends Product{

    private String director;

    public Movie(String director) {
        this.director = director;
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public double getDiscount() {
        double priceAfterDiscount = getPrice() * 40 /100;
        return getPrice() - priceAfterDiscount  ;
    }

    public String toString() {
        return "Movie Name :  " + getName() + "\nMovie Price: " + getPrice() +  "SAR" +"\nDirector Name: " + director + "\n-------------";

    }

}

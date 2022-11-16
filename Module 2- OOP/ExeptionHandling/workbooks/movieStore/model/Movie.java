package ExeptionHandling.workbooks.movieStore.model;

public class Movie {
    
    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean isAvailable;

    public Movie(String name, String format, double rating){

        if(name.isBlank() || name.equals(null)){
            throw new IllegalArgumentException("Name cannot be null/black");
        }
        // if(!format.equalsIgnoreCase("DVD") || !format.equalsIgnoreCase("Blue-Ray")){
        //     throw new IllegalArgumentException("Formant don't valid");
        // }

        if(rating < 0 || rating >10){
            throw new IllegalArgumentException("Rating out of range  ");
        }
        this.name = name;
        this.format = format;
        this.rating = rating;
        this.isAvailable = true;
        this.sellingPrice = format.equals("Blue-Ray")? 4.25 : 2.25;
        this.rentalPrice = format.equals("Blue-Ray") ? 1.99 : 0.99;

    }

    public Movie(Movie movie){
        this.name = movie.getName();
        this.format = movie.getFormat();
        this.rating = movie.getRating();
        this.sellingPrice = movie.getSellingPrice();
        this.rentalPrice = movie.getRentalPrice();
        this.isAvailable = movie.isAvailable();
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
        setSellingPrice(format.equals("Blue-Ray")? 4.25 : 2.2);
        setRating(format.equals("Blue-Ray") ? 1.99 : 0.99);

    }
    private double getSellingPrice() {
        return sellingPrice;
    }

    private void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    private double getRentalPrice() {
        return rentalPrice;
    }

    private void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    private String available(){
        return isAvailable ? "In-Stock" : "Rented";
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nFormat: " + format + "\nRating: " + rating + "\nSelling Price: " + sellingPrice
                + "\nRental Price: " + rentalPrice + "\nAvailability: " + available() + "\n";
    }

    
    
}

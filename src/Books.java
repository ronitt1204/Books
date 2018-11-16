public class Books implements Comparable <Books>{
    private String bookName, bookAuthor;
    double price;

    public Books(String bookName, String bookAuthor, double price) {
        setBookName(bookName);
        setBookAuthor(bookAuthor);
        setPrice(price);

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Books books) {
        if (this.getPrice() > books.getPrice())

            return 1;

        else
            return -1;
    }

       public String toString(){
        return String.format("Book Name: " + bookName + "Author: " + bookAuthor + "Price: " + price);
       }
}
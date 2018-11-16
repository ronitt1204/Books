import java.util.TreeSet;

public class Main
{
    public static void main (String [] args)
    {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add(new book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 50 ));
        treeSet.add(new book("The Kite Runner", "Khaled Hosseini", 40 ));
        treeSet.add(new book("Life of Pi", "Yann Martel", 60 ));
        treeSet.add(new book("Pride and Prejudice", "Jane Austen", 45 ));

        System.out.println("Books: "+treeSet);
    }
}

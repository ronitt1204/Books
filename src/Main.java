import java.util.TreeSet;

public class Main
{
    public static void main (String [] args)
    {
        TreeSet<Books> treeSet = new TreeSet<>();
        treeSet.add(new Books("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 50 ));
        treeSet.add(new Books("The Kite Runner", "Khaled Hosseini", 40 ));
        treeSet.add(new Books("Life of Pi", "Yann Martel", 60 ));
        treeSet.add(new Books("Pride and Prejudice", "Jane Austen", 45 ));

        System.out.println("Books: "+treeSet);
        for(Books book: treeSet)
            System.out.println(treeSet);
    }
}

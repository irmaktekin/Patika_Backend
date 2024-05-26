package Week5.booksorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //TreeSet
        Set<Book> books = new TreeSet<>();
        books.add(new Book("The Curious Incident",45,"Stephan Colbert",new Date()));
        books.add(new Book("To Kill a Mockingbird",135,"Carolyn Mackler",new Date()));
        books.add(new Book("A Story of Yesterday",225,"Scott Fitzgerald",new Date()));
        books.add(new Book("A Clockwork Orange",42,"Celia Rivenbark",new Date()));
        books.add(new Book("Fahrenheit 451",55,"Oliver Sacks",new Date()));


        for(Book book : books){
            System.out.println(book.getBookName());
        }
        System.out.println("-----------------");

        //HashSet
        Set<Book> books2 = new HashSet<>();
        books2.add(new Book("Curious Incident",45,"Stephan Colbert",new Date()));
        books2.add(new Book("To Kill a Mockingbird",45,"Carolyn Mackler",new Date()));
        books2.add(new Book("A Story of Yesterday",225,"Scott Fitzgerald",new Date()));
        books2.add(new Book("A Clockwork Orange",49,"Celia Rivenbark",new Date()));
        books2.add(new Book("Fahrenheit 451",55,"Oliver Sacks",new Date()));


        //anonymous class that implements the Comparator interface
        Set<Book> bookSetByPageNumber = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                int pageNumber = Integer.compare(b1.getPageNumber(), b2.getPageNumber());
                if(pageNumber!=0){
                    return pageNumber;
                }
                else{
                    //if page numbers are equal check the titles
                    return b1.getBookName().compareTo(b2.getBookName());
                }

            }
        });

        //Hashset is converted to treeset
        bookSetByPageNumber.addAll(books2);

        for(Book book : bookSetByPageNumber){
            System.out.println("Name: "+book.getBookName()+ " Page Number: "+ book.getPageNumber());
        }
    }
}

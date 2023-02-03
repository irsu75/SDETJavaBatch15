package HomeWork17;

public class Book {

    /*
    6) Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
       Instance variables are being initialized
       Both Constructors are being executed
       You do not have permission to send messages in this channel.

     */
    String name;
    String author;
    int year;

    Book(String bookName, String bookAuthor, int bookYear){
        name=bookName;
        author=bookAuthor;
        year=bookYear;
    }
    void print(){
        System.out.println("Name of the book "+name+" Author of the book "+author+" Publication year "+year);
    }
}

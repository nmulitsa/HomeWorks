import java.util.ArrayList;
import java.util.List;

public class Reader {
    String surname;
    char name;
    char otch;
    int numberLC;
    String department;
    String phoneNumber;
    List <Book> books;
    int count;

    public Reader() {

    }

    public Reader(String surname,char name,char otch, int numberLC, String department, String phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.otch = otch;
        this.numberLC = numberLC;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.books = new ArrayList<Book>();

    }

    public void printStatus(){

        String bookName= "";
        for (Book b:books) {

                bookName += b.name +", ";
            }

        bookName = bookName.substring(0, bookName.length()-2);
        System.out.println(surname + " "+ name +"." + otch + "." + " взял " + books.size() +" книги:" + bookName+ ".");

    }
    public void takeBook(Book book) {
    this.books.add(book);
    }
    public void returnBook(Book book) {
        if (books.contains(book)){
            books.remove(books.indexOf(book));
            System.out.println("Студент " + surname + " " + name + "." + otch + "." + " вернул книгу " + book.name);
        }else {
            System.out.println("Студент " + surname + " " + name + "." + otch + "." + " не хранит книгу " + book.name);
            }
        }
    }

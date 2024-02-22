public class Reader {
    String surname;
    char name;
    char otch;
    int numberLC;
    String department;
    String phoneNumber;
    Book[] books;
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
        this.books = new Book[11];

    }

    public void printStatus(){
        int count = 0;
        String bookName= "";
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                count++;
                bookName += books[i].name+", ";
            }

        }
        bookName = bookName.substring(0, bookName.length()-2);
        System.out.println(surname + " "+ name +"." + otch + "." + " взял " + count +" книги:" + bookName+ ".");

    }
    public void takeBook(Book book) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }
    public void returnBook(Book book) {

        for(int i = 0;i< books.length; i++){
            if (books[i] == book){
                books[i] = null;
                System.out.println("Студент " + surname + " "+ name +"." + otch + "." + " вернул книгу " + book.name);
                break;
            }else{
                System.out.println("Студент " + surname + " " + name +"." + otch + "."+ " не хранит книгу " + book.name);
                break;
            }
        }
    }
}
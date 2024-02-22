public class Main {
    public static void main(String[] args) {
        Book b = new Book("Игра Эндера", "Кард", " ");
        Book c = new Book ("Мастер и маргарита", "Булгаков", " ");
        Book d = new Book("Война и Мир", "Толстой", " ");
        Book e = new Book("Люпен","Леблан"," ");


// System.out.println(b.name);
        Reader a = new Reader("Петров", 'B','В', 12, "bank", "136");
        a.takeBook(c);

        a.takeBook(d);

        a.takeBook(e);
        //a.takeBook(b);
        //System.out.println("Студент " + a.surname +" "+ a.name +"." + a.otch + "." + " взял книгу " + b.name);

        a.printStatus();

        //a.returnBook(c);
        }
    }
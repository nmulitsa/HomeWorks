public class IncorrectInfoException extends Exception {


  int age;
  String fio;

  public IncorrectInfoException(String message) {
    super(message);
    age = this.age;
    fio = this.fio;
  }


  public int getAge() {
    return age;
  }

  public String getFio() {
    return fio;
  }
}
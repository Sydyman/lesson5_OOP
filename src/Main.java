import java.time.LocalDate;

public class Main {

    static int a = 1;
    static int b = 10;
    public static void main(String[] args) {
        System.out.println("Hello OOP !");
        Phone phone1 = new Phone(311,"Gophone",1);
        System.out.println(phone1.getNumber());

        phone1.receiveCall("АдиСлейв");
        Phone phone2 = new Phone(16,"Vedroid");
        System.out.println(phone1.getNumber());

        phone1.sendMessage(phone1.getNumber(),phone2.getNumber());

        Person person1 = new Person("Адислейв",27);
        Person person2 = new Person();

        person1.move();
        person1.talk();

        Reader reader = new Reader("Адислейв",1,"IT", LocalDate.of(2000,01,25),"0500817187");
        Reader reader2 = new Reader("Порезин",2,"жд", LocalDate.of(2000,01,25),"0500817187");

        Book book = new Book("Fight Club","Chcuk Palanick");
        Book book1 = new Book("Zaratustra","Nitzhe");
        Book book2 = new Book("Fight Club2","Chcuk Palanick");

        reader.takeBook(book,book2);
        reader.returnBook(book,book1);
        reader.takeBook(3);

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }


    }
}
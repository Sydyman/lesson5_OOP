import java.time.LocalDate;

public class Reader {
    String fullName;
    int numberBilet;
    String facultet;
    LocalDate dateOfBirth;
    String phoneNumber;

    public Reader(String fullName, int numberBilet, String facultet,
                  LocalDate dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.numberBilet = numberBilet;
        this.facultet = facultet;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook() {
        System.out.println(fullName + " dвзял книги");
    }

    public void returnBook() {
        System.out.println(fullName + "вернул книги");
    }

    public void takeBook(int count) {
        System.out.println(fullName + "vвзял " + count + " книги");
    }

    public void takeBook(String... books) {
        System.out.print(fullName + "взялкниги: ");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
        }

        System.out.println("");
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].name);
        }

    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги");
    }

    public void returnBook(String... books) {
        System.out.print(fullName + " вернул книги");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
        }
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].name);
        }


    }
}
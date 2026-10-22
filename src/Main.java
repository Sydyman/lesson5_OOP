
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello OOP !");
        Phone phone1 = new Phone(311,"Gophone",1);
        System.out.println(phone1.getNumber());

        phone1.receiveCall("АдиСлейв");
        Phone phone2 = new Phone(16,"Vedroid");
        System.out.println(phone1.getNumber());

        phone1.sendMessage(phone1.getNumber(),phone2.getNumber());

        Phone phone3 = new Phone();

    }
}
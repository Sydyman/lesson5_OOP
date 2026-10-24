public class Person {

    String fullName;
    int age;

    public  Person(){

    }
    public  Person(String fullName,int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println("Move you ass " + fullName);
    }
    public void talk(){
        System.out.println(fullName + " talk");
    }

}

public class Phone {
    private int number ;
    private   String model ;
    private int weight ;

    public Phone(int number,String model,int weight){
        this(number,model);
        this.weight = weight;

    }

    public Phone(int number,String model   ){
        this.number = number;
        this.model = model;
    }
    public Phone(){

    }

    public int getNumber() {
        return number
                ;
    }
    public String getModel(){
        return model;
    }
    public int getWeight(){
        return weight;
    }
    public void setNumber(){
        this.number = number;
    }
    public void setModel(){
        this.model = model;
    }
    public void setWeight(){
        this.weight = weight;
    }


    public void receiveCall(String name,int number){

    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    public void sendMessage(int... number){
        for(int numbs: number){
        System.out.println("Send message to " + "" + numbs  );}
    }
}


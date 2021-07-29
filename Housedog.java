public class Housedog extends dog{

    public Housedog(String name){
        this.setname(name);
    }
    public Housedog(int num){
        if (num == 1){
            this.setname("강아지");
        }
        else{
            this.setname("멍멍이");
        }
    }

    public void sleep(){
        System.out.println(this.name + " zzz in house");
    }
    public void sleep(int hour){
        System.out.println(this.name + " zzz in house " + hour + " hours");
    }

    public static void main(String[] args) {
        System.out.println();


    }
    
}

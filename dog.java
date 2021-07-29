public class dog extends Animal{

    public void sleep(){
        System.out.println(this.name + " zzz");
    }

    public static void main(String[] args) {
        dog dog = new dog();
        dog.setname("poppy");
        System.out.println(dog.name);


        dog.sleep();
    }


    
}

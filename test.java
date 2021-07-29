public class test {
    public int sum(int a, int b){
        return a+b;
    }

    public String say(){
        return "Hello";
    }

    public void sum01(int a, int b){
        System.out.println(a +"과 " + b + "의 합은 " + (a+b) +" 입니다.");
    }
    public void say01(){
        System.out.println("Hi");
    }



    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        test mytest = new test(); // mytest = 빈 객체

        int c = mytest.sum(a,b);
        String d = mytest.say();

        System.out.println(c);
        System.out.println(d);

        mytest.sum01(1,2);
        mytest.say01();
        

    }
    
}

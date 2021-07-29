public class test2 {
    public int vartest(int a){
        a++;
        return a;
        
    }

    public static void main(String[] args) {
        int a = 1;
        test2 mytest = new test2();
        mytest.vartest(a);
        System.out.println(a);
        System.out.println(mytest.vartest(a));


    }
    
}

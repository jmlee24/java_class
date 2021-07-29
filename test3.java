public class test3 {

    int a;


    public void vartest(test3 test){
        test.a++;
       
        
    }

    public static void main(String[] args) {
        test3 mytest = new test3();
        mytest.a = 1;
        mytest.vartest(mytest);
        System.out.println(mytest.a);

        

    }
    
}

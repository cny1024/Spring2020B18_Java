package day42_Inheritance;



    class Test{
        public Test(int a){
            this(2.5);
            System.out.println("A");
        }
        public Test(double a){
            System.out.println("C");
        }
    }
public class Constructor2 extends Test {
    public Constructor2(){
        super(15);
        System.out.println("B");
    }

    public static void main(String[] args) {
        //Test obj = new Test(10);
        Constructor2 obj2 = new Constructor2();

    }
}

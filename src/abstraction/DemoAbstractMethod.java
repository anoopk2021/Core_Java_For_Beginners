package abstraction;

    public  abstract class DemoAbstractMethod {

        // a method without method body called abstract method
        //a class with at least one abstract method will be called as abstract class
        // provide partial abstraction because it may have normal method as well.
        public abstract void m1();// abstract method

        public void m2(){

            System.out.println("This is m2");
        }


        public static void main(String[] args) {
            // we can not create object of abstract class?

       /* DemoAbstractMethod obj= new DemoAbstractMethod();
        obj.m1();*/
        }
    }

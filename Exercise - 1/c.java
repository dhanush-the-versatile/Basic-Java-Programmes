/* Java Program to Implement Wrapper Class */
class Wrapper{
    public static void main(String [] args)
    {
        //implicit - Autoboxing and Auto unboxing
        //Explicit - Boxing and Unboxing
        //boxing
        int a=10;
        Integer i=Integer.valueOf(a); //Boxing
        Integer j=a; //Autoboxing
        System.out.println(a+" "+i+" "+j);
        //unboxing
        Integer x= 20;
        int y=x.intValue(); //Unboxing
        int z=x; //Auto unboxing
        System.out.println(x+" "+y+" "+z);
    }
}

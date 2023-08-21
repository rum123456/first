import java.io.*;
public class Area{
    int calculate(int l,int b)
    {
        int ar;
        ar=l*b;
        return(ar);
    }
    public static void main(String args[])
    {
        int ar1=0,ar2=0;
        Area ob1=new Area();
        Area ob2=new Area();
        ar1=ob1.calculate(15,10);
        ar2=ob2.calculate(25,15);
        System.out.println("area of figure1="+ar1);
        System.out.println("area of figure2="+ar2);
    }
}
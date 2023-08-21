import java.io.*;
public class calculate{
    int m,n,s,d;
    public  void inpitdata()throws IOException{
        InputStreamReader br=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(br);
        System.out.println("enter 1st no");
        m=Integer.parseInt(in.readLine());
        System.out.println("enter 2nd no");
        n=Integer.parseInt(in.readLine());
    }
    public void calculation()
    {
        s=m+n;
        d=m-n;
    }
    public void outputdata()
    {
      System.out.println("the sum of 2 number is"+s);
        System.out.println("the difference of 2 number is"+d);
    }
}
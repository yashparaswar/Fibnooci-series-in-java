import java.util.Scanner;

public class Fibonnaci {
    public int n;
    
    public void getdata()
    {
         //TO DO: handle exception we have use try and catch 
        try {
            System.out.println("Enter The Range Of Number You Want Series");
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
        } catch (Exception e) {

           
            System.out.println("Invalid Input");
        }

    }
    public void generate()//without use of recursion
    {
        int a =0;
    int b =1;
    int c ;
    int i;
       System.out.println("We are Now in a method that doesnt use recursion");
        System.out.println("Fibonnaci Series are "+a);
        System.out.println(b);
        for( i=1;i<=n-2;i++)  
        {
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
        }
    }
   
    
    public static void main(String args [])
    {
        Fibonnaci ob = new Fibonnaci();
        ob.getdata();
        ob.generate();
       
        
       
    
    }
}

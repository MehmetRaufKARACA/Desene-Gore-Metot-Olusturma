import java.util.Scanner;
public class Desen{
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen sayıyı girin : ");
        
        int number = scan.nextInt();
       
        desen(number,number,number);
        
    }
    static void desen(int a,int b,int temp)
    {
        if (a>0)
        {
            System.out.print(a+" ");
            a =a-5;
             temp= a;
            
            desen(a,b,temp);
        }
        else if(a <=0)
        {
            System.out.print(temp +" ");
            temp=temp+5;
            if (b ==temp)
            {
                System.out.println(b);
            }
            else
            {
                desen(a,b,temp);

            }
        }
    }
}
import java.util.Scanner;
public class Desen{
    public static void main(String[] args) {
        System.out.print("Lütfen sayıyı girin : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Girdiğiniz sayı: "+number);
        System.out.print("Çıktısı : ");
        desen(number,number,number);
        input.close();
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
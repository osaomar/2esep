import java.util.Scanner;
public class Main
{
    static void polindrom(int []a){
        for (int i = 0; i < a.length; i++) {
            int k = 0, j = a[i], sum=0;
            while (j > 0) {
                k = (k * 10) + (j % 10);
                j /= 10;
            }
            if (a[i] == k){ System.out.println(a[i] +" --> polindrom");
                while (a[i]!=0){
                    sum+=a[i]%10;
                    a[i]= a[i]/10;
                } System.out.println("polindrom zifr kosyndysy="+ sum);
            }

            else System.out.println(a[i]+" --> polindrom emes");
        }
    }
    public static void main(String[] args)
    {


        int []a = {777,4554,4551,545,147};
        polindrom(a);

    }
}
/**
 * Created by VINNI on 06.11.16.
 */
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int arr[] = {7, 7, -5, 0, -20, 33, -4, -1, 33, -1};
        int l=arr.length-1;
        int first=arr[0];
        int last=arr[l];
        int arrravno=0;
        for(int z=0; z<l; z++)
        {
            if (arr[z] != arr[z+1])
                arrravno=1;
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));
/*for(int k=0; k <=l; k++)
{
System.out.print(arr[k]+" ");
}*/
        for(int i = l ; i > 0 ; i--)
        {
            for(int j = 0 ; j < i ; j++)
            {

                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        sum(arr, l);
        min(arr, l, arrravno);
        max(arr, l, arrravno);
        maxPositive(arr, l, arrravno);
        multiplication(arr, l);
        modulus(first, last);
        secondLagest(arr, l, arrravno);
    }

    public static void min(int[] arr,int l, int arrravno)
    {
        if (arrravno==0)
            System.out.println("min: все эл. массива равны");
        else
            System.out.println("min:"+arr[0]);
    }

    public static void max(int[] arr,int l, int arrravno)
    {
        if (arrravno==0)
            System.out.println("max: все эл. массива равны");
        else
            System.out.println("max:"+arr[l]);
    }

    public static void sum(int[] arr, int l)
    {
        int sum1 = 0;
        for(int i = 0; i <=l ; i++){

            sum1=sum1+arr[i];}

        System.out.println("сумма элементов:"+sum1);

    }

    public static void multiplication(int[] arr, int l)
    {
        int mult = 1;
        for(int i = 0; i <=l ; i++)
        {
            mult=mult*arr[i];
        }
        System.out.println("multiplication:"+mult);
    }


    public static void maxPositive(int[] arr, int l, int arrravno)
    {
        if (arrravno==0)
            System.out.println("maxPositive: все эл. массива равны");
        else
        {

            if (arr[l]>0)
            {
                System.out.println("maxPositive:"+arr[l]);
            }
            else System.out.println("Положительные элементы отсутствуют");
        }
    }

    public static void modulus(int first, int last)
    {
        if (last !=0)
        {
            int mod=first%last;
            System.out.println("modulus первого и последн. эл.:"+mod);
        }
        else System.out.println("modulus: Последний эл. равен нулю");
    }


    public static void secondLagest(int[] arr,int l, int arrravno)
    {
        if (arrravno==0)
            System.out.println("secondLagest: все эл. массива равны");
        else
        {
            for(int i = l; i >0; i--)
            {
                if (arr[i] != arr[i-1])
                {
                    System.out.println("secondLagest:"+arr[i-1]);
                    return;
                }
            }
        }
    }
}

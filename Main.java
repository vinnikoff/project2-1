import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int arr[] = {7, 7, -5, 0,-33,-5,-4, 1,-33,-1};
        int arrravno=0;
        for(int z=0; z< arr.length-1; z++)
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

/*for(int i = l ; i > 0 ; i--)
{
for(int j = 0 ; j < i ; j++)
{

if( arr[j] > arr[j+1] ){
int tmp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = tmp;
}
}
}*/

        System.out.println("\n");
        sum(arr);
        System.out.println("\n");
        min(arr, arrravno);
        System.out.println("\n");
        max(arr, arrravno);
        System.out.println("\n");
        maxPositive(arr, arrravno);
        System.out.println("\n");
        multiplication(arr);
        System.out.println("\n");
        modulus(arr);
        System.out.println("\n");
        secondLagest(arr, arrravno);

    }

    public static void min(int[] arr, int arrravno)
    {
        if (arrravno==0)
            System.out.println("min: все эл. массива равны");
        else
        {
            int min = arr[0];
            for (int i=1; i<= arr.length-1; ++i)
            {
                if(arr[i]<min) min=arr[i];
            }
            System.out.println("min:"+min);
        }
    }

    public static void max(int[] arr,int arrravno)
    {
        if (arrravno==0)
            System.out.println("max: все эл. массива равны");
        else
        {
            int max=arr[0];
            for (int i=1; i<= arr.length-1; ++i)
            {
                if(arr[i]>max) max=arr[i];
            }

            System.out.println("max:"+max);
        }
    }
    public static void sum(int[] arr)
    {
        int sum1 = 0;
        for(int i = 0; i <= arr.length-1; i++){

            sum1=sum1+arr[i];}

        System.out.println("сумма элементов:"+sum1);

    }

    public static void multiplication(int[] arr)
    {
        int mult = 1;
        for(int i = 0; i <= arr.length-1 ; i++)
        {
            mult=mult*arr[i];
        }
        System.out.println("multiplication:"+mult);
    }


    public static void maxPositive(int[] arr, int arrravno)
    {
        if (arrravno==0)
            System.out.println("maxPositive: все эл. массива равны");
        else
        {
            int max=arr[0];
            for (int i=1; i<= arr.length-1; ++i)
            {
                if(arr[i]>max) max=arr[i];
            }
            if (max>0)
            {
                System.out.println("maxPositive:"+max);
            }
            else System.out.println("Положительные элементы отсутствуют");
        }
    }

    public static void modulus(int[] arr)
    {
        int first=arr[0];
        int last=arr[arr.length-1];
        if (last !=0)
        {

            int mod=first%last;
            System.out.println("modulus первого и последн. эл.:"+mod);
        }
        else System.out.println("modulus: Последний эл. равен нулю");
    }


    public static void secondLagest(int[] arr, int arrravno)
    {
        if (arrravno==0)
            System.out.println("secondLagest: все эл. массива равны");
        else
        {
            for(int i = arr.length-1; i > 0 ; i--)
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


            for(int z= arr.length-1; z >0; z--)
            {
                if (arr[z] != arr[z-1])
                {
                    System.out.println("secondLagest:"+arr[z-1]);
                    return;
                }
            }
        }
    }
}
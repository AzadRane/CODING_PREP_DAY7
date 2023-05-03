import java.util.*;

public class ArrayClassDemo
{
    public static void main(String args[])
    {
        int arr[] = {10,20,30,40,50,60,70};

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("ARRAY CLASS TO STRING");

        System.out.println(Arrays.toString(arr));
    }
}
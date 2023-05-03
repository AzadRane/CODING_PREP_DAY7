import java.io.*;

public class AgeArrayDemo {

    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int age[] = new int[5];

        System.out.println("Enter the ages of family members");

        for(int i=0;i<age.length;i++)
        {
            System.out.println("Enter the age of"+i+" 'th person");
            age[i] = Integer.parseInt(br.readLine());
        }

        int eldest=age[0],youngest=age[0];

        for(int k=0;k<age.length;k++)
        {
            if(age[k]<youngest)
            {
                youngest=age[k];
            }
            
            if(age[k]>eldest)
            {
                eldest = age[k];
            }
        }


            System.out.println("Youngest is :"+youngest);

            System.out.println("Eldest is :"+eldest);


    }
    
}

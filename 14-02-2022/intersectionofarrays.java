import java.util.Scanner;
public class intersectionofarrays
{
    public static void main(String[] args)
    {
        int i,j,n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.print("number of elements of first array:");
        n1=sc.nextInt();
        System.out.print("number of elements of second array:");
        n2=sc.nextInt();
        int a1[]=new int[n1];
        int a2[]=new int[n2];

        System.out.print("Enter elements of first array in ascending order:");
        for(i=0;i<n1;++i)
            a1[i]=sc.nextInt();

        System.out.print("Enter elements of second array in ascending order:");
        for(i=0;i<n2;++i)
            a2[i]=sc.nextInt();

        i=j=0;
        System.out.print("Intersection of Arrays: ");
        while(i<n1&&j<n2)
        {
            if(a1[i]<a2[j])
                i++;
            else
            if(a2[j]<a1[i])
                j++;
            else
            {
                System.out.print(a1[i]+" ");
                i++;
                j++;
            }
        }

    }
}


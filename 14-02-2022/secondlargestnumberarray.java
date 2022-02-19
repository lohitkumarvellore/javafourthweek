import java.util.Arrays;
import java.util.Scanner;

public class secondlargestnumberarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of elements of array:");
        int n1=sc.nextInt();
        int a1[]=new int[n1];

        System.out.print("Enter elements of array :");
        for(int i=0;i<n1;++i)
            a1[i]=sc.nextInt();

        Arrays.stream(a1).sorted();
        System.out.println(a1[n1-2]);
    }
}

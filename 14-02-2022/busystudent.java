import java.util.Scanner;

public class busystudent {
    static int busyStudents(int[] startTime, int[] endTime, int queryTime) {
        int count = 0,i;
        for (i = 0; i < startTime.length; i++)
        {
            if (queryTime <= endTime[i] && queryTime >= startTime[i])
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] start = {1,2,3};
        int[] end = {3,2,7};
        Scanner sc = new Scanner(System.in);
        int querytime = sc.nextInt();
        int count = busyStudents(start,end,querytime);
        System.out.println(count);

    }
}

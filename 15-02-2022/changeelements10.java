import java.util.Arrays;

public class changeelements10 {
    public static void changecolumn(int[][] b, int m, int n, int x, int y)
    {
        for(int j=0;j<n;j++)
        {
            if(b[x][j] != 0)
            {
                b[x][j] = -1;
            }
        }
        for(int i = 0; i< m ;i++)
        {
            if(b[i][y] !=0)
            {
                b[i][y] = -1;
            }
        }
    }
    public static void main(String[] args) {
        int[][] a = {{1, 1, 0, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 0, 1}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 1}};
        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0) {
                    changecolumn(a, m, n, i, j);
                }
            }
        }
        for(int i =0; i<m; i++)
        {
            for(int j=0; j<n;j++)
            {
                if(a[i][j] == -1)
                {
                    a[i][j] = 0;
                }
            }
        }
        for(var r:a)
        {
            System.out.println(Arrays.toString(r));
        }
    }
}

public class printspiralorder {
    public static void main(String[] args) {
        int rows = 3, columns = 4;
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int firstrow = 1;
        int firstcolumn = 0;
        int lastrow = rows;
        int lastcolumn = columns;
        int i,j = 0;
        //printing frst row
        for(i = 0;i<columns;i++)
        {
            for(j=0; j<lastcolumn;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            break;
        }

        //printing last column
        for(i=1;i<lastrow;i++)
        {
            j=lastcolumn-1;
            System.out.print(a[i][j]+ " ");
        }
        //printing the last row
        for(i=lastcolumn-2;i>=firstcolumn;i--)
        {
            j=lastrow-1;
            System.out.print(a[j][i]+" ");
        }
        //printing spiral

        }
    }


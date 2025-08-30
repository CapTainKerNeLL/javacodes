public class MatrixOps {
    public static void main(String[] args) {
        int[][] A = {{1,2},{3,4}};
        int[][] B = {{5,6},{7,8}};

    
        int[][] add = new int[2][2];
        int[][] mul = new int[2][2];

        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                add[i][j] = A[i][j] + B[i][j];


        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<2;k++)
                    mul[i][j] += A[i][k] * B[k][j];

        System.out.println("Addition:");
        for (int[] row : add) System.out.println(row[0]+" "+row[1]);
        System.out.println("Multiplication:");
        for (int[] row : mul) System.out.println(row[0]+" "+row[1]);
    }
}


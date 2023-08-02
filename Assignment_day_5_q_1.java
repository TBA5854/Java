import java.util.Scanner;

public class Assignment_day_5_q_1{
    int[][] matrix(int order,int test[][])
    {
        Scanner obj = new Scanner(System.in);
        for (int i =1;i<=order;i++)
        {
            for (int j = 1; j <= order; j++) {
                System.out.println("Enter element for ("+i+","+j+") : ");
                test[i-1][j-1]=obj.nextInt();
            }
        }
        obj.close();
        return test;
    }
    public static void main(String[] args) {
        System.out.print("Enter order of square matrix :");
        Scanner obj = new Scanner(System.in);
        int order = obj.nextInt();
        System.out.println("Considering matrix layout as:");
        for (int i=1 ; i <= order ; i++)
        {
            for (int j=1 ; j <= order ; j++)
            {
                System.out.print("("+i+","+j+") ");
            }
            System.out.println("\n");
        }
        Assignment_day_5_q_1 testt=new Assignment_day_5_q_1();
        int[][] matrix1= new int[order][order];
        System.out.println("Enter Elements for first array :");
        matrix1=testt.matrix(order, matrix1);
        int[][] matrix2= new int[order][order];
        System.out.println("Enter Elements for second array :");
        matrix2=testt.matrix(order, matrix2);
        obj.close();
        System.out.println("1st array :");
        for (int i=1 ; i <= order ; i++)
        {
            for (int j=1 ; j <= order ; j++)
            {
                System.out.print(matrix1[i-1][j-1]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("2nd array :");
        for (int i=1 ; i <= order ; i++)
        {
            for (int j=1 ; j <= order ; j++)
            {
                System.out.print(matrix2[i-1][j-1]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("Multiplied matrix :");
        for (int i=1 ; i <= order ; i++)
        {
            for (int j=1 ; j <= order ; j++)
            {
                System.out.print(matrix1[i-1][j-1]*matrix2[j-1][i-1]+" ");
            }
            System.out.println("\n");
        }
    }
}
//to be completed
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row=scanner.nextInt();
        System.out.println("Enter the col: ");
        int col=scanner.nextInt();
        System.out.println("Enter the values: ");
        int[][] arr = new int[row][col];
        int capsum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter  capacity: ");
        int cap=scanner.nextInt();
        int out=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(j==0)
                {
                    capsum+=arr[i][j];
                }
                if(j==1)
                {
                    if(arr[i][j]>arr[i][j+1])
                    {
                        out=1;
                    }
                }
            }
        }
        if((capsum>cap)||(out==1))
        {
            System.out.println(false);
        }
        else
        {
            System.out.println(true);
        }
    }
}
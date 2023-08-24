

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер фигуры: ");
        int depth = kb.nextInt();
        // Шахматная доска из звездочек
        /*for(int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        System.out.print((i%2 == k%2) ? "* " : "  ");
                    }
                }
                System.out.println();
            }
        }*/

        int nf = 1;
        for(int i = 0; i <= depth+2; i++) System.out.print("    ");
        System.out.println(1);
        for(int n = 1; n <= depth; n++)
        {
            for(int j=0; j < depth-n; j++)
            {
                System.out.print("     ");
            }
            System.out.print(1+"       ");
            nf *= n;
            int mf = 1;
            for(int m = 1; m <= n; m++)
            {
                mf *= m;
                int kf = 1;
                for(int k = 1; k <= n-m; k++)
                {
                    kf *= k;
                }
                int member = nf/mf/kf;
                System.out.print(member + "        ");
            }
            System.out.println();
        }
    }
}



import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        // I will consider all the walls and then move inwards
        // keeping in mind about the boundary conditions
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        int cnt = 0;
        int nle = m * n;
        // now I initialize my boundary condtions so that a box is formed
        int minr = 0;
        int minc = 0;
        int maxr = mat.length - 1;
        int maxc = mat[0].length - 1;

        // Now i will start making the box from the top
        while (cnt < nle) {
            // /Top wall of the box
            for (int i = minc; i <= maxc&&cnt<nle; i++) {
                System.out.print(mat[minr][i] + " ");
                cnt++;
            }
            maxr--; 
            // right wall of the box
            for(int i=maxr;i<=maxr&&cnt<nle;i++){
                System.out.print(mat[i][minc]);
                cnt++;
            }
            maxc--;
            // Bottom wall of the box
            for(int i=maxc;i>=minc&&cnt<nle;i--){
                System.out.print(mat[maxr][i]);
                cnt++;
            }
            maxr--;
            // left wall of the box
            for(int i=maxr;maxr>=minr&&cnt<nle;i--){
                System.out.print(mat[minc][i]);
                cnt++;
            }
            minc++;
        }

    }
}

package backjoon_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_10_20_02 {

    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = (sc.readLine()).split(" ");

        int M = Integer.parseInt(nm[0]);
        int N = Integer.parseInt(nm[1]);

        char[][] input = new char[M][N];

        for(int i = 0; i<M; i++){
            String temp_str = sc.readLine();
            for(int j=0; j<N; j++){
                input[i][j] = temp_str.charAt(j);
                sc.lines();

            }
        }
        char[][]result_matrix = new char[8][8];
        int min = 9999;
        //int random_m = (int)(Math.random()*(M-8+1)+1);
        //int randox_n = (int)(Math.random()*(N-8+1)+1);

        for(int i = 0; i<M-8+1; i++){
            for(int j=0; j<N-8+1; j++){
                int count = 0;
                result_matrix = cut_matrix(input,i,j);
                count = find(result_matrix,count);
                if(count<min) min = count;
            }

        }

        System.out.println("min = " + min);


    }

    public static char[][] cut_matrix(char[][] matrix,int m, int n){

        char[][] new_matrix = new char[8][8];
        for (int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                new_matrix[i][j] = matrix[m+i][n+j];
            }
        }
        return new_matrix;
    }

    public static int find(char[][] MN, int count){
        char first = MN[0][0];


        for (int i=0; i< MN.length; i+=2){
            for(int j=0; j<MN[i].length; j+=2){
                if(MN[i][j] != first){
                    count++;
                }
            }
            for(int j=1; j<MN[i].length; j+=2){
                if(MN[i][j] == first){
                    count++;
                }
            }

        }
        for (int i=1; i< MN.length; i+=2){
            for(int j=0; j<MN[i].length; j+=2){
                if(MN[i][j] == first){
                    count++;
                }
            }
            for(int j=1; j<MN[i].length; j+=2){
                if(MN[i][j] != first){
                    count++;
                }
            }
        }


        return Math.min(count,64-count); // 이 부분은 도저히 if문으로 다시 짜기가 싫어서 찾아봤어요.....


    }
}

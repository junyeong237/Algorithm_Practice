package backjoon_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_02_10_19 {


    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str_int = input.readLine().split(" ");
        String[] str_arr = input.readLine().split(" ");


        int n = Integer.parseInt(str_int[0]); //배열안에 들어가는 갯수
        int k = Integer.parseInt(str_int[1]); //K번쨰 구하는
        int[] int_arr = new int[n];

        for(int i=0; i<n; i++){
            int_arr[i] = Integer.parseInt(str_arr[i]);
        }

        Arrays.sort(int_arr); // Collection.sort가 Arrays.sort보다 더 빠르다
        k = int_arr[k-1];
        System.out.println(k);

    }



}

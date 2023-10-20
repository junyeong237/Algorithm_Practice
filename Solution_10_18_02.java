package backjoon_algorithm;

import java.util.*;

public class Solution_10_18_02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String strn = s.nextLine(); //입력받은수

        char[] n_str = strn.toCharArray();
        ArrayList<Integer> answer = new ArrayList<>();
        for(char c : n_str){
            answer.add(c - '0');
        }

        answer.sort(Comparator.reverseOrder());

        for(Integer i : answer){
            System.out.print(i);
        }


    }
}

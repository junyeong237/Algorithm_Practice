package backjoon_algorithm;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution_01_10_18 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //입력받을 줄의 갯수 할당
        s.nextLine(); //버퍼 비우기

        Person[] persons = new Person[n];

        String[] answer = new String[n];

        for(int i=0; i<n; i++){
            persons[i] = new Person();
            String ps = s.nextLine();
            String[] temp_ps = ps.split(" ");
            int age = Integer.parseInt(temp_ps[0]);
            persons[i] = new Person(age, temp_ps[1]);
        }

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for(int i=0; i<n; i++){
            System.out.print(persons[i].getAge() + " ");
            System.out.println(persons[i].getName());
        }

    }


    public static class Person {

        private int age;
        private String name;

        public Person(){}

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }


        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


}



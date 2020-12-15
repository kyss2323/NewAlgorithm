package etc;

import java.util.*;

public class Etc_10814 {
    static class Person implements Comparable<Person>{
        int age;
        String name;


        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return String.format("%d %s", age, name);
        }

        @Override
        public int compareTo(Person o) {
            return this.age - o.age;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int pNum = Integer.parseInt(sc.nextLine());
        Etc_10814.Person[] pList = new Etc_10814.Person[pNum];


        int i = 0;
        while(pNum-- > 0){
            String[] input = sc.nextLine().split(" ");

            int age = Integer.parseInt(input[0]);
            String name = input[1];

            pList[i++] = new Etc_10814.Person(age, name);
        }

        Arrays.sort(pList);

        for(Etc_10814.Person p: pList){
            System.out.println(p);
        }
    }

}

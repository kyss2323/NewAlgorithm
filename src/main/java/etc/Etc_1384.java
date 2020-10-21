package etc;

import java.util.*;

public class Etc_1384 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> group;
        int groupCount = 1;

        while (true) {
            int children_num = Integer.parseInt(sc.nextLine());
            if (children_num == 0)
                break;

            group = new ArrayList<>();

            for (int i = 0; i < children_num; i++) {
                group.add(sc.nextLine());
            }

            printBadKid(group, groupCount);
            System.out.println();

            groupCount++;
        }
    }

    public static void printBadKid(List<String> group, int count) {
        System.out.println("Group " + count);
        String paperOwner;
        String badKid = "";

        for (int i = 0; i < group.size(); i++) {
            String[] paperInfo = group.get(i).split(" ");
            paperOwner = paperInfo[0];

            for (int j = 1; j < paperInfo.length; j++) {
                if (paperInfo[j].equals("N")) {
                    int index = (paperInfo.length - (i - j + 1)) % paperInfo.length;

                    badKid = group.get(group.size() - 1 - index).split(" ")[0];
                    System.out.printf("%s was nasty about %s\n", badKid, paperOwner);
                }
            }
        }
        if (badKid.equals(""))
            System.out.println("Nobody was nasty");

    }

}

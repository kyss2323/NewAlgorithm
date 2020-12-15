package dataStruct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_10816 {
    public static void main(String[] args){
        Map<Integer, Integer> cards = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int cardNum = sc.nextInt();
        while (cardNum-- > 0){
            int card = sc.nextInt();
            if(cards.containsKey(card))
                cards.put(card, cards.get(card) + 1);
            else
                cards.put(card, 1);
        }

        cardNum = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while (cardNum-- > 0){
            int card = sc.nextInt();
            if(cards.containsKey(card))
                result.append(cards.get(card));
            else
                result.append(0);
            if(cardNum != 0)
                result.append(" ");
        }
        System.out.println(result);
    }
}

package dataStruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deque_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int cmdNum = Integer.parseInt(sc.readLine());

        int[] deque = new int[cmdNum];

        int queueSize = cmdNum;
        int frontIndex = 0;
        int backIndex = 0;

        StringBuilder result = new StringBuilder();
        while(cmdNum-- > 0){
            String[] input = sc.readLine().split(" ");
            switch (input[0]){
                case "push_front":
                    deque[frontIndex] = Integer.parseInt(input[1]);
                    frontIndex = (queueSize + (frontIndex - 1)) % queueSize;
                    break;
                case "push_back":
                    backIndex = (queueSize + (backIndex + 1)) % queueSize;
                    deque[backIndex] = Integer.parseInt(input[1]);
                    break;
                case "pop_front":
                    if(frontIndex == backIndex) {
                        result.append(-1).append("\n");
                    } else {
                        frontIndex = (queueSize + (frontIndex + 1)) % queueSize;
                        result.append(deque[frontIndex]).append("\n");
                    }
                    break;
                case "pop_back":
                    if(frontIndex == backIndex) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(deque[backIndex]).append("\n");
                        backIndex = (queueSize + (backIndex - 1)) % queueSize;
                    }
                    break;
                case "size":
                    int size;
                    if(frontIndex == backIndex)
                        size = 0;
                    else if(frontIndex > backIndex)
                        size = backIndex + (queueSize - frontIndex);
                    else
                        size = backIndex - frontIndex;
                    result.append(size).append("\n");
                    break;
                case "empty":
                    if(frontIndex == backIndex)
                        result.append(1).append("\n");
                    else
                        result.append(0).append("\n");
                    break;
                case "front":
                    if(frontIndex == backIndex) {
                        result.append(-1).append("\n");
                    } else {
                        int tempIndex = (queueSize + (frontIndex + 1)) % queueSize;
                        result.append(deque[tempIndex]).append("\n");
                    }
                    break;
                default:
                    if(frontIndex == backIndex) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(deque[backIndex]).append("\n");
                    }
                    break;

            }
        }
        System.out.print(result);

    }
}

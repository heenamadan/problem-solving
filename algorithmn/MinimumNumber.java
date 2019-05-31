/*
package algorithmn;


import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MinimumNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            int N = in.nextInt();
            int K = in.nextInt();
            int Q = in.nextInt();
            //int[][] output = new int[K][];
            int[] intArray = new int[N];
            for(int i=0;i<N-1;i++){
                intArray[i] = in.nextInt();

            }

            int numOfChunks = (int)Math.ceil(N / K);
            int[][] output = new int[numOfChunks][];
            int[] temp ={};
            for (int i = 0; i < numOfChunks; ++i) {
                int start = i * 2;
                int length = Math.min(intArray.length - start, 5);
                temp = new int[length];

                System.arraycopy(intArray, start, temp, 0, length);
                output[i] = temp;
            }

            testCases--;
            System.out.println(output.length);
            Arrays.sort(output);
            Arrays.stream(output) for (int[] val: output
                                       ) {

            };

            IntStream stream = Arrays.stream(output).flatMapToInt(Arrays::stream);
            IntStream.rangeClosed(0, stream.getLength() - 1)
                    .forEach(index -> {
                        final Node currentNode = nodeList.item(index);
                        if (Objects.nonNull(node.getFirstChild())) {
                            if (node.getFirstChild().getNodeType() == Node.ELEMENT_NODE) {
                                map.putAll(getXMLNodeValueMap(currentNode));
                            } else if (node.getFirstChild().getNodeType() == Node.TEXT_NODE) {
                                map.put(node.getLocalName(), node.getTextContent());
                            }
                        }
                    });

        }

    }
}*/

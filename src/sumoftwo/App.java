package sumoftwo;

import java.util.Arrays;
import java.util.List;

public class App {

    /*--------------------------------------------------------------------------------------------*/
    public static void main(String[] args) {

        int[] data = {7, 1, 8, 9, 3, 8, 10, 2, 5, 4, 6};
        System.out.println("Given Data: " + Arrays.toString(data));

        int twoSum = 8;

        BST bst = new BST();
        for (int i : data) {
            bst.insert(i);
        }

        System.out.print("In order Max " + twoSum + ": ");
        List<Integer> list = bst.inorderMax(twoSum);
        System.out.println(list);
        System.out.println();

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 1; j < list.size(); j++) {

                if (list.get(i) + list.get(j) == twoSum) {
                    System.out.println(list.get(i) + " + " + list.get(j) + " = " + twoSum);
                }
            }
        }
        /*--------------------------------------------------------------------------------------------*/

    }
}

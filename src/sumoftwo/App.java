package sumoftwo;

import java.util.List;

public class App {

    private static BST bst = new BST();

    /*--------------------------------------------------------------------------------------------*/
    private static void store(int i) {
        System.out.print(i + " ");
        bst.insert(i);
    }
    /*--------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {

        int twoSum = 10;

        for (int i = 0; i < 20; i++) {
            store((int) (Math.random() * 30));
        }
        System.out.println();

        System.out.println("In Order Limit = " + twoSum);
        List<Integer> list = bst.inorderLimit(twoSum);
        System.out.println(list);
        System.out.println();

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 1; j < list.size(); j++) {

                if (list.get(i) + list.get(j) == twoSum) {
                    System.out.printf("%2d + %2d = %2d\n", list.get(i), list.get(j), twoSum);
                }
            }
        }
        /*--------------------------------------------------------------------------------------------*/

    }
}

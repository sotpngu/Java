package examples.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainClass {

    public static void main(String[] args) throws Exception {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);
        printArray("排序结果为：", array);
        int index = Arrays.binarySearch(array, 2);
        System.out.println("元素 2  在第 " + index + " 个位置");

        //插入数组
        int newIndex = index;
        array = insertElement(array, 1, newIndex);
        printArray("数组添加元素 1", array);

        //数组长度
        String[][] data = new String[2][5];
        System.out.println("第一维数组长度: " + data.length);
        System.out.println("第二维数组长度: " + data[0].length);

        //数组反转
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        Collections.reverse(arrayList);
        System.out.println("反转后排序：" + arrayList);


        //获取最大值、最小值
        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5 };
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("最小值：" + min);
        System.out.println("最大值：" + max);


        //数组合并
        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };



    }

    private static void printArray(String message, int array[]) {
        System.out.println(message
                + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if(i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static int[] insertElement(int original[],
                                       int element, int index) {
        int length = original.length;
        int destination[] = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(original, index, destination, index
                + 1, length - index);
        return destination;
    }

}

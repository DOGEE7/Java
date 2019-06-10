import java.util.Arrays;

import static java.util.Arrays.*;

public class ClassArray {
    public static void main(String[] args){
        double[] numbers = {1.22,3.22,0.96,6.68,2.68};
        int [] numbers1 = {1,5,45,25,10,23,96,22};
        char[] list = {'a','b','t','e','w','o','h'};
        char[] list1 = {'d','e','o','n','p'};

        System.out.println("全部排序");
        Arrays.sort(numbers);
        for (double e:numbers)
            System.out.println(e);
        System.out.println("部分排序");
        Arrays.parallelSort(numbers1,1,3);
        for (int e:numbers1)
            System.out.println(e);

        System.out.println("\n二分查找");
        System.out.println("Index: " + Arrays.binarySearch(list,'o'));

        System.out.println("\n比较");
        System.out.println(Arrays.equals(list,list1));

        System.out.println("\n填充");
        Arrays.fill(list,1,3,'l');
        for (char e:list)
            System.out.print(e);

        System.out.println("\n\n返回一个字符串");
        System.out.println(Arrays.toString(list1));

    }



}

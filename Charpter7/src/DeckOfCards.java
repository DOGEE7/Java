import java.util.Scanner;

import static java.lang.System.arraycopy;
import static java.lang.System.in;

public class DeckOfCards {
    public static void main(String[] args){
        int[] dec = new int[52];
        String[] suits ={"Hearts","Spades","Diamonds","Clubs"};
        String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//        int cardNumber;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a card number(1-52):");
//        cardNumber = input.nextInt();
        for (int i = 1; i <= dec.length; i++){
            dec[i-1] = i;
        }

        int temp;
        for (int i = 1; i<=dec.length;i++){
            temp = dec [i-1];
            dec[i-1] = dec[(int)( Math.random() * 52)] ;
            dec[(int)( Math.random() * 52)] = temp;
        }
        //抽出四张牌
        System.out.println("随机抽出四张牌");
        for (int i = 0; i < 4; i++){
            String suit = suits[(dec[i]-1) / 13];
            String rank = ranks[(dec[i]-1) % 13];
            System.out.println(rank + " of " + suit);
        }

        System.out.println("复制");
        String[] copyArray = new String[9];
        arraycopy(ranks,3,copyArray,0,8);
        for (int i =0;i <copyArray.length;i++){
            System.out.print(copyArray[i] + " ");
        }

        System.out.println("\n传递");
        printArray(new  int[]{1,5,8,9,6,44});

        System.out.println("\n交换");
        int[] a = {1,2};
        swap(a[0],a[1]);
        for (int e:a)
            System.out.print(e);
        System.out.println();
        swapArray(a);
        for (int e:a)
            System.out.print(e);


    }
    public static void printArray(int[] array){
        for (int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void swap(int n1,int n2){
        int temp;
        temp = n1;
        n1 = n2;
        n2= temp;
    }
    public static void  swapArray(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}

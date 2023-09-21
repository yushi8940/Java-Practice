package jp.hachi.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        // java.lang.Comparableを実装したクラスの並べ替え
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("A", 30));
        personList.add(new Person("B", 20));
        personList.add(new Person("C", 25));
        personList.add(new Person("D", 26));
        personList.add(new Person("E", 19));
        
        Collections.sort(personList);
        
        for(Person p : personList) {
            System.out.println(p);
        }
        
        
        // java.util.Comparatorを使用した並び替え
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("a", 1200));
        itemList.add(new Item("b", 1500));
        itemList.add(new Item("c", 1600));
        itemList.add(new Item("d", 1700));
        itemList.add(new Item("e", 1300));
        
        
        Comparator<Item> itemComparator = (Item item1, Item item2) -> {
            return item1.getPrice().compareTo(item2.getPrice());
        };
        
        Collections.sort(itemList, itemComparator);
        
        for (Item item : itemList) {
            System.out.println(item);
        }
        
        // Arraysクラスのmismatchメソッド
        // 最初に一致しなかった要素のインデックスを返却する
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        int[] c = {1, 3, 2};
        int[] d = {1};
        int[] e = {1, 2, 3};

        System.out.println(Arrays.mismatch(a, b));    // 出力結果：「2」
        System.out.println(Arrays.mismatch(a, c));    // 出力結果：「1」
        System.out.println(Arrays.mismatch(a, d));    // 出力結果：「1」
        System.out.println(Arrays.mismatch(a, e));    // 出力結果：「-1」
    }
}
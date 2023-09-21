package jp.hachi.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        
        arrayListSample();
        
        hashMapSample();
    }
    
    public static void arrayListSample() {
        
        // 固定長のリストのインスタンスを生成する
        // いずれの方法で作成したリストも要素の追加・削除はできない
        
        // Arrays.asListを使う方法 
        Integer[] array = {1, 2, 3};
        var intList = Arrays.asList(array);
        // List.ofメソッドを使う方法
        var charList = List.of('A', 'B', 'C');
        
        // Arrays.asListで作成したリストは要素の変更ができる
        intList.set(0, 999);
        // List.ofで作成したリストは要素の変更もできない
        // charList.set(0, 'z');	→ java.lang.UnsupportedOperationExceptionが発生
        
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        // forEachメソッドで簡単な繰り返し処理が書ける
        // 引数はConsumer型なので、ラムダ式で書ける
        fruits.forEach((fruit) -> System.out.println(fruit));
    }
    
    public static void hashMapSample() {
        
        Map<Integer, Item> map = new HashMap<>();
        
        // putメソッドにキーとバリューを渡して要素を追加する
        map.put(1, new Item(1, "A"));
        map.put(2, new Item(2, "B"));
        map.put(3, new Item(3, "C"));
        map.put(1, new Item(1, "A"));
        // HashMapクラスはキーとバリューどちらもnullを許容している
        map.put(null, new Item(0, "default"));
        
        System.out.println(map.size());
        map.forEach( (id, item) -> System.out.println(id + " : " + map.get(id).getName()) );
    }
}

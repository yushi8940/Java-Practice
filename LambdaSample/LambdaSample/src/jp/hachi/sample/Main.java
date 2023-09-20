package jp.hachi.sample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        
        final String LAMBDA = "Lambda";
        
        // ラムダ式で関数型インタフェースAlgorithmのperformメソッドの振る舞いを宣言
        Algorithm logic = (name) -> {
            System.out.println("hello, " + name);
        };
        Service service = new Service();
        service.setLogic(logic);
        service.doProcess(LAMBDA);
        
        
        // java.util.functionパッケージのインタフェースを使用してみる
        // 引数を受け取って、booleanを返す
        Predicate<String> p = str -> str.equals("Lambda");
        System.out.println(p.test(LAMBDA));
        
        // 引数を受け取って、戻り値は返さない
        Consumer<String> c = str -> System.out.println(str);
        c.accept(LAMBDA);
        
        // 引数を受け取らず、戻り値を返す
        Supplier<Date> s = () -> new Date();
        System.out.println("現在時刻：" + s.get());
        
        // 引数を受け取って、指定した型の戻り値を返す
        Function<Date, String> f = date -> {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            return sf.format(date);
        };
        System.out.println("現在時刻：" + f.apply(s.get()));
        
    }

}

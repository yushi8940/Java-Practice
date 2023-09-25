package jp.hachi.sample;

public class Main1 {

    public static void main(String[] args) {
        
        
        int result1 = sample1();
        System.out.println("sample1 : " + result1);
        
        int result2 = sample2();
        System.out.println("sample2 : " + result2);
        
        Result result3 = sample3();
        System.out.println("sample3 : " + result3);
    }
    
    
    // catchブロックとfinallyブロックの両方でreturnを行っている場合
    private static int sample1() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            return 10;
        } finally {
            return 20;
        }
    }
    
    
    // catchブロックでreturnしている変数val(プリミティブ型)の値をfinallyブロックで更新した場合
    private static int sample2() {
        int val = 0;
        try {
            String[] array = {"A", "B", "C"};
            System.out.println(array[3]);
        } catch (RuntimeException e) {
            val = 10;
            return val;
        } finally {
            val += 10;
        }
        return val;
    }
    
    
    // catchブロックでreturnしている変数val(参照型)の値をfinallyブロックで更新した場合
    private static Result sample3() {
        Result result = new Result();
        try {
            String[] array = {"A", "B", "C"};
            System.out.println(array[3]);
        } catch (RuntimeException e) {
            result.setExceptionType("RuntimeException");
            return result;
        } finally {
            result.setExceptionType("execute finally clause");
        }
        return result;
    }
}
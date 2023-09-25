package jp.hachi.sample;

public class Main2 {

    public static void main(String[] args) {
        
        String result = null;
        try {
            result = execute();			
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
    
    private static String execute() throws Exception{
        
        try {
            throw new Exception();
        } finally {
            return "XXXXX";
        }
    }

}

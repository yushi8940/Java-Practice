package jp.hachi.sample;

public class Cat extends Animal {

    public String TAG = "CAT";
    
    @Override
    public void makeSound() {
        System.out.println("にゃー！");
    }
    
    @Override
    public void printTag() {
        System.out.println(TAG);
    }
    
    public void meow() {
        System.out.println("meow!");
    }

}

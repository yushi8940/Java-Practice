package jp.hachi.sample;

public class Dog extends Animal {

    public String TAG = "DOG";
    
    @Override
    public void makeSound() {
        System.out.println("わんわん！");
    }
    
}

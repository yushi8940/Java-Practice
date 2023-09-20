package jp.hachi.sample;

public class Main {

    public static void main(String[] args) {
        Animal myPet1 = new Dog();	// 犬のインスタンス
        Animal myPet2 = new Cat();	// 猫のインスタンス
        
        myPet1.makeSound();	// 犬が鳴く
        myPet2.makeSound();	// 猫が鳴く
        
        System.out.println("===============================");
        
        // DogクラスではprintTagメソッドをオーバーライドしていないため、Animalクラスのメソッドが呼び出される
        myPet1.printTag();	// ANIMAL
        myPet2.printTag();	// CAT
        
        System.out.println("===============================");
        
        // Catクラスにはmeowメソッドを追加しているが、myPet2はAnimal型であり、
        // Animalクラスにはmeowメソッドが未定義のため、次の行はコンパイルエラーになる
        // myPet2.meow();
        
        // Catクラスのmeowメソッドを呼ぶためには、Animal型からCat型へのダウンキャストが必要
        Cat cat = (Cat) myPet2;
        cat.meow();
        
        System.out.println();
        
        // サブクラスのコンストラクタにsuper()が自動的に追加されることの確認
        System.out.print("A a1 = new B(); → ");
        A a1 = new B();
        
        System.out.println();
        
        System.out.print("A a2 = new B(\"pple\"); → ");
        A a2 = new B("pple");
    }

}


class A {
    public A() {
        System.out.print("A");
    }
}
class B extends A {
    public B() {
        System.out.print("B");
    }
    public B(String msg) {
        System.out.println(msg);
    }
}
package jp.hachi.module;

import jp.hachi.module.alpha.Alpha;

public class Main {

    public static void main(String[] args) {
        
        // exports jp.hachi.module.alpha
        Alpha alpha = new Alpha();
        alpha.say();
        
        // exports jp.hachi.module.beta
        // Beta beta = new Beta();
        // beta.say();
    }

}

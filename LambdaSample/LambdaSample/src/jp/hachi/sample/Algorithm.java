package jp.hachi.sample;

// 関数型インタフェースであることを明示するためのアノテーション
// 抽象メソッドが複数あるなどした場合にコンパイルエラーが発生するようにしてくれる
@FunctionalInterface
public interface Algorithm {
    void perform(String name);
}

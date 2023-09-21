package jp.hachi.sample;

public class Person implements Comparable<Person> {
    
    private String name;
    private Integer age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // 年齢で比較する
        return this.age.compareTo(otherPerson.getAge());
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

package hello.core;

import lombok.Data;

@Data
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setAge(5);
        helloLombok.setName("KIM");
        System.out.println("helloLombok = " + helloLombok);
    }
}

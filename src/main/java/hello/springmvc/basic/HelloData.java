package hello.springmvc.basic;

import lombok.Data;

@Data //getter, setter, toString, requiredArgConstructor 등등 자동으로 생성
public class HelloData {
    private String username;
    private int age;
}

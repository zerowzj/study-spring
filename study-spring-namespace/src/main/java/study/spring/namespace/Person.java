package study.spring.namespace;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Person {

    private String id;

    private String name;

    private int age;
}

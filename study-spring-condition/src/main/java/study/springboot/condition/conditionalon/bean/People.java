package study.springboot.condition.conditionalon.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class People {

    private String name;

    private Integer age;

    private City city;

    public People(String name, Integer age, City city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}

package study.spring.ioc.bean_definition;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MyBean {

    private String name;

    public MyBean() {
    }

    public MyBean(String name) {
        this.name = name;
    }
}

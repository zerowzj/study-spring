package study.sping.annotation.properties;


//@Configuration
//@PropertySource("classpath:prop.properties")
//@ConfigurationProperties(prefix = "custom.prop.demo1")
public class CustomProperties {

    private String name;

    private Integer age;

    private CustomProperties son;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public CustomProperties getSon() {
        return son;
    }

    public void setSon(CustomProperties son) {
        this.son = son;
    }
}

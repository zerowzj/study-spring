package study.springboot.condition.conditional_on.tt.and;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@Slf4j
public class OnAndConditions extends AllNestedConditions {

    public OnAndConditions() {
        super(ConfigurationPhase.PARSE_CONFIGURATION);
    }

    @ConditionalOnProperty(name="person", havingValue = "man")
    static class OnProperty1{}

    @ConditionalOnProperty(name="", havingValue = "man")
    static class OnProperty{}
}

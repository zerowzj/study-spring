package study.springboot.condition.conditionalon.tt.none;

import org.springframework.boot.autoconfigure.condition.NoneNestedConditions;

public class OnNoneConditions extends NoneNestedConditions {

    public OnNoneConditions() {
        super(ConfigurationPhase.PARSE_CONFIGURATION);
    }
}

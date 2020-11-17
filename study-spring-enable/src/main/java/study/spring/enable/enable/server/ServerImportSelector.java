package study.spring.enable.enable.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.Map;

@Slf4j
public class ServerImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        //
        Map<String, Object> attr = metadata.getAnnotationAttributes(EnableServer.class.getName());
        metadata.getAnnotationTypes()
                .forEach(e -> {
                    log.info("{}", e);
                });
        //
        Server.Type type = (Server.Type) attr.get("type");
        //
        String[] classNames = new String[0];
        switch (type) {
            case HTTP:
                classNames = new String[]{HttpServer.class.getName()};
                break;
            case FTP:
                classNames = new String[]{FtpServer.class.getName()};
                break;
        }
        Arrays.stream(classNames).forEach(e -> {
            log.info(e);
        });
        return classNames;
    }
}

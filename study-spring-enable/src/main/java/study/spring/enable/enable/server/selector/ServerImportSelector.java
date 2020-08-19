package study.spring.enable.enable.server.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import study.spring.enable.enable.server.EnableServer;
import study.spring.enable.enable.server.FtpServer;
import study.spring.enable.enable.server.HttpServer;
import study.spring.enable.enable.server.Server;


import java.util.Map;

public class ServerImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Map<String, Object> attr = annotationMetadata.getAnnotationAttributes(EnableServer.class.getName());
        Server.Type type = (Server.Type) attr.get("type");
        String[] importClassNames = new String[0];
        switch (type) {
            case HTTP:
                importClassNames = new String[]{HttpServer.class.getName()};
                break;
            case FTP:
                importClassNames = new String[]{FtpServer.class.getName()};
                break;
        }
        return importClassNames;
    }
}

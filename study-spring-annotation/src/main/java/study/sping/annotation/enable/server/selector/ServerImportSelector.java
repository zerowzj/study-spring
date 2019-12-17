package study.sping.annotation.enable.server.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import study.sping.annotation.enable.server.EnableServer;
import study.sping.annotation.enable.server.FtpServer;
import study.sping.annotation.enable.server.HttpServer;
import study.sping.annotation.enable.server.Server;


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

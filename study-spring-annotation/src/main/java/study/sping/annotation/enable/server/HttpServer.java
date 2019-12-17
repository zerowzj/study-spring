package study.sping.annotation.enable.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Component
public class HttpServer implements Server {

    public static final Logger LOGGER = LoggerFactory.getLogger(HttpServer.class);

    @Override
    public void start() {
        LOGGER.info("http server starting...");
    }

    @Override
    public void stop() {
        LOGGER.info("http server stopping...");
    }
}

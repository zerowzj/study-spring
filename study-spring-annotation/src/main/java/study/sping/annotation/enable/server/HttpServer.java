package study.sping.annotation.enable.server;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class HttpServer implements Server {

    @Override
    public void start() {
        log.info("HTTP server starting...");
    }

    @Override
    public void stop() {
        log.info("HTTP server stopping...");
    }
}

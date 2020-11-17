package study.spring.enable.enable.server;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HttpServer implements Server {

    @Override
    public void start() {
        log.info("HTTP server starting...");
    }
}

package study.spring.enable.enable.server;

import lombok.extern.slf4j.Slf4j;

//@Component
@Slf4j
public class FtpServer implements Server {

    @Override
    public void start() {
        log.info("FTP server starting...");
    }

    @Override
    public void stop() {
        log.info("FTP server stopping...");
    }
}

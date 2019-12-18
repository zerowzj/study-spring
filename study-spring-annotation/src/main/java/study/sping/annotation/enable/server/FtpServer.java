package study.sping.annotation.enable.server;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

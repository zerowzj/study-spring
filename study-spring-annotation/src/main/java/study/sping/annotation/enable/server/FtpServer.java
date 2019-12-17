package study.sping.annotation.enable.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Component
public class FtpServer implements Server {

    public static final Logger LOGGER = LoggerFactory.getLogger(FtpServer.class);

    @Override
    public void start() {
        LOGGER.info("ftp server starting...");
    }

    @Override
    public void stop() {
        LOGGER.info("ftp server stopping...");
    }
}

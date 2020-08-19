package study.spring.enable.enable.server;

public interface Server {

    void start();

    void stop();

    enum Type {
        HTTP,
        FTP
    }
}

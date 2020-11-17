package study.spring.enable.enable.server;

public interface Server {

    void start();

    enum Type {
        HTTP,
        FTP
    }
}

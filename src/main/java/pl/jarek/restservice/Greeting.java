package pl.jarek.restservice;

import java.time.LocalTime;

public class Greeting {
    private Long id;
    private String content;
    private LocalTime localTime;

    public Greeting(){
    }

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
        this.localTime = LocalTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }
}

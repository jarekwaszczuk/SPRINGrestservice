package pl.jarek.restservice;

import java.time.LocalTime;

// GET localhost:7777/greeting?name=Jarosław


public class Greeting {
    private Long id;
    private String name;
    private LocalTime localTime;

    public Greeting(Long id, String name, LocalTime localTime) {
        this.id = id;
        this.name = name;
        this.localTime = localTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }
}

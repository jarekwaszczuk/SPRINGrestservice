package pl.jarek.restservice;

import org.springframework.stereotype.Service;

import java.util.List;

public interface GreetingService {

    public Greeting findById(Long id);

    public Greeting deleteById(Long id);

    public Greeting create(Greeting greeting);

    public Greeting update(Long id, Greeting greeting);

    public List<Greeting> findAll();
}

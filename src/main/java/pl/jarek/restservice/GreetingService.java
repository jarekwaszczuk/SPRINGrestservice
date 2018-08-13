package pl.jarek.restservice;

import java.util.List;

public interface GreetingService {

    void findById(Long id);

    void deleteById(Long id);

    void create(Greeting greeting);

    void update(Long id, Greeting greeting);

    List<Greeting> findAll();
}

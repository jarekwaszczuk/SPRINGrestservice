package pl.jarek.restservice;

import java.util.List;
import java.util.Optional;

public interface GreetingService {

    Optional<Greeting> findById(Long id);

    void deleteById(Long id);

    Greeting create(Greeting greeting);

    void update(Long id, Greeting updatedGreeting);

    List<Greeting> findAll();
}

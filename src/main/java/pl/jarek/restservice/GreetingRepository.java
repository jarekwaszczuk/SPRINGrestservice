package pl.jarek.restservice;

import java.util.List;
import java.util.Optional;

public interface GreetingRepository {

    Optional<Greeting> findById(Long id);

    void deleteById(Long id);

    Greeting save(Greeting greeting);

    List<Greeting> findAll();

}

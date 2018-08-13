package pl.jarek.restservice;

import java.util.List;

public interface GreetingRepository {

    Greeting findById(Long id);

    void deleteById(Long id);

    void save(Greeting greeting);

    List<Greeting> findAll();

}

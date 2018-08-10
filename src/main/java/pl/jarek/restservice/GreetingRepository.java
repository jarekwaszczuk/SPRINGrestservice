package pl.jarek.restservice;

import java.util.List;

public interface GreetingRepository {

    //TODO dodać wszystkie metody, które pojawią sie w GreetingServiceIml

    public Greeting findById(Long id);

    public Greeting deleteById(Long id);

    public Greeting create(Greeting greeting);

    public Greeting update(Long id, Greeting greeting);

    public List<Greeting> findAll();
}

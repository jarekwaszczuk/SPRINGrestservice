package pl.jarek.restservice;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArrayListGreetingRepository implements GreetingRepository {

    //TODO wszystko z GreetingRepository
    //TODO greetingi w array-liście

    private List<Greeting> greetings = new ArrayList();

    @Override
    public Greeting findById(Long id) {
        for(Greeting greeting: greetings){
            if(id.equals(greeting.getId())) return greeting;
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        for(Greeting greeting: greetings){
            if(id.equals(greeting.getId())) greetings.remove(greeting);
        }
    }

    @Override
    public void save(Greeting greeting) {
        greetings.add(greeting);
    }

    @Override
    public List<Greeting> findAll() {
        return greetings;
    }

}

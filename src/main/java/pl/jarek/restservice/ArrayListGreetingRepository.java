package pl.jarek.restservice;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArrayListGreetingRepository implements GreetingRepository {

    //TODO wszystko z GreetingRepository
    //TODO greetingi w array-liście

    private List<Greeting> greetingList = new ArrayList();

    @Override
    public Greeting findById(Long id) {
        return null;
    }

    @Override
    public Greeting deleteById(Long id) {
        return null;
    }

    @Override
    public Greeting create(Greeting greeting) {
        return null;
    }

    @Override
    public Greeting update(Long id, Greeting greeting) {
        return null;
    }

    @Override
    public List<Greeting> findAll() {
        return null;
    }

}

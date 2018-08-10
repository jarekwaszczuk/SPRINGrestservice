package pl.jarek.restservice;

import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService {

//    @Autowired
//    private final GreetingRepository greetingRepository;

    @Override
    public Greeting findById(Long id) {
        return new Greeting(id, "findById", LocalTime.now());
    }

    @Override
    public Greeting deleteById(Long id) {
        return new Greeting(id, "deleteById", LocalTime.now());
    }

    @Override
    public Greeting create(Greeting greeting) {
        return greeting;
    }

    @Override
    public Greeting update(Long id, Greeting greeting) {
        return new Greeting(id, "update", LocalTime.now());
    }

    @Override
    public List<Greeting> findAll() {
        List<Greeting> greetingList = new ArrayList<>();
        greetingList.add(new Greeting(1l, "FindAll", LocalTime.now()));
        greetingList.add(new Greeting(2l, "FindAll", LocalTime.now()));
        greetingList.add(new Greeting(3l, "FindAll", LocalTime.now()));
        return greetingList;
    }
}

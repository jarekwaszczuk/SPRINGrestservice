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
        return new Greeting(id, "findById");
    }

    @Override
    public Greeting deleteById(Long id) {
        return new Greeting(id, "deleteById");
    }

    @Override
    public Greeting create(Greeting greeting) {
        return greeting;
    }

    @Override
    public Greeting update(Long id, Greeting greeting) {
        return new Greeting(id, "update");
    }

    @Override
    public List<Greeting> findAll() {
        List<Greeting> greetingList = new ArrayList<>();
        greetingList.add(new Greeting(1l, "FindAll"));
        greetingList.add(new Greeting(2l, "FindAll"));
        greetingList.add(new Greeting(3l, "FindAll"));
        return greetingList;
    }
}

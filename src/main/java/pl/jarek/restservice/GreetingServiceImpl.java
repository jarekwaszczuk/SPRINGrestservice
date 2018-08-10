package pl.jarek.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    private final GreetingRepository greetingRepository;

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

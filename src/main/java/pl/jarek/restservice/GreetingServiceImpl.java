package pl.jarek.restservice;

import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService {


    private final GreetingRepository greetingRepository;

    public GreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public Greeting findById(Long id) {
        return greetingRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        greetingRepository.deleteById(id);
    }

    @Override
    public void create(Greeting greeting) {
        greeting.setLocalTime(LocalTime.now());
        greetingRepository.save(greeting);
    }

    @Override
    public void update(Long id, Greeting updateGreeting) {
        Greeting greeting = greetingRepository.findById(id);
        greeting.setContent(updateGreeting.getContent());
        greeting.setLocalTime(LocalTime.now());
        greetingRepository.save(updateGreeting);
    }

    @Override
    public List<Greeting> findAll() {
        return greetingRepository.findAll();
    }
}

package pl.jarek.restservice;

import ch.qos.logback.core.pattern.parser.OptionTokenizer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ArrayListGreetingRepository implements GreetingRepository {

    //TODO wszystko z GreetingRepository
    //TODO greetingi w array-liście

    private List<Greeting> greetings = new ArrayList();

    @Override
    public Optional<Greeting> findById(Long id) {
        return greetings.stream()
                .filter(greeting -> greeting.getId().equals(id))
                .findFirst();

//        for (Greeting greeting : greetings) {
//            if (greeting.getId().equals(id)) return greeting;
//        }
//        return null;
    }

    @Override
    public void deleteById(Long id) {
        findById(id)
                .ifPresent(greeting -> greetings.remove(greeting));
    }

    @Override
    public void save(Greeting greeting) {
        if (greeting.getId() == null) {
            greeting.setId(findMaxId() + 1);
            greetings.add(greeting);
        } else {
            findById(greeting.getId())
                    .ifPresent(existingGreeting -> {
                        existingGreeting.setContent(greeting.getContent());
                        existingGreeting.setLocalTime(greeting.getLocalTime());
                    });
        }
    }

    @Override
    public List<Greeting> findAll() {
        return greetings;
    }

    private Long findMaxId() {
        return greetings.stream()
                .mapToLong(greeting -> greeting.getId())
                .max()
                .orElse(0L);
    }
}

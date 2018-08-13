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
        for (Greeting greeting : greetings) {
            if (id.equals(greeting.getId())) greetings.remove(greeting);
        }
    }

    @Override
    public void save(Greeting greeting) {
        if (greeting.getId() == null) {
            greeting.setId(findMaxId() + 1);
            greetings.add(greeting);
        } else {
            Greeting existingGreeting = findById(greeting.getId());
            existingGreeting.setContent(greeting.getContent());
            existingGreeting.setLocalTime(greeting.getLocalTime());
        }
    }

    @Override
    public List<Greeting> findAll() {
        return greetings;
    }

    private Long findMaxId() {
        Long maxId = 0l;
        for (Greeting greeting : greetings) {
            if (greeting.getId().compareTo(maxId) > 0) maxId = greeting.getId();
        }
        return maxId;
    }

}

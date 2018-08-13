package pl.jarek.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private final AtomicLong counter = new AtomicLong();

    // GET localhost:7777/greetings?name=Jarosław

    @GetMapping(value = "/{id}")
    public ResponseEntity<Greeting> findById(@PathVariable Long id) {
        return greetingService.findById(id)
                .map(greeting -> new ResponseEntity<>(greeting, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        greetingService.deleteById(id);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Greeting> create(@RequestBody Greeting greeting) {
        return new ResponseEntity<>(greetingService.create(greeting), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public List<Greeting> findAll() {
        return greetingService.findAll();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Greeting updatedGreeting) {
        greetingService.update(id, updatedGreeting);
    }
}

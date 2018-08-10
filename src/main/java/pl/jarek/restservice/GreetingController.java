package pl.jarek.restservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    private final GreetingService greetingService = new GreetingServiceImpl();

    private final AtomicLong counter = new AtomicLong();

    // GET localhost:7777/greetings?name=Jarosław

    @GetMapping(value = "/{id}")
    public Greeting findById(@PathVariable Long id) {
        return greetingService.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public Greeting deleteById(@PathVariable Long id) {
        return greetingService.deleteById(id);
    }

    @PostMapping(value = "/")
    public Greeting create(@RequestBody Greeting greeting) {
        return greetingService.create(greeting);
    }

    @GetMapping("/")
    public List<Greeting> findAll() {
        return greetingService.findAll();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Greeting greeting) {
        greetingService.update(id, greeting);
    }


}

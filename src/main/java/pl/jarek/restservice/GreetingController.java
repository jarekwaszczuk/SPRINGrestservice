package pl.jarek.restservice;

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
    public void findById(@PathVariable Long id) {
        greetingService.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        greetingService.deleteById(id);
    }

    @PostMapping(value = "/")
    public void create(@RequestBody Greeting greeting) {
        greetingService.create(greeting);
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

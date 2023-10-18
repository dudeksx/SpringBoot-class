package dio.aula.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Users user = new Users();
        user.setName("Eduardo");
        user.setUsername("Dudeksx");
        user.setPassword("iGotU");

        repository.save(user);

        for (Users u : repository.findAll()) {
            System.out.println(u);
        }
    }

}

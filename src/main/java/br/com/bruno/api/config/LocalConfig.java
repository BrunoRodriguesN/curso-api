package br.com.bruno.api.config;


import br.com.bruno.api.domain.User;
import br.com.bruno.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {
    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Bruno", "bruno@mail.com", "123" );
        User u2 = new User(null, "Kathy", "kathy@mail.com", "123" );

        repository.saveAll(List.of(u1, u2));
    }
}

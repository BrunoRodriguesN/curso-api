package br.com.bruno.api.services.impl;

import br.com.bruno.api.domain.User;
import br.com.bruno.api.repositories.UserRepository;
import br.com.bruno.api.services.UserService;
import br.com.bruno.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado !"));
    }

    public List<User> findAll() {
        return repository.findAll();

    }
}
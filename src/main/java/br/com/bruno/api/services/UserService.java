package br.com.bruno.api.services;

import br.com.bruno.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}

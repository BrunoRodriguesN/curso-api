package br.com.bruno.api.services;

import br.com.bruno.api.domain.User;

public interface UserService {

    User findById(Integer id);
}

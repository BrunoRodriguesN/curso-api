package br.com.bruno.api.services;

import br.com.bruno.api.domain.User;
import br.com.bruno.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
}

package br.com.williamrichard.api.services;

import br.com.williamrichard.api.domain.User;
import br.com.williamrichard.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User finById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
}

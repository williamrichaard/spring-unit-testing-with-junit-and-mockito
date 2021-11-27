package br.com.williamrichard.api.services;

import br.com.williamrichard.api.domain.User;

import java.util.List;

public interface UserService {

    User finById(Integer id);
    List<User> findAll();
}

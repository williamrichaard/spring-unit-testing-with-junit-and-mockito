package br.com.williamrichard.api.services.impl;

import br.com.williamrichard.api.domain.User;
import br.com.williamrichard.api.repositories.UserRepository;
import br.com.williamrichard.api.services.UserService;
import br.com.williamrichard.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User finById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}

package br.com.williamrichard.api.resources;

import br.com.williamrichard.api.domain.User;
import br.com.williamrichard.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(service.finById(id));
    }
}

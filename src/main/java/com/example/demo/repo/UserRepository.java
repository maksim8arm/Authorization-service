package com.example.demo.repo;

import com.example.demo.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {

        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("ivan") && password.equals("123")) {
            authorities.add(Authorities.READ);
            authorities.add(Authorities.WRITE);
            authorities.add(Authorities.DELETE);
        } else if (user.equals("tom") && password.equals("321")) {
            authorities.add(Authorities.READ);
        }
        return authorities;
    }
}

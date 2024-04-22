package com.example.demo.Serivce;

import com.example.demo.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<User>();

    public UserService() {
        store.add(new User((UUID.randomUUID().toString()), "Nikhil", "nik@gmail.com"));
        store.add(new User((UUID.randomUUID().toString()), "Dice", "dice@gmail.com"));
        store.add(new User((UUID.randomUUID().toString()), "John", "john@gmail.com"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}

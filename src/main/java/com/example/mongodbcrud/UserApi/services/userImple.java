package com.example.mongodbcrud.UserApi.services;

import com.example.mongodbcrud.UserApi.model.user;
import com.example.mongodbcrud.UserApi.repo.userRepor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class userImple implements Iuserservices{

    private final userRepor repor;

    public userImple(userRepor repor) {
        this.repor = repor;
    }

    @Override
    public user add(user user) {
        return repor.save(user);
    }

    @Override
    public List<user> listuser() {
        return repor.findAll();
    }
}

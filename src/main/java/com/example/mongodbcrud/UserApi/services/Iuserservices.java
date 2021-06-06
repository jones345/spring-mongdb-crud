package com.example.mongodbcrud.UserApi.services;

import com.example.mongodbcrud.UserApi.model.user;

import java.util.ArrayList;
import java.util.List;

public interface Iuserservices {
    user add(user user);
    List<user> listuser();
}

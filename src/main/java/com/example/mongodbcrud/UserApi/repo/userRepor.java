package com.example.mongodbcrud.UserApi.repo;

import com.example.mongodbcrud.UserApi.model.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepor extends MongoRepository<user,String> {
}

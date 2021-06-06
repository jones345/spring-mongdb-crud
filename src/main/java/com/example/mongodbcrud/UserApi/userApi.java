package com.example.mongodbcrud.UserApi;

import com.example.mongodbcrud.UserApi.model.user;
import com.example.mongodbcrud.UserApi.services.Iuserservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/user")
public class userApi {

    @Autowired
    private final Iuserservices iuserservices;

    public userApi(Iuserservices iuserservices) {
        this.iuserservices = iuserservices;
    }
    @GetMapping(path = "/all")
    public List<user>  alluser(){
        return iuserservices.listuser();
    }
    @PostMapping(path = "/create")
    public user add( @RequestBody user user){
     return iuserservices.add(user);
    }
}

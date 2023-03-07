package com.demo.HelloWorld.dao;

import com.demo.HelloWorld.Model.UserDetails;
import org.springframework.data.repository.CrudRepository;

public interface DataInterface extends CrudRepository<UserDetails , Integer> {
}

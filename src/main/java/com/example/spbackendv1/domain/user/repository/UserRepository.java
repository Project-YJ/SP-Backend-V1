package com.example.spbackendv1.domain.user.repository;

import com.example.spbackendv1.domain.user.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
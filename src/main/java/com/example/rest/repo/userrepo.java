package com.example.rest.repo;

import com.example.rest.models.user;
import org.springframework.data.jpa.repository.JpaRepository;


public interface userrepo extends JpaRepository<user, Long> {

}

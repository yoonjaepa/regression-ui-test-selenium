package com.ktds.uitest.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ktds.uitest.domain.User;


public interface UserDao extends JpaRepository<User, Long> {

}

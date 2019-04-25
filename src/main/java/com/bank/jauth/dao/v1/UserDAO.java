package com.bank.jauth.dao.v1;

import com.bank.jauth.model.v1.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {


}

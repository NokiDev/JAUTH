package com.bank.jauth.dao.v1;

import com.bank.jauth.model.v1.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenDAO extends JpaRepository<Token, Long> {




}

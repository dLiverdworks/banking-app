package com.javaguides.banking.repository;

import com.javaguides.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByPhoneNumber(String phoneNumber);
}

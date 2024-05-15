package dev.metehankozan.accountservice.service;

import dev.metehankozan.accountservice.entity.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public Account get(String id) {
        return new Account();
    }

    public Account save(Account account) {
        return new Account();
    }

    public Account update(Account account) {
        return new Account();
    }

    public void delete(String id) {

    }

}

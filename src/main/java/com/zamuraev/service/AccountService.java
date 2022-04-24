package com.zamuraev.service;

import com.zamuraev.dto.AccountDto;
import com.zamuraev.models.Account;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface AccountService extends UserDetailsService {

    Account addAccount(AccountDto accountDto);
    Account findByUsername(String username);

}

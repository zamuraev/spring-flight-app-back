package com.zamuraev.service.impl;

import com.zamuraev.dto.AccountDto;
import com.zamuraev.models.Account;
import com.zamuraev.repository.AccountRepository;
import com.zamuraev.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
@Data
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Account addAccount(AccountDto accountDto) {
        Account account = new Account();
        account.setUsername(accountDto.getUsername());
        account.setPassword(passwordEncoder.encode(accountDto.getPassword()));
        account.setConfpassword(passwordEncoder.encode(accountDto.getConfpassword()));
        account.setEmail(accountDto.getEmail());
        return accountRepository.save(account);
    }

    @Override
    public Account findByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
        Account account = accountRepository.findByUsername(username);
        if(account==null){
            throw new UsernameNotFoundException("Account not found with username: "+username);
        }
        return new User(username,account.getPassword(),enabled,accountNonExpired,credentialsNonExpired,accountNonLocked,new ArrayList<>());
    }
}

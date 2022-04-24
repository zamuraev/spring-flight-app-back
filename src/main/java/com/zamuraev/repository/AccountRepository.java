package com.zamuraev.repository;

import com.zamuraev.models.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {

    @Query("select account from Account account where account.username=?1")
    Account findByUsername(String username);

}

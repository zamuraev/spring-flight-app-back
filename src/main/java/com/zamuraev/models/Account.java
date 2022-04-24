package com.zamuraev.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAccount;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String confpassword;
    @Column
    private String email;
    @Column
    private boolean enabled;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
    private Set<Bookmark> bookmarks;

}

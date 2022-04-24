package com.zamuraev.dto;

import com.zamuraev.validation.Password;
import com.zamuraev.validation.PasswordMatches;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@PasswordMatches
public class AccountDto {

    @NotBlank(message = "Username is mandatory")
    private String username;
    @NotBlank(message = "Password is mandatory")
    @Password
    private String password;
    @NotBlank(message = "Password confirmation is mandatory")
    private String confpassword;
    @NotBlank(message = "Email is mandatory")
    @Email
    private String email;

}

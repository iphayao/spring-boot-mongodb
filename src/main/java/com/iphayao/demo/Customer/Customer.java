package com.iphayao.demo.Customer;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import javax.validation.constraints.NotNull;

@Data
public class Customer {
    @Id
    private String id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private Integer age;
    @NotNull
    private String email;

}

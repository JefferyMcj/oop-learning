package com.easycoding.java.senior;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    public String name;
    public int age;
}

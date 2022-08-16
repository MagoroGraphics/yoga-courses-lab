package models;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Customer {
    @NonNull
    private final String firstName;
    @NonNull
    private final String lastName;
    @NonNull
    private String town;
    @NonNull
    private int age;
    private String sex;

}

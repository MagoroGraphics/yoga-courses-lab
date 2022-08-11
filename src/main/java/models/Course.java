package models;

import lombok.*;


@Data
@Builder
public class Course {
    @NonNull
    private final String courseName;

    @NonNull
    private final String town;

    private int rating;
}

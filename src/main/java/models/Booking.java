package models;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Booking {
    @NonNull
    private String date;
}

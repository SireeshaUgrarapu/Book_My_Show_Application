package com.project.BookMyShow.model;

import com.project.BookMyShow.model.constant.SeatStatus;
import com.project.BookMyShow.model.constant.SeatType;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Seat_Table")
public class Seat extends BaseModel{
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus status;

}

/*
        SELECT * FROM SEAT WHERE ROW = ? AND COL = ? AND SEATNUMBER IS NOT ?

        findSeatByRowAndColNotSeatNumber(int row, int col, String seatNumber);
 */


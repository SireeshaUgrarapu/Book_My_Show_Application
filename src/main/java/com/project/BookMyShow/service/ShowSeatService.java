package com.project.BookMyShow.service;

import com.project.BookMyShow.model.ShowSeat;
import com.project.BookMyShow.repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowSeatService {
    @Autowired
    private ShowSeatRepository showSeatRepository;
    public ShowSeat getShowSeat(int showSeatId){
        return showSeatRepository.findById(showSeatId).get();
    }
    public ShowSeat saveShowSeat(ShowSeat seat){
        return showSeatRepository.save(seat);
    }

}

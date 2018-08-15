package com.service;

import com.mapper.DeductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeductService implements DeductMapper{
    @Override
    public double deduct(double moeny) {
        moeny=moeny*0.1;
        return moeny;
    }
}

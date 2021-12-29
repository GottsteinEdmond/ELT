package com.example.smartcatinterview;

import com.example.smartcatinterview.extract.ShiftExtract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ETLJob implements ApplicationRunner {

    @Autowired
    ShiftExtract shiftExtract;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        shiftExtract.getShifts();

    }
}

package com.robert.vesta.service.impl.timer;

import com.robert.vesta.service.impl.bean.IdMeta;
import com.robert.vesta.service.impl.bean.IdType;

import java.util.Date;

public interface Timer {
    long EPOCH = 1546272000000L;// From 2019-01-01 00:00:00

    void init(IdMeta idMeta, IdType idType);

    Date transTime(long time);

    void validateTimestamp(long lastTimestamp, long timestamp);

    long tillNextTimeUnit(long lastTimestamp);

    long genTime();

}

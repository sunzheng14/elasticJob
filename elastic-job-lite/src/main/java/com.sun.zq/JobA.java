package com.sun.zq;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.util.Date;

public class JobA implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("JobA start-----------------" + new Date());
        System.out.println("JobA>>>>>>>>>");
        System.out.println("JobA end-----------------");
    }
}

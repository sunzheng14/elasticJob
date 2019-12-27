package com.sun.zq;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.util.Date;

public class JobB implements SimpleJob {
    @Override
    public void execute(ShardingContext context) {
        int item = context.getShardingItem();
        switch (item) {
            case 0:
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("shardingItem=" + item);
                System.out.println("JobB>>>>getShardingParameter>>>" + context.getShardingParameter());
                break;
            case 1:
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("shardingItem=" + item);
                System.out.println("JobB>>>>getShardingParameter>>>" + context.getShardingParameter());
                break;
        }
//        System.out.println("JobB start-----------------" + new Date());
//        System.out.println("JobB>>>>getJobName>>>" + shardingContext.getJobName());
//        System.out.println("JobB>>>>getShardingParameter>>>" + shardingContext.getShardingParameter());
//        System.out.println("JobB>>>>getTaskId>>>" + shardingContext.getTaskId());
//        System.out.println("JobB>>>>getShardingItem>>>" + shardingContext.getShardingItem());
//        System.out.println("JobB>>>>getShardingTotalCount>>>" + shardingContext.getShardingTotalCount());
//        System.out.println("JobB end------------------");

    }
}

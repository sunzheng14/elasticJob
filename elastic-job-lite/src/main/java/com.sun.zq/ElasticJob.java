package com.sun.zq;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class ElasticJob implements SimpleJob {
    @Override
    public void execute(ShardingContext context) {
        int item = context.getShardingItem();
        switch (item) {
            case 0:
                // do something by sharding item 0
                System.out.println(String.format("-----currentTime:%s, ThreadId:%s, 当前分片项：%s", System.currentTimeMillis(), Thread.currentThread().getId(),item));
                break;
            case 1:
                // do something by sharding item 1
                System.out.println(String.format("-----currentTime:%s, ThreadId:%s, 当前分片项：%s", System.currentTimeMillis(), Thread.currentThread().getId(),item));
                break;
            case 2:
                // do something by sharding item 2
                System.out.println(String.format("-----currentTime:%s, ThreadId:%s, 当前分片项：%s", System.currentTimeMillis(), Thread.currentThread().getId(),item));
                break;
            // case n: ...
        }
    }
}

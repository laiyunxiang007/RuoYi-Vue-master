package com.ruoyi.framework.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MybatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        List<InnerInterceptor> interceptorList=new ArrayList<>();
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //乐观锁插件
        interceptorList.add(new OptimisticLockerInnerInterceptor());
        //防全表更新与删除插件
        interceptorList.add(new BlockAttackInnerInterceptor());
        //分页插件
        interceptorList.add(new PaginationInnerInterceptor());
        interceptor.setInterceptors(interceptorList);
        return interceptor;
    }

}

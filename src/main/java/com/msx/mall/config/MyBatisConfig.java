package com.msx.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: masixin
 * @Description: mybatis配置类
 * @Date: Created in 15:20 2020/1/10
 * @Modified By:
 */
@Configuration
@MapperScan("com.msx.mall.mapper")
public class MyBatisConfig {
}

package com.zyz.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yongzhou.zhang on 2019/5/29.
 */
@Configuration
public class ConfigBean { //boot -->spring  applicationContext.xml ---@Configuration配置 ConfigBean = applicationContext.xml

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
//applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userService" class="com.zyz.tmall.UserServiceImpl">
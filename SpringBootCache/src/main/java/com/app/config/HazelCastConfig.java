package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;

@Configuration
public class HazelCastConfig {
	@Bean
	public Config cacheConfig() {
		return new Config()
				.setInstanceName("hazel-instance")
				.addMapConfig(new MapConfig()
				.setName("cust-cache")
				.setTimeToLiveSeconds(2000)
				.setEvictionPolicy(EvictionPolicy.LRU)
				.setMaxSizeConfig(
						new MaxSizeConfig().setSize(200)		
						)
				);
	}
}

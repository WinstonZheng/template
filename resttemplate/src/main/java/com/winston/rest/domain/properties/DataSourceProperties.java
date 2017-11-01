package com.winston.rest.domain.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * author: winston
 * date: 10/31/2017.
 * description:
 */
@ConfigurationProperties(prefix = "my.primary.datasource")
@Component
public class DataSourceProperties {

    private String name;
    private String url;
    private String username;
    private String password;
    private String mybatisMapperLocations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMybatisMapperLocations() {
        return mybatisMapperLocations;
    }

    public void setMybatisMapperLocations(String mybatisMapperLocations) {
        this.mybatisMapperLocations = mybatisMapperLocations;
    }
}

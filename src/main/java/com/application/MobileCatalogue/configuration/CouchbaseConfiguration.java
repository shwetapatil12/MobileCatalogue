package com.application.MobileCatalogue.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
@Configuration
public class CouchbaseConfiguration extends AbstractCouchbaseConfiguration{
	@Value("${app.couchbase.connection-string}")
	private String connectionString;
	@Value("${app.couchbase.user-name}")
	private String username;
	@Value("${app.couchbase.password}")
	private String password;
	@Value("${app.couchbase.bucket-primary}")
	private String mobileBucket;
	
	
	
	@Override
    public String getConnectionString() {
        return connectionString;
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getBucketName() {
        return mobileBucket;
    }

}

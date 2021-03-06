package com.yammer.dropwizard.config.tests;

import com.google.common.io.Resources;
import com.yammer.dropwizard.config.ConfigurationFactory;
import com.yammer.dropwizard.config.RequestLogConfiguration;
import com.yammer.dropwizard.validation.Validator;
import org.junit.Before;

import java.io.File;

public class RequestLogConfigurationTest {
    private RequestLogConfiguration requestLog;

    @Before
    public void setUp() throws Exception {
        this.requestLog = ConfigurationFactory.forClass(RequestLogConfiguration.class,
                                                        new Validator()).build(new File(Resources.getResource("yaml/requestLog.yml").getFile()));
    }


}

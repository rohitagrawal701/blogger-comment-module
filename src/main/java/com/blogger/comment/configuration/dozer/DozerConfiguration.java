package com.blogger.comment.configuration.dozer;

import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration Class for Dozer.
 *
 * @author Rohit
 * @version 1.0
 */
@Configuration
public class DozerConfiguration {

    /**
     * Creation of bean for all Dozer mappings.
     *
     * @return DozerBeanMapper
     */
    @Bean
    public DozerBeanMapper getDozerBeanMapper() {
        final List<String> mappingFileList =
                Arrays.asList("com/blogger/module/comment/mapping/comment.xml");
        final DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.setMappingFiles(mappingFileList);
        return mapper;
    }
}

package com.laoma.common.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laoma.common.jackson.ConfusionModule;
import org.junit.Test;
import org.junit.runner.RunWith;


public class JacksonTest {

    @Test
    public void testJackson(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper = ConfusionModule.registerModule(objectMapper);


    }
}

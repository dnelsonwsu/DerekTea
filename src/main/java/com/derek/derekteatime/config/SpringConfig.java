package com.derek.derekteatime.config;

import com.derek.derekteatime.data.Tea;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nelsoder on 5/12/2018.
 */
@Configuration
public class SpringConfig {

    @Bean
    public Tea verySpecialTea() {
        Tea badTea = new Tea();
        badTea.setName("grass tea");
        badTea.setRating(0);
        badTea.setType(Tea.Type.BLACK);
        return badTea;
    }

}

package com.curso_spring_boot.Arquiteturaspring.Montadora.configuration;

import com.curso_spring_boot.Arquiteturaspring.Montadora.Motor;
import com.curso_spring_boot.Arquiteturaspring.Montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor(){
        Motor motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        return motor;
    }

}

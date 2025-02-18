package com.curso_spring_boot.Arquiteturaspring.Montadora.configuration;

import com.curso_spring_boot.Arquiteturaspring.Montadora.Motor;
import com.curso_spring_boot.Arquiteturaspring.Montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        Motor motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        return motor;
    }
    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        Motor motor = new Motor();
        motor.setCavalos(320);
        motor.setCilindros(6);
        motor.setTipoMotor(TipoMotor.TURBO);
        motor.setModelo("SS-L");
        motor.setLitragem(2.5);
        return motor;
    }
    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        Motor motor = new Motor();
        motor.setCavalos(580);
        motor.setCilindros(0);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        motor.setModelo("M-E");
        motor.setLitragem(0.0);
        return motor;
    }

}

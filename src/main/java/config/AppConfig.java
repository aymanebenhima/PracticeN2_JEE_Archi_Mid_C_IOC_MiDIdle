package config;

import hdmi.*;
import org.springframework.beans.factory.annotation.Qualifier;
import unitecentrale.UniteCentrale;
import usb.*;
import vga.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
    @Bean
    public VGA ecran() {
        return new Ecran();
    }

    @Bean
    public VGA videoProjecteur() {
        return new VideoProjecteur();
    }

    @Bean
    public USB souris() {
        return new Souris();
    }

    @Bean
    public USB clavier() {
        return new Clavier();
    }

    @Bean
    public HDMI tv() {
        return new Tv();
    }

    @Bean
    public VGA hdmiToVgaAdapter(HDMI tv) {
        return new HDMItoVGAAdapter(tv);
    }

    @Bean
    public UniteCentrale uniteCentrale(@Qualifier("ecran") VGA vga, @Qualifier("clavier") USB usb) {
        return new UniteCentrale(vga, usb);
    }
}
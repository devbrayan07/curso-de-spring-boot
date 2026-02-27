package com.arquiteturaspring.arquiteturaspring.montadora;

import java.awt.*;

public class FiatSiena extends Carro {


    public FiatSiena(Motor motor) {
        super(motor);
        setModelo("GRAND");
        setCor(Color.BLACK);
        setMontadora(Montadora.FIAT);
    }
}

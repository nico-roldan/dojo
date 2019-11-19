package com.mercadolibre.dojos;

public class Tablero {

    private Presenter presenter;
    private String[][] coordenadas = new String[3][3];
    private String status;

    Tablero(Presenter presenter){
        this.presenter = presenter;
    }

    public String render() {
        return presenter.render(this);
    }
}

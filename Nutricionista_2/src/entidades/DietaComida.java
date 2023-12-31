
package entidades;

import java.util.logging.Logger;


public class DietaComida {
    private int id;
    private Comida comida;
    private Dieta dieta;
    private double porciones;
    private Horario horario;
    
    public DietaComida() {
    }

    public DietaComida(int id, Comida comida, Dieta dieta, double porciones) {
        this.id = id;
        this.comida = comida;
        this.dieta = dieta;
        this.porciones = porciones;
    }

    public DietaComida(Comida comida, Dieta dieta, double porciones) {
        this.comida = comida;
        this.dieta = dieta;
        this.porciones = porciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public double getPorciones() {
        return porciones;
    }

    public void setPorciones(double porciones) {
        this.porciones = porciones;
    }

    public DietaComida(Comida comida, Dieta dieta) {
        this.comida = comida;
        this.dieta = dieta;
    }
    

    public DietaComida(int id, Comida comida, Dieta dieta, Horario horario) {
        this.id = id;
        this.comida = comida;
        this.dieta = dieta;
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
}


package com.axeldev.automovil.logica;

import com.axeldev.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPesistencia = new ControladoraPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int nroPuertas) {
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setNroPuertas(nroPuertas);
        
        controlPesistencia.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutomoviles() {
        return controlPesistencia.traerAutomoviles();
    }

    public void borrarAuto(int id) {
        controlPesistencia.borrarAuto(id);
    }

    public Automovil traerAutomovil(int id) {
        return controlPesistencia.traerAutomovil(id);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int nroPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setNroPuertas(nroPuertas);
        controlPesistencia.modificarAuto(auto);
    }

}

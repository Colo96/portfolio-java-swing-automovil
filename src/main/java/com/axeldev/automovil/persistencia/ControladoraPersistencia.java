
package com.axeldev.automovil.persistencia;

import com.axeldev.automovil.logica.Automovil;
import com.axeldev.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutomoviles() {
        return autoJpa.findAutomovilEntities();
    }

    public void borrarAuto(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAutomovil(int id) {
        return autoJpa.findAutomovil(id);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

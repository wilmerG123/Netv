package com.netv.services;


import com.netv.DTO.ContratoCrcDTO;
import com.netv.model.ContratoCRC;

import java.util.List;

public interface IContratoCRC {

    /**
     * Interface donde se definen las operaciones de negocio a implementar
     *
     * @author wilmer garnica
     *
     */

    public ContratoCRC crearContratoCRC (ContratoCrcDTO contratocrcdto);

    public ContratoCRC actualizarContratoCRC (ContratoCrcDTO contratocrcdto, Long id);

    public List<ContratoCRC> obtenerContratoCRC ();

    public void borrarContratoCRC (Long id);

}

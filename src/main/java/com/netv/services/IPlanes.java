package com.netv.services;

import com.netv.DTO.ContratoCrcDTO;
import com.netv.DTO.PlanDTO;
import com.netv.model.ContratoCRC;
import com.netv.model.Plan;

import java.util.List;

public interface IPlanes {

    /**
     * Interface donde se definen las operaciones de negocio a implementar
     *
     * @author wilmer garnica
     *
     */

    public Plan crearPlan (PlanDTO plandto);

    public Plan actualizarPlan (PlanDTO plandto, Long id);

    public List<Plan> obtenerPlan ();

    public void borrarPlan (Long id);
}

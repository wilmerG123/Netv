package com.netv.services;

import com.netv.DTO.PlanDTO;
import com.netv.model.Plan;
import com.netv.repositorio.IRepoPlanes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanesImplementacion implements IPlanes{


    @Autowired
    IRepoPlanes repoPlanes;


    @Override
    public Plan crearPlan(PlanDTO plandto) {

        Plan plan = new Plan();

        plan.setNombre(plandto.getNombre());
        plan.setDescripcion(plandto.getDescripcion());
        plan.setValor(plandto.getValor());

        return repoPlanes.save(plan);
    }

    @Override
    public Plan actualizarPlan(PlanDTO plandto, Long id) {
        Plan plan = new Plan();

        plan.setId_plan(id);
        plan.setNombre(plandto.getNombre());
        plan.setDescripcion(plandto.getDescripcion());
        plan.setValor(plandto.getValor());

        return repoPlanes.save(plan);
    }

    @Override
    public List<Plan> obtenerPlan() {

        return repoPlanes.findAll();
    }

    @Override
    public void borrarPlan(Long id) {

        repoPlanes.deleteById(id);
    }
}

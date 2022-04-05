package com.netv.DTO;

import com.netv.model.*;

public class ContratoCrcDTO {

    private Cliente cliente;

    private Long numeroContrato;

    private Plan plan;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Long numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public ContratoCrcDTO(Cliente cliente, Long numeroContrato, Plan plan) {
        this.cliente = cliente;
        this.numeroContrato = numeroContrato;
        this.plan = plan;
    }

    public ContratoCrcDTO() {
    }
}

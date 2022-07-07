package com.concepto.pucp.microservicios.app.medidas.services;

import java.util.Optional;

import com.concepto.pucp.microservicios.app.medidas.models.entity.Medida;

public interface MedidaService {
	
	public Iterable<Medida> findAll();
	public Optional<Medida> findById(Integer idMedida);
	public Medida save(Medida medida);
	public void deleteById(Integer idMedida);

}

package com.concepto.pucp.microservicios.app.medidas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concepto.pucp.microservicios.app.medidas.models.entity.Medida;
import com.concepto.pucp.microservicios.app.medidas.models.repository.MedidaRepository;
@Service
public class MedidaServicelmpl implements MedidaService {
	@Autowired MedidaRepository repository;

	@Override
	public Iterable<Medida> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Medida> findById(Integer idMedida) {
		// TODO Auto-generated method stub
		return repository.findById(idMedida);
	}

	@Override
	public Medida save(Medida medida) {
		// TODO Auto-generated method stub
		return repository.save(medida);
	}

	@Override
	public void deleteById(Integer idMedida) {
		// TODO Auto-generated method stub
		repository.deleteById(idMedida);

	}

}

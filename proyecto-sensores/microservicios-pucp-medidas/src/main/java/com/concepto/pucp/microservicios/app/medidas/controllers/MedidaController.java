package com.concepto.pucp.microservicios.app.medidas.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.concepto.pucp.microservicios.app.medidas.models.entity.Medida;
import com.concepto.pucp.microservicios.app.medidas.services.MedidaService;

@RestController
public class MedidaController {
	
	@Autowired MedidaService service;
	
	@GetMapping
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok().body(service.findAll());
		
	}
	
	@GetMapping("/{idMedida}")
	public ResponseEntity<?> ver(@PathVariable Integer idMedida){
		Optional<Medida> o = service.findById(idMedida);
		if((o != null && !o.isPresent()|| o == null)) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(o);
	}
	
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Medida medida){
		Medida medidaDb = service.save(medida);
		return ResponseEntity.status(HttpStatus.CREATED).body(medidaDb);
	}
	
	@PutMapping("/{idMedida}")
	public ResponseEntity<?> editar(@RequestBody Medida medida, @PathVariable Integer idMedida){
		Optional<Medida> o = service.findById(idMedida);
		System.out.println("o.isPresent(): " + o.isPresent());
		if((o!=null && !o.isPresent()) || o==null) {
			return ResponseEntity.notFound().build();
		}
		
		Medida medidaDb = o.get();
		medidaDb.setMedida(medida.getMedida());
		medidaDb.setEstado(medida.getEstado());
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(medidaDb));
	}
	
	@DeleteMapping("/{idMedida}")
	public ResponseEntity<?> eliminar(@PathVariable Integer idMedida){
		service.deleteById(idMedida);
		return ResponseEntity.noContent().build();
	}
}

package pe.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.idat.model.Alumno;
import pe.idat.service.BodegaServiceImpl;
import pe.idat.model.Bodega;

@RestController
@RequestMapping("/bodega/v1")
public class BodegaController {

	@Autowired
	private BodegaServiceImpl service;
	
	@Autowired
	@RequestMapping(path = "/listar", method = RequestMethod.GET)		
	public ResponseEntity<List<Bodega>> listar() {
		return new ResponseEntity<List<Bodega>>(service.listar(), HttpStatus.OK);	
	}
}

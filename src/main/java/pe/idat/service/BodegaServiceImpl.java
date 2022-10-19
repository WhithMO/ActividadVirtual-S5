package pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.model.Bodega;
import pe.idat.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService {
	
	@Autowired
	private BodegaRepository repository;

	@Override
	public void guardar(Bodega bodega) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bodega> listar() {
		return repository.findAll();
	}

	@Override
	public Bodega obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}

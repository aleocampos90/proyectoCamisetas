package app.camisetas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.camisetas.model.Camiseta;
import app.camisetas.repository.CamisetasRepository;

@Service
public class CamisetasServiceJPA implements ICamisetasService {

	@Autowired
	public CamisetasRepository camisetasRepo;
	@Override
	public List<Camiseta> getCamisetas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Camiseta getCamiseta(int camisetaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Camiseta saveCamiseta(Camiseta camiseta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Camiseta camiseta) {
		// TODO Auto-generated method stub
		camisetasRepo.save(camiseta);
	}
	
	

}

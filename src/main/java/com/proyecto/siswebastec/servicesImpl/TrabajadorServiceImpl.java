package com.proyecto.siswebastec.servicesImpl;

import java.util.List;

import com.proyecto.siswebastec.DAO.JPAUtil;
import com.proyecto.siswebastec.DAO.TrabajadorDAO;
import com.proyecto.siswebastec.DAO.UsuarioDAO;
import com.proyecto.siswebastec.model.Trabajador;
import com.proyecto.siswebastec.model.Usuario;
import com.proyecto.siswebastec.services.TrabajadorService;

public class TrabajadorServiceImpl implements TrabajadorService{

	TrabajadorDAO trabajadorDAO;
	JPAUtil objJpaUtil;
	Trabajador trabajador;
	
	public TrabajadorServiceImpl() {
		super();
		objJpaUtil = new JPAUtil();
		trabajadorDAO =  new TrabajadorDAO(objJpaUtil.getEntityManager());
		trabajador = new Trabajador();
	}

	public void setTrabajadorDAO(TrabajadorDAO trabajadorDAO) {
		this.trabajadorDAO = trabajadorDAO;
	}
	
	public TrabajadorDAO getTrabajadorDAO() {
		return trabajadorDAO;
	}

	@Override
	public void addTrabajador(Trabajador trabajador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTrabajador(Trabajador trabajador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrabajador(Trabajador rabajador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Trabajador getTrabajadorById(String id) {
		objJpaUtil =  new JPAUtil();
		trabajadorDAO = new TrabajadorDAO(objJpaUtil.getEntityManager());
		trabajador = trabajadorDAO.getTrabajadorByIdtrabajador(id);
		return trabajador;
	}

	@Override
	public List<Trabajador> getTrabajadores() {
		return getTrabajadorDAO().listarTodos();
	}
	
	@Override
	public Boolean verificarTrabajador(String id, String password) {
		if(getTrabajadorById(id).getClaveUsuario().equals(password)){
			return true;
		}else{
			return false;
		}			
	}
}

package com.proyecto.siswebastec.servicesImpl;

import java.util.List;

import com.proyecto.siswebastec.DAO.SolicitudDAO;
import com.proyecto.siswebastec.DAO.JPAUtil;
import com.proyecto.siswebastec.model.Solicitud;
import com.proyecto.siswebastec.services.SolicitudService;

public class SolicitudServiceImpl implements SolicitudService{

	SolicitudDAO solicitudDAO;
	JPAUtil objJpaUtil;
	Solicitud solicitud;
	
	public SolicitudServiceImpl() {
		super();
		objJpaUtil = new JPAUtil();
		solicitudDAO =  new SolicitudDAO(objJpaUtil.getEntityManager());
		solicitud = new Solicitud();
	}
	
	@Override
	public void addSolicitud(Solicitud solicitud) {
		objJpaUtil = new JPAUtil();
		solicitudDAO = new SolicitudDAO(objJpaUtil.getEntityManager());
		solicitudDAO.insertarSolicitud(solicitud);
		
	}

	@Override
	public void updateSolicitud(Solicitud solicitud) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSolicitud(Solicitud solicitud) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Solicitud getSolicitudById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitud> getSolicitudes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verificaSolicitud(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}

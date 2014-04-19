package br.unirn.dao;


import java.util.List;

import br.unirn.dominio.Album;

public class AlbumDao extends GenericDaoImpl<Album> implements GenericDao<Album> {

    
    public List<Album> findAll() {
		List<Album> albuns = null;
		 try {
		  albuns = getEntityManager().createNamedQuery("Album.findAll")
		   .getResultList();
		 } catch (Exception e) {
		  e.printStackTrace();
		 }
		 return  albuns;
	}
    
}

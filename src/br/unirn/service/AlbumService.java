package br.unirn.service;

import br.unirn.dao.AlbumDao;
import br.unirn.dao.FotografoDao;
import br.unirn.dominio.Album;
import java.util.ArrayList;
import java.util.List;


public class AlbumService {

	private AlbumDao albumDao;
        	
	public AlbumService() {
		albumDao = new AlbumDao();
		
	}
	
	/*
         Metodo que adiciona um Album
        */
	public void adicionarAlbum(Album album){
		
		Album novoAlbum = new Album();
			
		novoAlbum.setDescricao(album.getDescricao());
		novoAlbum.setData(album.getData());
		novoAlbum.setObs(album.getObs());
		
		albumDao.insert(novoAlbum);
		
	}
        /**
         * Metodo que Lista os Albums 
         * @return 
         */
    public List<Album> listar() {
        
        return  albumDao.findAll();

    }
	
}

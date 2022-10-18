package net.itinajero.api.service.jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.itinajero.api.entity.Album;
import net.itinajero.api.repository.AlbumsRepository;
import net.itinajero.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {

	@Autowired
	private AlbumsRepository repoAlbums;
	
	@Override
	public List<Album> buscarTodos() {
		return repoAlbums.findAll();
	}

}

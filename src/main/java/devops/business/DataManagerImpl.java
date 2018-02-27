package devops.business;

import java.util.List;

import devops.integration.LibraryDAO;


public class DataManagerImpl implements DataManager {
	private LibraryDAO libraryDao ;
	
	public void setLibraryDao( LibraryDAO libraryDao ) {
		this.libraryDao = libraryDao;
	}
	
	public String getTitle() {
		return "Wel-come" ;
	}
	public List<Library>getDockerData() {
		return libraryDao.findAll();
	}
	

}

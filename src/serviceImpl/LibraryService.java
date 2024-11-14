package serviceImpl;

import database.Database;
import models.Library;

import java.util.List;

public class LibraryService implements service.LibraryService {
    @Override
    public void saveLibrary(Library libraries) {
        Database.libraries.add(libraries);
        
    }

    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        return List.of();
    }


    @Override
    public Library getLibraryById(Long id) {
        for (Library library: Database.libraries){
            if (library.getId()==id){
                return library;
            }
        }
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library newLibrary) {
        for (Library library1: Database.libraries){
            if (library1.getId()==id){
                library1.setAddress(newLibrary.getAddress());
                System.out.println("Success! Update library!");
            }
        }

        return newLibrary;
    }

    @Override
    public String deleteLibrary(Long id) {
        Library library = getLibraryById(id);
        Database.libraries.remove(library);
        return "Success! Delete library!";
    }
}

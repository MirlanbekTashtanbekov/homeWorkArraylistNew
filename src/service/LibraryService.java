package service;

import models.Library;

import java.util.List;

public interface LibraryService {

    void saveLibrary(Library libraries);

    List<Library>saveLibrary(List<Library>libraries);

    Library getLibraryById(Long id);

    Library updateLibrary(Long id, Library library);

    String deleteLibrary(Long id);



}

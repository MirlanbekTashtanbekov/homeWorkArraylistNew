package serviceImpl;

import database.Database;
import models.Library;
import models.Reader;

import java.util.Date;
import java.util.List;

public class ReaderService implements service.ReaderService {
    @Override
    public void saveReader(Reader reader) {
        Database.readers.add(reader);
    }

    @Override
    public List<Reader> getAllReaders() {
        return Database.readers;
    }

    @Override
    public Reader getReaderById(Long id) {
        for (Reader reader: Database.readers){
            if (reader.getId()==id){
                System.out.println(reader);
            }
        }
        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        for (Reader reader1: Database.readers){
            if (reader1.getId()==id){
                reader1.setId(id);
                System.out.println("Success! Update new Reader!");
            }
        }
        return new Reader();
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
        for (Library library: Database.libraries){
            if (library.getId()==libraryId){
                for (Reader reader:Database.readers){
                    if (reader.getId()==readerId){
                        library.getReaders().add(reader);
                        System.out.println("Successfully ASSIGN! Kajetsya");
                    }
                }
            }
        }

    }
}

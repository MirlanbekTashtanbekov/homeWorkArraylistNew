
import models.Book;
import models.Library;
import models.Reader;
import service.BookService;
import serviceImpl.BooKService;
import serviceImpl.LibraryService;
import serviceImpl.ReaderService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService();
        BooKService booKService = new BooKService();
        ReaderService readerService = new ReaderService();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose option: ");
            System.out.println("1. Save ");
            System.out.println("2. Get all ");
            System.out.println("3. Get by ID ");
            System.out.println("4. Update ");
            System.out.println("5. Delete ");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Exit");
                default:
                    System.out.println("ERROR! Try again.");
            }
        }


    }
}
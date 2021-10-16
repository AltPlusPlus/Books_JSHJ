package com.atlPlusPlus.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.atlPlusPlus.model.Books;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@Service
public class BooksService {


    private static List<Books> tempBookStore = new ArrayList<>();
    static {
        tempBookStore.add( new Books("AB",1,"Anantham", "Sri Sri", "Rs 500/-" ));
        tempBookStore.add( new Books("AB",2,"Koti Kommachchi", "Mullapudi", "Rs 600/-" ));
        tempBookStore.add( new Books("AB",3,"Anubhavalu Jnapakalu", "Sri Pada", "Rs 400/-" ));
        tempBookStore.add( new Books("AB",4,"Naa Ishtam", "RGV", "Rs 400/-" ));
        tempBookStore.add( new Books("AB",5,"Harry Potter", "J.K Rowling", "Rs 100/-" ));

    }

    public List<Books> getAllBooksService() {
        return tempBookStore;
    }

    public Books deleteById(int id){
        Books bookToDelete = findBookByID(id);
        if ( bookToDelete == null) {
            return null;
        }
        if(tempBookStore.remove(bookToDelete)){
            return bookToDelete;
        }
        return null;

    }

    public Books findBookByID(int id) {
        for ( Books book: tempBookStore){
            if ( book.getBookid() == id ){
                return book;
            }
        }
        return null;
    }
}
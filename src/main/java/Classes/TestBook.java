package Classes;

import com.google.gson.Gson;

public class TestBook {
    public static void main(String[] args) {

        Book newBook = new Book("Herman Hesse", "Demian");
        Gson gson = new Gson();
        String bookJson = gson.toJson(newBook);
        System.out.println(bookJson);

    }

}

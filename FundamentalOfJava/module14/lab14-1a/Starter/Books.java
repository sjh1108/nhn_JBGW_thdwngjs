import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Books implements Iterable<Book> {
    List<Book> list;
    
    public Books() {
        this.list = new LinkedList<>();
        this.getBooks();
    }

    private void getBooks() {
        File file = new File("book.csv");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
                                                        
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] bookInfo = line.split("\\|");
                this.list.add(new Book(Integer.parseInt(bookInfo[0]), bookInfo[1], bookInfo[2], bookInfo[3], bookInfo[4], Integer.parseInt(bookInfo[5]), bookInfo[6]));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Iterator<Book> iterator(){
        return this.list.iterator();
    }
}

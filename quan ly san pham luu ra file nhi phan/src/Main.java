import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product product1= new Product("Xiao mi","China",1562.42);
        Product product2= new Product("Iphone X","US",2562.42);
        Product product3= new Product("Redmi","China",5562.42);
        Product product4= new Product("Samsung","Korean",25562.42);
        Product product5= new Product("LG","China",24562.42);

        OutputStream outputStream=new FileOutputStream("product.dat");

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(product1);
        objectOutputStream.writeObject(product2);
        objectOutputStream.writeObject(product3);
        objectOutputStream.writeObject(product4);
        objectOutputStream.writeObject(product5);

        InputStream inputStream=new FileInputStream("product.dat");



        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);


        ArrayList<Product> myList= new ArrayList<>();

        for (int i =0 ; i<5;i++){
            myList.add((Product)objectInputStream.readObject());
        }

        myList.forEach(System.out::println);
    }
}

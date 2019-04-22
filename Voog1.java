import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;


public class Voog1{

  public static int pikkus(String s){
    return Integer.parseInt(s.split(",")[1]);
  }


public static void main(String[] args) throws Exception{

  PrintWriter writer = new PrintWriter(new FileWriter("pikkusedOut.txt"));
  //Siin sortreerin failist saadava info
  Files.readAllLines(Paths.get("pikkusedIn.txt")).stream().sorted(Comparator.comparingInt(Voog1::pikkus)).collect(Collectors.toList()).forEach(writer::println);
  writer.close();
  //Toome välja kõik Eesti keskmisest pikemad mehed
  Files.readAllLines(Paths.get("pikkusedIn.txt")).stream().
               filter(s -> Integer.parseInt(s.split(",")[1])>181).forEach(System.out::println);

}

}
/*Mango,189
Varko,194
*/

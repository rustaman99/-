package исключения;

import java.io.*;

public class tryWithResources {
    public static void main(String[] args) throws FileNotFoundException {
      try (Reader reader= new FileReader(new File("someFileName"))){

      } catch (IOException|ArithmeticException e) {
          throw new RuntimeException(e);
      }
    }
}

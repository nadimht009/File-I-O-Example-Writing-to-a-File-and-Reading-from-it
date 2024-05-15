import java.io.*;
import java.util.Scanner;

class FileHandel{
   public static void main(String[] args) {
      File myfile = new File("F:\\STUDY\\United International University\\4th trimester\\OOP\\Object Oriented Programming - Final\\output.txt");


      try{
         Scanner scan = new Scanner(System.in);
         FileWriter writrer  = new FileWriter("F:\\STUDY\\United International University\\4th trimester\\OOP\\Object Oriented Programming - Final\\output.txt");
         for(int i = 0;i<=2;i++){
            String a = scan.nextLine();
            writrer.write(a+"\n");
         }
         try {
            if(writrer!=null)
            {
               writrer.close();
            }
         }
         catch (IOException e){
            e.printStackTrace();
         }
      }
      catch (IOException E){
         E.printStackTrace();
      }
      String[] array = new String[4];
      int i = 0;
      try{
         BufferedReader reader = new BufferedReader(new FileReader("F:\\STUDY\\United International University\\4th trimester\\OOP\\Object Oriented Programming - Final\\output.txt"));

         while (reader.ready()){
            String a = reader.readLine().split(" ")[1];
            array[i] = a;
            i++;
         }
      }
      catch (IOException e){
         e.printStackTrace();
      }

      System.out.println(array[1]);

   }
}

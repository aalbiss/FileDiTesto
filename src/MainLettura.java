import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainLettura {
    public static void main(String[] args) {
        ArrayList<Alunno> alunni = new ArrayList<>();
        File fileAlunni = new File("alunni.csv");

        FileInputStream fis = null;
        Scanner in = null;

        try {
            Alunno a = new Alunno();
            fis = new FileInputStream(fileAlunni);
            in = new Scanner(fis);

            while (in.hasNextLine()){
                String riga = in.nextLine();
                String alunno[] =  riga.split(";");

                a.setNome(alunno[0]);
                a.setCognome(alunno[1]);
                a.setAnnoNascita(Integer.parseInt(alunno[2]));
                alunni.add(a);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (Alunno a : alunni) {
            System.out.println(a);
        }

    }
}

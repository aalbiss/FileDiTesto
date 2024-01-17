import java.io.*;

public class MainScrittura {
    public static void main(String[] args) {
        File fileAlunni = new File("alunni.csv");
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(fileAlunni);
            pw = new PrintWriter(fw);

            for (int i = 1; i < 3; i++) {
                pw.print(i + ";");
                pw.print(i + ";");
                pw.println(1947+(int)(Math.random()*20));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (pw != null) {
                pw.close();
            }
        }


    }
}
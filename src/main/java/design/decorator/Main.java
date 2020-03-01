package design.decorator;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("f:\\standalone.xml");
        System.out.println(file.exists());

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (true) {
            String s = bufferedReader.readLine();
            if (s == null) break;
            System.out.println(s);
        }

        bufferedReader.close();
        fileReader.close();

    }
}

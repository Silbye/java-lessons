package lesson2;

import java.util.Arrays;
import java.util.logging.*;

public class task2 {
    public static void main(String[] args) {
        Logger LOG = Logger.getLogger(task2.class.getName());
        LOG.setLevel(Level.INFO);

        ConsoleHandler ch = new ConsoleHandler();
        LOG.addHandler(ch);
        
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);

        FileHandler fh;
        try{
            fh = new FileHandler("lesson2/logs.log");

            LOG.addHandler(fh);
            fh.setFormatter(sf);
        }
        catch (Exception e) {
            LOG.log(Level.WARNING, "File logging doesn't work", e);
        }

        int [] mas = {11, 3, 14, 16, 7, 8, 15, 16, 2, 8, 0, -1, 99};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    LOG.info(Arrays.toString(mas));
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

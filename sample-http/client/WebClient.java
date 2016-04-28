package main;

import java.io.IOException;
import textsock.TextSocket;

public class WebClient {
    public static void main(String[] args) throws IOException {
        TextSocket conn = new TextSocket("localhost", 10002);
        int number = Integer.parseInt(args[0]);
        conn.putln(""+number);
        
        String req = conn.getln();

        System.out.println("X = "+req);

        if(Integer.parseInt(req)==-1){
            System.out.println("There are no servers to handle this number");
        }else{

            if(number>Integer.parseInt(req)){
                System.out.println("Not a prime");
            }else{
                System.out.println("Is a prime");
            }
        }

        conn.close();
    }
}


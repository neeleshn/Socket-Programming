package main;

import java.io.IOException;
import textsock.TextSocket;

public class WebServer {
    public static void main(String[] args) throws IOException {
        int X = Integer.parseInt(args[0]);
        int port = 10000 + X;
        TextSocket.Server svr = new TextSocket.Server(port);
        TextSocket conn;
        while (null != (conn = svr.accept())) {
            String req = conn.getln();
            int Y = Integer.parseInt(req);

            System.out.println("Y = "+Y+";Port = "+port);
            if(Y % X == 0){
                conn.putln(""+X);
            }else{
                try{
                    TextSocket conn2 = new TextSocket("localhost", port+1);
                    conn2.putln(""+Y);
                    
                    for (String line : conn2) {
                        conn.putln(line);
                    }

                    conn2.close();
                }catch(Exception e){
                        conn.putln("-1");
                }
            }
            conn.close();
        }
    }
}

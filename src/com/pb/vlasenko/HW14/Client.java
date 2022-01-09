package com.pb.vlasenko.HW14;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.pb.vlasenko.HW12.LocalDateDeserializer1;
import com.pb.vlasenko.HW12.LocalDateSerializer1;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Client {


    public static void main(String[] args) throws InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer2());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer2());
        mapper.registerModule(module);

        try(Socket socket = new Socket("localhost", 3345);
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream oos = new DataOutputStream(socket.getOutputStream());
            DataInputStream ois = new DataInputStream(socket.getInputStream()); )
        {

            System.out.println("Client connected to socket.");
            System.out.println();
            System.out.println("Client writing channel = oos & reading channel = ois initialized."+LocalDateTime);


            while(!socket.isOutputShutdown()){


                if(br.ready()){


                    System.out.println("Client start writing in channel..."+LocalDateTime);
                    Thread.sleep(1000);
                    String clientCommand = br.readLine();


                    oos.writeUTF(clientCommand);
                    oos.flush();
                    System.out.println(LocalDateTime+"Clien sent: " + clientCommand + " to server.");
                    Thread.sleep(1000);

                    if(clientCommand.equalsIgnoreCase("quit")){


                        System.out.println("Client kill connections"+LocalDateTime);
                        Thread.sleep(2000);


                        if(ois.read() > -1)     {
                            System.out.println("reading...");
                            String in = ois.readUTF();
                            System.out.println(in);
                        }


                        break;
                    }


                    System.out.println("Client sent message & start waiting for data from server..."+LocalDateTime);
                    Thread.sleep(2000);


                    if(ois.read() > -1)     {


                        System.out.println("reading...");
                        String in = ois.readUTF();
                        System.out.println(in);
                    }
                }
            }

            System.out.println("Closing connections & channels on clentSide - DONE.");

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    private static transient java.time.LocalDateTime LocalDateTime;
    public Client(LocalDateTime LocalDateTime) {this.LocalDateTime=LocalDateTime;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sac.CarvInsight.util;

import comunicacionserial.ComunicacionSerial_Arduino;
import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.*;
import java.util.*;
import sac.CarvInsight.view.FrameArduino;

/**
 *
 * @author adali
 */
public class ConexionArduino implements SerialPortEventListener {

    CommPortIdentifier portId;
    Enumeration numPuertos;
    InputStream input = null;
    OutputStream output = null;
    HashMap portMap = new HashMap();
    SerialPort serialPort = null;
    boolean conectado = false;
    public BufferedReader entrada;
    public static String todo = "", dato = "";
    //ComunicacionSerial_Arduino conex = new ComunicacionSerial_Arduino();

    /*public void initListener() {
        try {
            serialPort.addEventListener(this);
            serialPort.notifyOnDataAvailable(true);
        } catch (Exception e) {
            System.out.println("Error al leer");
            System.out.println(e.getMessage());
        }
    }

    public String getTodo() {
        return dato;
    }*/
    
    
    /*public void serialEvent(SerialPortEvent spe) {
        if (spe.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
            try {
                byte datoSimple=(byte) input.read();
               
                   String texto=new String(new byte[]{datoSimple});
                   
                   todo+=texto;
                   System.out.println(todo);
                   
                   FrameArduino.txtRead.setText(todo);
                                  
                   dato=todo;
                   todo="";
               
                    byte[] buffer = new byte[1024]; // Tamaño del buffer
                                int len = input.read(buffer); // Leer datos del input stream
                                String receivedData = new String(buffer, 0, len);
                                FrameArduino.txtRead.setText(receivedData);
                                System.out.println("Datos recibidos: " + receivedData);
                
            } catch (Exception e) {
                System.out.println("Error serial : " + e.getMessage());
            }
        }

    }*/

    public String obtenerLista() {
        numPuertos = CommPortIdentifier.getPortIdentifiers();
        String todo = "";

        while (numPuertos.hasMoreElements()) {
            CommPortIdentifier solito = (CommPortIdentifier) numPuertos.nextElement();
            if (solito.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                portMap.put(solito.getName(), solito);
                todo += solito.getName() + ",";
                System.out.println("Puerto encontrado: " + solito.getName());
            }
        }
        return todo;
    }

    /*public void conectar(String cualPuerto) {
        portId = (CommPortIdentifier) portMap.get(cualPuerto);
        conex.arduinoRXTX(cualPuerto, 9600, this);
    }*/

    public void desconectar() {
        try {
            serialPort.removeEventListener();
            serialPort.close();
            input.close();
            output.close();
            System.out.println("Desconectado");
            setConectado(false);
        } catch (Exception e) {
        }
    }

    /*public boolean iniciarIo() {
        boolean exito = false;
        try {
            input = serialPort.getInputStream();
            output = serialPort.getOutputStream();
            exito = true;
            return exito;
        } catch (Exception e) {
            System.out.println("Error al iniciar IO: " + e.getMessage());
            exito = false;
        }
        return exito;
    }*/

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public void escribir(int texto) {
        try {
            output.write((texto + "").getBytes());
            output.flush();
        } catch (Exception e) {
            System.out.println("Error escribir: " + e.getMessage());
        }
    }

    @Override
    public void serialEvent(SerialPortEvent spe) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

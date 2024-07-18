
package sac.CarvInsight.util;

import com.fazecast.jSerialComm.SerialPort;
import java.io.IOException;


public class Arduino {
    private SerialPort puertoSerie;      
    
    public boolean conectar(int indice){        
        puertoSerie = SerialPort.getCommPorts()[indice];
        puertoSerie.openPort();
        puertoSerie.setComPortParameters(9600, 8, 1, 0);
        puertoSerie.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING, 0, 0); 
        return estaConectado();
    }
    
    public static SerialPort[] getPuertosSerie() {
        SerialPort puertos[] = SerialPort.getCommPorts();
        return puertos;
    }    
    
    public boolean estaConectado() {
        return puertoSerie.isOpen();
    }

    public boolean desconectar() {
        return puertoSerie.closePort();
    }

    public boolean enviarNumero(int valor) {
        try {
            puertoSerie.getOutputStream().write((new Integer(valor)).byteValue());
            puertoSerie.getOutputStream().flush();
            return true;
        } catch (IOException ex) {            
            return false;
        }        
    }
    
    public boolean enviarLetra(char valor) {
        try {
            puertoSerie.getOutputStream().write(valor);
            puertoSerie.getOutputStream().flush();
            return true;
        } catch (IOException ex) {           
            return false;
        }        
    }
    
    public boolean enviarTexto(String texto) {
        try {
            puertoSerie.getOutputStream().write(texto.getBytes());
            puertoSerie.getOutputStream().flush();
            return true;
        } catch (IOException ex) {            
            return false;
        }        
    }
    
    public String recibirTexto() {
        StringBuilder textoRecibido = new StringBuilder();
        try {
            while (puertoSerie.bytesAvailable() > 0) {
                int data = puertoSerie.getInputStream().read();
                if (data == -1) {
                    break;  // End of stream
                }
                textoRecibido.append((char) data);
            }
            return textoRecibido.toString();
        } catch (IOException ex) {
            return null;
        }
    }

}

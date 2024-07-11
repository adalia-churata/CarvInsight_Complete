
package sac.CarvInsight.util;

/**
 *
 * @author adali
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;


public class Draw_G{
        private final double percentage;
        private final JPanel panel;
        private final int height;
        private final int width;

        public Draw_G(double percentage, JPanel p) {
            this.percentage = percentage;
            this.panel = p;
            height = p.getHeight();
            width = p.getWidth();
        }

        public void paintComponentOEE() {
            Graphics2D g2d = (Graphics2D) panel.getGraphics(); // Conversión explícita a Graphics2D

            // Suavizar los bordes del dibujo
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Dimensiones del componente
            int diameter = Math.min(width, height) - 50;
            
            // Dimensiones del componente pequeño
            int diameter2 = Math.min(width, height) - 80;

            // Coordenadas y tamaño del arco general
            int x = (width - diameter) / 2;
            int x2 = (width - diameter2) / 2; // Coordenadas y tamaño del arco pqueño que se sobrepone
            int y = height / 2;

            // Dibujar y pintar de fondo en el circulo principal (Es el color que aparece como el porcentaje llenado)
            g2d.setColor(new Color(72, 88, 231));
            g2d.fillArc(x, y - diameter / 2, diameter, diameter, 0, 180);

            // Dibujar y pintar el fondo del circulo (Es el color que aparece como faltante del porcentaje)
            g2d.setColor(new Color(152, 195, 208));
            int arcAngle = (int) (180 * percentage / 100);
            g2d.fillArc(x, y - diameter / 2, diameter, diameter, 0, 180-arcAngle);
            
            //Pintar el color de fondo para que aparezca solo el anillo.
            g2d.setColor(new Color(221,221,221));
            g2d.fillArc(x2, y - diameter2 / 2, diameter2, diameter2, 0, 180);

            // Dibujar el borde del medio anillo
            /*g2d.setColor(Color.BLACK);
            g2d.drawArc(x, y - diameter / 2, diameter, diameter, 0, 180);
            
            g2d.setColor(Color.BLACK);
            g2d.drawArc(x2, y - diameter2 / 2, diameter2, diameter2, 0, 180); */
        }
        
        
        
        protected void paintOtherComponents() {
            Graphics2D g2d = (Graphics2D) panel.getGraphics(); // Conversión explícita a Graphics2D

            // Suavizar los bordes del dibujo
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Dimensiones del componente
            int diameter = Math.min(width, height) - 50;
            
            // Dimensiones del componente pequeño
            int diameter2 = Math.min(width, height) - 80;

            // Coordenadas y tamaño del arco general
            int x = (width - diameter) / 2;
            int x2 = (width - diameter2) / 2; // Coordenadas y tamaño del arco pqueño que se sobrepone
            int y = height / 2;

            // Dibujar y pintar de fondo en el circulo principal (Es el color que aparece como el porcentaje llenado)
            g2d.setColor(new Color(72, 88, 231));
            g2d.fillArc(x, y - diameter / 2, diameter, diameter, 0, 180);

            // Dibujar y pintar el fondo del circulo (Es el color que aparece como faltante del porcentaje)
            g2d.setColor(new Color(152, 195, 208));
            int arcAngle = (int) (180 * percentage / 100);
            g2d.fillArc(x, y - diameter / 2, diameter, diameter, 0, 180-arcAngle);
            
            //Pintar el color de fondo para que aparezca solo el anillo.
            g2d.setColor(new Color(221,221,221));
            g2d.fillArc(x2, y - diameter2 / 2, diameter2, diameter2, 0, 180);
        }
        
        public void SemiCircle(int Grosor, String Color, String BackColor, int size) {
           
            Graphics2D g2d = (Graphics2D) panel.getGraphics(); // Conversión explícita a Graphics2D
            // Suavizar los bordes del dibujo
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Descomposicion de colores 
            
            String[] rgbStrings = Color.split(",");
            // Convierte las partes en enteros
            int red = Integer.parseInt(rgbStrings[0]);
            int green = Integer.parseInt(rgbStrings[1]);
            int blue = Integer.parseInt(rgbStrings[2]);
            
            
            String[] rgbStringsback = BackColor.split(",");
            // Convierte las partes en enteros
            int redback = Integer.parseInt(rgbStringsback[0]);
            int greenback = Integer.parseInt(rgbStringsback[1]);
            int blueback = Integer.parseInt(rgbStringsback[2]);
            
            // Dibujar y pintar de fondo en el circulo principal (Es el color que aparece como el porcentaje llenado)
            g2d.setColor(new Color(red, green, blue));
            g2d.fillArc(0, 0, size, size, 0, 180);

            // Dibujar y pintar el fondo del circulo (Es el color que aparece como faltante del porcentaje)
            g2d.setColor(new Color(redback, greenback, blueback));
             int arcAngle = (int) (180 * percentage / 100);
            g2d.fillArc(0, 0, size, size, 0, 180-arcAngle);
            
            //Pintar el color de fondo para que aparezca solo el anillo.
            g2d.setColor(new Color(33,36,41));
            g2d.fillArc(Grosor, Grosor*2 / 2, size-(Grosor*2),size-(Grosor*2), 0, 180);

        }
        
    }


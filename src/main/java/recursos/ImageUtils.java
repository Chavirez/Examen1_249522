package recursos;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class ImageUtils {

    /**
     * Escala una imagen a las dimensiones especificadas.
     * * @param originalImage Imagen original de tipo BufferedImage
     * @param targetWidth   Ancho deseado
     * @param targetHeight  Alto deseado
     * @return BufferedImage escalada
     */
    public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        // Creamos una nueva imagen con el tamaño destino
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        
        // Creamos el objeto Graphics2D para dibujar en la nueva imagen
        Graphics2D g2d = resizedImage.createGraphics();
        
        // Configuramos la calidad del escalado
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujamos la imagen original escalándola al nuevo lienzo
        g2d.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
        g2d.dispose(); // Liberamos recursos de memoria del contexto gráfico

        return resizedImage;
    }
}
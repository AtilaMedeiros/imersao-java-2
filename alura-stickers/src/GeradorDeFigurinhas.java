import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradorDeFigurinhas {

    public void cria(InputStream inputStream, String nomeArquivo) throws IOException {

        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // Create new image in memory with transparency and new size
        int larguraOriginal = imagemOriginal.getWidth();
        int alturaOriginal = imagemOriginal.getHeight();
        int alturaExcedente = 200;
        int novaAltura = alturaOriginal + alturaExcedente;

        BufferedImage novaImage = new BufferedImage(larguraOriginal, novaAltura, BufferedImage.TRANSLUCENT);

        // Copy from original image to new image in memory
        Graphics2D pen = (Graphics2D) novaImage.createGraphics();
        pen.drawImage(imagemOriginal, 0, 0, null);

        // set the font
        Font font = new Font("Impact", Font.BOLD, 80);
        pen.setColor(Color.YELLOW);
        pen.setFont(font);

        // Write a sentence on the new image
        String texto = "TOPZERA";
        FontMetrics fontMetrics = pen.getFontMetrics();
        Rectangle2D retangulo = fontMetrics.getStringBounds(texto, pen);
        int larguraTexto = (int) retangulo.getWidth();
        int alturaTexto = (int) retangulo.getHeight();
        int posicaoTextoX = (larguraOriginal - larguraTexto) / 2;
        int posicaoTextoY = alturaOriginal + (alturaExcedente / 2) + (alturaTexto / 2);

        pen.drawString("TOPZERA", posicaoTextoX, posicaoTextoY);

        // Write a new image to a file
        ImageIO.write(novaImage, "png", new File(nomeArquivo));

    }
}

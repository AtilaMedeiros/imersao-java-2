import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradorDeFigurinhas {

    public void cria(InputStream inputStream, String nomeArquivo, InputStream inputStreamSobreposicao)
            throws IOException {

        // intanciando a imagem na memoria
        BufferedImage imagemOriginal = ImageIO.read(inputStream);
        BufferedImage imageSobreposicao = ImageIO.read(inputStreamSobreposicao);

        // Parametros para manipular imagems
        float larguraOriginal = imagemOriginal.getWidth();
        float alturaOriginal = imagemOriginal.getHeight();
        float porcentagemTamanhoFonte = 0.1f;
        float tamanhoDafonte = alturaOriginal * porcentagemTamanhoFonte;
        float alturaExcedente = alturaOriginal * 0.25f;
        float alturaTotal = alturaOriginal + alturaExcedente;
        float alturaSobreposicao = alturaOriginal * 0.35f;
        float larguraSobreposicao = alturaSobreposicao * 0.75f;
        float posicaoSobreporY = 0;
        if (alturaSobreposicao > alturaExcedente) {
            posicaoSobreporY = alturaTotal - (alturaExcedente + (alturaSobreposicao - alturaExcedente));
        } else
            posicaoSobreporY = alturaTotal - alturaSobreposicao;

        // Aplicando novos paramentros na imagem original
        BufferedImage novaImage = new BufferedImage((int) larguraOriginal, (int) alturaTotal,
                BufferedImage.TRANSLUCENT);

        // Desenhando a nova imagem de fundo
        Graphics2D pen = (Graphics2D) novaImage.createGraphics();
        pen.drawImage(imagemOriginal, 0, 0, null);

        Image scaledImageSobreposicao = imageSobreposicao.getScaledInstance(
                (int) larguraSobreposicao, (int) alturaSobreposicao, Image.SCALE_SMOOTH);
        pen.drawImage(scaledImageSobreposicao, 0, (int) posicaoSobreporY, null);

        // Configurando a fonte
        Font font = new Font("Impact", Font.BOLD, (int) tamanhoDafonte);
        pen.setColor(Color.YELLOW);
        pen.setFont(font);

        // Parametros para manipular Texto
        String texto = "TOPZERA";
        FontMetrics fontMetrics = pen.getFontMetrics();
        Rectangle2D retangulo = fontMetrics.getStringBounds(texto, pen);
        int larguraTexto = (int) retangulo.getWidth();
        int posicaoTextoX = (int) (larguraSobreposicao + 20);
        int posicaoTextoY = (int) ((alturaExcedente * 0.75) + alturaOriginal);

        pen.drawString("TOPZERA", posicaoTextoX, posicaoTextoY);

        // Write a new image to a file
        ImageIO.write(novaImage, "png", new File(nomeArquivo));

    }
}

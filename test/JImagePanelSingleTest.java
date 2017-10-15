
import com.towel.swing.img.JImagePanel;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author allan
 */
public class JImagePanelSingleTest {
    public static void main(String[] args) throws Throwable {
        JImagePanel panel = new JImagePanel(
                loadImage("C:\\Users\\allan\\Documents\\NetBeansProjects\\CADaster\\test.fundo.jpg"));
 
        panel.setFillType(JImagePanel.FillType.CENTER);
 
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(100, 100));
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
 
    private static BufferedImage loadImage(String file) throws IOException {
        return ImageIO.read(new File(file));
    }
}

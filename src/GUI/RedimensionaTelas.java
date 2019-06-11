package GUI;

import java.awt.Dimension;

public class RedimensionaTelas {
    public static void redimensiona(javax.swing.JFrame tela){
        Dimension inicial = tela.getSize();
        tela.setSize(tela.getMaximumSize());
        int xMeio = (int) ((tela.getX()+tela.getWidth())/2 - inicial.getWidth()/2);
        int yMeio = (int)((tela.getY()+tela.getHeight())/2 - inicial.getHeight()/2);
        tela.setSize(inicial);
        tela.setLocation(xMeio,yMeio); 
    }

}

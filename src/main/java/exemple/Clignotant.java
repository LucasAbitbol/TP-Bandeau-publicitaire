/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author lucasabitbol
 */
public class Clignotant extends Effet{

    public Clignotant(int repetitions, Bandeau b, String message) {
        super(repetitions, b, message);
    }
    
    public void afficher() {
        b.setMessage(message);
        for (int i = 0; i < this.repetitions; i++) {
            for (int j = 0; j < 60; j++) {
                if (j%2 == 0) {
                    this.b.setForeground(Color.white);
                    this.b.sleep(100);
                }
                if ((j%2)!=0) {
                    this.b.setForeground(Color.black);
                    this.b.sleep(100);
                }
            }
        }
    }
    
    
    
}

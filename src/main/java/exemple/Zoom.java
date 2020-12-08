/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author lucasabitbol
 */
public class Zoom extends Effet {

    public Zoom(int repetitions, Bandeau b, String message) {
        super(repetitions, b, message);
    }

    public void afficher() {
        b.setMessage(message);
        for (int i = 0; i < this.repetitions; i++) {
            for (int j = 5; j<60; j += 5) {
            this.b.setFont(new Font("Dialog", Font.BOLD, 5+j));
            this.b.sleep(100);
            
        }
        }

    }
}

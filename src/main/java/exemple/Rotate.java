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
public class Rotate extends Effet {

    public Rotate(int repetitions, Bandeau b, String message) {
        super(repetitions, b, message);
    }

    public void afficher() {
        b.setMessage(message);
        for (int i = 0; i < this.repetitions; i++) {
            for (int j = 0; j<=100; j ++) {
            this.b.setRotation(2* Math.PI * j / 100);
            this.b.sleep(100);

        }
    }
    }
}

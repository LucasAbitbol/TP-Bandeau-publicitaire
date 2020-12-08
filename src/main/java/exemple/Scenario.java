/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;

/**
 *
 * @author lucasabitbol
 */
public class Scenario {
    
    private Bandeau bandeau;
    ArrayList<Effet> lesEffets = new ArrayList<Effet>();
    
    public Scenario(Bandeau bandeau) {
        this.bandeau=bandeau;
    }
    
    public void ajouterEffet (Effet unEffet) {
        lesEffets.add(unEffet);
    }
    
    public void afficherScenario() {
        for (Effet e : lesEffets) {
            e.afficher();
            bandeau.sleep(1000);
        }
        bandeau.close();
    }
    
}

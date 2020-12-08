package exemple;

import bandeau.Bandeau;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucasabitbol
 */
public abstract class Effet {

    public Bandeau b;
    public int repetitions;
    public String message;

    public Effet(int repetitions, Bandeau b, String message) {
        
        this.repetitions = repetitions;
        this.b = b;
        this.message=message;
    }
    
    public abstract void afficher();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import classesPokemons.Pikachu;
import classesPokemons.Blastoise;
import classesPokemons.Bulbassauro;
import classesPokemons.Charizard;
import classesPokemons.Charmander;
import classesPokemons.Flareon;
import classesPokemons.Gyrados;
import classesPokemons.Jolteon;
import classesPokemons.Meowth;
import classesPokemons.Onix;
import classesPokemons.Squirtle;
import classesPokemons.Venossauro;
import classesPokemons.Vaporeon;
import interfaceGrafica.Frame.Frame;
/**
 *
 * @author Arthur
 */
public class IniciaJogo {

         int i = 0;
         Treinador a;
         Treinador b;

        public IniciaJogo(){
            a = new Treinador();
            b = new Treinador();
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame(a, b).setVisible(true);
            }
            });
        }

        
}

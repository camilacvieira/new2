/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import classesPokemons.Blastoise;
import classesPokemons.Bulbassauro;
import classesPokemons.Charizard;
import classesPokemons.Charmander;
import classesPokemons.Flareon;
import classesPokemons.Gyrados;
import classesPokemons.Jolteon;
import classesPokemons.Onix;
import classesPokemons.Pikachu;
import classesPokemons.Squirtle;
import classesPokemons.Vaporeon;
import classesPokemons.Venossauro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *classe treinador calcula vida e escolheAtaque 
 * @author Arthur
 */
public class Treinador {
    private float vidaTotal;
    Pokemon p1;
    Pokemon p2;
    Pokemon p3;
    Pokemon p4;
    Pokemon p5;
    Pokemon p6;
    Pokemon p7;
    Pokemon p8;
    Pokemon p9;
    Pokemon p10;
    Pokemon p11;
    Pokemon p12; 
    Time timeEscolhido;

    /**
     *declara time de pokemons
     */
    public Time time = new Time();

    /**
     *energia para usar habilidade
     */
    public int mana = 100;
	
    /**
     *inicializa a funcao treinador
     * @param t
     */
    public Treinador(Time t) {
        this.time = t;
        vidaTotal = t.pokemons.get(0).healthPoints + t.pokemons.get(1).healthPoints + t.pokemons.get(2).healthPoints;
    }

    public Treinador() {
        p1 = new Pikachu();
        p2 = new Blastoise();
        p3 = new Bulbassauro();
        p4 = new Charizard();
        p5 = new Charmander();
        p6 = new Flareon();
        p7 = new Gyrados();
        p8 = new Jolteon();
        p9 = new Onix();
        p10 = new Venossauro();
        p11 = new Vaporeon();
        p12 = new Squirtle();
    }
        
    /**
     *A vida total de todos pokemons somados
     */
    public void calculaVida(){
        vidaTotal = time.pokemons.get(0).healthPoints + time.pokemons.get(1).healthPoints + time.pokemons.get(2).healthPoints;
    }

    /**
     *retorna a vida total
     * @return
     */
    public float getVidaTotal() {
        return vidaTotal;
    }

    /**
     *determina a vida total
     * @param vidaTotal
     */
    public void setVidaTotal(float vidaTotal) {
        this.vidaTotal = vidaTotal;
    }
      	
    /**
     *funcao que determina qual ataque é usado e seu dano
     * @return
     */
    public int escolheAtaque(){
        //qual ataque vc quer utilizar?
        //cin
        int choice=-1;
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Qual ataque vc quer utilizar? 1- 75mp, 2- 50mp, 3- 25mp, 4-Passar a vez");
        int ler = reader.nextInt();
        choice=choice+ler;
        if(choice==0||choice==1||choice==2||choice==3){
        return choice;
        }
        else{
            System.out.println("Insira um ataque válido");
            return -1;
        }
    }
    
    public void escolherTime(int i){
        if(i==1){
            timeEscolhido = new Time(p5,p11,p10);
        }
        if(i==2){
            timeEscolhido = new Time(p12,p6,p7);
        }
        if(i==3){
            timeEscolhido = new Time(p3,p8,p2);
        }
        if(i==4){
            timeEscolhido = new Time(p1,p4,p9);
        }
    }
    
}

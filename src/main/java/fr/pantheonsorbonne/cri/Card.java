package fr.pantheonsorbonne.cri;


public class Card {
 
    private String couleur;
    private String valeur;

    public Card(String valeur,String couleur){
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public String getValeur(){
        return this.valeur;
    }

    public String getCouleur(){
        return this.couleur;
    }





}

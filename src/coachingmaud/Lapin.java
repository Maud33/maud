/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coachingmaud;

/**
 *
 * @author Maud
 */

public class Lapin {
    private String nom;
    private int age;

    public Lapin(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void crier(){
        System.out.println("Yihaaaaaaa");
        System.out.println("I love Broha");
        System.out.println("Yihaaaaaaahouuuuuuuuuu");
        System.out.println("Me gusta las carotas !!!");
    }
}

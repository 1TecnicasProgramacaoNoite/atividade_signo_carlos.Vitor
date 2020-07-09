/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Horoscopo {
    public static void main(String[] args) {
        int dia, mes;
        
        Scanner entrada = new Scanner(System.in);
    System.out.println("\n\t<3seu signo<3\n");
    
    System.out.print("\nInforme seu dia:\t\n");
        dia = entrada.nextInt();
        
        System.out.print("\nInforme seu mês:\t\n");
        mes = entrada.nextInt();
        switch(mes){
            case 1:
                if(dia >=20){
                System.out.println("Aquário");
                }else{
                System.out.println("Capricórnio");
                }
                break;
            case 2:
                if(dia >=19){
                System.out.println("Peixes");
                }else{
                System.out.println("Aquário");
                }
                break;
            case 3:    
                if(dia <=20){
                System.out.println("Peixes");
                }else{
                System.out.println("Áries");
                }
                break;
            case 4:
                if(dia >=19){
                System.out.println("Touro");
                }else{
                System.out.println("Áries");
                }
                break;
            case 5:    
                if(dia >=21){
                System.out.println("Gêmeos");
                }else{
                System.out.println("Touro");
                }
                break;
            case 6:    
                if(dia >=22){
                System.out.println("Câncer");
                }else{
                System.out.println("Gêmeos");
                }
                break;
              case 7:    
                if(dia >=23){
                System.out.println("Leão");
                }else{
                System.out.println("Câncer");
                }
           case 8:    
                if(dia >=23){
                System.out.println("Virgem");
                }else{
                System.out.println("Virgem");
                }
                break;
            case 9:    
                if(dia >=23){
                System.out.println("Libra");
                }else{
                System.out.println("Leão");
                }
                break;
        case 10:    
                if(dia >=23){
                System.out.println("Escorpião");
                }else{
                System.out.println("Libra");
                }
                break;
                case 11:    
                if(dia >=22){
                System.out.println("sargitário");
                }else{
                System.out.println("Escorpião");
                }
                break;
                case 12:    
                if(dia >=22){
                System.out.println("Capricórnio");
                }else{
                System.out.println("Sargitário");
                }
                break;
            }
        }
    }  

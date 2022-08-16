/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appstreaming;

import java.util.Scanner;

/**
 *
 * @author csagastume
 */
public class series extends AppStreaming{
    
    int serie;
    Scanner consola = new Scanner(System.in);

    public void Selecionado() {
        System.out.println("Ingrese la serie que desea ver:");
        System.out.println("1. Breaking Bad");
        System.out.println("2. GOT");
        System.out.println("3. TWD");
        serie = entrada.nextInt();
}}

package com.mycompany.project13;
import java.util.Scanner;

public class Project13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu salário bruto: ");
        Double sb = in.nextDouble();
        System.out.println("Digite o valor da prestação: ");
        Double vp = in.nextDouble();
        Double ip = sb * 0.3;
        if(vp <= ip){
            System.out.println("Empréstimo concedido!");
        }else{
            System.out.println("Empréstimo negado!");
        }
    }
}

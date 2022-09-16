package com.company;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// Ol?, {nome}! Hoje ? {dia-da-semana}, tenha um(a) ?timo(a) dia(tarde/noite)!

        String nome = "Samuel";
        String nome2 = "samuel";

        System.out.println(nome.toUpperCase());     // Exibe o nome em letras mai?sculas
        System.out.println(nome.toLowerCase());     // ... em letras min?sculas
        System.out.println(nome.length());     // Exibe o tamanho da string

        System.out.println(nome.equals(nome2));     // Compara as strings e retorna true ou false
        System.out.println(nome.equalsIgnoreCase(nome2));    // ... ignorando a diferen?a entre maiusculas e minusculas

        // ISO 8601

        LocalDate hoje = LocalDate.now();   // Pega o dia atual e insere na vari?vel "hoje"
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek());    // Dia da semana (em ingl?s)

        Locale brasil = new Locale("pt", "BR");     //Locale brasil = new Locale("pt", "BR");
        LocalDateTime hora = LocalDateTime.now();       // Hora atual
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);    // Nome completo do dia em BR
        String saudacao;

        System.out.println(diaSemana);

        if (hora.getHour() >= 0 && hora.getHour() < 12){
            saudacao = "Tenha um ?timo dia!";
        }
        else if (hora.getHour() >= 12 && hora.getHour() < 18){
            saudacao = "Tenha uma ?tima tarde!";
        }
        else
            saudacao = "Tenha uma ?tima noite!";

        System.out.printf("Ol?, %s! Hoje ? %s. %s %n", nome, diaSemana, saudacao );
        // printf possibilita utilizar as variáveis (Que nem C)

    }
}

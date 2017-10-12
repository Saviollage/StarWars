package br.edu.unifei.ecoi09.starwars.game;

import br.edu.unifei.ecoi09.starwars.domain.Jedi;


public class Computer_AI {

    /*
    Precisamos saber qual recurso o computador vai escolher e qual seu valor,
    por isso criamos essas duas variaveis abaixo para esse controle
    */
     
    int value;    //Valor do recurso
    String resource;  //Nome do recurso


    public void Computer_Play(Jedi card) //Computador recebe a carta e retorna o maior valor do atributo
    {
        //tamanho do vetor
        int tam = 5;

        //criamos um vetor de atributos
        int[] attrib = new int[]{card.getAgility(), card.getHonor(), card.getLevel(), card.getPower(), card.getPrecision()};


        int max_value = attrib[0];
        int pos = 0;

        //ordenamos o vetor de forma decrescente
        for (int i = 0; i < tam; i++)
            if (max_value < attrib[i]) {
                max_value = attrib[i];  //aqui garantimos que max_attrb terá o maior valor entre os atributos
                pos = i;                //pegamos a posição do vetor q tem esse atributo
            }


        if (pos == 0)
            resource = "Agility";
        else if (pos == 1)
            resource = "Honor";
        else if (pos == 2)
            resource = "Level";
        else if (pos == 3)
            resource = "Power";
        else
            resource = "Precision";


    }

}

package br.edu.unifei.ecoi09.starwars.game;

import br.edu.unifei.ecoi09.starwars.domain.Jedi;

import java.util.ArrayList;

public class Game {

    int user_points, pc_points; //TODO: setar como 0(zero) sempre que o jogo iniciar

    public void game (int User_attrib, int PC_attrib) //recebe os atributos, compara e pontua o vencedor da rodada
    {
        if (User_attrib > PC_attrib) //Se o atributo escolhido pelo user for maior
            user_points++; //ponto pro user

        else if (PC_attrib > User_attrib) //se o do atributto do pc for maior
            pc_points++;  //ponto pro pc
    }





}

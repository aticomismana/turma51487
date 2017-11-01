/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepbl4;
import controller.*;
import view.*;
import dao.*;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JfListar jfListagem = new JfListar();
        ControllerListagem controllerListagem = new ControllerListagem(jfListagem);
        jfListagem.setVisible(true);
        jfListagem.setLocationRelativeTo(null);
    }
    
}

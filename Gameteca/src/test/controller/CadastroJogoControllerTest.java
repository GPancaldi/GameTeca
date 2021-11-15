/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.Test;
import controller.CadastroJogoController;
import model.Usuario;
import static org.junit.Assert.*;

import org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory.Result;
import static org.mockito.Mockito.when;
import model.Usuario;
/**
 *
 * @author philipeloureiro
 */
public class CadastroJogoControllerTest {
    

    /**
     * Test of salvarJogo method, of class CadastroJogoController.
     */
    @Test
    public void testSalvarJogo() throws Exception {
  
       CadastroJogoController dickMock = mock(CadastroJogoController.class);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("senha");
        lista.add("12345");
       
        System.out.println("dicMock " + dickMock);

    }
    
    
    @Test
   public void loginSuccess() throws Exception {
        Usuario modelUsuario = mock(Usuario.class);
        
        modelUsuario.setUsuario("testeee");
        System.out.println(modelUsuario.getUsuario());


    }
    
    
}

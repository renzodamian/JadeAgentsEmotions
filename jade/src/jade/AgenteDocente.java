/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jade;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class AgenteDocente extends Agent {
    /*Inicializacion del Agente*/
   protected void setup(){
       addBehaviour(new CyclicBehaviour(){
           public void action(){
               ACLMessage msg = receive();
               if(msg!=null){
                   JOptionPane.showMessageDialog(null, msg.getContent());
               }else block();
           }
       });
   }
}

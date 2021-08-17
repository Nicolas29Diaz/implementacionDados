/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import datos.Lanzamiento;
import java.net.URL;
import java.util.LinkedList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.JOptionPane;
import modelo.OperacionesPila;
import modelo.Pila;


/**
 *
 * @author nicolas_san.diaz
 */
public class FXMLDocumentController implements Initializable {
    
    Pila<Lanzamiento> PilaLanzamientos ;
    
 //   LinkedList<Lanzamiento> pares;
 //   Pila<Lanzamiento> pilaRepetidos;
    
      Timer timer = new Timer();
    
//    @FXML
//    private Label buscado;
//    
//    
    @FXML
    private TextField textoBuscado;
    @FXML
    private TextField textoPar;
    
    @FXML
    private ImageView imageV1;
    @FXML
    private ImageView imageV2;
    
    Image imagen1;
    Image imagen2;
    Image imagen3;
    Image imagen4;
    Image imagen5;
    Image imagen6;
    Image mal;
    
    @FXML
    private void lanzar(ActionEvent event) {
        
        TimerTask TimerTask = new TimerTask() {
            @Override
            public void run() {
               
                  Random dadoRand = new Random();
        
        int dado1 = dadoRand.nextInt(6)+1;
        
        int dado2 = dadoRand.nextInt(6)+1;
        
       if(dado1 == 1){
           imageV1.setImage(imagen1);
       }else if(dado1 == 2){
           imageV1.setImage(imagen2);
       }else if(dado1 == 3){
           imageV1.setImage(imagen3);
       }else if(dado1 == 4){
           imageV1.setImage(imagen4);
       }else if(dado1 == 5){
           imageV1.setImage(imagen5);   
       }else if(dado1 == 6){
           imageV1.setImage(imagen6);
       }
       else
       {
           imageV1.setImage(mal);
       }
        
       
       
         if(dado2 == 1){
           imageV2.setImage(imagen1);
       }else if(dado2 == 2){
           imageV2.setImage(imagen2);
       }else if(dado2 == 3){
           imageV2.setImage(imagen3);
       }else if(dado2 == 4){
           imageV2.setImage(imagen4);
       }else if(dado2 == 5){
           imageV2.setImage(imagen5);   
       }else if(dado2 == 6){
           imageV2.setImage(imagen6);
       } else
       {
           imageV1.setImage(mal);
       }
        
        
        
         Lanzamiento lanzamientos = new Lanzamiento(dado1, dado2);
               
         PilaLanzamientos.apilar(lanzamientos);
                 
            }
        };
      
      
        
        timer.scheduleAtFixedRate(TimerTask,0, 2000);
    }
    
    
    @FXML
        private void pararTodo(ActionEvent event) {
            
            timer.cancel();
            
        }
    
        
    
        @FXML
        private void ultimo(ActionEvent event) {
            
            String mostrar;
            Pila<Lanzamiento> obj = OperacionesPila.sacarUltimo(PilaLanzamientos);
            mostrar = obj.toString();
            
            JOptionPane.showMessageDialog(null,mostrar );
           
        }
   
        
        
     @FXML
        private void buscar(ActionEvent event) {
            
           int buscado1 = Integer.parseInt(textoBuscado.getText());
            
           String repetidos = OperacionesPila.buscarRepetido(PilaLanzamientos, buscado1);
            
            JOptionPane.showMessageDialog(null, repetidos);
            
        }
    
        
        @FXML
        private void buscarPar(ActionEvent event) {
            
           int buscado1 = Integer.parseInt(textoPar.getText());
            
           String par = OperacionesPila.buscarPar(PilaLanzamientos, buscado1);
            
            JOptionPane.showMessageDialog(null, par);
            
        }
        
        
         @FXML
        private void salir(ActionEvent event) {
            
          System.exit(0);
            
        }
        
        
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        PilaLanzamientos = new Pila<>();
        
      //  pilaRepetidos = new Pila<>(); 
        
        imagen1 = new Image("/imagenes/1.png");
        imagen2 = new Image("/imagenes/2.png");
        imagen3 = new Image("/imagenes/3.png");
        imagen4 = new Image("/imagenes/4.png");
        imagen5 = new Image("/imagenes/5.png");
        imagen6 = new Image("/imagenes/6.png");
        mal = new Image("/imagenes/x.jpg");
        
    }    
    
}

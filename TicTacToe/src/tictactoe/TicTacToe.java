/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 91807
 */
public class TicTacToe extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button();
        btn1.setText(" ");
        btn1.setOnAction(event->{
            PlayGame(1,btn1);
        });
        
         Button btn2 = new Button();
        btn2.setText(" ");
        btn2.setOnAction(event->{
            PlayGame(2,btn2);
        });
        
        
         Button btn3 = new Button();
        btn3.setText(" ");
        btn3.setOnAction(event->{
            PlayGame(3,btn3);
        });
        
         Button btn4 = new Button();
        btn4.setText(" ");
        btn4.setOnAction(event->{
            PlayGame(4,btn4);
        });
         Button btn5 = new Button();
        btn5.setText(" ");
        btn5.setOnAction(event->{
            PlayGame(5,btn5);
        });
        
         Button btn6 = new Button();
        btn6.setText(" ");
        btn6.setOnAction(event->{
            PlayGame(6,btn6);
        });
        
        
         Button btn7 = new Button();
        btn7.setText(" ");
        btn7.setOnAction(event->{
            PlayGame(7,btn7);
        });
        
         Button btn8 = new Button();
        btn8.setText(" ");
        btn8.setOnAction(event->{
            PlayGame(8,btn8);
        });
        
         Button btn9 = new Button();
        btn9.setText(" ");
        btn9.setOnAction(event->{
            PlayGame(9,btn9);
        });
        
        
        
        
        GridPane grid =new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        grid.add(btn1,0,0);
        grid.add(btn2,1,0);
        grid.add(btn3,2,0);
        grid.add(btn4,0,1);
        grid.add(btn5,1,1);
        grid.add(btn6,2,1);
        grid.add(btn7,0,2);
        grid.add(btn8,1,2);
        grid.add(btn9,2,2);
        
        
        
        
        
        
       
        Scene scene = new Scene(grid, 600, 600);
        
        
        scene.getStylesheets().add("tictactoe/style.css");
        
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    ArrayList<Integer> Player1=new ArrayList<Integer>();
     ArrayList<Integer> Player2=new ArrayList<Integer>();
    int ActivePlayer=1;
    void PlayGame(int CellId, Button SelectedButton){
    System.out.println("CellId:"+CellId);
    if(ActivePlayer==1){
        SelectedButton.setText("X");
        Player1.add(CellId);
        ActivePlayer=2;
    }
    else if(ActivePlayer==2){
        SelectedButton.setText("0");
        Player1.add(CellId);
        ActivePlayer=1;
    }
    SelectedButton.setDisable(true);
    CheckWinner();
    
    }
    
    void CheckWinner(){
        int Winner=-1;
        if (Player1.contains(1) && Player1.contains(2) && Player1.contains(3) )
            Winner=1;
        if(Player2.contains(1) && Player2.contains(2) && Player2.contains(4))
            Winner=2;
        if (Player1.contains(1) && Player1.contains(4) && Player1.contains(7) )
            Winner=1;
        if(Player2.contains(1) && Player2.contains(4) && Player2.contains(7))
            Winner=2;
        if (Player1.contains(4) && Player1.contains(5) && Player1.contains(6) )
            Winner=1;
        if(Player2.contains(4) && Player2.contains(5) && Player2.contains(6))
            Winner=2;
        
        if (Player1.contains(7) && Player1.contains(8) && Player1.contains(9) )
            Winner=1;
        if(Player2.contains(7) && Player2.contains(8) && Player2.contains(9))
            Winner=2;
        
        if (Player1.contains(2) && Player1.contains(5) && Player1.contains(8) )
            Winner=1;
        if(Player2.contains(2) && Player2.contains(5) && Player2.contains(8))
            Winner=2;
        
        if (Player1.contains(3) && Player1.contains(6) && Player1.contains(9) )
            Winner=1;
        if(Player2.contains(3) && Player2.contains(6) && Player2.contains(9))
            Winner=2;
        
        if (Player1.contains(1) && Player1.contains(5) && Player1.contains(9) )
            Winner=1;
        if(Player2.contains(1) && Player2.contains(5) && Player2.contains(9))
            Winner=2;
        
        if (Player1.contains(3) && Player1.contains(5) && Player1.contains(7) )
            Winner=1;
        if(Player2.contains(3) && Player2.contains(5) && Player2.contains(7))
            Winner=2;
        
        
        //show winner message
        
        if(Winner != -1){
            String MSG="";
            if(Winner==1){
                MSG="Player 1 is the winner";
            }
            if(Winner==2){
                MSG="Player 2 is the winner";
            }
            //Alert Dialog
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Game Info");
        alert.setContentText(MSG);
        alert.setHeaderText("Playing info");
        alert.show();
            
            
            
        }
        
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

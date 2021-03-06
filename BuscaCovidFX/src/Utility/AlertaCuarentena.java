/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Hokers
 */
public class AlertaCuarentena {
    
    public void AlertaCuarentena()
    {
        Stage ventanaAlerta = new Stage();
        
        ventanaAlerta.initModality(Modality.APPLICATION_MODAL);
        ventanaAlerta.setTitle("Has sido contagiado.");
        ventanaAlerta.setMinWidth(250);
        
        Label label = new Label();
        label.setText("Ahora te encuentras en cuarentena, reinicia para volver a intentarlo");
        Button cerrarAlerta = new Button("Cerrar alerta");
        cerrarAlerta.setOnAction(e-> ventanaAlerta.close());
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, cerrarAlerta);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        ventanaAlerta.setScene(scene);
        ventanaAlerta.showAndWait();
        
    }
}

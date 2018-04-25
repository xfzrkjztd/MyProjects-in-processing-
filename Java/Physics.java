

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;




public class Physics extends Application {
    
    Circle ball;
    Rectangle screen, platform;
    Button start;
    private int WIDTH = 500, HEIGHT = 500;

  
  
    
    public Parent createContent(){
       Pane root = new Pane(); 
       
       root.setPrefSize(WIDTH,HEIGHT);
       
       
       ball = new Circle(6);
       ball.setFill(Color.GREEN);
       ball.setLayoutX(WIDTH/2);
       ball.setLayoutY(HEIGHT/4);
       
       platform = new Rectangle(100,20,Color.BLACK);
       platform.setLayoutX(WIDTH/2-50);
       platform.setLayoutY(HEIGHT-100);
       
       start = new Button("Start");
       start.setLayoutX(20);
       start.setLayoutY(HEIGHT-100);
       
        
       
       
       
       root.getChildren().addAll(ball,platform,start);
      
       return root;
    }
  
    @Override
    public void start(Stage primaryStage) {
        
        Scene scene = new Scene(createContent());

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(8),
                new EventHandler<ActionEvent>() {
         
                  float dy=2;
 
                  
                    
            @Override
            public void handle(ActionEvent t) {
          
                ball.setLayoutY(ball.getLayoutY()+dy);
                /*Beschleuningun*/   dy+=0.02; 
                    
                    
                    
                      //Reflection
                if(ball.getLayoutY() >= 400){
                    dy*=-1;
                }
                   
                //Gravitation
                if(ball.getLayoutY()>=400){
                    dy/=1.2;
                }
                
                 primaryStage.getScene().setOnKeyPressed(event -> {
                 if(event.getCode() == KeyCode.UP){
          
                     System.out.println(dy);
            
                }
                 });
              
            }
                }));
       
        
  
        
          timeline.setCycleCount(Timeline.INDEFINITE);
         start.setOnAction(e->{
             timeline.play();
             });
        scene.getStylesheets().add("style.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

        
   
    public static void main(String[] args) {
        launch(args);
    }
    
}

package ownpro;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ownpro extends Application {

    Pane root;
    Circle ball, ball2;
    Rectangle player, screen, randob, brick;
    Line line;
    AnimationTimer timer;
    Label score;
    Node car;
    private List lol = new ArrayList<>();
    ArrayList<Double> xkor = new ArrayList<Double>(50); 
    ArrayList<Double> ykor = new ArrayList<Double>(50);
    private final int WIDTH = 350, HEIGHT = 600;
    private int a = 100;
    private boolean status = true;

    private Parent createContent() {
        root = new Pane();
        root.setPrefSize(WIDTH, HEIGHT);
        screen = new Rectangle(WIDTH, HEIGHT);
        
        ball = new Circle(6);
        ball.relocate(5, 5);
      
        randob = new Rectangle(10,10);
        randob.setFill(Color.RED);
        randob.setLayoutY(HEIGHT-10);
        randob.setLayoutX(-10);
        
       

        player = new Rectangle(a, 10);
        player.setLayoutX(WIDTH / 2 - 50);
        player.setLayoutY(HEIGHT - 10);
        player.setFill(Color.GREEN);
        line = new Line(0, HEIGHT / 4, WIDTH, HEIGHT / 4);
        line.setStroke(Color.WHITE);
        
       
        

        

        root.getChildren().addAll(screen, ball, player, line, randob);

        return root;
    }
 

    int pts = 0;

    public void createNewBall() {
        Circle ball2 = new Circle(6,Color.TRANSPARENT);
        ball.relocate(5, 5);
        root.getChildren().add(ball2);
    }
   
  
    @Override
    public void start(Stage primaryStage) throws Exception {
       
        primaryStage.setScene(new Scene(createContent()));
     
        primaryStage.show();
      
        Label timer = new Label();
        score = new Label();
        
        FileInputStream input = new FileInputStream("src/ownpro/bluestar.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        randob.setFill(new ImagePattern(image));
        
        FileInputStream input2 = new FileInputStream("src/ownpro/pb.png");
        Image image2 = new Image(input2);
        ImageView imageView2 = new ImageView(image2);
        ball.setFill(new ImagePattern(image2));
          
        FileInputStream input3 = new FileInputStream("src/ownpro/paddel.png");
        Image image3 = new Image(input3);
        ImageView imageView3 = new ImageView(image3);
        player.setFill(new ImagePattern(image3));
        
           
       LinearGradient linearGrad = new LinearGradient(
       0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0.1f, Color.RED),new Stop(1.0f, Color.WHITE));
        screen.setFill(linearGrad);
    
              
   
 
          for(int i = 0; i<10; i++){
            for (int j = 3 ; j<8; j++){
                
            brick = new Rectangle(34,15,Color.BLACK);

      brick.setLayoutX(i*35);
      brick.setLayoutY(j*16);   
      root.getChildren().add(brick);
      
      xkor.add(brick.getLayoutX());
      ykor.add(brick.getLayoutY()); 

             }
                      
        }
          
          /* for (int f = 0; f < xkor.size(); f++) {
			System.out.println(xkor.get(f));
		} 
           */
          
          if(ball.getLayoutX() == (brick.getLayoutX() - 34) && ball.getLayoutY() == (brick.getLayoutY()- 15)){
                        System.out.println("lolololololol");
                        
                    }
              
       //EINmal komplett durch xkkor und ykor gehen und inhalte speichern
       //Dann inhalte vergleichen und bei treffer mit ball kor löschen.
              
          
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(15),
                new EventHandler<ActionEvent>() {
            
                
       
 
            double dx = 5;
            double dy = 3;
            double k = 60;
             
       
            
            @Override
            public void handle(ActionEvent t) {
                ball.setLayoutX(ball.getLayoutX() + dx);
                ball.setLayoutY(ball.getLayoutY() + dy);
                     root.getChildren();  
                System.out.println(ykor.get(3));
      
       /*       
        if((ball.getLayoutX()>=brick.getLayoutX() && ball.getLayoutX()<=brick.getLayoutX()+35) && (ball.getLayoutY()>=brick.getLayoutY() && ball.getLayoutY()<=brick.getLayoutY()+16)){
            System.out.println("ll");
        }
        
        */
       
      
          for(int i = 0; i<10; i++){
            for (int j = 3 ; j<8; j++){

                System.out.println(brick.getLayoutX() + " " +  brick.getLayoutY());
            }
        }
             

                
                
                
                
                
                
                
                
              if(randob.getLayoutX()>=player.getLayoutX() && randob.getLayoutX()<=player.getLayoutX()+100){
                randob.setLayoutX(-10);
                a+=20;
                player.setWidth(a);
              }

           //   ))(())   System.out.println("X: " + ball.getLayoutX() + "Y: " + ball.getLayoutY());
                k -= 0.015;
             
             if (k < 0.03) {
                             
                    root.getChildren().remove(timer);
                    
                }
                Bounds bounds = root.getBoundsInLocal();
              

                if (ball.getLayoutX() <= (bounds.getMinX() + ball.getRadius())
                        || ball.getLayoutX() >= (bounds.getMaxX() - ball.getRadius())) {
                    dx = -dx;
                }

                if ((ball.getLayoutY() <= (bounds.getMinY() + ball.getRadius()))) {
                  dy = -dy;
            
                }

         
                score.setLayoutX(WIDTH - 60);
                score.setLayoutY(30);
                score.setTextFill(Color.GOLD);
                score.setText("Score : " + pts);
                
               

                timer.setTextFill(Color.WHITE);
                timer.setLayoutX(0);
                timer.setLayoutY(30);

                timer.setText("Countdown : " + Math.round(k));
              
                double x = ball.getLayoutX();
                double y = ball.getLayoutY();

                if (y == player.getLayoutY() && x > player.getLayoutX() && x < player.getLayoutX() + a) {
                    dy = -dy;
                    pts++;
                
                   

                } else if (y > player.getLayoutY()) {
                    createNewBall();
                  
                } 
                
            if (k < 0.03) {
            boolean won = true;
            String win = "YOU WIN";

            HBox hBox = new HBox();
            hBox.setTranslateX(0);
            hBox.setTranslateY(HEIGHT/2);
            root.getChildren().add(hBox);
            
             
              

            for (int i = 0; i < win.toCharArray().length; i++) {
                char letter = win.charAt(i);

                Text text = new Text(String.valueOf(letter));
                text.setFont(Font.font(48));
                text.setFill(Color.RED);
                text.setOpacity(0);
             
               
               hBox.getChildren().add(text);

                FadeTransition ft = new FadeTransition(Duration.seconds(0.66), text);
                ft.setToValue(1);
                ft.setDelay(Duration.seconds(i * 0.15));
                ft.play();
            }
        } 
            }
 
        }));
        
        Timeline timeline2 = new Timeline(new KeyFrame(Duration.millis(1000),
                new EventHandler<ActionEvent>() {
            int d = 60; 
            @Override
            public void handle(ActionEvent t) {
              
              d -= 1;
                 int u = (int)((Math.random())*341);
                   if(d%20 == 0)   
                 randob.setLayoutX(u);
 
            }
            
                }));
         
         
        
        root.getChildren().addAll(score,timer);
   
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline2.setCycleCount(Timeline.INDEFINITE);
        Label label = new Label("Press Space to Start");
        label.setTextFill(Color.WHITE);
        label.setLayoutX(125);
        label.setLayoutY(HEIGHT / 2);
        root.getChildren().add(label);

        primaryStage.getScene().setOnKeyPressed(event -> {

            if (event.getCode() == KeyCode.LEFT && !status) {
                player.setLayoutX(player.getLayoutX() - 25);
            }
            if (event.getCode() == KeyCode.RIGHT && !status) {
                player.setLayoutX(player.getLayoutX() + 25);
            }

            if (player.getLayoutX() < 0) {
                player.setLayoutX(300);
            }
            if (player.getLayoutX() > 300) {
                player.setLayoutX(0);
            }
 

            if (event.getCode() == KeyCode.SPACE && status) {
                timeline2.play();
             timeline.play();
                status = false;
                root.getChildren().remove(label);

            } else if (event.getCode() == KeyCode.SPACE && !status) {
             timeline.pause();
                status = true;
                root.getChildren().add(label);
            }
         
 
        });
       
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package gamedev;



import java.awt.event.KeyEvent;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Myworks extends Application {
    Pane root;
    Rectangle player,bot;
    Circle ball;
    Line line;
    AnimationTimer timer;
    private final int WIDTH = 1000, HEIGHT = 400;
    private int speedX = 3, speedY = 3, dv = speedX, dy = speedY;
    
    
    
    
   
    @Override
    public void start(Stage primaryStage) {
       
 primaryStage.setTitle("Game");
 primaryStage.setScene(new Scene(createContent()));
 primaryStage.show();
 primaryStage.getScene().setOnKeyPressed(event->{
     if (event.getCode() == KeyCode.UP)player.setLayoutY(player.getLayoutY()-30);
     if (event.getCode() == KeyCode.DOWN)player.setLayoutY(player.getLayoutY()+30);
 });
 
 
    }
    
    private Parent createContent(){
        root = new Pane();
        root.setPrefSize(WIDTH,HEIGHT);
        root.setStyle("-fx-background-color: black");
        
        line = new Line(WIDTH/2,0,WIDTH/2,HEIGHT);
        line.setStroke(Color.WHITE);
        
        bot = new Rectangle(10,80,Color.WHITE);
        
        bot.setLayoutX(0);
        bot.setLayoutY(HEIGHT/2-40);
        
        player = new Rectangle(10,80,Color.WHITE);
        player.setLayoutX(WIDTH-10);
        player.setLayoutY(HEIGHT/2-40);
        
        ball = new Circle(5,Color.GREEN);
        ball.setStroke(Color.WHITE);
        ball.setLayoutX(WIDTH/2);
        ball.setLayoutY(HEIGHT/2);
        
        
        
        root.getChildren().addAll(line,bot,player,ball);
        
        
        timer = new AnimationTimer(){
            @Override
            public void handle (long now){
                gameUpdate();
            }
        };
        
        timer.start();
        
        
        return root;
    }
    
    private void gameUpdate(){
    
        double x = ball.getLayoutX(),y = ball.getLayoutY();
        
        if(x<=10 &&  y > bot.getLayoutY() && y < bot.getLayoutY()+80) dv=speedX;
        if(x>=WIDTH-12.5 && y>player.getLayoutY() && y<player.getLayoutY()+80){ speedX ++;
        dv = -speedX;
        }
        if (y<=0)dy=speedY;
        if(y>=HEIGHT-5)dy=-speedY;
        
        ball.setLayoutX(ball.getLayoutX()+dv);
         ball.setLayoutY(ball.getLayoutY()+dy);
         
         if(x<WIDTH/2 && bot.getLayoutY()>y)bot.setLayoutY(bot.getLayoutY()-5);
         if(x<WIDTH/2 && bot.getLayoutY()+80<y)bot.setLayoutY(bot.getLayoutY()+5);
    }
  
    public static void main(String[] args) {
        launch(args);
    }
    
}

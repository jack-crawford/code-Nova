import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import java.util.Random;
import javafx.scene.text.Text;
import javafx.scene.text.*;
import javafx.util.Duration;


public class draw1 extends Application{

   public void start(Stage primaryStage) {
      Circle dot = new Circle(255, 255, 40, Color.rgb(250,5,111));
      Rectangle background = new Rectangle(15, 15, 640, 390);
      background.setFill(Color.BLACK);

      Group lines = new Group(background);
      lines.getChildren().add(dot);

      int x = 0;
      int lastx = 0;
      int lasty = 5;
      Random randd = new Random();
      int pl_or_m = 0;
           
      while (x <= 995) {
         pl_or_m = randd.nextInt(1);
         if (pl_or_m == 1) {
            pl_or_m = 3;
         } else {
            pl_or_m = -3;
         }
         lasty = lasty + pl_or_m;
         Line newline = new Line(255, 255, lastx, lasty);
         Line newline2 = new Line(255, 255, lasty + 245, lastx);
         Line newline3 = new Line(500, 255, 245 + lastx, lasty + 245);
         Line newline4 = new Line(255, 255, x, lasty);
         Line newline5 = new Line(255, 255, x + 250, lasty);

         if (x < 255) {
            newline.setStroke(Color.rgb(73,14,97));
            newline2.setStroke(Color.rgb(50, 250, 5));
            newline3.setStroke(Color.rgb(0,170,255));
            newline4.setStroke(Color.WHITE);
            newline5.setStroke(Color.PURPLE);


         }
         if (x < 250) {
            lines.getChildren().add(newline4);
         
         }
         lines.getChildren().add(newline5);

         lastx = lastx + 2;
          lines.getChildren().add(newline);
          lines.getChildren().add(newline2);
          lines.getChildren().add(newline3);


         x ++;
      }
      
      Group root = new Group(lines);

      Rectangle brown = new Rectangle(10,10, 650, 400);
      brown.setStroke(Color.rgb(68,68,68));
      brown.setStrokeWidth(10);
      brown.setFill(Color.TRANSPARENT);
      root.getChildren().add(brown);
      
      Rectangle placard = new Rectangle(700, 320, 140, 100);
      placard.setFill(Color.rgb(226, 226, 226));
      root.getChildren().add(placard);
      
      Text t = new Text (704, 355, "Art Overflow");
      Text t2 = new Text(704, 385, "by Jack Crawford\npixels on screen");
      t2.setFont(Font.font("Arial",FontPosture.ITALIC,14));

      t.setFont(Font.font("Arial", 22));
      root.getChildren().add(t);
      root.getChildren().add(t2);
      
      
      Timeline timeline = new Timeline();
      for (Node line: lines.getChildren()) {
          timeline.getKeyFrames().addAll(
              new KeyFrame(Duration.ZERO, // set start position at 0
                  new KeyValue(line.translateXProperty(), randd.nextInt(1) * 32),
                  new KeyValue(line.translateYProperty(), randd.nextInt(1) *32)
              ),
              new KeyFrame(new Duration(10000), // set end position at 40s
                  new KeyValue(line.translateXProperty(), randd.nextInt(10) * 69),
                  new KeyValue(line.translateYProperty(), randd.nextInt(10) * 69)
              )
          );
      }
      // play 40s of animation
      timeline.play();
      

      Scene scene = new Scene(root, 1000, 600, Color.WHITE);
      primaryStage.setTitle("ART");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String args[]) {
      launch(args);
   }
}
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import java.util.Random;


public class draw1 extends Application{

   public void start(Stage primaryStage) {
      Circle dot = new Circle(250, 250, 1, Color.BLACK);
      Group lines = new Group(dot);

      int x = 0;
      int lastx = 0;
      int lasty = 5;
      Random randd = new Random();
      int pl_or_m = 0;
      while (x <= 1000) {
         pl_or_m = randd.nextInt(1);
         if (pl_or_m == 1) {
            pl_or_m = 3;
         } else {
            pl_or_m = -3;
         }
         lasty = lasty + pl_or_m;
         Line newline = new Line(250, 250, lastx, lasty);
         Line newline2 = new Line(250, 250, lasty + 250, lastx);
         Line newline3 = new Line(500, 250, 250 + lastx, lasty + 250);
         Line newline4 = new Line(250, 250, x, lasty);
         Line newline5 = new Line(250, 250, x + 250, lasty);

         //System.out.println("Last y is: " + lasty);
         if (x < 255) {
            // newline.setStroke(Color.rgb(x, x, x));
            // newline2.setStroke(Color.rgb(255-x, 255-x, 255-x));
            newline.setStroke(Color.GREEN);
            newline2.setStroke(Color.RED);
            newline3.setStroke(Color.BLUE);
            newline4.setStroke(Color.BLACK);
            newline5.setStroke(Color.PURPLE);


         }
         if (x < 250) {
            lines.getChildren().add(newline4);
         
         }
         lines.getChildren().add(newline5);

         lastx = lastx + 2;
         // lines.getChildren().add(newline);
//          lines.getChildren().add(newline2);
//          lines.getChildren().add(newline3);
         //lines.getChildren().add(newline5);


         x ++;
      }
      Group root = new Group(lines);
      Scene scene = new Scene(root, 500, 500, Color.WHITE);
      primaryStage.setTitle("testing 123");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String args[]) {
      launch(args);
   }
}
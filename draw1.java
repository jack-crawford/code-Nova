import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import java.util.Random;


public class draw1 extends Application{

   public void start(Stage primaryStage) {
      Circle dot = new Circle(500, 500, 1, Color.BLACK);
      Group lines = new Group(dot);

      int x = 0;
      int lastx = 0;
      int lasty = 5;
      Random randd = new Random();
      int pl_or_m = 0;
      while (x <= 1000) {
         pl_or_m = randd.nextInt(1);
         if (pl_or_m == 1) {
            pl_or_m = 1;
         } else {
            pl_or_m = -1;
         }
         lasty = lasty + pl_or_m;
         Line newline = new Line(500, 500, lastx, lasty);
         Line newline2 = new Line(500, 500, lasty + 250, lastx);
         Line newline3 = new Line(500, 500, 500 + lastx, lasty + 500);
         Line newline4 = new Line(500, 500, x, Math.abs(lasty) + 500);
         //System.out.println("Last y is: " + lasty);
         if (x < 255) {
            // newline.setStroke(Color.rgb(x, x, x));
            // newline2.setStroke(Color.rgb(255-x, 255-x, 255-x));
            newline.setStroke(Color.GREEN);
            newline2.setStroke(Color.RED);
            newline3.setStroke(Color.BLUE);
            newline4.setStroke(Color.BLACK);

         }
         lastx = lastx + 2;
         lines.getChildren().add(newline);
         lines.getChildren().add(newline2);
         lines.getChildren().add(newline3);
         lines.getChildren().add(newline4);

         x ++;
      }
      Group root = new Group(lines);
      Scene scene = new Scene(root, 1000, 1000, Color.WHITE);
      primaryStage.setTitle("testing 123");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String args[]) {
      launch(args);
   }
}
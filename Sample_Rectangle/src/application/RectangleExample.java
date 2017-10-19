package application;
import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import java.util.*;

public class RectangleExample extends Application { 
	Random rand = new Random();
    int rect_x = 450;
  	int rect_y = 0;
   public void start(Stage stage) { 

	   //Drawing a Rectangle 
      Rectangle rect = new Rectangle(rect_x, rect_y, 50, 50); 
      
      //Drawing a Text
      Text text = new Text();
      text.setX(250);
      text.setX(250);

      //Creating a Group object  
      Group root = new Group(rect); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 500, 500);  
      scene.setFill(Color.WHITE);
      
      //Setting title to the Stage 
      stage.setTitle("Drawing a Rectangle"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
      
      scene.setOnKeyPressed(key ->{
  	    if(key.getCode() == KeyCode.RIGHT){
  	    	int a = rand.nextInt(255);
  	    	int b = rand.nextInt(255);
  	    	int c = rand.nextInt(255);
  	        rect.setFill(Color.rgb(a, b, c));
  	        rect_x = rect_x + 10;
  	        rect.setX(rect_x);
  	        rect.setY(rect_y);
  	    }else if(key.getCode() == KeyCode.LEFT){
  	    	int a = rand.nextInt(255);
  	    	int b = rand.nextInt(255);
  	    	int c = rand.nextInt(255);
  	    	rect.setFill(Color.rgb(a, b, c));
  	        rect_x = rect_x - 10;
  	        rect.setX(rect_x);
	        rect.setY(rect_y);
  	    }
  	    else if(key.getCode() == KeyCode.UP){
  	  	int a = rand.nextInt(255);
	    	int b = rand.nextInt(255);
	    	int c = rand.nextInt(255);
	    	rect.setFill(Color.rgb(a, b, c));
  	        rect_y = rect_y - 10;
  	        rect.setX(rect_x);
	        rect.setY(rect_y);

  	    }
  	    else if(key.getCode() == KeyCode.DOWN){
  	  	int a = rand.nextInt(255);
	    	int b = rand.nextInt(255);
	    	int c = rand.nextInt(255);
	    	rect.setFill(Color.rgb(a, b, c));
  	        rect_y = rect_y + 10;
  	        rect.setX(rect_x);
	        rect.setY(rect_y);
  	    }
  	});
  }
   
   
   public static void main(String args[]){ 
      launch(args); 
   } 
} 
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


/**
 * The FoodTruck class is the start of the program representing a foodtruck.
 *
 * @author Sahithya Pasagada
 * @version 1.0
 */
public class FoodTruck extends Application {

    /**
     * This is the main method which makes use of the other classes
     * and its respective methods.
     *
     * @param args Unused.
     *
     *
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * This method will start the program.
     *
     * @param primaryStage the primary stage (the first window)
     */
    @Override
    public void start(Stage primaryStage) {

        BuilderHandler b = new BuilderHandler();
        primaryStage.setMaximized(true);
        Button truck = buildTruck();
        Pane pane = b.getComponentBuilder().build(truck);
        Scene scene = new Scene(pane, 300, 300);

        b.getActionHandler().handleAction(primaryStage, truck);
        primaryStage.setTitle("FoodTruck");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * This method builds the truck.
     *
     * @return the button
     */
    private Button buildTruck() {
        Button truck = new Button();
        truck.setText("  CLICK HERE TO ORDER  ");
        truck.setOnMouseEntered(e -> {
            truck.setCursor(Cursor.HAND);
        });
        truck.setLayoutX(1520);
        truck.setLayoutY(30);
        truck.setStyle("-fx-background-color: gainsboro; -fx-background-radius: 10;");
        truck.setAlignment(Pos.CENTER);
        truck.setTextFill(Color.BLACK);
        Font font = Font.font("Goudy Old Style", FontWeight.BOLD, 27);
        truck.setFont(font);
        return truck;
    }

    /**
     * The inner class Builder handler will work to construct the next stage.
     */
    class BuilderHandler {
         /**
         * The Component builder.
         */
        private ComponentBuilder componentBuilder = new ComponentBuilder();
        /**
         * The Action handler.
         */
        private ActionHandler actionHandler = new ActionHandler();
        public ComponentBuilder getComponentBuilder() {
            return componentBuilder;
        }
        public void setComponentBuilder(ComponentBuilder componentBuilder) {
            this.componentBuilder = componentBuilder;
        }
        public ActionHandler getActionHandler() {
            return actionHandler;
        }
        public void setActionHandler(ActionHandler actionHandler) {
            this.actionHandler = actionHandler;
        }
    }
}




import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javafx.scene.transform.Rotate;
import javafx.scene.shape.Polygon;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.DialogPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
/**
 * The ActionHandler class works to take care of the second stage and certain event actions.
 *
 * @author Sahithya Pasagada
 * @version 1.0
 */
public class ActionHandler {

    /**
     * Handle action.
     *
     * @param primaryStage the primary stage
     * @param truck        the truck
     */
    public void handleAction(Stage primaryStage, Button truck) {
        truck.setOnAction(new EventHandler<ActionEvent>() {

            private final Text current = new Text("$0.00");
            private final Stage newStage = new Stage();
            private ImageView idliView;
            private ImageView puliView;
            private ImageView payaView;
            private int count = 0;
            private int count2 = 0;
            private double value;
            private int n;
            private Text raita;
            private Text mintChut;
            private Text tamChut;
            private TextField textField1;
            private TextField textField2;
            private TextField textField3;
            private TextField textField4;
            private TextField textField5;
            private TextField textField6;
            private TextField textFieldBuild;
            private Pane second;
            private int raitaCount = 0;
            private int mintChutCount = 0;
            private int tamChutCount = 0;

            public void handle(ActionEvent event) {
                second = setNewStage(primaryStage, newStage);
                Rectangle food1 = buildRectangleFood1();
                Rectangle food2 = buildRectangleFood2();
                Rectangle food3 = buildRectangleFood3();
                Line labelLine = buildLabelLine();
                Rectangle a = buildRectangleA();
                Text a1 = buildTextA1();
                Text p1 = buildTextp1();
                Rectangle b = buildRectangleB();
                Text b1 = buildTextB1();
                Text p2 = buildTextp2();
                Rectangle c = buildRectangleC();
                Text c1 = buildTextC1();
                Text p3 = buildTextp3();

                ImageView dvView = buildImageView(
                        "file:dv.png",
                        128, 350);

                idliView = buildImageView(
                        "file:idli.png",
                        144, 350);
                ImageView gbcView = buildImageView(
                        "file:gbc.png",
                        1280, 350);
                payaView = buildImageView(
                        "file:paya.png",
                        1240, 350);
                ImageView mbView = buildImageView(
                        "file:mb.png",
                        687, 357);
                puliView = buildImageView(
                        "file:puli.png",
                        715, 357);
                ImageView rView = buildImageView(
                        "file:raita.png",
                        -5, 910);
                ImageView mintView = buildImageView(
                        "file:mintchut.png",
                        95, 900);
                ImageView tamView = buildImageView(
                        "file:tamchut.png",
                        184, 890);
                condiment(rView, 150, 150, 46, 905, 1, "RAITA");
                condiment(mintView, 160, 160, 123, 905, 2, "MINTCHUTNEY");
                condiment(tamView, 187, 187, 235, 905, 3, "TAMCHUTNEY");

                second.getChildren().add(food1);
                second.getChildren().add(food2);
                second.getChildren().add(food3);
                second.getChildren().add(labelLine);
                second.getChildren().add(a);
                second.getChildren().add(a1);
                second.getChildren().add(p1);
                second.getChildren().add(b);
                second.getChildren().add(b1);
                second.getChildren().add(p2);
                second.getChildren().add(c);
                second.getChildren().add(c1);
                second.getChildren().add(p3);
                second.getChildren().add(gbcView);
                second.getChildren().add(mbView);
                second.getChildren().add(dvView);
                second.getChildren().add(rView);
                second.getChildren().add(mintView);
                second.getChildren().add(tamView);

                Polygon up1 = arrow(110, 230, false);
                second.getChildren().add(up1);
                Polygon up2 = arrow(655, 230, false);
                second.getChildren().add(up2);
                Polygon up3 = arrow(1200, 230, false);
                second.getChildren().add(up3);

                Polygon down1 = arrow(110, 810, true);
                Polygon down2 = arrow(655, 810, true);
                Polygon down3 = arrow(1200, 810, true);


                onMouseEntered(food1, dvView);
                onMouseEntered(food2, mbView);
                onMouseEntered(food3, gbcView);
                onMouseEntered(gbcView, gbcView);
                onMouseEntered(mbView, mbView);
                onMouseEntered(dvView, dvView);

                textField1 = buildTextFieldQuantity(505, 756, 570, 750, second);
                textField2 = buildTextFieldQuantity(1055, 756, 1120, 750, second);
                textField3 = buildTextFieldQuantity(1595, 756, 1660, 750, second);
                textField4 = buildTextFieldQuantity(505, 756, 570, 750, second);
                textField4.setVisible(false);
                textField5 = buildTextFieldQuantity(1055, 756, 1120, 750, second);
                textField5.setVisible(false);
                textField6 = buildTextFieldQuantity(1595, 756, 1660, 750, second);
                textField6.setVisible(false);

                textField1.setOnAction(e -> {
                    getQuantity(textField1, textField2, textField3, textField4, textField5, textField6);
                });

                textField2.setOnAction(e -> {
                    getQuantity(textField1, textField2, textField3, textField4, textField5, textField6);
                });

                textField3.setOnAction(e -> {
                    getQuantity(textField1, textField2, textField3, textField4, textField5, textField6);
                });

                textField4.setOnAction(e -> {
                    getQuantity(textField1, textField2, textField3, textField4, textField5, textField6);
                });

                textField5.setOnAction(e -> {
                    getQuantity(textField1, textField2, textField3, textField4, textField5, textField6);
                });

                textField6.setOnAction(e -> {
                    getQuantity(textField1, textField2, textField3, textField4, textField5, textField6);
                });

                up1.setOnMouseClicked(e -> {
                    count++;
                    if (count == 1) {
                        a1.setText("     IDLI");
                        second.getChildren().remove(dvView);
                        second.getChildren().add(idliView);
                        onMouseEntered(food1, idliView);
                        onMouseEntered(idliView, idliView);
                        second.getChildren().add(down1);
                        second.getChildren().remove(up1);
                        textField1.setVisible(false);
                        textField4.setVisible(true);
                        count = 0;
                        count2 = 0;
                    }
                });

                up2.setOnMouseClicked(e -> {
                    count++;
                    if (count == 1) {
                        b1.setText("     PULIHORA ");
                        second.getChildren().remove(mbView);
                        second.getChildren().add(puliView);
                        onMouseEntered(food2, puliView);
                        onMouseEntered(puliView, puliView);
                        second.getChildren().add(down2);
                        second.getChildren().remove(up2);
                        textField2.setVisible(false);
                        textField5.setVisible(true);
                        count = 0;
                        count2 = 0;
                    }
                });

                up3.setOnMouseClicked(e -> {
                    count++;
                    if (count == 1) {
                        c1.setText("         PAYASAM ");
                        second.getChildren().remove(gbcView);
                        second.getChildren().add(payaView);
                        onMouseEntered(food3, payaView);
                        onMouseEntered(payaView, payaView);
                        second.getChildren().add(down3);
                        second.getChildren().remove(up3);
                        textField3.setVisible(false);
                        textField6.setVisible(true);
                        count = 0;
                        count2 = 0;
                    }
                });

                down1.setOnMouseClicked(e -> {
                    count2++;
                    if (count2 == 1) {
                        a1.setText("DAHI VADA");
                        second.getChildren().remove(idliView);
                        second.getChildren().add(dvView);
                        onMouseEntered(food1, dvView);
                        second.getChildren().add(up1);
                        second.getChildren().remove(down1);
                        textField1.setVisible(true);
                        textField4.setVisible(false);
                        count = 0;
                        count2 = 0;
                    }
                });

                down2.setOnMouseClicked(e -> {
                    count2++;
                    if (count2 == 1) {
                        b1.setText("MUTTON BIRYANI");
                        second.getChildren().remove(puliView);
                        second.getChildren().add(mbView);
                        onMouseEntered(food2, mbView);
                        second.getChildren().add(up2);
                        second.getChildren().remove(down2);
                        textField2.setVisible(true);
                        textField5.setVisible(false);
                        count = 0;
                        count2 = 0;
                    }
                });

                down3.setOnMouseClicked(e -> {
                    count2++;
                    if (count2 == 1) {
                        c1.setText("GULAB JAMUN CAKE");
                        second.getChildren().remove(payaView);
                        second.getChildren().add(gbcView);
                        onMouseEntered(food3, gbcView);
                        second.getChildren().add(up3);
                        second.getChildren().remove(down3);
                        textField3.setVisible(true);
                        textField6.setVisible(false);
                        count = 0;
                        count2 = 0;
                    }
                });

                Label currentCost = new Label("TOTAL ORDER:");
                currentCost.setFont(Font.font("Verdana", FontWeight.BOLD, 45));
                currentCost.setLayoutX(700);
                currentCost.setLayoutY(875);
                currentCost.setTextFill(Color.BLACK);
                current.setFont(Font.font("Verdana", FontWeight.BOLD, 45));
                current.setLayoutX(1088);
                current.setLayoutY(920);
                second.getChildren().addAll(currentCost, current);

                Button clear = new Button("CLEAR");
                clear.setLayoutX(1640);
                clear.setLayoutY(950);
                clear.setPrefWidth(255);
                clear.setStyle("-fx-background-color: indianred; -fx-background-radius: 30;");
                clear.setAlignment(Pos.CENTER);
                clear.setTextFill(Color.IVORY);
                Font font = Font.font("Verdana", FontWeight.BOLD, 20);
                clear.setFont(font);
                second.getChildren().add(clear);

                clear.setOnMouseClicked(e -> {
                    clear();
                    textField1.setText("0");
                    textField2.setText("0");
                    textField3.setText("0");
                    textField4.setText("0");
                    textField5.setText("0");
                    textField6.setText("0");
                    clearCondiment();
                });
                clear.setOnMouseEntered(e -> {
                    Glow g1 = new Glow();
                    g1.setLevel(0.3);
                    clear.setEffect(g1);
                    clear.setCursor(Cursor.HAND);
                });
                clear.setOnMouseReleased(e -> {
                    Glow g1 = new Glow();
                    g1.setLevel(0.0);
                    clear.setEffect(g1);
                });
                clear.setOnMouseExited(e -> {
                    Glow g1 = new Glow();
                    g1.setLevel(0.0);
                    clear.setEffect(g1);
                });

                Button purchase = new Button("  PURCHASE  ");
                purchase.setLayoutX(1640);
                purchase.setLayoutY(900);
                purchase.setPrefWidth(255);
                purchase.setStyle("-fx-background-color: indianred; -fx-background-radius: 30;");
                purchase.setAlignment(Pos.CENTER);
                purchase.setTextFill(Color.IVORY);
                Font font2 = Font.font("Verdana", FontWeight.BOLD, 20);
                purchase.setFont(font2);
                second.getChildren().add(purchase);
                purchase.setOnMouseClicked(e -> {
                    purchase();
                });
                purchase.setOnMouseEntered(e -> {
                    Glow g1 = new Glow();
                    g1.setLevel(0.3);
                    purchase.setEffect(g1);
                    purchase.setCursor(Cursor.HAND);
                });
                purchase.setOnMouseReleased(e -> {
                    Glow g1 = new Glow();
                    g1.setLevel(0.0);
                    purchase.setEffect(g1);
                });
                purchase.setOnMouseExited(e -> {
                    Glow g1 = new Glow();
                    g1.setLevel(0.0);
                    purchase.setEffect(g1);
                });
            }

            public Polygon arrow(int x, int y, boolean isDown) {
                Polygon up = new Polygon();
                up.getPoints().addAll(300.0, 50.0, 250.0, 100.0, 350.0, 100.0);
                up.setFill(Color.INDIANRED);

                if (isDown) {
                    Rotate r = new Rotate();
                    r.setPivotX(300);
                    r.setPivotY(50);
                    r.setAngle(180);
                    up.getTransforms().add(r);
                }

                up.setLayoutY(y);
                up.setLayoutX(x);
                up.setStroke(Color.BLACK);
                up.setStrokeWidth(3);
                up.setCursor(Cursor.HAND);

                up.setOnMouseEntered(e -> {
                    Glow g1 = new Glow();
                    g1.setLevel(0.3);
                    up.setEffect(g1);
                });
                up.setOnMouseReleased(e -> {
                    Glow g1 = new Glow();
                    g1.setLevel(0.0);
                    up.setEffect(g1);
                });
                up.setOnMouseExited(e -> {
                    Glow g1 = new Glow();
                    g1.setLevel(0.0);
                    up.setEffect(g1);
                });

                return up;
            }

            public void condiment(ImageView c, int height, int width, int textX, int textY, int n, String name) {
                raitaCount = 0;
                mintChutCount = 0;
                tamChutCount = 0;
                c.setFitHeight(height);
                c.setFitWidth(width);
                c.setPreserveRatio(true);
                c.setOnMouseEntered(e -> {
                    glow(c);
                    c.setCursor(Cursor.HAND);
                });
                c.setOnMouseExited(e -> {
                    offGlow(c);
                });
                if (n == 1) {
                    raita = new Text(textX, textY, name + ": " + raitaCount);
                    raita.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
                    second.getChildren().add(raita);

                    c.setOnMouseClicked(e -> {
                        if (e.getButton() == MouseButton.PRIMARY) {
                            if (raitaCount >= 0 && raitaCount < 10) {
                                raitaCount += 1;
                                raita.setText(name + ": " + raitaCount);
                            }

                        }
                        if (e.getButton() == MouseButton.SECONDARY) {
                            if (raitaCount >= 1 && raitaCount < 11) {
                                raitaCount -= 1;
                                raita.setText(name + ": " + raitaCount);
                            }

                        }
                    });

                } else if (n == 2) {
                    mintChut = new Text(textX, textY, name + ": " + mintChutCount);
                    mintChut.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
                    second.getChildren().add(mintChut);

                    c.setOnMouseClicked(e -> {
                        if (e.getButton() == MouseButton.PRIMARY) {
                            if (mintChutCount >= 0 && mintChutCount < 10) {
                                mintChutCount += 1;
                                mintChut.setText(name + ": " + mintChutCount);
                            }

                        }
                        if (e.getButton() == MouseButton.SECONDARY) {
                            if (mintChutCount >= 1 && raitaCount < 11) {
                                mintChutCount -= 1;
                                mintChut.setText(name + ": " + mintChutCount);
                            }

                        }
                    });
                } else {
                    tamChut = new Text(textX, textY, name + ": " + tamChutCount);
                    tamChut.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
                    second.getChildren().add(tamChut);

                    c.setOnMouseClicked(e -> {
                        if (e.getButton() == MouseButton.PRIMARY) {
                            if (tamChutCount >= 0 && tamChutCount < 10) {
                                tamChutCount += 1;
                                tamChut.setText(name + ": " + tamChutCount);
                            }

                        }
                        if (e.getButton() == MouseButton.SECONDARY) {
                            if (tamChutCount >= 1 && tamChutCount < 11) {
                                tamChutCount -= 1;
                                tamChut.setText(name + ": " + tamChutCount);
                            }

                        }
                    });
                }

            }

            public void clearCondiment() {
                raita.setText("RAITA: 0");
                mintChut.setText("MINTCHUTNEY: 0");
                tamChut.setText("TAMCHUTNEY: 0");
            }

            private TextField buildTextFieldQuantity(int labelX, int labelY, int textX, int textY, Pane second) {
                Label one = new Label("QUANTITY");
                one.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
                one.setLayoutX(labelX);
                one.setLayoutY(labelY);
                textFieldBuild = new TextField("0");
                textFieldBuild.setMinWidth(20);
                textFieldBuild.setMaxWidth(40);
                textFieldBuild.setLayoutX(textX);
                textFieldBuild.setLayoutY(textY);
                textFieldBuild.positionCaret(textFieldBuild.getText().length());
                second.getChildren().addAll(one, textFieldBuild);
                return textFieldBuild;

            }

            private void onMouseEntered(Node d, ImageView v) {
                d.setOnMouseEntered(e -> {
                    glow(v);
                });
                d.setOnMouseExited(e -> {
                    offGlow(v);
                });
            }

            public void getQuantity(TextField t1, TextField t2,
                TextField t3, TextField t4, TextField t5, TextField t6) {
                try {
                    n = 1;
                    if (Integer.parseInt(t1.getText()) < 0) {
                        throw new NegativeQuantityException(t1.getText());
                    }
                    n = 2;
                    if (Integer.parseInt(t2.getText()) < 0) {
                        throw new NegativeQuantityException(t2.getText());
                    }
                    n = 3;
                    if (Integer.parseInt(t3.getText()) < 0) {
                        throw new NegativeQuantityException(t3.getText());
                    }
                    n = 4;
                    if (Integer.parseInt(t4.getText()) < 0) {
                        throw new NegativeQuantityException(t4.getText());
                    }
                    n = 5;
                    if (Integer.parseInt(t5.getText()) < 0) {
                        throw new NegativeQuantityException(t5.getText());
                    }
                    n = 6;
                    if (Integer.parseInt(t6.getText()) < 0) {
                        throw new NegativeQuantityException(t6.getText());
                    }
                    value = 0;
                    value = (Integer.parseInt(t1.getText()) * 6.99) + (Integer.parseInt(t2.getText()) * 12.99)
                            + (Integer.parseInt(t3.getText()) * 10.99) + (Integer.parseInt(t4.getText()) * 6.99)
                            + (Integer.parseInt(t5.getText()) * 12.99) + (Integer.parseInt(t6.getText()) * 10.99);
                    value = Math.round(value * Math.pow(10, 2)) / Math.pow(10, 2);
                    //current.setText("$" + Double.toString(value));
                    current.setText(String.format("$%.2f", value));
                } catch (NegativeQuantityException neg) {
                    error(neg);
                } catch (NumberFormatException num) {
                    if (n == 1) {
                        try {
                            throw new IllegalQuantityException(t1.getText());
                        } catch (IllegalQuantityException ill) {
                            error(ill);
                        }
                    } else if (n == 2) {
                        try {
                            throw new IllegalQuantityException(t2.getText());
                        } catch (IllegalQuantityException ill) {
                            error(ill);
                        }
                    } else {
                        try {
                            throw new IllegalQuantityException(t3.getText());
                        } catch (IllegalQuantityException ill) {
                            error(ill);
                        }
                    }
                }

            }

            private void error(Exception exception) {
                current.setText("$0.00");
                Alert a = new Alert(AlertType.NONE);
                DialogPane p = a.getDialogPane();
                a.setTitle("QUANTITY ERROR");
                a.setHeaderText("Invalid Quantity");
                a.setX(780);
                a.setY(500);
                p.setStyle(
                        "-fx-text-fill:black;  -fx-font-size:13.0px; -fx-text-fill:black;"
                        + "-fx-font-weight:bold; -fx-font-family: Verdana;");
                a.setAlertType(AlertType.ERROR);
                a.setContentText(exception.getMessage().toUpperCase());
                a.show();
            }

            public void clear() {
                value = 0;
                current.setText("$0.00");
            }

            public void purchase() {

                PrintWriter out = null;
                try {
                    out = new PrintWriter(
                            "order.txt");
                    // out = new PrintWriter("order.txt");
                    out.println("Thank you for your purchase! Here is your order summary.");
                    out.println();
                    if (Integer.parseInt(textField1.getText()) > 0) {
                        out.println("Dahi Vada: " + textField1.getText());
                    }

                    if (Integer.parseInt(textField2.getText()) > 0) {
                        out.println("Mutton Biryani: " + textField2.getText());
                    }

                    if (Integer.parseInt(textField3.getText()) > 0) {
                        out.println("Gulab Jamun Cake: " + textField3.getText());
                    }
                    if (Integer.parseInt(textField4.getText()) > 0) {
                        out.println("Idli: " + textField4.getText());
                    }

                    if (Integer.parseInt(textField5.getText()) > 0) {
                        out.println("Pulihora: " + textField5.getText());
                    }
                    if (Integer.parseInt(textField6.getText()) > 0) {
                        out.println("Payasam: " + textField6.getText());
                    }

                    out.println();
                    out.println("Condiments: ");

                    if (raitaCount > 0) {
                        out.println("Raita Count: " + raitaCount);
                    }

                    if (mintChutCount > 0) {
                        out.println("Mint Chutney Count: " + mintChutCount);
                    }

                    if (tamChutCount > 0) {
                        out.println("Tamarind Chutney Count: " + tamChutCount);
                    }

                    out.println();
                    out.println("The Order Total is " + String.format("$%.2f", value) + ".");

                } catch (FileNotFoundException f) {
                    System.out.println("File not found, message: " + f.getMessage());
                } finally {
                    if (out != null) {
                        out.close();
                    }
                }

            }

        });
    }

    /**
     * This method turns off glow.
     *
     * @param i the i
     */
    private void offGlow(ImageView i) {
        Glow g1 = new Glow();
        g1.setLevel(0.0);
        i.setEffect(g1);
    }

    /**
     * This method turns on glow.
     *
     * @param i the i
     */
    private void glow(ImageView i) {
        Glow g1 = new Glow();
        g1.setLevel(0.5);
        i.setEffect(g1);
    }

    /**
     * Builds the image view.
     *
     * @param path the path
     * @param x    the x
     * @param y    the y
     * @return the image view
     */
    private ImageView buildImageView(String path, int x, int y) {
        //Image i = new Image(path);
        ImageView view = new ImageView(path);
        view.setX(x);
        view.setY(y);
        return view;
    }

    /**
     * Builds the textp3.
     *
     * @return the text
     */
    private Text buildTextp3() {
        Text p3 = new Text("$10.99");
        p3.setFill(Color.IVORY);
        p3.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
        p3.setX(1300);
        p3.setY(397);
        return p3;
    }

    /**
     * Builds the text c1.
     *
     * @return the text
     */
    private Text buildTextC1() {
        Text c1 = new Text("GULAB JAMUN CAKE");
        c1.setX(1322);
        c1.setY(238);
        c1.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        c1.setFill(Color.IVORY);
        return c1;
    }

    /**
     * Builds the rectangle c.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleC() {
        Rectangle c = new Rectangle(1270, 200, 450, 50);
        c.setArcHeight(10);
        c.setArcWidth(10);
        c.setFill(Color.INDIANRED);
        return c;
    }

    /**
     * Builds the textp2.
     *
     * @return the text
     */
    private Text buildTextp2() {
        Text p2 = new Text("$12.99");
        p2.setFill(Color.IVORY);
        p2.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
        p2.setX(755);
        p2.setY(397);
        return p2;
    }

    /**
     * Builds the text b1.
     *
     * @return the text
     */
    private Text buildTextB1() {
        Text b1 = new Text("MUTTON BIRYANI");
        b1.setX(810);
        b1.setY(238);
        b1.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        b1.setFill(Color.IVORY);
        return b1;
    }

    /**
     * Builds the rectangle b.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleB() {
        Rectangle b = new Rectangle(730, 200, 450, 50);
        b.setArcHeight(10);
        b.setArcWidth(10);
        b.setFill(Color.INDIANRED);
        return b;
    }

    /**
     * Builds the textp1.
     *
     * @return the text
     */
    private Text buildTextp1() {
        Text p1 = new Text("$6.99");
        p1.setFill(Color.IVORY);
        p1.setFont(Font.font("Verdana", FontWeight.BOLD, 35));
        p1.setX(210);
        p1.setY(395);
        return p1;
    }

    /**
     * Builds the text a1.
     *
     * @return the text
     */
    private Text buildTextA1() {
        Text a1 = new Text("DAHI VADA");
        a1.setX(315);
        a1.setY(238);
        a1.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        a1.setFill(Color.IVORY);
        return a1;
    }

    /**
     * Builds the rectangle a.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleA() {
        Rectangle a = new Rectangle(190, 200, 450, 50);
        a.setArcHeight(10);
        a.setArcWidth(10);
        a.setFill(Color.INDIANRED);
        return a;
    }

    /**
     * Builds the header.
     *
     * @return the header
     */
    private Line buildLabelLine() {
        Line labelLine = new Line(0, 130, 2000, 130);
        labelLine.setStroke(Color.BLACK);
        labelLine.setStrokeWidth(3);
        return labelLine;
    }

    /**
     * Builds the rectangle food3.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleFood3() {
        Rectangle food3 = new Rectangle(1278, 344, 450, 450);
        food3.setArcHeight(50.0);
        food3.setArcWidth(50.0);
        // food3.setStroke(Color.BLACK);
        // food3.setStrokeWidth(4);
        food3.setFill(Color.CHOCOLATE);
        return food3;
    }

    /**
     * Builds the rectangle food2.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleFood2() {
        Rectangle food2 = new Rectangle(735, 344, 450, 450);
        food2.setArcHeight(50.0);
        food2.setArcWidth(50.0);
        // food2.setStroke(Color.BLACK);
        // food2.setStrokeWidth(4);
        food2.setFill(Color.CHOCOLATE);
        // second.setCenter(food2);
        return food2;
    }

    /**
     * Builds the rectangle food1.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleFood1() {
        Rectangle food1 = new Rectangle(190, 344, 450, 450);
        food1.setArcHeight(50.0);
        food1.setArcWidth(50.0);
        // food1.setStroke(Color.BLACK);
        // food1.setStrokeWidth(4);
        food1.setFill(Color.CHOCOLATE);
        return food1;
    }

    /**
     * Sets the new stage.
     *
     * @param primaryStage the primary stage
     * @param newStage     the new stage
     * @return the pane
     */
    private Pane setNewStage(Stage primaryStage, Stage newStage) {
        Pane second = new Pane();
        Scene secondScene = new Scene(second, 230, 100);
        second.setStyle("-fx-background-color: ivory;");
        Label header = new Label("CS 1331 FOOD TRUCK");
        header.setFont(Font.font("Verdana", FontWeight.BOLD, 28));
        header.setStyle("-fx-background-color: ivory;");
        header.setPadding(new Insets(40.5, 12.5, 40.5, 14.5));
        header.setLayoutX(755);
        header.setLayoutY(10);
        second.getChildren().add(header);
        // second.setTop(new CustomPane("CS 1331 FOOD TRUCK"));

        newStage.setMaximized(true);
        newStage.setTitle("Second Stage");
        newStage.setScene(secondScene);
        newStage.setX(primaryStage.getX() + 200);
        newStage.setY(primaryStage.getY() + 100);
        newStage.show();
        return second;
    }

}

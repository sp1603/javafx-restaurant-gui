
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

/**
 * The ComponentBuilder class works to take care of the first stage.
 *
 * @author Sahithya Pasagada
 * @version 1.0
 */
public class ComponentBuilder {

    /**
     * The translate.
     */
    private static int translate = 180;

    /**
     * The donut bod.
     */
    private Circle donutBod;

    /**
     * The donut in.
     */
    private Circle donutIn;

    /**
     * The frosting 1.
     */
    private Circle frosting1;

    /**
     * The frosting 2.
     */
    private Circle frosting2;

    /**
     * The frosting 3.
     */
    private Circle frosting3;

    /**
     * The frosting 4.
     */
    private Circle frosting4;

    /**
     * The frosting 5.
     */
    private Circle frosting5;

    /**
     * The frosting 6.
     */
    private Circle frosting6;

    /**
     * The frosting 7.
     */
    private Circle frosting7;

    /**
     * The frosting 8.
     */
    private Circle frosting8;

    /**
     * The body.
     */
    private Rectangle body;

    /**
     * The under.
     */
    private Rectangle under;

    /**
     * The over.
     */
    private Rectangle over;

    /**
     * The bottom.
     */
    private Rectangle bottom;

    /**
     * The window.
     */
    private Rectangle window;

    /**
     * The light.
     */
    private Rectangle light;

    /**
     * The line 1.
     */
    private Line line1;

    /**
     * The line 2.
     */
    private Line line2;

    /**
     * The line 3.
     */
    private Line line3;

    /**
     * The line 4.
     */
    private Line line4;

    /**
     * The line 5.
     */
    private Line line5;

    /**
     * The line 6.
     */
    private Line line6;

    /**
     * The trapezoid.
     */
    private Polygon trapezoid;

    /**
     * The trapezoid 2.
     */
    private Polygon trapezoid2;

    /**
     * The r 1.
     */
    private Rectangle r1;

    /**
     * The r 2.
     */
    private Rectangle r2;

    /**
     * The r 3.
     */
    private Rectangle r3;

    /**
     * The r 4.
     */
    private Rectangle r4;

    /**
     * The r 5.
     */
    private Rectangle r5;

    /**
     * The r 6.
     */
    private Rectangle r6;

    /**
     * The r 7.
     */
    private Rectangle r7;

    /**
     * The r 8.
     */
    private Rectangle r8;

    /**
     * The r 9.
     */
    private Rectangle r9;

    /**
     * The r 10.
     */
    private Rectangle r10;

    /**
     * The r 11.
     */
    private Rectangle r11;

    /**
     * The r 12.
     */
    private Rectangle r12;

    /**
     * The r 13.
     */
    private Rectangle r13;

    /**
     * The r 14.
     */
    private Rectangle r14;

    /**
     * The wheel 1.
     */
    private Circle wheel1;

    /**
     * The wheel inset 1.
     */
    private Circle wheelInset1;

    /**
     * The wheel 2.
     */
    private Circle wheel2;

    /**
     * The wheel inset 2.
     */
    private Circle wheelInset2;

    /**
     * The run truck.
     */
    private Button runTruck;

    /**
     * Build pane.
     *
     * @param truck the truck
     * @return the pane
     */
    public Pane build(Button truck) {
        Rectangle corner = buildRectangleCorner();
        Rectangle bgd = buildRectangleBgd();
        Circle profile = buildCircleProfile();

        donutBod = buildCircleDonutBod();
        donutIn = buildCircleDonutIn();
        frosting1 = buildFrosting(770, 75, 46, Color.HOTPINK);
        frosting2 = buildFrosting(700, 110, 46, Color.HOTPINK);
        frosting3 = buildFrosting(675, 180, 46, Color.HOTPINK);
        frosting4 = buildFrosting(705, 240, 46, Color.HOTPINK);
        frosting5 = buildFrosting(770, 265, 46, Color.HOTPINK);
        frosting6 = buildFrosting(835, 240, 46, Color.HOTPINK);
        frosting7 = buildFrosting(864, 180, 46, Color.HOTPINK);
        frosting8 = buildFrosting(845, 110, 46, Color.HOTPINK);

        body = buildRectangleForTruck();
        under = buildRectangleUnder();
        over = buildRectangleOver();
        bottom = buildRectangleBottom();
        window = buildRectangleWindow();
        light = buildRectangleLight();

        line1 = buildLine(280, 350, 280, 849, 4.0);
        line2 = buildLine(280, 350, 1319, 350, 4.0);
        line3 = buildLine(280, 849, 1480, 849, 4.0);
        line4 = buildLine(1079, 849, 1079, 350, 4.0);
        line5 = buildLine(1319, 350, 1482, 670, 4.0);
        line6 = buildLine(1482, 670, 1482, 849, 4.0);

        trapezoid = buildTrapezoid();
        trapezoid2 = buildTrapezoid2();

        r1 = buildRectangle(80, 205, 2);
        r2 = buildRectangle(80, 205, 2);
        r3 = buildRectangle(80, 205, 1);
        r4 = buildRectangle(80, 205, 2);
        r5 = buildRectangle(80, 205, 1);
        r6 = buildRectangle(80, 205, 2);
        r7 = buildRectangle(80, 205, 1);
        r8 = buildRectangle(80, 205, 2);
        r9 = buildRectangle(80, 205, 1);
        r10 = buildRectangle(80, 205, 2);
        r11 = buildRectangle(80, 205, 1);
        r12 = buildRectangle(80, 205, 2);
        r13 = buildRectangle(80, 205, 1);
        r14 = buildRectangle(80, 205, 2);


        wheel1 = buildCircleWheel1();
        wheelInset1 = buildCircleWheelInset1();

        wheel2 = buildCircleWheel2();
        wheelInset2 = buildCircleWheelInset2();

        Text name = new Text(150, 72, "SAHITHYA PASAGADA");
        Text email = new Text(205, 92, "spasagada3@gatech.edu");
        name.setFont(Font.font("Goudy Old Style", FontWeight.BOLD, 28));
        name.setFill(Color.BLACK);
        email.setFont(Font.font("Lucida Sans Unicode", FontWeight.BOLD, 15));
        email.setFill(Color.BLACK);

        runTruck = buildRunTruck();

        runTruck.setOnMouseEntered(e -> {
            runTruck.setCursor(Cursor.HAND);
        });

        runTruck.setOnAction(e -> {
            moveTruckAway();
            moveTruckBack();
        });

        Pane pane = new Pane();
        pane.getChildren().addAll(corner, bgd, profile, name, email, truck, body, under, trapezoid, trapezoid2, bottom,
                wheel1, wheel2, line3, wheelInset1, wheelInset2, line1, line2, line4, line5, line6, window, r1, r2, r3,
                r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14,
                over, light, donutBod, donutIn, frosting1, frosting2, frosting3,
                frosting4, frosting5, frosting6, frosting7, frosting8, runTruck);
        pane.setStyle("-fx-background-color: ivory;");



        return pane;
    }



    /**
     * Move truck away.
     */
    private void moveTruckAway() {
        setter(body);
        setter(under);
        setter(trapezoid);
        setter(trapezoid2);
        setter(bottom);
        setter(wheel1);
        setter(wheel2);
        setter(line3);
        setter(wheelInset1);
        setter(wheelInset2);
        setter(line1);
        setter(line2);
        setter(line4);
        setter(line5);
        setter(line6);
        setter(window);
        setter(r1);
        setter(r2);
        setter(r3);
        setter(r4);
        setter(r5);
        setter(r6);
        setter(r7);
        setter(r8);
        setter(r9);
        setter(r10);
        setter(r11);
        setter(r12);
        setter(r13);
        setter(r14);
        setter(over);
        setter(light);
        setter(donutBod);
        setter(donutIn);
        setter(frosting1);
        setter(frosting2);
        setter(frosting3);
        setter(frosting4);
        setter(frosting5);
        setter(frosting6);
        setter(frosting7);
        setter(frosting8);
    }

    /**
     * Move truck back.
     */
    private void moveTruckBack() {
        back(body);
        back(under);
        back(trapezoid);
        back(trapezoid2);
        back(bottom);
        back(wheel1);
        back(wheel2);
        back(line3);
        back(wheelInset1);
        back(wheelInset2);
        back(line1);
        back(line2);
        back(line4);
        back(line5);
        back(line6);
        back(window);
        back(r1);
        back(r2);
        back(r3);
        back(r4);
        back(r5);
        back(r6);
        back(r7);
        back(r8);
        back(r9);
        back(r10);
        back(r11);
        back(r12);
        back(r13);
        back(r14);
        back(over);
        back(light);
        back(donutBod);
        back(donutIn);
        back(frosting1);
        back(frosting2);
        back(frosting3);
        back(frosting4);
        back(frosting5);
        back(frosting6);
        back(frosting7);
        back(frosting8);
    }

    /**
     * Builds the run truck.
     *
     * @return the button
     */
    private Button buildRunTruck() {
        Button runTrucks = new Button();
        runTrucks.setText("          MOVE TRUCK      ");
        runTrucks.setLayoutX(1180);
        runTrucks.setLayoutY(30);
        runTrucks.setStyle("-fx-background-color: gainsboro; -fx-background-radius: 10;");
        runTrucks.setTextFill(Color.BLACK);
        runTrucks.setAlignment(Pos.CENTER);
        Font font = Font.font("Goudy Old Style", FontWeight.BOLD, 27);
        runTrucks.setFont(font);
        return runTrucks;
    }

    /**
     * Builds the circle wheel inset 2.
     *
     * @return the circle
     */
    private Circle buildCircleWheelInset2() {
        Circle wheelInsets2 = new Circle(1200, 849, 70);
        wheelInsets2.setFill(Color.DARKGRAY);
        //setter(wheelInset2);
        return wheelInsets2;
    }

    /**
     * Builds the circle wheel 2.
     *
     * @return the circle
     */
    private Circle buildCircleWheel2() {
        Circle wheels2 = new Circle(1200, 849, 103);
        return wheels2;
    }

    /**
     * Builds the circle wheel inset 1.
     *
     * @return the circle
     */
    private Circle buildCircleWheelInset1() {
        Circle wheelInsets1 = new Circle(440, 849, 70);
        wheelInsets1.setFill(Color.DARKGRAY);
        return wheelInsets1;
    }

    /**
     * Builds the circle wheel 1.
     *
     * @return the circle
     */
    private Circle buildCircleWheel1() {
        Circle wheels1 = new Circle(440, 849, 103);
        //setter(wheel1);
        return wheels1;
    }

    /**
     * Builds the rectangle.
     *
     * @param x the x
     * @param y the y
     * @param r the r
     * @return the rectangle
     */
    private Rectangle buildRectangle(int x, int y, int r) {
        Rectangle rs1 = new Rectangle(x, y);
        addRect(rs1, r);
        //setter(r1);
        return rs1;
    }

    /**
     * Add rect.
     *
     * @param r the r
     * @param a the a
     */
    public void addRect(Rectangle r, int a) {
        r.setX(80);
        r.setY(250);
        r.setStroke(Color.BLACK);
        r.setStrokeWidth(4);
        r.setArcWidth(100);
        r.setArcHeight(100);
        if (a == 1) {
            r.setFill(Color.SANDYBROWN);
        } else {
            r.setFill(Color.GOLD);
        }
        translate = translate + 60;
        r.setX(translate);
        r.setY(320);
    }

    /**
     * Sets .
     *
     * @param n the n
     */
    public void setter(Node n) {
        TranslateTransition t = new TranslateTransition();
        //t.setDelay(Duration.seconds(2));
        t.setDuration(Duration.seconds(4));
        t.setNode(n);
        t.setToX(6000);
        t.play();
    }

    /**
     * Back.
     *
     * @param n the n
     */
    public void back(Node n) {
        //n.setLayoutX(0);
        TranslateTransition t = new TranslateTransition();
        t.setDelay(Duration.seconds(4));
        t.setDuration(Duration.seconds(3));
        t.setNode(n);
        t.setFromX(-6000);
        t.setToX(n.getLayoutX());
        t.play();
    }

    /**
     * Builds the trapezoid 2.
     *
     * @return the polygon
     */
    private Polygon buildTrapezoid2() {
        Polygon trapezoids2 = new Polygon();
        trapezoids2.getPoints().addAll(400.0, 0.0, 400.0, 300.0, 0.0, 500.0, 0.0, 0.0);
        trapezoids2.setFill(Color.SEASHELL);
        trapezoids2.setStroke(Color.BLACK);
        trapezoids2.setStrokeWidth(6);

        Translate translate2 = buildTranslate(1125, 645);
        Scale scale2 = buildScale(0.6, 0.6);
        Rotate rotate2 = buildRotate(270);


        trapezoids2.getTransforms().addAll(translate2, scale2, rotate2);

        //setter(trapezoid2);

        return trapezoids2;
    }


    /**
     * Builds the trapezoid.
     *
     * @return the polygon
     */
    private Polygon buildTrapezoid() {
        Polygon trapezoidss = new Polygon();
        trapezoidss.getPoints().addAll(400.0, 0.0, 400.0, 300.0, 0.0, 500.0, 0.0, 0.0);
        trapezoidss.setFill(Color.LIGHTCORAL);

        Translate translates = buildTranslate(1080, 670);
        Scale scale = buildScale(0.8, 0.8);
        Rotate rotate = buildRotate(270);

        trapezoidss.getTransforms().addAll(translates, scale, rotate);
        //setter(trapezoid);
        return trapezoidss;
    }

    /**
     * Builds the line.
     *
     * @param a   the a
     * @param b   the b
     * @param c   the c
     * @param d   the d
     * @param stw the stw
     * @return the line
     */
    private Line buildLine(int a, int b, int c, int d, double stw) {
        Line lines1 = new Line(a, b, c, d);
        lines1.setStrokeWidth(stw);
        //setter(line1);
        return lines1;
    }

    /**
     * Builds the rectangle light.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleLight() {
        Rectangle lights = new Rectangle(1432, 690, 50, 80);
        lights.setFill(Color.GOLD);
        lights.setStroke(Color.BLACK);
        lights.setStrokeWidth(4);
        //setter(light);
        return lights;
    }

    /**
     * Builds the rectangle window.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleWindow() {
        Rectangle windows = new Rectangle(380, 465, 620, 230);
        windows.setFill(Color.SEASHELL);
        windows.setStroke(Color.BLACK);
        windows.setStrokeWidth(4);
        windows.setArcHeight(50.0);
        windows.setArcWidth(50.0);
        //setter(window);
        return windows;
    }

    /**
     * Builds the rectangle bottom.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleBottom() {
        Rectangle bottoms = new Rectangle(270, 830, 1225, 45);
        bottoms.setFill(Color.BLACK);
        bottoms.setStroke(Color.BLACK);
        bottoms.setStrokeWidth(4);
        bottoms.setArcHeight(10);
        bottoms.setArcWidth(10);
        //setter(bottom);
        return bottoms;
    }

    /**
     * Builds the rectangle over.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleOver() {
        Rectangle overs = new Rectangle(235, 318, 1100, 40);
        overs.setFill(Color.GOLD);
        overs.setStroke(Color.BLACK);
        overs.setStrokeWidth(4);
        //setter(over);
        return overs;
    }

    /**
     * Builds the rectangle under.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleUnder() {
        Rectangle unders = new Rectangle(1080, 670, 400, 181);
        unders.setFill(Color.LIGHTCORAL);
        //setter(under);
        return unders;
    }

    /**
     * Builds the frosting.
     *
     * @param a     the a
     * @param b     the b
     * @param c     the c
     * @param color the color
     * @return the circle
     */
    private Circle buildFrosting(int a, int b, int c, Color color) {
        Circle frostings1 = new Circle(a, b, c);
        frostings1.setFill(color);
        //setter(frosting1);
        return frostings1;
    }

    /**
     * Builds the circle donut in.
     *
     * @return the circle
     */
    private Circle buildCircleDonutIn() {
        Circle donutIns = new Circle(770, 170, 40);
        donutIns.setFill(Color.IVORY);
        donutIns.setStroke(Color.BLACK);
        donutIns.setStrokeWidth(4);
        //setter(donutIn);
        return donutIns;
    }

    /**
     * Builds the circle donut bod.
     *
     * @return the circle
     */
    private Circle buildCircleDonutBod() {
        Circle donutBods = new Circle(770, 170, 150);
        donutBods.setFill(Color.CHOCOLATE);
        donutBods.setStroke(Color.BLACK);
        donutBods.setStrokeWidth(4);
        //setter(donutBod);
        return donutBods;
    }

    /**
     * Builds the rectangle for truck.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleForTruck() {
        //truck drawing
        Rectangle bodys = new Rectangle(280, 350, 800, 500);
        bodys.setFill(Color.LIGHTCORAL);
        //setter(body);
        return bodys;
    }

    /**
     * Builds the rectangle corner.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleCorner() {
        Rectangle corner = new Rectangle(20, 20, 500, 100);
        corner.setArcHeight(50.0);
        corner.setArcWidth(50.0);
        corner.setFill(Color.GAINSBORO);
        return corner;
    }

    /**
     * Builds the circle profile.
     *
     * @return the circle
     */
    private Circle buildCircleProfile() {
        Circle profile = new Circle();
        profile.setCenterX(90.0);
        profile.setCenterY(70.0);
        profile.setRadius(37.0);
        profile.setFill(Color.LIGHTGRAY);
        return profile;
    }

    /**
     * Builds the rectangle bgd.
     *
     * @return the rectangle
     */
    private Rectangle buildRectangleBgd() {
        Rectangle bgd = new Rectangle(180, 178, 1500, 800);
        bgd.setArcHeight(50.0);
        bgd.setArcWidth(50.0);
        bgd.setFill(Color.FLORALWHITE);
        bgd.setStroke(Color.BLACK);
        bgd.setStrokeWidth(4);
        return bgd;
    }

    /**
     * Builds the rotate.
     *
     * @param angle the angle
     * @return the rotate
     */
    private Rotate buildRotate(int angle) {
        Rotate rotate = new Rotate();
        rotate.setAngle(angle);
        return rotate;
    }

    /**
     * Builds the scale.
     *
     * @param x the x
     * @param y the y
     * @return the scale
     */
    private Scale buildScale(double x, double y) {
        Scale scale = new Scale();
        scale.setX(x);
        scale.setY(y);
        return scale;
    }

    /**
     * Builds the translate.
     *
     * @param x the x
     * @param y the y
     * @return the translate
     */
    private Translate buildTranslate(int x, int y) {
        Translate translated = new Translate();
        translated.setX(x);
        translated.setY(y);
        return translated;
    }


}

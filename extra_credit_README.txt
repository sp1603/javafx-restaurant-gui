Copy all files into a folder.

How to Run the Program
	Commands:
	javac --module-path "C:\_home\javafx\javafx-sdk-19\lib" --add-modules javafx.controls,javafx.base,javafx.fxml,javafx.graphics,javafx.media,javafx.web FoodTruck.java
	java --module-path C:\_home\javafx\javafx-sdk-19\lib --add-modules javafx.controls,javafx.base,javafx.fxml,javafx.graphics,javafx.media,javafx.web FoodTruck	

Graphics Window:

	I created a drawing of a foodtruck which can move when the user presses the "Move Truck" button. It will move right off the screen and then return from the left of the screen to its original position.
	To go to the next stage, press the "Click Here To Order" button. The cursor will also change over these buttons. 


Order Window:

	Images representing eachc food item.
	Additional 3 food items.
	
	I set the textField cursor to the right instead of the default left for ease. 

	Mouse:
		When any image is hovered over it will glow.
		When anything 'clickable' is hovered over, the mouse cursor will change. Items include: the purchase button, clear button, and condiments' buttons.
		Condiments:
			There are three condiments which when LEFT clicked will increase the count and when RIGHT clicked will decrease the count. The max is 10 and min is 0. It will also be included in the receipt and is free of charge.
		Arrow Buttons:
			For each button the item will change as well as the text. This is just additional menu options and can also be hovered over along with written to the receipt. 



Additional Components:
	I made a different UI design.

		

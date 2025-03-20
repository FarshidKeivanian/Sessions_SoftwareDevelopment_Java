<GridPane alignment="CENTER" hgap="10" vgap="10">
    <Text text="Register Here" GridPane.columnIndex="1"/>
    <Label text="Name:" GridPane.rowIndex="1"/>
    <TextField fx:id="nameField" GridPane.rowIndex="1" GridPane.columnIndex="1"/>
    <Label text="Email:" GridPane.rowIndex="2"/>
    <TextField fx:id="emailField" GridPane.rowIndex="2" GridPane.columnIndex="1"/>
    <Label text="Country:" GridPane.rowIndex="3"/>
    <ComboBox fx:id="countryBox" GridPane.rowIndex="3" GridPane.columnIndex="1"/>
    <Button text="Register" onAction="#registerUser" GridPane.rowIndex="4" GridPane.columnIndex="1"/>
</GridPane>
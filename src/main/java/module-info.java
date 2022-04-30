module ru.gb.gbhw7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.gbhw7 to javafx.fxml;
    exports ru.gb.gbhw7;
}
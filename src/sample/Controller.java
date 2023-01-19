package sample;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @FXML
    public TextField urlInput;

    @FXML
    public TextField idInput;

    @FXML
    private Label resultLinkId;


    @FXML
    private Button btn;

//    @FXML
//    private void initialize (){
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                logger.toString();
//            }
//        });
//    }

    @FXML
    void setResultLinkText() {
        urlInput = new TextField();
//        resultLinkId = new Text();
        urlInput.textProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println("skjd");
                resultLinkId.setText(newValue);
            }
        });
    }

    ;

    public void onClickEvent(MouseEvent mouseEvent) {
//        Button btn = (Button) mouseEvent.getSource();
//        resultLinkId.setText(resultLinkId.getText() + btn.getText());
    }

    public void setValue(String str) {
//        resultLinkId.setText("123");
        System.out.println(resultLinkId.getText());
    }


    public void onKeyTyped(KeyEvent keyEvent) {
        resultLinkId.setText(keyEvent.getCharacter() + urlInput.getText());


//        str += keyEvent.getCharacter();
//        System.out.println(urlInput.getText());
    }

//    public void addCharacter (String text) {
//        resultLinkId.
//    }
}


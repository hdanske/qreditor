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
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.util.regex.Pattern;

public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @FXML
    public TextField urlInput;

    @FXML
    public TextField idInput;

    @FXML
    private Label resultLinkId;

    @FXML
    private void setUrlInput() {

        System.out.println("i am here");
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(urlInput.getText());
        System.out.println("urlInput: " + urlInput.getText());
        resultLinkId.setText(stringBuilder.toString());
    }

//    @FXML
//    private void getResultLink() {
//        resultLinkId.textProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue<? extends String> observable,
//                                String oldValue, String newValue) {
//            }
//        });
//    }

    @FXML
    private void initialize() {
        StringBuilder stringBuilder = new StringBuilder();

        urlInput.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable,
                                String oldValue, String newValue) {

//                stringBuilder.append(newValue);
               resultLinkId.setText(newValue);
            }
        });

        idInput.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable,
                                String oldValue, String newValue) {

//                stringBuilder.append(newValue);
                resultLinkId.setText(newValue);
            }
        });

        resultLinkId.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable,
                                String oldValue, String newValue) {
            }
        });
    }


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

    public void onClickEvent(MouseEvent mouseEvent) {
//        Button btn = (Button) mouseEvent.getSource();
//        resultLinkId.setText(resultLinkId.getText() + btn.getText());
    }

    public void setValue(String str) {
//        resultLinkId.setText("123");
        System.out.println(resultLinkId.getText());
    }

//    @FXML
//    public void onKeyTyped(KeyEvent keyEvent) {
//        StringBuilder stringBuilder = new StringBuilder();
//
//        stringBuilder.append(urlInput.getText());
//        System.out.println("urlInput: " + urlInput.getText());
//        resultLinkId.setText(stringBuilder.toString());
//    }

    private void setResultLink() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(urlInput.getText());
        System.out.println("urlInput: " + urlInput.getText());
        resultLinkId.setText(stringBuilder.toString());
    }

//    public void textChanged(InputMethodEvent inputMethodEvent) {
//        if (inputMethodEvent.getComposed().) System.out.println("ololo");
//        resultLinkId.setText(urlInput.getText());
//
//
//    }

//    public void addCharacter (String text) {
//        resultLinkId.
//    }
}

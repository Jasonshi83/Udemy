package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
  @FXML
  private TextField nameField;

  @FXML
  private Button helloButton;

  @FXML
  private Button byeButton;

  @FXML
  private CheckBox ourCheckBox;

  @FXML
  private Label ourLabel;

  @FXML
  public void initialize()
  {
    helloButton.setDisable(true);
    byeButton.setDisable(true);
  }

  @FXML

  public void onButtonClicked(ActionEvent e)
  {
    if(e.getSource().equals(helloButton))
    {
      System.out.println("hello, " + nameField.getText());
    }else if(e.getSource().equals(byeButton))
    {
      System.out.println("Bye, " + nameField.getText());
    }


    //do the work of setting up and running this code in the background
    //so its no longer gonna be running on a UI thread its gonna create another process virtually another program another instance of something running in the background on your computer to do whatever processing we want to do
    Runnable task = new Runnable() {
      @Override
      public void run() {
          try{
            String s = Platform.isFxApplicationThread()?"UI.Thread":"BackGround thread";
            System.out.println("I'm going to sleep on the: " + s);
            Thread.sleep(10000);//让系统等1000毫秒
            Platform.runLater(new Runnable() {
              @Override
              public void run() {
                String s = Platform.isFxApplicationThread()?"UI.Thread":"BackGround thread";
                System.out.println("I'm am updating the label on the: " + s);
                ourLabel.setText("We did something");
              }
            });
          }catch(InterruptedException event)
          {}
        }
    };

    //after setting runnable task, run it by using following code

    new Thread(task).start();


    if(ourCheckBox.isSelected())
    {
      nameField.clear();
      helloButton.setDisable(true);
      byeButton.setDisable(true);
    }
  }

  @FXML

  public void handleKeyReleased()
  {
    String text = nameField.getText();
    boolean disableButtons = text.isEmpty()|| text.trim().isEmpty();
    helloButton.setDisable(disableButtons);
    byeButton.setDisable(disableButtons);

  }

  @FXML
  public void handleChange()
  {
    System.out.println("The checkbox is "+ (ourCheckBox.isSelected()? "checked" : " not checked"));
  }

}

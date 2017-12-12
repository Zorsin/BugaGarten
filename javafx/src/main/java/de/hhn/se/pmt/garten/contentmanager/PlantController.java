package de.hhn.se.pmt.garten.contentmanager;

    import java.net.URL;
    import java.util.Arrays;
    import java.util.List;
    import java.util.ResourceBundle;
    import javafx.fxml.FXML;
    import javafx.scene.control.CheckBox;
    import javafx.scene.control.CheckMenuItem;
    import javafx.scene.control.ComboBox;
    import javafx.scene.control.Label;
    import javafx.scene.control.SelectionMode;
    import javafx.scene.control.TextArea;
    import javafx.scene.control.TextField;
    import javafx.scene.control.ToggleButton;
    import javafx.scene.layout.FlowPane;

/**
 * 12.12.2017
 *
 * @author SWirries
 * <p>
 * This code is
 * documentation enough
 */
public class PlantController {

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private TextField textFieldBotName;

  @FXML
  private TextField textFieldDeutName;

  @FXML
  private ComboBox<CheckMenuItem> comboBoxBodenart;

  @FXML
  private ComboBox<?> comboBoxWuchshoehe;

  @FXML
  private ComboBox<?> comboBoxGewaechsart;

  @FXML
  private ComboBox<?> comboBoxBluetenform;

  @FXML
  private ComboBox<?> comboBoxBluetenfarbe;

  @FXML
  private ComboBox<?> comboBoxFruchtfarbe;

  @FXML
  private TextArea textAreaBeschreibung;

  @FXML
  private ToggleButton toogleButtonAngepflanzt;

  @FXML
  private ToggleButton toogleButtonDuftend;

  @FXML
  private TextField textfFieldBluezeitraum;

  @FXML
  private TextField textfFieldBluehdauer;

  @FXML
  private TextField textfFieldLebensdauer;

  @FXML
  private TextField textfFieldAnpflanzzeitraum;

  @FXML
  private TextField textfFieldTags;

  @FXML
  private FlowPane flowPaneBodenart;

  @FXML
  void initialize() {
    assert textFieldBotName != null : "fx:id=\"textFieldBotName\" was not injected: check your FXML file 'plant.fxml'.";
    assert textFieldDeutName != null : "fx:id=\"textFieldDeutName\" was not injected: check your FXML file 'plant.fxml'.";
    assert comboBoxBodenart != null : "fx:id=\"comboBoxBodenart\" was not injected: check your FXML file 'plant.fxml'.";
    assert comboBoxWuchshoehe != null : "fx:id=\"comboBoxWuchshoehe\" was not injected: check your FXML file 'plant.fxml'.";
    assert comboBoxGewaechsart != null : "fx:id=\"comboBoxGewaechsart\" was not injected: check your FXML file 'plant.fxml'.";
    assert comboBoxBluetenform != null : "fx:id=\"comboBoxBluetenform\" was not injected: check your FXML file 'plant.fxml'.";
    assert comboBoxBluetenfarbe != null : "fx:id=\"comboBoxBluetenfarbe\" was not injected: check your FXML file 'plant.fxml'.";
    assert comboBoxFruchtfarbe != null : "fx:id=\"comboBoxFruchtfarbe\" was not injected: check your FXML file 'plant.fxml'.";
    assert textAreaBeschreibung != null : "fx:id=\"textAreaBeschreibung\" was not injected: check your FXML file 'plant.fxml'.";
    assert toogleButtonAngepflanzt != null : "fx:id=\"toogleButtonAngepflanzt\" was not injected: check your FXML file 'plant.fxml'.";
    assert toogleButtonDuftend != null : "fx:id=\"toogleButtonDuftend\" was not injected: check your FXML file 'plant.fxml'.";
    assert textfFieldBluezeitraum != null : "fx:id=\"textfFieldBluezeitraum\" was not injected: check your FXML file 'plant.fxml'.";
    assert textfFieldBluehdauer != null : "fx:id=\"textfFieldBluehdauer\" was not injected: check your FXML file 'plant.fxml'.";
    assert textfFieldLebensdauer != null : "fx:id=\"textfFieldLebensdauer\" was not injected: check your FXML file 'plant.fxml'.";
    assert textfFieldAnpflanzzeitraum != null : "fx:id=\"textfFieldAnpflanzzeitraum\" was not injected: check your FXML file 'plant.fxml'.";
    assert textfFieldTags != null : "fx:id=\"textfFieldTags\" was not injected: check your FXML file 'plant.fxml'.";
    assert flowPaneBodenart != null : "fx:id=\"flowPaneBodenart\" was not injected: check your FXML file 'plant.fxml'.";

    List<CheckBox> items = Arrays.asList(
        new CheckBox("Boden1"),
        new CheckBox("Boden2"),
        new CheckBox("Boden3"),
        new CheckBox("Boden4"),
        new CheckBox("Boden5"),
        new CheckBox("Boden6"),
        new CheckBox("Boden7")
    );
    flowPaneBodenart.getChildren().addAll(items);

  }
}


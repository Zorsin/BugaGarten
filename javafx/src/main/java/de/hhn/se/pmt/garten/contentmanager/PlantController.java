package de.hhn.se.pmt.garten.contentmanager;

    import java.net.URL;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
    import java.util.ResourceBundle;

    import de.hhn.se.pmt.garten.Bluetenform;
    import de.hhn.se.pmt.garten.Bodenart;
    import de.hhn.se.pmt.garten.Farbe;
    import de.hhn.se.pmt.garten.Gewaechsart;
    import de.hhn.se.pmt.garten.Wuchshoehe;
    import javafx.fxml.FXML;
    import javafx.geometry.Insets;
    import javafx.scene.control.CheckBox;
    import javafx.scene.control.CheckMenuItem;
    import javafx.scene.control.ComboBox;
    import javafx.scene.control.Label;
    import javafx.scene.control.RadioButton;
    import javafx.scene.control.SelectionMode;
    import javafx.scene.control.TextArea;
    import javafx.scene.control.TextField;
    import javafx.scene.control.ToggleButton;
    import javafx.scene.control.ToggleGroup;
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
  private FlowPane flowPaneWuchshoehe;

  @FXML
  private FlowPane flowPaneFruchtfarbe;

  @FXML
  private FlowPane flowPaneBluetenform;

  @FXML
  private FlowPane flowPaneBluetenfarbe;

  @FXML
  private FlowPane flowPaneGewaechsart;

  @FXML
  private FlowPane flowPaneBodenart;

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
  void initialize() {
    assert textFieldBotName != null : "fx:id=\"textFieldBotName\" was not injected: check your FXML file 'plant.fxml'.";
    assert textFieldDeutName != null : "fx:id=\"textFieldDeutName\" was not injected: check your FXML file 'plant.fxml'.";
    assert textAreaBeschreibung != null : "fx:id=\"textAreaBeschreibung\" was not injected: check your FXML file 'plant.fxml'.";
    assert toogleButtonAngepflanzt != null : "fx:id=\"toogleButtonAngepflanzt\" was not injected: check your FXML file 'plant.fxml'.";
    assert toogleButtonDuftend != null : "fx:id=\"toogleButtonDuftend\" was not injected: check your FXML file 'plant.fxml'.";
    assert textfFieldBluezeitraum != null : "fx:id=\"textfFieldBluezeitraum\" was not injected: check your FXML file 'plant.fxml'.";
    assert textfFieldBluehdauer != null : "fx:id=\"textfFieldBluehdauer\" was not injected: check your FXML file 'plant.fxml'.";
    assert textfFieldLebensdauer != null : "fx:id=\"textfFieldLebensdauer\" was not injected: check your FXML file 'plant.fxml'.";
    assert textfFieldAnpflanzzeitraum != null : "fx:id=\"textfFieldAnpflanzzeitraum\" was not injected: check your FXML file 'plant.fxml'.";
    assert textfFieldTags != null : "fx:id=\"textfFieldTags\" was not injected: check your FXML file 'plant.fxml'.";
    assert flowPaneWuchshoehe != null : "fx:id=\"flowPaneWuchshoehe\" was not injected: check your FXML file 'plant.fxml'.";
    assert flowPaneFruchtfarbe != null : "fx:id=\"flowPaneFruchtfarbe\" was not injected: check your FXML file 'plant.fxml'.";
    assert flowPaneBluetenform != null : "fx:id=\"flowPaneBluetenform\" was not injected: check your FXML file 'plant.fxml'.";
    assert flowPaneBluetenfarbe != null : "fx:id=\"flowPaneBluetenfarbe\" was not injected: check your FXML file 'plant.fxml'.";
    assert flowPaneGewaechsart != null : "fx:id=\"flowPaneGewaechsart\" was not injected: check your FXML file 'plant.fxml'.";
    assert flowPaneBodenart != null : "fx:id=\"flowPaneBodenart\" was not injected: check your FXML file 'plant.fxml'.";


    Bodenart[] bodenarts = Bodenart.values();
    ToggleGroup bodenGroup = new ToggleGroup();
    Insets insets = new Insets(10,10,10,10);
    for(Bodenart art : bodenarts){
      RadioButton rb = new RadioButton(art.name());
      rb.setPadding(insets);
      rb.setToggleGroup(bodenGroup);
      bodenartButtons.add(rb);
    }
    bodenartButtons.get(0).setSelected(true);
    flowPaneBodenart.getChildren().addAll(bodenartButtons);

    Gewaechsart[] gewaechsarts = Gewaechsart.values();
    ToggleGroup gewaechsGroup = new ToggleGroup();
    for(Gewaechsart art: gewaechsarts){
      RadioButton rb = new RadioButton(art.name());
      rb.setPadding(insets);
      rb.setToggleGroup(gewaechsGroup);
      gewaechsartButtons.add(rb);
    }
    gewaechsartButtons.get(0).setSelected(true);
    flowPaneGewaechsart.getChildren().addAll(gewaechsartButtons);

    Farbe[] bluetenfarbe = Farbe.values();
    for(Farbe farbe : bluetenfarbe){
      CheckBox cb = new CheckBox(farbe.name());
      cb.setPadding(insets);
      bluetenfarbeButtons.add(cb);
    }
    flowPaneBluetenfarbe.getChildren().addAll(bluetenfarbeButtons);

    //Bluetenform
    Bluetenform[] bluetenforms = Bluetenform.values();
    ToggleGroup bluetenGroup = new ToggleGroup();
    for(Bluetenform form : bluetenforms){
      RadioButton rb = new RadioButton(form.name());
      rb.setPadding(insets);
      rb.setToggleGroup(bluetenGroup);
      bluetenformButtons.add(rb);
    }
    flowPaneBluetenform.getChildren().addAll(bluetenformButtons);

    //Fruchtfarbe
    Farbe[] fruchtfarbe = Farbe.values();
    for(Farbe farbe : fruchtfarbe){
      CheckBox cb = new CheckBox(farbe.name());
      cb.setPadding(insets);
      fruchtfarbeButtons.add(cb);
    }
    flowPaneFruchtfarbe.getChildren().addAll(fruchtfarbeButtons);
    //Wuchshöhe
    Wuchshoehe[] wuchshoehes = Wuchshoehe.values();
    ToggleGroup wuchsGroup = new ToggleGroup();
    for(Wuchshoehe hoehe : wuchshoehes){
      RadioButton rb = new RadioButton(hoehe.name());
      rb.setPadding(insets);
      rb.setToggleGroup(wuchsGroup);
      wuchshoeheButtons.add(rb);
    }
    flowPaneWuchshoehe.getChildren().addAll(wuchshoeheButtons);
  }

  List<RadioButton> bodenartButtons = new ArrayList<>();
  List<RadioButton> gewaechsartButtons = new ArrayList<>();
  List<CheckBox> bluetenfarbeButtons = new ArrayList<>();
  List<RadioButton> bluetenformButtons = new ArrayList<>();
  List<RadioButton> wuchshoeheButtons = new ArrayList<>();
  List<CheckBox> fruchtfarbeButtons = new ArrayList<>();

}


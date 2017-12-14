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
    import de.hhn.se.pmt.garten.Pflanze;
    import de.hhn.se.pmt.garten.Wuchshoehe;
    import de.hhn.se.pmt.garten.dao.DAOFactory;
    import de.hhn.se.pmt.garten.dao.PflanzeDAO;
    import de.hhn.se.pmt.garten.impl.PflanzeDAOImpl;
    import javafx.fxml.FXML;
    import javafx.geometry.Insets;
    import javafx.scene.control.Alert;
    import javafx.scene.control.Button;
    import javafx.scene.control.CheckBox;
    import javafx.scene.control.CheckMenuItem;
    import javafx.scene.control.ComboBox;
    import javafx.scene.control.Dialog;
    import javafx.scene.control.Label;
    import javafx.scene.control.RadioButton;
    import javafx.scene.control.SelectionMode;
    import javafx.scene.control.TextArea;
    import javafx.scene.control.TextField;
    import javafx.scene.control.ToggleButton;
    import javafx.scene.control.ToggleGroup;
    import javafx.scene.layout.FlowPane;
    import org.orm.PersistentException;
    import org.orm.PersistentTransaction;

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
  private TextField textFieldBluezeitraum;

  @FXML
  private TextField textFieldBluehdauer;

  @FXML
  private TextField textFieldLebensdauer;

  @FXML
  private TextField textFieldAnpflanzzeitraum;

  @FXML
  private TextField textFieldTags;

  @FXML
  private Button buttonSave;

  @FXML
  void initialize() {
    assert textFieldBotName != null : "fx:id=\"textFieldBotName\" was not injected: check your FXML file 'plant.fxml'.";
    assert textFieldDeutName != null : "fx:id=\"textFieldDeutName\" was not injected: check your FXML file 'plant.fxml'.";
    assert textAreaBeschreibung != null : "fx:id=\"textAreaBeschreibung\" was not injected: check your FXML file 'plant.fxml'.";
    assert toogleButtonAngepflanzt != null : "fx:id=\"toogleButtonAngepflanzt\" was not injected: check your FXML file 'plant.fxml'.";
    assert toogleButtonDuftend != null : "fx:id=\"toogleButtonDuftend\" was not injected: check your FXML file 'plant.fxml'.";
    assert textFieldBluezeitraum != null : "fx:id=\"textfFieldBluezeitraum\" was not injected: check your FXML file 'plant.fxml'.";
    assert textFieldBluehdauer != null : "fx:id=\"textfFieldBluehdauer\" was not injected: check your FXML file 'plant.fxml'.";
    assert textFieldLebensdauer != null : "fx:id=\"textfFieldLebensdauer\" was not injected: check your FXML file 'plant.fxml'.";
    assert textFieldAnpflanzzeitraum != null : "fx:id=\"textfFieldAnpflanzzeitraum\" was not injected: check your FXML file 'plant.fxml'.";
    assert textFieldTags != null : "fx:id=\"textfFieldTags\" was not injected: check your FXML file 'plant.fxml'.";
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
    bluetenformButtons.get(0).setSelected(true);
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
    wuchshoeheButtons.get(0).setSelected(true);
    flowPaneWuchshoehe.getChildren().addAll(wuchshoeheButtons);

    buttonSave.setOnAction(event -> onButtonSaveClick());

    toogleButtonAngepflanzt.setOnAction(event -> {
      if(toogleButtonAngepflanzt.isSelected()){
        toogleButtonAngepflanzt.setText("angepflanzt");
      }else {
        toogleButtonAngepflanzt.setText("nicht angepflanzt");
      }
    });
    toogleButtonDuftend.setOnAction(event -> {
      if(toogleButtonDuftend.isSelected()){
        toogleButtonDuftend.setText("duftend");
      }else {
        toogleButtonDuftend.setText("nicht duftend");
      }
    });
  }

  List<RadioButton> bodenartButtons = new ArrayList<>();
  List<RadioButton> gewaechsartButtons = new ArrayList<>();
  List<CheckBox> bluetenfarbeButtons = new ArrayList<>();
  List<RadioButton> bluetenformButtons = new ArrayList<>();
  List<RadioButton> wuchshoeheButtons = new ArrayList<>();
  List<CheckBox> fruchtfarbeButtons = new ArrayList<>();


  private void onButtonSaveClick(){
    Bodenart bodenart = getBodenart();

    if(checkEntryValues()){
      Alert alert = new Alert(Alert.AlertType.WARNING);
      alert.setTitle("Warnung");
      alert.setHeaderText("Fehler beim Speichern der Daten");
      alert.setContentText("Es wurden nicht alle Felder mit * ausgefüllt");
      alert.showAndWait();
    }else {

      Pflanze pflanze = new Pflanze();

      pflanze.setDeutscherName(textFieldDeutName.getText());
      pflanze.setBotanischerName(textFieldBotName.getText());
      pflanze.setBodenart(getBodenart());
      pflanze.setWuchshoehe(getWuchshoehe());
      pflanze.setGewaechsart(getGewaechsart());
      pflanze.setBluetenform(getBluetenform());
      pflanze.setFruchtfarbe(getFruchtfarbe());
      pflanze.setBluetenfarbe(getBluetenfarbe());

      pflanze.setBeschreibung(textAreaBeschreibung.getText());
      pflanze.setBluehdauer(textFieldBluehdauer.getText());
      pflanze.setBluehzeitraum(textFieldBluezeitraum.getText());
      int valLebensdauer = Integer.valueOf(textFieldLebensdauer.getText().equals("") ? "0" : textFieldLebensdauer.getText());
      pflanze.setLebensdauer(valLebensdauer);
      pflanze.setAnpflanzzeitraum(textFieldAnpflanzzeitraum.getText());
      pflanze.setDuftend(toogleButtonDuftend.isSelected());
      pflanze.setAngepflanztAufBuga(toogleButtonAngepflanzt.isSelected());
      pflanze.setBewertung(0);

      System.out.println(pflanze);
      DAOFactory lDAOFactory = DAOFactory.getDAOFactory();
      PflanzeDAO pflanzeDAO = lDAOFactory.getPflanzeDAO();
      try {
        PersistentTransaction t = de.hhn.se.pmt.garten.BUGAPflanzenLexikonPersistentManager.instance().getSession().beginTransaction();
        pflanzeDAO.save(pflanze);
        t.commit();
        System.out.println("Erfolgreich gespeichert");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText("Die Daten wurde erfolgreich gespeichert!");
        alert.showAndWait();

      } catch (Exception e) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Fehler");
        alert.setHeaderText("Fehler beim Schreiben der Daten in die Datenbank");
        alert.setContentText(e.toString());
        e.printStackTrace();
        alert.showAndWait();
      }
    }
  }

  private boolean checkEntryValues(){
    boolean vaildBluete = getBluetenfarbe().length == 0;
    boolean vaildFrucht  = getFruchtfarbe().length == 0;
    boolean vaildDeuName = textFieldDeutName.getText().equals("");
    boolean vaildBotName = textFieldBotName.getText().equals("");

    System.out.println(vaildBluete);
    System.out.println(vaildFrucht);
    System.out.println(vaildBotName);
    System.out.println(vaildDeuName);
    return vaildBluete || vaildFrucht || vaildDeuName || vaildBotName;
  }


  private Farbe[] getBluetenfarbe(){
    ArrayList<Farbe> farbes = new ArrayList<>();
    for(CheckBox cb: bluetenfarbeButtons){
      if(cb.isSelected()){
        farbes.add(Farbe.valueOf(cb.getText()));
      }
    }

    Farbe[] farbArray = new Farbe[farbes.size()];
    for(int i=0; i<farbArray.length-1;i++){
      farbArray[i] = farbes.get(i);
    }
    return farbArray;
  }

  private Farbe[] getFruchtfarbe(){
    ArrayList<Farbe> farbes = new ArrayList<>();
    for(CheckBox cb: fruchtfarbeButtons){
      if(cb.isSelected()){
        farbes.add(Farbe.valueOf(cb.getText()));
      }
    }

    Farbe[] farbArray = new Farbe[farbes.size()];
    for(int i=0; i<farbArray.length-1;i++){
      farbArray[i] = farbes.get(i);
    }
    return farbArray;
  }

  private Bodenart getBodenart(){
    for(RadioButton rb : bodenartButtons){
      if(rb.isSelected()){
        return Bodenart.valueOf(rb.getText());
      }
    }
    return null;
  }

  private Gewaechsart getGewaechsart(){
    for(RadioButton rb : gewaechsartButtons){
      if(rb.isSelected()){
        return Gewaechsart.valueOf(rb.getText());
      }
    }
    return null;
  }

  private Bluetenform getBluetenform(){
    for(RadioButton rb : bluetenformButtons){
      if(rb.isSelected()){
        return Bluetenform.valueOf(rb.getText());
      }
    }
    return null;
  }

  private Wuchshoehe getWuchshoehe(){
    for(RadioButton rb: wuchshoeheButtons){
      if(rb.isSelected()){
        return Wuchshoehe.valueOf(rb.getText());
      }
    }
    return null;
  }
}


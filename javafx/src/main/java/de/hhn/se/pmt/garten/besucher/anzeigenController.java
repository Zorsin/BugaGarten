package de.hhn.se.pmt.garten.besucher;

import de.hhn.se.pmt.garten.Pflanze;
import de.hhn.se.pmt.garten.dao.DAOFactoryImpl;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import org.orm.PersistentException;

import java.net.URL;
import java.util.ResourceBundle;

public class anzeigenController implements Initializable {

  @FXML
  private ChoiceBox<String> cbauswahl;

  @FXML
  private Label lblbotanisch;

  @FXML
  private Label lbldeutsch;

  @FXML
  private Label lblbeschreibung;

  @FXML
  private Label lblbluehdauer;

  @FXML
  private Label lbllebensdauer;

  @FXML
  private Label lblbodenart;

  @FXML
  private Label lblanpflanzzeitraum;

  @FXML
  private Label lblwuchshoehe;

  @FXML
  private Label lblduftend;

  @FXML
  private Label lblgewaechsart;

  @FXML
  private Label lblbluetenform;

  @FXML
  private Label lblbewertung;

  @FXML
  private CheckBox cbangepflanzt;

  @FXML
  private CheckBox cbduftend;

  @Override
  public void initialize(URL location, ResourceBundle resources) {

    try {

      Pflanze[] plantList = DAOFactoryImpl.getDAOFactory().getPflanzeDAO().listPflanzeByQuery(null, "DeutscherName");

      String[] nameList = new String[plantList.length];
      for (int i = 0; i < nameList.length; i++) nameList[i] = plantList[i].getDeutscherName();
      cbauswahl.setItems(FXCollections.observableArrayList(nameList));
      cbauswahl.getSelectionModel().selectedIndexProperty().addListener(event -> {

        Pflanze p = plantList[cbauswahl.getSelectionModel().getSelectedIndex()];
        cbduftend.setText("");
        cbangepflanzt.setText("");
        cbduftend.setStyle("-fx-opacity: 1");
        cbangepflanzt.setStyle("-fx-opacity: 1");

        lblbotanisch.setText(p.getBotanischerName());
        lbldeutsch.setText(p.getDeutscherName());
        lblbeschreibung.setText(p.getBeschreibung());
        lblbluehdauer.setText(p.getBluehdauer());
        lbllebensdauer.setText(p.getLebensdauer() + "");
        lblbodenart.setText(p.getBodenart() + "");
        lblanpflanzzeitraum.setText(p.getAnpflanzzeitraum());
        lblwuchshoehe.setText(p.getWuchshoehe() + "");
        cbduftend.setSelected(p.getDuftend());
        lblgewaechsart.setText(p.getGewaechsart() + "");
        lblbluetenform.setText(p.getBluetenform() + "");
        cbangepflanzt.setSelected(p.getAngepflanztAufBuga());
        lblbewertung.setText(p.getBewertung() + "");

      });
      cbauswahl.getSelectionModel().selectFirst();
    } catch (Exception e) {

      Alert alert = new Alert(Alert.AlertType.ERROR, "Fehler beim Zugriff auf die Datenbank.", ButtonType.CLOSE);
      alert.showAndWait();
      if (alert.getResult() == ButtonType.CLOSE) alert.close();
    }
  }
}
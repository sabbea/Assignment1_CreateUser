package Controller;

/**
 * Created by Abhishek on 7/25/2016.
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import Model.Hospital;
import View.HospitalListJavaFXView;


public class HospitalListController {
    @FXML
    private TextField searchKey;
    @FXML
    private TableView<Hospital> hospitalTable;
    @FXML
    private TableColumn<Hospital, String> nameColumn;
    @FXML
    private TableColumn<Hospital, String> streetAddressColumn;
    @FXML
    private TableColumn<Hospital, String> cityColumn;
    @FXML
    private TableColumn<Hospital, String> stateColumn;
    @FXML
    private TableColumn<Hospital, String> zipColumn;
    @FXML
    private TableColumn<Hospital, String> latitudeColumn;
    @FXML
    private TableColumn<Hospital, String> longitudeColumn;
    @FXML
    private TableColumn<Hospital, String> phoneNoColumn;
    @FXML
    private TableColumn<Hospital, String> photoColumn;

    // Reference to the main application.
    private HospitalListJavaFXView hospitalApp;

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        streetAddressColumn.setCellValueFactory(cellData -> cellData.getValue().streetAddressProperty());
        cityColumn.setCellValueFactory(cellData -> cellData.getValue().cityProperty());
        stateColumn.setCellValueFactory(cellData -> cellData.getValue().stateProperty());
        zipColumn.setCellValueFactory(cellData -> cellData.getValue().zipProperty());
        latitudeColumn.setCellValueFactory(cellData -> cellData.getValue().latitudeProperty());
        longitudeColumn.setCellValueFactory(cellData -> cellData.getValue().longitudeProperty());
        phoneNoColumn.setCellValueFactory(cellData -> cellData.getValue().phoneNoProperty());
        photoColumn.setCellValueFactory(cellData -> cellData.getValue().photoProperty());
    }

    public void setHospitalApp(HospitalListJavaFXView hospitalApp) {
        this.hospitalApp = hospitalApp;

        // Add observable list data to the table
        hospitalTable.setItems(hospitalApp.getHospitalData());
    }

    //search logic and update table view for the result
    public void handleEnterPressed(KeyEvent event) {
        String latitude = "";
        String longitude = "";
        String key = "";
        boolean coordinate = true;
        Hospital hospitalKey;
        ObservableList<Hospital> searchHospitalResultTable = FXCollections.observableArrayList();

        if (event.getCode() == KeyCode.ENTER) {
            key = searchKey.getText();
            //first add logic to check if key is coordinate or others
            //if key is empty
            if (key.equals("")) {
                hospitalTable.setItems(hospitalApp.getHospitalData());
            }
            //if coordinate
            if (coordinate) {
                latitude = key.split(",")[0];
                longitude = key.split(",")[1];
                System.out.println(latitude + " " + longitude);
                hospitalKey = new Hospital(latitude, longitude);
                if (hospitalApp.getHospitalBSTree().contains(hospitalKey)) {
                    //create the new observable list and add the result to this list
                    searchHospitalResultTable.add(hospitalApp.getHospitalBSTree().get(hospitalKey));
                    //set new result of search to observable list
                    // hospitalApp.setHospitalData(searchHospitalResultTable);
                    //update view
                    hospitalTable.setItems(searchHospitalResultTable);
                } else {
                    //reset the observable list
                    searchHospitalResultTable.clear();
                    //set new result of search to observable list
                    //hospitalApp.setHospitalData(searchHospitalResultTable);
                    //update view
                    hospitalTable.setItems(searchHospitalResultTable);
                }
            }
            //if hospital name
            //if phone number
            //if address

        }
    }
}
package Tests;

import static org.junit.Assert.*;

/**
 * Created by Abhishek on 7/27/2016.
 */
import Model.Hospital;
import Model.ReadExcelFile;
import org.junit.Test;
import Utility.BST;

import java.util.List;


public class ReadExcelFileTest {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String latitude;
    private String longitude;
    private String phoneNo;
    private String photo;

    @Test
    public void excelReader() throws Exception {

        BST<Hospital> hospitalBSTree = new BST<Hospital>();
        List hospitalList = ReadExcelFile.excelReader("HospitalList.xls");
        //ReadExcelFile.showExcelData(hospitalList);
        System.out.println(hospitalList.size());
        for (int i = 0; i < hospitalList.size(); i++) {
            List record = (List) hospitalList.get(i);
            System.out.println(record);
            //System.out.println(record);
            //System.out.println(record.get(col));
            name = String.valueOf(record.get(0));
            streetAddress = String.valueOf(record.get(1));
            //System.out.println(name + "/t" + streetAddress);
            city = String.valueOf(record.get(2));
            state = String.valueOf(record.get(3));
            zip = String.valueOf(record.get(4));
            latitude = String.valueOf(record.get(5));
            longitude = String.valueOf(record.get(6));
            photo = String.valueOf(record.get(7));

        }

    }

}
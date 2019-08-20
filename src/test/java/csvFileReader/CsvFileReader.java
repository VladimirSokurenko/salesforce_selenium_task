package csvFileReader;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.*;

public class CsvFileReader {


        public HashMap<String,String> getTestData() throws Exception {
            CsvFileReader csvFileReader = new CsvFileReader();

            ArrayList<String> arr = csvFileReader.getElementsAsArray();

            HashMap<String, String> testingData = new HashMap<>();
            testingData.put("homepage logo", arr.get(0));
            testingData.put("login button", arr.get(1));
            testingData.put("production button", arr.get(2));
            testingData.put("username field", arr.get(4));
            testingData.put("username", arr.get(3));
            testingData.put("password", arr.get(5));
            testingData.put("password field", arr.get(6));
            testingData.put("logIn button", arr.get(7));
            testingData.put("approve button", arr.get(8));
            testingData.put("data explorer block", arr.get(9));
            testingData.put("last used app", arr.get(10));
            testingData.put("solutions", arr.get(11));
            testingData.put("accounts", arr.get(12));
            testingData.put("campaigns", arr.get(13));
            testingData.put("contacts", arr.get(14));
            testingData.put("export selections button", arr.get(15));
            testingData.put("google button", arr.get(16));
            testingData.put("email", arr.get(17));
            testingData.put("email field", arr.get(18));
            testingData.put("next button", arr.get(19));
            testingData.put("email password", arr.get(20));
            testingData.put("email password filed", arr.get(21));
            testingData.put("finish button", arr.get(22));
            testingData.put("allow access button", arr.get(23));
            testingData.put("radio button google", arr.get(24));
            testingData.put("folder name field", arr.get(25));
            testingData.put("submit button", arr.get(26));
            testingData.put("OK modal button", arr.get(27));
            testingData.put("view files button", arr.get(28));
            testingData.put("go to folder button", arr.get(29));
            testingData.put("accounts file", arr.get(30));
            testingData.put("campaign file", arr.get(31));
            testingData.put("contacts file", arr.get(32));
            testingData.put("solutions file", arr.get(33));
            testingData.put("last used app file", arr.get(34));

                return testingData;
        }

        public ArrayList<String> getElementsAsArray() throws Exception{

            String fileFile = "/home/alexander/IdeaProjects/salesforce_selenium_test/testing_data.csv";
            String[] test;

            CSVReader reader = new CSVReader(new FileReader(fileFile));

            ArrayList<String> arr = new ArrayList<String>();


            while ((test = reader.readNext())!= null){

                for (int i = 0; i < 35 ; i++) {
                    arr.add(test[i]);
                }
            }

            return arr;
        }

}

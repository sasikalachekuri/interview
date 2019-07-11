package Interview_topics;
import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class DataProviderDemo {


   private String filePath = "C:\\Users\\amrit\\Desktop\\Data.xlsx";
    private String sheetName = "demo";
    private String filePath1 = "C:\\Users\\amrit\\Desktop\\TestData.xlsx";
    private String sheetName1 = "Contacts";

    @Test(dataProvider = "excelData")
    

   public void read(String Title, String Firstname,String lastname) {
  	 System.out.println(Title);
    
    }

    @DataProvider(name="excelData")
    public Object[][] readExcel() throws InvalidFormatException, IOException {
        return ExcelReader.readExcel(filePath1, sheetName1);
    }

}
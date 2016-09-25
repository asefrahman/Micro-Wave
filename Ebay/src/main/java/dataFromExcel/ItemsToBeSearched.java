package dataFromExcel;

import java.io.IOException;
import utility.DataReader;



/**
 * Created by Asef on 9/24/2016.
 */
public class ItemsToBeSearched {
    DataReader dr = new DataReader();
    public String [] getData()throws IOException {
        String path = System.getProperty("user.dir")+"/data/file1.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}


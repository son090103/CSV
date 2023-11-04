
package Repository;

import Model.CSV;
import java.util.ArrayList;
import DataAcess.CSVFomatDAO;

public class FormatCsvRepository implements IFormatCsvRepository{
    
    @Override
    public void importFile(ArrayList<CSV> list) {
        CSVFomatDAO.Instance().importFile(list);
    }

    @Override
    public void formatAddress(ArrayList<CSV> list) {
        CSVFomatDAO.Instance().formatAddress(list);
    }

    @Override
    public void formatName(ArrayList<CSV> list) {
        CSVFomatDAO.Instance().formatName(list);
    }

    @Override
    public void exportFile(ArrayList<CSV> list) {
        CSVFomatDAO.Instance().exportFile(list);
    }

    @Override
    public void print(ArrayList<CSV> list) {
        CSVFomatDAO.Instance().print(list);
    }
    
}

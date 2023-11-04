
package Repository;

import Model.CSV;
import java.util.ArrayList;

public interface IFormatCsvRepository {
    void importFile(ArrayList<CSV> lits);

    void formatAddress(ArrayList<CSV> lits);

    void formatName(ArrayList<CSV> lits);

    void exportFile(ArrayList<CSV> lits);

    void print(ArrayList<CSV> lits);
}


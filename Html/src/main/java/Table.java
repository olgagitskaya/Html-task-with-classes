import java.util.ArrayList;

/**
 * Created by user on 02.04.2017.
 */
public class Table
{
    ArrayList<Row> rowList = new ArrayList<Row>();
    int numberOfRows = 0;
    int numberOfCells = 0;

    public Table(int numberOfRows, int numberOfCells)
    {
        this.numberOfRows = numberOfRows;
        this.numberOfCells = numberOfCells;

        for(int i = 0; i<numberOfRows; i++)
        {
                rowList.add(new Row((i==0),numberOfCells));
        }
    }

    public String toString()
    {
        StringBuilder buf = new StringBuilder();
        buf.append("<table>\n");
        for(Row row:rowList)
        {
            buf.append(row.toString());
        }
        buf.append("</table>\n");
        String html = buf.toString();
        return html;
    }
}

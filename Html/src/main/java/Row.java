import java.util.ArrayList;

/**
 * Created by user on 02.04.2017.
 */
public class Row
{
    ArrayList<Cell> cellList = new ArrayList<Cell>();
    boolean isHeader;

    public Row(boolean isHeader, int numberOfCells)
    {
        for(int i=0;i<numberOfCells;i++)
        {
            if(isHeader)
            {
                cellList.add(new Cell(true,("Column"+i)));
            }
            else
            {
                String random = Math.random()+"";
                cellList.add(new Cell(false,random));
            }
        }
    }

    public String toString()
    {
        StringBuilder buf = new StringBuilder();
        buf.append("<tr>\n");
        for(Cell cell:cellList)
        {
            buf.append(cell.toString());
        }
        buf.append("</tr>\n");
        String html = buf.toString();
        return html;
    }
}

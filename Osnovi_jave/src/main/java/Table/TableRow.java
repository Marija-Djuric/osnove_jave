package Table;

import java.util.ArrayList;

public class TableRow {
    private ArrayList<String> cellRow = new ArrayList<>();

    public void addRowCell (String cell2) {
        cellRow.add(cell2);
    }
    public boolean check (String neki) {
        for (int i = 0; i < cellRow.size(); i++) {
            if (neki.equals(cellRow.get(i))) {
                return true;
            }
        } return  false;
    }
    public void stampa ()  {
        for (int i = 0; i < cellRow.size(); i++) {
            System.out.print("\t\t"+ cellRow.get(i)+"\t\t");
        }
        System.out.println();
    }
    public void printHTML () {
        System.out.println("<tr>");
        for (int i = 0; i < cellRow.size(); i++) {
            System.out.println("<th>"+ cellRow.get(i)+"<th>");
        }
        System.out.println("<tr>");
    }
    }
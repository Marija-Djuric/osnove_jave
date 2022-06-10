package Table;

import java.util.ArrayList;

public class TableHeader {
    private ArrayList<String> cellHeader = new ArrayList<>();

    public TableHeader() {
    }

    public void addHeaderCell (String cell1) {
        cellHeader.add(cell1);
    }

    public ArrayList<String> getCellHeader() {
        return cellHeader;
    }

    public void setCellHeader(ArrayList<String> cellHeader) {
        this.cellHeader = cellHeader;
    }

    public  void stampa () {
        for (int i = 0; i < cellHeader.size(); i++) {
            System.out.print("\t\t"+ cellHeader.get(i)+"\t\t|");
        }
        System.out.println();
    }
    public void printHTML () {
        System.out.println("<tr>");
        for (int i = 0; i < cellHeader.size(); i++) {
            System.out.println("<th>"+ cellHeader.get(i)+"<th>");
        }
        System.out.println("<tr>");
    }
}

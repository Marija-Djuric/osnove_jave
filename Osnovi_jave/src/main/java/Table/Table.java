package Table;

import java.util.ArrayList;

public class Table {
    private TableHeader header;
    private ArrayList<TableRow>rows=new ArrayList<>();
    private int numberOfRowsPerPage;

    public Table(TableHeader header, int numberOfRowsPerPage) {
        this.header = header;
        this.numberOfRowsPerPage=numberOfRowsPerPage;
    }

    public void setHeader(TableHeader header) {
        this.header = header;
    }

    public int getNumberOfRowsPerPage() {
        return numberOfRowsPerPage;
    }

    public void setNumberOfRowsPerPage(int numberOfRowsPerPage) {
        this.numberOfRowsPerPage = numberOfRowsPerPage;
    }

    public void addNew (TableRow newRow) {
        rows.add(newRow);
    }
    public void filter (String tekst2) {
        header.stampa();
        for (int i = 0; i < rows.size(); i++) {
            if (rows.get(i).check(tekst2)) {
                rows.get(i).stampa();
            }
        }
    }
    public void paginator () {
        for (int i = 1; i <= rows.size()/numberOfRowsPerPage; i++) {
            System.out.println("| "+i+" ");
        }
    }
    public void stampa () {
        this.header.stampa();
        for (int i = 0; i < rows.size(); i++) {
            this.rows.get(i).stampa();
}
    }
    public void printHTML () {
        System.out.println("<table>");
        System.out.println("<thead>");
        header.printHTML();
        System.out.println("<thead>");
        System.out.println("<tbody>");
        for (int i = 0; i < rows.size(); i++) {
            rows.get(i).printHTML();
        }
        System.out.println("<tbody>");
        System.out.println("<table>");
    }

}
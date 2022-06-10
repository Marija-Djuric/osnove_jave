package Table;

public class MainTable {
    //5. (Za vezbanje)
    //Kreirati klasu TableHeader koja ima:
    //niz celija u headeru tabele. Niz je niz stringova
    //metodu addHeaderCell, koja dodaje polje u niz
    //metodu za stampu koja stampa celije kao u primeru:
    //celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
    //(Objasnjenje \t je specijalan karakter tab koji ce da sluzi da lakse poravnate kolone)
    //metodu printHTML, koja sluzi da stampa header u HTML formatu.
    //header se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <th></th>
    //primer:
    //<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
    //Kreirati klasu TableRow koja ima:
    //niz celija u telu tabele. Niz je niz stringova
    //metodu addRowCell, koja dodaje polje u niz
    //metodu za stampu koja stampa celije kao u primeru:
    //celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
    //metodu printHTML, koja sluzi da stampa red u HTML formatu.
    //red se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <td></td>
    //primer:
    //<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
    //Kreirati klasu Table koja ima:
    //header tabele
    //niz redova. Niz je niz TableRow elementa
    //setter za header
    //metodu za dodvanje novog reda u tablu
    //metodu za stampu koja stampa header i redove tabele
    //metodu za stampu HTML-a tabele.Primer
    //<table>
    //<thead>
    //<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
    //</thead>
    //<tbody>
    //<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
    //<tr><td>Petar</td><td>Petrovic</td><td>29</td></td>
    //<tr><td>Darko</td><td>Darkovic</td><td>30</td></td>
    //</tbody>
    //</table>
    //U mainu kreirati jednu tabelu sa 3x3 (3 kolone i 3 reda) i odstampajte je obicno i u html-u.
    //(DOPUNA 1)
    //U klasi TableRow dodajte metodu koja proverava da li se neki prosledjeni tekst sadrzi u nekoj celiji tog reda. Metoda vraca true ako postoji
    //U klasi Table dodajte metodu filter, koja sluzi da filtrira redove tabele u odnosu na prosledjeni tekst. Metoda stampa tabelu, ali samo redove koji sadrze trazeni tekst.
    //Primer izvrsenja: za filter “Milan” stampa se
    //First Name 	|	Last Name 	| 	Age	|
    //Milan			Jovanovic		27
    //(DOPUNA 2)
    //U klasi Table dodajte atribut broj redova po strani (najcesce se koristi 5, 10, 25 ili 100 cisto da navedem neki primer).
    //Dodati metodu koja stampa paginator (Sta je paginator?). Paginator stampa koliko strana imamo za redove u tabeli.
    //Npr: ako imamo u tabeli 50 redova i broj redova po strani je 10 paginator se stampa
    //| 1 | 2 | 3 | 4 | 5
    //Zatim izmenite metodu za stampu tako da prima parametar redni broj strane na osnovu koje tabela prikazuje samo elemente te strane. Naravno maksimalno broj elemenata po strani.
    //Primer ako se pozove metoda stampaj za stranu 3 i broj redova po strani je 5, treba da se stampaju redovi od indeksa 10 do 14.
    //Ispod redova tabele odstampajte paginator.
    //Primer tabele
    //First Name 	|	Last Name 	| 	Age	|
    //Milan			Jovanovic		27
    //Marko 			Markovic		30
    //Darko 			Darkovic		60
    //Broj redova po strani [3]
    //| 1 | 2 | 3 | 4 | ===> Ovo je paginator.
    public static void main(String[] args) {
        TableHeader jedan = new TableHeader();
        jedan.addHeaderCell("First Name");
        jedan.addHeaderCell("Last Name");
        jedan.addHeaderCell("Age");

     //   jedan.stampa();
     //   jedan.printHTML();

        TableRow prva = new TableRow();
        prva.addRowCell("Milos");
        prva.addRowCell("Milosevic");
        prva.addRowCell("23");

    //    prva.stampa();
    //    prva.printHTML();

        TableRow druga = new TableRow();
        druga.addRowCell("Milica");
        druga.addRowCell("Milic");
        druga.addRowCell("31");

    //    druga.stampa();
    //    druga.printHTML();

        TableRow treca = new TableRow();
        treca.addRowCell("Jovana");
        treca.addRowCell("Jovic");
        treca.addRowCell("18");

    //    treca.stampa();
    //    treca.printHTML();

        Table newTable = new Table(jedan,3);
        newTable.addNew(prva);
        newTable.addNew(druga);
        newTable.addNew(treca);

        newTable.stampa();
        System.out.println();
        newTable.printHTML();

        newTable.filter("Jovana");

        newTable.paginator();
    }
}

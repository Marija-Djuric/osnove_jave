package KeyValuePair_UrlBuilder;

public class MainUrlBuilder {
    public static void main(String[] args) {

        KeyValuePair prvi = new KeyValuePair("firstName","Jovan");
        KeyValuePair drugi = new KeyValuePair("lastName","Jovanovic");
        KeyValuePair treci = new KeyValuePair("age","33");

        UrlBuilder novi = new UrlBuilder("https://www.facebook.com");

        System.out.println(novi.generateLink());

        novi.addKeyValuePair(prvi);
        novi.addKeyValuePair(drugi);
        novi.addKeyValuePair(treci);

        System.out.println(novi.generateLink());

        novi.deleteKeyValuePair("age");

        System.out.println(novi.generateLink());
    }
}

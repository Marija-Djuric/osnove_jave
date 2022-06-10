package KeyValuePair_UrlBuilder;

import java.util.ArrayList;

public class UrlBuilder {
    private String baseUrl;
    private ArrayList<KeyValuePair>keyValuePairs=new ArrayList<>();

    public UrlBuilder(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
    public void addKeyValuePair (KeyValuePair k) {
        keyValuePairs.add(k);
    }
    public void deleteKeyValuePair (String key1) {
        for (int i = 0; i < keyValuePairs.size(); i++) {
            if (key1.equals(keyValuePairs.get(i).getKey())) {
                keyValuePairs.remove(i);
            }
        }
    }
    public String generateLink () {
        if (keyValuePairs.size()<=0) {
            return baseUrl;
        }
        String pairs="";
        for (int i = 0; i < keyValuePairs.size(); i++) {
            pairs=pairs+"&"+keyValuePairs.get(i).generateParamString();
        }
        return baseUrl+"?"+pairs;
    }
}

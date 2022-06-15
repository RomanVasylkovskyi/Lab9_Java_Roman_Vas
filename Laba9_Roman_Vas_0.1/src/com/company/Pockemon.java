package com.company;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.Comparator;



@Generated("jsonschema2pojo")
public class Pockemon {

    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;

    /**
     * No args constructor for use in serialization
     */
    public Pockemon() {
    }

    /**
     * @param name
     * @param url
     */
    public Pockemon(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pockemon.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null) ? "<null>" : this.url));
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public static Comparator<Pockemon> byNameAsc = Comparator.comparing(o -> o.name);
    public static Comparator<Pockemon> byNameDesc = (o1, o2) -> o2.name.compareTo(o1.name);
}

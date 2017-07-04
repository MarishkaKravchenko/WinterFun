package network.responseModels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class House {

    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("culture")
    @Expose
    public String culture;
    @SerializedName("born")
    @Expose
    public String born;
    @SerializedName("died")
    @Expose
    public String died;
    @SerializedName("titles")
    @Expose
    public List<String> titles = null;
    @SerializedName("aliases")
    @Expose
    public List<String> aliases = null;
    @SerializedName("father")
    @Expose
    public String father;
    @SerializedName("mother")
    @Expose
    public String mother;
    @SerializedName("spouse")
    @Expose
    public String spouse;
    @SerializedName("allegiances")
    @Expose
    public List<String> allegiances = null;
    @SerializedName("books")
    @Expose
    public List<String> books = null;
    @SerializedName("povBooks")
    @Expose
    public List<String> povBooks = null;
    @SerializedName("tvSeries")
    @Expose
    public List<String> tvSeries = null;
    @SerializedName("playedBy")
    @Expose
    public List<String> playedBy = null;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
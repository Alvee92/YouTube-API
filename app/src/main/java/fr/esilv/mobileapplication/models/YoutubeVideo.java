package fr.esilv.mobileapplication.models;

import com.google.api.client.util.DateTime;

/**
 * Created by Hakim on 26/02/2016.
 */
public class YoutubeVideo {

    private String Title;
    private String Description;
    private String ThumbnailsURL;
    private DateTime PublishedAt;
    private String Id;


    public String getTitle() {return Title;}
    public String getDescription() {return Description;}
    public DateTime getPublishedAt() {return PublishedAt;}
    public String getId() {return Id;}
    public String getThumbnailsURL() {return ThumbnailsURL;}

    public void setTitle(String title) {this.Title = title;}
    public void setDescription(String description) {this.Description=description;}
    public void setPublishedAt(DateTime publishedAt) {this.PublishedAt=publishedAt;}
    public void setId(String id) {this.Id=id;}
    public void setThumbnailsURL(String thumbnailsURL) {this.ThumbnailsURL=thumbnailsURL;}

}

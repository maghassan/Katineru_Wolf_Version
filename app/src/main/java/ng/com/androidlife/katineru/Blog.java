package ng.com.androidlife.katineru;

/**
 * Created by aminu on 8/10/17.
 */

public class Blog {

    private String title;
    private String desc;
    private String image;
    private String recipes;
    private String username;

    public Blog(){

    }

    public Blog(String title, String desc, String image, String username, String recipes) {
        this.title = title;
        this.desc = desc;
        this.image = image;
        this.recipes = recipes;
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String setDesc() {
        return desc;
    }

    public String setImage() {
        return image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRecipes() {
        return recipes;
    }

    public void setRecipes(String recipes) {
        this.recipes = recipes;
    }
}

package BL.Hierarchy;

import java.util.ArrayList;

import Contracts.ISubcategory;

/**
 * Created by Edgar on 8/06/2017.
 */

public class Item implements ISubcategory {

    private int Icon;
    private String Name;
    private String PageName;
    private ArrayList<ISubcategory> myList;

    private String url;

    public Item() {
        super();
    }

    public Item(int icon, String name, String pageName) {
        super();
        this.Icon = icon;
        this.Name = name;
        this.PageName = pageName;
    }

    public int getIcon() {
        return Icon;
    }

    @Override
    public ArrayList<ISubcategory> getList() {
        return this.myList;
    }

    public String getName() {
        return Name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void Add(ISubcategory category) {

        myList.add(category);
    }

}

package BL.Hierarchy;

import java.util.ArrayList;

import Contracts.ISubcategory;

/**
 * Created by Edgar on 11/06/2017.
 */

public class SubCategoryComposite implements ISubcategory {

    private int Icon;
    private String Name;
    private String PageName;
    private ArrayList<ISubcategory> myList;

    public SubCategoryComposite(int icon, String name, String pageName) {

        this.Icon = icon;
        this.Name = name;
        this.PageName = pageName;
        this.myList = new ArrayList<>();
    }

    @Override
    public void Add(ISubcategory category) {

        myList.add(category);
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public int getIcon() {
        return this.Icon;
    }

    @Override
    public ArrayList<ISubcategory> getList() {
        return this.myList;
    }
}

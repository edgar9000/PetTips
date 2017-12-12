package Contracts;

import java.util.ArrayList;

/**
 * Created by Edgar on 11/06/2017.
 */

public interface ISubcategory {

    public void  Add(ISubcategory category);

    public String getName();

    public int getIcon();

    public ArrayList<ISubcategory> getList();
}

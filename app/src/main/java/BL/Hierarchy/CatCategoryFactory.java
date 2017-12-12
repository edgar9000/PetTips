package BL.Hierarchy;

import Contracts.ACategoryCreator;
import Contracts.ISubcategory;
import illumicon.pettipsu.R;

/**
 * Created by Edgar on 11/06/2017.
 */

public class CatCategoryFactory extends ACategoryCreator {

    @Override
    public ISubcategory StructureFactory() {

        //Root
        SubCategoryComposite Cat = new SubCategoryComposite(R.drawable.ic_menu_camera, "Gato", "CatCategory");

        //Level 1
        SubCategoryComposite health = new SubCategoryComposite(R.drawable.ic_menu_gallery, "Salud", "CatHealth");

        SubCategoryComposite food = new SubCategoryComposite(R.drawable.ic_menu_manage, "Alimentacion", "CatFood");

        //Level 2 - Salud
        Item hygiene = new Item(R.drawable.ic_menu_send, "Higiene", "CatHygiene");

        Item vaccines = new Item(R.drawable.ic_menu_share, "Vacunas", "CatVaccines");

        health.Add(hygiene);
        health.Add(vaccines);

        //Add levels
        Cat.Add(health);
        Cat.Add(food);

        return Cat;
    }
}

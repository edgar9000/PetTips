package BL.Utilities;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import BL.Hierarchy.Item;
import Contracts.ISubcategory;
import illumicon.pettipsu.R;

/**
 * Created by Edgar on 8/06/2017.
 */

public class ItemAdapter extends ArrayAdapter<ISubcategory> {

    private final Context context;
    private final List<ISubcategory> items;

    public ItemAdapter(Context context, List<ISubcategory> items) {
        super(context,-1,items);
        this.context = context;
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (convertView == null) {
            // Create a new view into the list.
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.list_item, parent, false);
        }

        // Set data into the view.
        ImageView ivItem = (ImageView) rowView.findViewById(R.id.ivItem);
        TextView tvTitle = (TextView) rowView.findViewById(R.id.tvTitle);

        ISubcategory item = this.items.get(position);
        tvTitle.setText(null);
        tvTitle.setText(item.getName());
        ivItem.setImageResource(item.getIcon());

        return rowView;
    }
}

package sg.edu.rp.c347.holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {

    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvName;
    private TextView tvDate;
    private ImageView ivIcon;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        holiday = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_second, parent, false);

        tvName = rowView.findViewById(R.id.tvName);
        tvDate = rowView.findViewById(R.id.tvDate);
        ivIcon = rowView.findViewById(R.id.ivIcon);


        Holiday currentHoliday = holiday.get(position);

        tvName.setText(currentHoliday.getName());
        tvDate.setText(currentHoliday.getDate());
        String icon = currentHoliday.getIcon();
        if(icon.equals("n")) {
            ivIcon.setImageResource(R.drawable.n);
        }
        else if (icon.equals("ld")){
            ivIcon.setImageResource(R.drawable.ld);
        }else if(icon.equals("christmas")){
            ivIcon.setImageResource(R.drawable.christmas);
        }else if(icon.equals("gf")){
            ivIcon.setImageResource(R.drawable.gf);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}

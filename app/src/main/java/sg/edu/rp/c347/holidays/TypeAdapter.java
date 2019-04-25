package sg.edu.rp.c347.holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TypeAdapter extends ArrayAdapter<Type> {
    private ArrayList<Type> type;
    private Context context;
    private TextView tvType;

    public TypeAdapter(Context context,int resource,ArrayList<Type> objects){
        super(context,resource,objects);
        //Store the type that is passed to this adapter
        type=objects;
        //store context objects
        this.context=context;

    }

    //getView() method
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //inflate
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //INFLATE row.xml
        View rowView=inflater.inflate(R.layout.row_main,parent,false);
        //get tv
        tvType=rowView.findViewById(R.id.tvType);

        //position
        Type currentType=type.get(position);
        //set tv to show type
        tvType.setText(currentType.getName());

        //return lv
        return rowView;


    }

}

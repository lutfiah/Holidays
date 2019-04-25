package sg.edu.rp.c347.holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter aa;
    ArrayList<Type> type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv=findViewById(R.id.lvTypes);
        //Create object in array
        type=new ArrayList<Type>();
        type.add(new Type("Secular"));
        type.add(new Type("Ethnic & Religion"));

        //link activity to rowxml

        aa=new TypeAdapter(this,R.layout.row_main,type);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Type selectedType=type.get(position);
                String selectType=selectedType.getName();

                //create intent
                Intent i=new Intent(MainActivity.this,SecondActivity.class);

                //pass object
                i.putExtra("selectType",selectType);
                startActivity(i);
            }
        });
    }
}

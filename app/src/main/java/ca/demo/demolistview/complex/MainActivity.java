package ca.demo.demolistview.complex;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	private List<Car> myCars = new ArrayList<Car>();
  //  public final static String EXTRA_MESSAGE = "ca.demo.demolistview.complex.MESSAGE";

    int position;
    public final static String EXTRA_MESSAGE = "test";

    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		populateCarList();
		populateListView();

    }
	private void populateCarList() {
        myCars.add(new Car("Name: ferrari", "Speed:1971", "Model: e9",R.drawable.ferrari,"dealer:898","price:9879","l:545","r_rate:2323"));
		myCars.add(new Car("Name:BMW","Speed: 1940", "Model:f464", R.drawable.bmw,"dealer:89,","price:888","l:545","r_rate:2323"));
		myCars.add(new Car("Name:Ford", "Speed: 1994", "Model: 54fg", R.drawable.ford,"dealer:898","price:9879","l:545","r_rate:2323"));
		myCars.add(new Car("Name:Honda", "Speed: 1999", "Model: jh54", R.drawable.car4,"dealer:898","price:9879","l:545","r_rate:2323"));
		myCars.add(new Car("Name:Porch", "Speed: 2005", "Model: gf4", R.drawable.ford2,"dealer:898","price:9879","l:545","r_rate:2323"));
		myCars.add(new Car("Name:Jeep", "Speed: 200", " Model:45gf", R.drawable.imag,"dealer:898","price:9879","l:545","r_rate:2323"));
		myCars.add(new Car("Name:Bucket", "Speed: 2010", "Model: 54fg", R.drawable.car1,"dealer:898","price:9879","l:545","r_rate:2323"));
        myCars.add(new Car("Name:Bucket", "Speed: 2010", "Model: 54fg", R.drawable.toyoto,"dealer:898","price:9879","l:545","r_rate:2323"));
        myCars.add(new Car("Name:Rust", "Speed: 2010", "Model: 54fg", R.drawable.images,"dealer:898","price:9879","l:545","r_rate:2323"));
        myCars.add(new Car("Name:Rust", "Speed: 2010", "Model: 54fg", R.drawable.car,"dealer:898","price:9879","l:545","r_rate:2323"));
        myCars.add(new Car("Name:Rust", "Speed: 2010", "Model: 54fg", R.drawable.hondat,"dealer:898","price:9879","l:545","r_rate:2323"));
        myCars.add(new Car("Name:Rust", "Speed: 2010", "Model: 54fg", R.drawable.honda,"dealer:898","price:9879","l:545","r_rate:2323"));
        myCars.add(new Car("Name:Rust", "Speed: 2010", "Model: 54fg", R.drawable.hundai,"dealer:898","price:9879","l:545","r_rate:2323"));
        myCars.add(new Car("Name:Rust", "Speed: 2010", "Model: 54fg", R.drawable.hondar,"dealer:898","price:9879","l:545","r_rate:2323"));
        myCars.add(new Car("Name:Rust", "Speed: 2010", "Model: 54fg", R.drawable.suzuki1,"dealer:898","price:9879","l:545","r_rate:2323"));
        myCars.add(new Car("Name:Rust", "Speed: 2010", "Model: 54fg", R.drawable.mersi,"dealer:898","price:9879","l:545","r_rate:2323"));

    }

    public void hello(View view) {
        Intent intent = new Intent(this, Profile.class);

        intent.putExtra(EXTRA_MESSAGE, position);
        startActivity(intent);
    }
    private void populateListView() {
        ArrayAdapter<Car> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.carsListView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked,
                                    int position, long id) {

                Car clickedCar = myCars.get(position);
                String message = "You clicked position " + position
                        + " Which is car make " + clickedCar.getMake();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
        list.setAdapter(adapter);
    }



	
	private class MyListAdapter extends ArrayAdapter<Car> {
		public MyListAdapter() {
			super(MainActivity.this, R.layout.item_view, myCars);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// Make sure we have a view to work with (may have been given null)
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
			}
			
			// Find the car to work with.
			Car currentCar = myCars.get(position);
			
			// Fill the view
			ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon);
			imageView.setImageResource(currentCar.getIconID());
			
			// Make:
            TextView makeText = (TextView) itemView.findViewById(R.id.item_txtMake);
            makeText.setText(currentCar.getMake());
            // Make:
           // TextView priceText = (TextView) itemView.findViewById(R.id.item_txtprc);
           // priceText.setText(currentCar.getPrice());


            // Year:
			TextView yearText = (TextView) itemView.findViewById(R.id.item_txtYear);
			yearText.setText("" + currentCar.getSpeed());

			// Condition:
			TextView condionText = (TextView) itemView.findViewById(R.id.item_txtCondition);
			condionText.setText(currentCar.getCondition());

			return itemView;
		}				
	}
}













package mordor.calculator;

import mordor.calculator_new.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText input;
	private float f1, f2;
	private int operation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		input = (EditText) findViewById(R.id.editText1);
	}

	public void onAdd(View view){
		//input = (EditText) findViewById(R.id.editText1);
		f1 = Float.valueOf(input.getText().toString());
		input.setText("");
		operation=1;
	}


	public void onSub(View view){
		//input = (EditText) findViewById(R.id.editText1);
		f1 = Float.valueOf(input.getText().toString());
		input.setText("");
		operation=2;
	}
	public void onMul(View view){
		//input = (EditText) findViewById(R.id.editText1);
		f1 = Float.valueOf(input.getText().toString());
		input.setText("");
		operation=3;
	}
	public void onDiv(View view){
		//input = (EditText) findViewById(R.id.editText1);
		f1 = Float.valueOf(input.getText().toString());
		input.setText("");
		operation=4;
	}
	
	
	public void onEquate(View view) {
		f2 = Float.valueOf(input.getText().toString());
		String out = new String();
		switch (operation) {
		case 1:
			out = String.valueOf(f1 + f2);
			break;
		case 2:
			out= String.valueOf(f1-f2);
			break;
			
		case 3:
			out= String.valueOf(f1*f2);
			break;
			
		case 4: 
			if (f2 == 0){
				Toast.makeText(this, "Divide By Zero!", Toast.LENGTH_LONG).show();
				break;

			}
			out= String.valueOf(f1/f2);
			break;
		}

		input.setText(out);

	}
}

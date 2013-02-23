package mordor.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import mordor.calculator_new.R;

public class MainActivity extends Activity {
	private EditText input ;
	private float f1,f2;
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
		
	}

	public void onEquate(View view){
		f2 = Float.valueOf(input.getText().toString());
		String out = new String();
		out = String.valueOf(f1+f2);
		
		input.setText(out);
		
	}
}

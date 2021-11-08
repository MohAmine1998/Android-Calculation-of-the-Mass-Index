package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 
    EditText text1;
    EditText text2;
	TextView text3;
	ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setText("IMC");
		
        text1 = (EditText)findViewById(R.id.text);
        text2 = (EditText)findViewById(R.id.text2);
		text3 = (TextView)findViewById(R.id.textView);
		image = (ImageView)findViewById(R.id.imageView) ;

        }
		
		button.setOnClickListener(new View.OnClickListener() {
    public void onclick(View v){

      

			double Masse = Double.parseDouble(text1.getText().toString());
            double Taille = Double.parseDouble(text2.getText().toString());
            double IMC = Masse /((Taille)*(Taille));
			
			 if (IMC<=18){

                text3.setText(Double.toString(IMC)+" Under Weight");

                image.setImageResource(R.drawable.UnderWeight);
			
				}
			else  if (IMC>18 && IMC<=25){

                text3.setText(Double.toString(IMC)+" Normal");

                image.setImageResource(R.drawable.Normal);
			
					}
				else  if (IMC>25 && IMC<=30){

                text3.setText(Double.toString(IMC)+" Over Weight");

                image.setImageResource(R.drawable.OverWeight);
			
						}
					else  if (IMC>30 && IMC<=35){

					text3.setText(Double.toString(IMC)+" Obese");

					image.setImageResource(R.drawable.Obese);
			
							}
						else {

						text3.setText(Double.toString(IMC)+" Extremly Obese");

						image.setImageResource(R.drawable.ExtremlyObese);
			
							}
							
		}});
    }
}
package com.example.adisuarpala.wildanimals;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAbout = (Button) findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(
                                                    MainActivity.this,AboutActivity.class);
                                            startActivity(intent);
                                        }
                                    });

            spinner1=(Spinner)

            findViewById(R.id.spinner);

            spinner1.setOnItemSelectedListener(new

            ItemSelectedListener() {

                @Override
                public void onItemSelected (AdapterView < ? > arg0, View arg1,int arg2, long arg3){
                    final Intent intent;
                    switch (arg2) {
                        case 0:
                            Intent i = new Intent();
                            i.setClass(MainActivity.this, MainActivity.class);
                            //startActivity(i);
                            break;
                        case 1:
                            Intent ir = new Intent();
                            ir.setClass(MainActivity.this, LionActivity.class);
                            startActivity(ir);
                            break;
                        case 2:
                            Intent ic = new Intent();
                            ic.setClass(MainActivity.this, WolfActivity.class);
                            startActivity(ic);
                            break;
                        case 3:
                            Intent ib = new Intent();
                            ib.setClass(MainActivity.this, TigerActivity.class);
                            startActivity(ib);
                            break;
                    }

                }

                @Override
                public void onNothingSelected (AdapterView < ? > arg0){
                    // TODO Auto-generated method stub

                }

            }

            );
        }


        public class ItemSelectedListener implements AdapterView.OnItemSelectedListener {

        //get strings of first item

        String firstItem = String.valueOf(spinner1.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

            if (firstItem.equals(String.valueOf(spinner1.getSelectedItem()))) {

            } else {

                Toast.makeText(parent.getContext(),

                    "Anda telah memilih : " + parent.getItemAtPosition(pos).toString(),

                    Toast.LENGTH_LONG).show();

            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> arg) {

        }

    }

}
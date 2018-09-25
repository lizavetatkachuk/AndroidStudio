package com.example.lizatkachuk.unipractice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button lab2 = (Button)findViewById(R.id.lab2);
    Button lab3 = (Button)findViewById(R.id.lab3);
    Button changeb = (Button)findViewById(R.id.changelayout);
    Button confirm1b = (Button)findViewById(R.id.confirm1);
    Button confirm2b = (Button)findViewById(R.id.button);
    Button btn = (Button) findViewById(R.id.Green);
    Button btn1 = (Button) findViewById(R.id.Red);
    Button btn2 = (Button) findViewById(R.id.Blue);
    Button btn3 = (Button) findViewById(R.id.Yellow);
    TableLayout layout = (TableLayout) findViewById(R.id.TableLayout1);
    EditText txt=(EditText)findViewById(R.id.sur);
    EditText txt1=(EditText)findViewById(R.id.nme);
    EditText txt2=(EditText)findViewById(R.id.snme);
    EditText txt3=(EditText)findViewById(R.id.edit);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation);
        lab2.setOnClickListener(Lab2Listener);
        lab3.setOnClickListener(Lab3Listener);
        changeb.setOnClickListener(ChangeListener);
        confirm1b.setOnClickListener(ConfirmListener);
        confirm2b.setOnClickListener(ConfirmListener);
        btn.setOnClickListener(BtnListener);
        btn1.setOnClickListener(Btn1Listener);
        btn2.setOnClickListener(Btn2Listener);
        btn3.setOnClickListener(Btn3Listener);

    }
    private View.OnClickListener Lab2Listener = new View.OnClickListener() {
        public void onClick(View v) {
            setContentView(R.layout.lab2p2);
        }
    };
}
    private View.OnClickListener BtnListener = new View.OnClickListener() {
        public void onClick(View v) {
            layout.setBackgroundColor(Color.GREEN);
        }
    };
    private View.OnClickListener Btn1Listener = new View.OnClickListener() {
        public void onClick(View v) {
            layout.setBackgroundColor(Color.RED);
        }
    }; private View.OnClickListener Btn2Listener = new View.OnClickListener() {
    public void onClick(View v) {
        layout.setBackgroundColor(Color.BLUE);
    }
}; private View.OnClickListener Btn3Listener = new View.OnClickListener() {
    public void onClick(View v) {
        layout.setBackgroundColor(Color.YELLOW);
    }
};
    private View.OnClickListener Lab3Listener = new View.OnClickListener() {
        public void onClick(View v) {
            setContentView(R.layout.lab3);
        }
    };
    private View.OnClickListener ChangeListener = new View.OnClickListener() {
        public void onClick(View v) {
            setContentView(R.layout.activity_main);
        }
    };
    private View.OnClickListener ConfirmListener = new View.OnClickListener() {
        public void onClick(View v) {
            String name=txt.getText().toString()+" "+txt1.getText().toString()+" "+txt2.getText().toString();
            txt3.setText(name);
            setContentView(R.layout.lab2final);
        }
    };
}

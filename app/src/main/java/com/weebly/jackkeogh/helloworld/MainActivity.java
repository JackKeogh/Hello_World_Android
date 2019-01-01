package com.weebly.jackkeogh.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        final Button m_button = findViewById(R.id.button);
        final TextView m_text = findViewById(R.id.countText);
        m_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                count++;

                m_text.setText(Integer.toString(count));
            }
        });
    }
}

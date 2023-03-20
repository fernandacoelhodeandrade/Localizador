package com.example.localizador;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText originalText;
    private EditText searchText;
    private EditText resultText;
    private Button replaceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        originalText = findViewById(R.id.original_text);
        searchText = findViewById(R.id.search_text);
        resultText = findViewById(R.id.result_text);
        replaceButton = findViewById(R.id.replace_button);

        replaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String original = originalText.getText().toString();
                String search = searchText.getText().toString();

                if (!original.contains(search)) {
                    resultText.setText("Vish, não encontrei esta string...");
                } else {
                    resultText.setText("Ebaa, encontrei esta string!!");
                }
            }
        });
    }
}


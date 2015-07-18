package sampco.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import sampco.interactivestory.R;


public class MainActivity extends ActionBarActivity {

    private EditText mNameField;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameField = (EditText) findViewById(R.id.nameEditText);
        mStartButton = (Button) findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String name = mNameField.getText().toString();
                startStory(name);
            }
        });


    }

    private void startStory(String name){
        //this starts another activity i.e. show another screen
        Intent intent = new Intent(this, StoryActivity.class);
        //using the following you can pass data to another intent
        intent.putExtra(getString(R.string.key_name), name);
        //this actually starts the activity named in the intent declaration
        startActivity(intent);
    }


}

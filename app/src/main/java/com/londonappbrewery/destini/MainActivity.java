package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView situationView;
    Button button1;
    Button button2;

    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        situationView =  findViewById(R.id.storyTextView);
        button1 = findViewById(R.id.buttonTop);
        button2 = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mStoryIndex == 1 || mStoryIndex == 2) {

                    path3();
                    mStoryIndex = 3;

                } else {

                    path6();
                    mStoryIndex = 6;

                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mStoryIndex == 1) {

                    path2();
                    mStoryIndex = 2;

                } else if(mStoryIndex == 2) {

                    path4();
                    mStoryIndex = 4;

                } else {

                    path5();
                    mStoryIndex = 5;

                }

            }
        });

    }

    private void path1() {

        situationView.setText(R.string.T1_Story);

        button1.setText(R.string.T1_Ans1);
        button2.setText(R.string.T1_Ans2);

    }

    private void path2() {

        situationView.setText(R.string.T2_Story);

        button1.setText(R.string.T2_Ans1);
        button2.setText(R.string.T2_Ans2);

    }

    private void path3() {

        situationView.setText(R.string.T3_Story);

        button1.setText(R.string.T3_Ans1);
        button2.setText(R.string.T3_Ans2);

    }

    private void path4() {

        situationView.setText(R.string.T4_End);

        button1.setVisibility(View.GONE);
        button2.setVisibility(View.GONE);

    }

    private void path5() {

        situationView.setText(R.string.T5_End);

        button1.setVisibility(View.GONE);
        button2.setVisibility(View.GONE);

    }

    private void path6() {

        situationView.setText(R.string.T6_End);

        button1.setVisibility(View.GONE);
        button2.setVisibility(View.GONE);

    }


}

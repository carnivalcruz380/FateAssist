package com.example.fateassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // buttons that you can click on to add a new character or view/change character profiles
    ImageButton character1Button;
    ImageButton character2Button;
    ImageButton character3Button;
    ImageButton character4Button;
    ImageButton character5Button;
    ImageButton character6Button;

    // button to start/continue gameplay on any profile
    Button playButton;
    // button for the rules pdf display
    Button rulesButton;

    // text under buttons that will change to the character's name once a character has been added
    TextView character1Label;
    TextView character2Label;
    TextView character3Label;
    TextView character4Label;
    TextView character5Label;
    TextView character6Label;

    //adapters for database
    Cursor playerCursor;
    CursorAdapter playerCursorAdapter;

    // booleans for ImageButtons
    // if false will take you to create new character activity
    // if true will take you to update character activity
    static boolean character1 = false;
    static boolean character2 = false;
    static boolean character3 = false;
    static boolean character4 = false;
    static boolean character5 = false;
    static boolean character6 = false;

    //This may or may not be useful to you, just know that these should be the options
    //for each skill box
    public enum SkillTypes{
        Athletics,
        Burglary,
        Contacts,
        Crafts,
        Deceive,
        Drive,
        Empathy,
        Fight,
        Investigate,
        Lore,
        Notice,
        Physique,
        Provoke,
        Rapport,
        Resources,
        Shoot,
        Stealth,
        Will,
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        character1Button = (ImageButton) findViewById(R.id.character1Button);
        character2Button = (ImageButton) findViewById(R.id.character2Button);
        character3Button = (ImageButton) findViewById(R.id.character3Button);
        character4Button = (ImageButton) findViewById(R.id.character4Button);
        character5Button = (ImageButton) findViewById(R.id.character5Button);
        character6Button = (ImageButton) findViewById(R.id.character6Button);

        playButton = (Button) findViewById(R.id.playButton);
        rulesButton = (Button) findViewById(R.id.rulesButton);

        character1Label = (TextView) findViewById(R.id.character1Label);
        character2Label = (TextView) findViewById(R.id.character2Label);
        character3Label = (TextView) findViewById(R.id.character3Label);
        character4Label = (TextView) findViewById(R.id.character4Label);
        character5Label = (TextView) findViewById(R.id.character5Label);
        character6Label = (TextView) findViewById(R.id.character6Label);

        // NOT YET IMPLEMENTED
        character1Button.setOnClickListener(imageListener);
        character2Button.setOnClickListener(imageListener);
        character3Button.setOnClickListener(imageListener);
        character4Button.setOnClickListener(imageListener);
        character5Button.setOnClickListener(imageListener);
        character6Button.setOnClickListener(imageListener);

        // NOT YET IMPLEMENTED
        playButton.setOnClickListener(playListener);

        // NOT YET IMPLEMENTED
        rulesButton.setOnClickListener(rulesListener);
    }

    // NOT YET IMPLEMENTED
    View.OnClickListener imageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    // NOT YET IMPLEMENTED
    View.OnClickListener playListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    // NOT YET IMPLEMENTED
    View.OnClickListener rulesListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
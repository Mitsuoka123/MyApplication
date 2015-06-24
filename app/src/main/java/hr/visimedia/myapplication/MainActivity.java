package hr.visimedia.myapplication;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void bicycleTrails(View view) {
            Intent btrails = new Intent(MainActivity.this, BicycleTrails.class);
            startActivity(btrails);

        }

        public void walkingTrails(View view) {
            Intent wtrails = new Intent(MainActivity.this, WalkingTrails.class);
            startActivity(wtrails);
        }

        public void aboutButton(View view) {
            Intent aboutButton = new Intent(MainActivity.this, BicycleTrail6.class);
            startActivity(aboutButton);
        }
    }











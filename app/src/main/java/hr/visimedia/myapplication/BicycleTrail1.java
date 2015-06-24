package hr.visimedia.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;


public class BicycleTrail1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicycle_trail1);
    }

    File kmlKorculaOrlandusa = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + "download" + File.separator + "korcula-orlandusa.kml");

    public void dwnldKmlKorculaOrlandusa(View v)
    {
        Intent dwnldKmlKorculaOrlandusa = new Intent();
        dwnldKmlKorculaOrlandusa.setAction(Intent.ACTION_VIEW);
        dwnldKmlKorculaOrlandusa.setData(Uri.parse("http://www.visitkorcula.eu/downloads/bike-trails/korcula-orlandusa.kml"));
        if(kmlKorculaOrlandusa.exists())
        {
            Toast alreadydownloaded = Toast.makeText(getApplicationContext(), "*.KML file already downloaded, Open *.KML file", Toast.LENGTH_LONG);
            LinearLayout toastLayout = (LinearLayout) alreadydownloaded.getView();
            TextView toastTV = (TextView) toastLayout.getChildAt(0);
            toastTV.setTextSize(25);
            alreadydownloaded.show();
        }
        else
        {
            startActivity(dwnldKmlKorculaOrlandusa);
        }
    }

    public void openKmlKorculaOrlandusa(View v)
    {
        Intent openKmlKorculaOrlandusa = new Intent();
        openKmlKorculaOrlandusa.setAction(Intent.ACTION_VIEW);
        openKmlKorculaOrlandusa.setDataAndType(Uri.fromFile(kmlKorculaOrlandusa), "application/vnd.google-earth.kml+xml");
        if(kmlKorculaOrlandusa.exists())
        { startActivity(openKmlKorculaOrlandusa);}
        else
        {
            Toast notdownloaded = Toast.makeText(getApplicationContext(), "*.KML file is not downloaded, download *.KML file", Toast.LENGTH_LONG);
            LinearLayout toastLayout = (LinearLayout) notdownloaded.getView();
            TextView toastTV = (TextView) toastLayout.getChildAt(0);
            toastTV.setTextSize(25);
            notdownloaded.show();
        }
    }

    public void playStoreOrux(View v)
    {
        Intent playStoreOrux = new Intent(Intent.ACTION_VIEW);
        playStoreOrux.setData(Uri.parse("market://details?id=com.orux.oruxmaps"));
        startActivity(playStoreOrux);
    }
}

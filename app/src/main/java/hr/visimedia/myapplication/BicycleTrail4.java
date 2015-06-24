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


public class BicycleTrail4 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicycle_trail4);
    }

    File kmlKorculaRacisce = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + "download" + File.separator + "korcula-pupnat-racisce.kml");

    public void dwnldKmlKorculaRacisce(View v)
    {
        Intent dwnldKmlKorculaRacisce = new Intent();
        dwnldKmlKorculaRacisce.setAction(Intent.ACTION_VIEW);
        dwnldKmlKorculaRacisce.setData(Uri.parse("http://www.visitkorcula.eu/downloads/bike-trails/korcula-pupnat-racisce.kml"));
        if(kmlKorculaRacisce.exists())
        {
            Toast alreadydownloaded = Toast.makeText(getApplicationContext(), "*.KML file already downloaded, Open *.KML file", Toast.LENGTH_LONG);
            LinearLayout toastLayout = (LinearLayout) alreadydownloaded.getView();
            TextView toastTV = (TextView) toastLayout.getChildAt(0);
            toastTV.setTextSize(25);
            alreadydownloaded.show();
        }
        else
        {
            startActivity(dwnldKmlKorculaRacisce);
        }
    }

    public void openKmlKorculaRacisce(View v)
    {
        Intent openKmlKorculaRacisce = new Intent();
        openKmlKorculaRacisce.setAction(Intent.ACTION_VIEW);
        openKmlKorculaRacisce.setDataAndType(Uri.fromFile(kmlKorculaRacisce), "application/vnd.google-earth.kml+xml");
        if(kmlKorculaRacisce.exists())
        { startActivity(openKmlKorculaRacisce);}
        else
        {
            Toast notdownloaded = Toast.makeText(getApplicationContext(), "*.KML file is not downloaded, download *.KML file", Toast.LENGTH_LONG);
            LinearLayout toastLayout = (LinearLayout) notdownloaded.getView();
            TextView toastTV = (TextView) toastLayout.getChildAt(0);
            toastTV.setTextSize(25);
            notdownloaded.show();
        }


    }

public void EvKorcRacPhoto(View v)
{
    Intent EvKorcRacPhoto = new Intent(BicycleTrail4.this, EvKorculaRaciscePhoto.class);
    startActivity(EvKorcRacPhoto);

}


    public void playStoreOrux(View v)
    {
        Intent playStoreOrux = new Intent(Intent.ACTION_VIEW);
        playStoreOrux.setData(Uri.parse("market://details?id=com.orux.oruxmaps"));
        startActivity(playStoreOrux);
    }
}

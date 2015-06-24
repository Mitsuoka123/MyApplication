package hr.visimedia.myapplication;

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


public class BicycleTrail6 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicycle_trail6);
    }

    File kmlKorculaLumbarda = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + "download" + File.separator + "http://www.visitkorcula.eu/downloads/bike-trails/korcula-lumbarda.kml");

    public void dwnldKmlKorculaLumbarda(View v)
    {
        Intent dwnldKmlKorculaLumbarda = new Intent();
        dwnldKmlKorculaLumbarda.setAction(Intent.ACTION_VIEW);
        dwnldKmlKorculaLumbarda.setData(Uri.parse("http://www.visitkorcula.eu/downloads/bike-trails/korcula-lumbarda.kml"));
        if(kmlKorculaLumbarda.exists())
        {
            Toast alreadydownloaded = Toast.makeText(getApplicationContext(), "*.KML file already downloaded, Open *.KML file", Toast.LENGTH_LONG);
            LinearLayout toastLayout = (LinearLayout) alreadydownloaded.getView();
            TextView toastTV = (TextView) toastLayout.getChildAt(0);
            toastTV.setTextSize(25);
            alreadydownloaded.show();
        }
        else
        {
            startActivity(dwnldKmlKorculaLumbarda);
        }
    }

    public void openKmlKorculaLumbarda(View v)
    {
        Intent openKmlKorculaLumbarda = new Intent();
        openKmlKorculaLumbarda.setAction(Intent.ACTION_VIEW);
        openKmlKorculaLumbarda.setDataAndType(Uri.fromFile(kmlKorculaLumbarda), "application/vnd.google-earth.kml+xml");
        if(kmlKorculaLumbarda.exists())
        { startActivity(openKmlKorculaLumbarda);}
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

package com.idury.kidgames;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
//import android.media.MediaPlayer;
public class MainActivity extends AppCompatActivity {

    private String[] animals = {"cow","dog","duck","eliphant","frog", "horse", "lion"
            , "owl","panda", "parrot", "penguin" ,"pig","rhino", "sheep", "squirrel","cat","rooster"
            ,"pig2", "eliphant2"};
    //private String[] animalSound = {"cow","dog","duck","eliphant","frog", "horse", "lion"
     //       , "owl","panda", "parrot", "penguin" ,"pig","rhino", "sheep", "squirrel","cat","rooster"
     //       ,"pig", "eliphant"};
    int ij = 0;
    //MediaPlayer mp = new MediaPlayer();
    /*public void exit1()
    {   mp.pause();
        mp.stop();
        mp.release();
        finish();
       // System.exit(0);
    }*/
    public void newImage(View view) throws InterruptedException {
        int imgclickflg = 1;
        ImageView image = (ImageView) findViewById(R.id.ImgAnimal);
       // mp.stop();
       // mp.release();
        /*if ( mp.isPlaying()) {
            mp.pause();
            //mp.release();
        }
        else
        {imgclickflg=1;}
        */
        //Thread.sleep(10000);
        while ( imgclickflg == 1 ) {
            if ( ij >= 18 ) {
                ij = 0;
            }
            else {
                ij = ij + 1;
            }
            image.setImageResource(getResources().getIdentifier(animals[ij], "drawable", getPackageName()));
       //     mp = MediaPlayer.create(this, getResources().getIdentifier(animalSound[ij],"raw",getPackageName()));
         //   mp.start();
            imgclickflg = 0;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}

package tatastrive.application.fragmenttp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity2 extends Activity {
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_2 );
        button1=findViewById( R.id.button2 );
        button2=findViewById( R.id.button3 );
        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment( new FirstFragment());

            }
        } );
        button2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment( new SecondFragment());

            }
        } );
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm= getFragmentManager();
        FragmentTransaction fragmentTransaction= fm.beginTransaction();
        fragmentTransaction.replace( R.id.framelayout,fragment );
        fragmentTransaction.commit();

    }
}

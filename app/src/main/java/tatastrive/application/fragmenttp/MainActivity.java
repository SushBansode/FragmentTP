package tatastrive.application.fragmenttp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button activitybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        activitybutton=findViewById( R.id.button );
        activitybutton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this );
                builder.setTitle( "Activity Button" );

            }
        } );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate( R.menu.menu,menu );
        return super.onCreateOptionsMenu( menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.me_set:
                startActivity( new Intent( Settings.ACTION_SETTINGS ) );
               // Toast.makeText( this, "set clicked", Toast.LENGTH_SHORT ).show();
               // Intent intent=new Intent( SimpleFragment.this,MainActivity2.class );
               // startActivity( intent );
                break;
            case R.id.me_frag:
                Intent intent=new Intent( MainActivity.this,MainActivity2.class);
                startActivity( intent );
                break;
        }
        return super.onOptionsItemSelected( item );
    }
}

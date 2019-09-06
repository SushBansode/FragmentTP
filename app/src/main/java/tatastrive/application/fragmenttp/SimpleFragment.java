package tatastrive.application.fragmenttp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SimpleFragment extends Fragment {
    View view;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view=inflater.inflate( R.layout.simple_fram,container,false );
        button=view.findViewById( R.id.fragent_btn);
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( view.getContext(),MainActivity2.class );
                startActivity( intent );
                Toast.makeText( getActivity(), "Fragment Button", Toast.LENGTH_SHORT ).show();


            }
        } );
        return view;
    }
}


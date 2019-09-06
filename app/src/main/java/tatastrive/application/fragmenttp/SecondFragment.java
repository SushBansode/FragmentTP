package tatastrive.application.fragmenttp;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SecondFragment extends Fragment {
    View view;
    Button secondbuttonTwo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate( R.layout.simple_fram_two, container, false );
        secondbuttonTwo = view.findViewById( R.id.buttonsec );
        secondbuttonTwo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent( view.getContext(), MainActivity2.class );
                //startActivity( intent );
                Toast.makeText( getActivity(), "Fragment Second's", Toast.LENGTH_SHORT ).show();


            }
        } );
        return view;
    }
}

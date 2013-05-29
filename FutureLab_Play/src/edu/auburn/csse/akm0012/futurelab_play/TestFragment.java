package edu.auburn.csse.akm0012.futurelab_play;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class TestFragment extends Fragment {
	
	View view;
		
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		view = inflater.inflate(R.layout.activity_side_panel_fragment, container,false);
		
		Button comment = (Button) view.findViewById(R.id.commentButton);
		comment.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				
			}
			
		});
		
		return view;

	}

}

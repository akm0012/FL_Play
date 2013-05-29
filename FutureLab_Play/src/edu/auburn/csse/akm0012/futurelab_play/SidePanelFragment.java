package edu.auburn.csse.akm0012.futurelab_play;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class SidePanelFragment extends Activity {
	OnHeadlineSelectedListener mCallback;
	
	// The container Activity must implement this interface so the frag can deliver messages
    public interface OnHeadlineSelectedListener {
        /** Called by HeadlinesFragment when a list item is selected */
        public void onArticleSelected(int position);
    }
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_side_panel_fragment);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.side_panel, menu);
		return true;
	}

}

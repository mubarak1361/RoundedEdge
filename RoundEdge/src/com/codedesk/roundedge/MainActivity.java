package com.codedesk.roundedge;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		int subtitleId = Resources.getSystem().
				getIdentifier("action_bar_subtitle", "id", "android");
				if(subtitleId==0)
				 subtitleId=com.actionbarsherlock.R.id.abs__action_bar_subtitle;
				TextView mAppSubtitle=(TextView)findViewById(subtitleId);
				mAppSubtitle.setEllipsize(TruncateAt.MARQUEE);
				    mAppSubtitle.setMarqueeRepeatLimit(1);
				    mAppSubtitle.setFocusable(true);
				    mAppSubtitle.setFocusableInTouchMode(true);
				    mAppSubtitle.requestFocus();
				    mAppSubtitle.setSingleLine(true);
				    mAppSubtitle.setSelected(true);
				    mAppSubtitle.setMarqueeRepeatLimit(-1);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

package com.codedesk.roundedge;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ActionBar abs = getSupportActionBar();
		abs.setSubtitle("Hello World !!! A Simple Marquee. Did you Like this ? :)");
		
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
}

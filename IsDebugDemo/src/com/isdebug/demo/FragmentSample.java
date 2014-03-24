package com.isdebug.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FragmentSample extends Fragment implements OnClickListener{
	
	Button getDebugStatusButton;
	TextView debugStatusView;
	View rootView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_main, container,
				false);
		return rootView;
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		InitCtrl();
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
	}

	@Override
	public void onDetach() {
		super.onDetach();
	}

	@Override
	public void onPause() {
		super.onPause();
	}

	@Override
	public void onResume() {
		super.onResume();
	}

	@Override
	public void onStart() {
		super.onStart();
	}

	@Override
	public void onStop() {
		super.onStop();
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.btn_get_is_debug:
			ClickGetDebugStatus();
			break;

		default:
			break;
		}
	}
	
	private void InitCtrl() {
		getDebugStatusButton = (Button) rootView.findViewById(R.id.btn_get_is_debug);
		getDebugStatusButton.setOnClickListener(this);
		debugStatusView = (TextView) rootView.findViewById(R.id.tv_debug_status);
	}
	private void ClickGetDebugStatus() {
		
		if (debugStatusView != null) {
			debugStatusView.setText(BuildConfig.DEBUG +"");
		} else {
			debugStatusView.setText("debugStatusView null");
		}
	}
}

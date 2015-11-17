package com.example.admin.testing;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

  FragmentTransaction ft;
  Intent intent;


  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);



  }

  public void onClick(View v) {
    ft = getFragmentManager().beginTransaction();
    switch(v.getId())
    {
      case R.id.btnFinance:
        intent= new Intent(MainActivity.this, FinanceActivity.class);
        startActivity(intent);
        break;

      case R.id.btnCosts:
        intent = new Intent(MainActivity.this, CostsActivity.class);
        startActivity(intent);
        break;

      case R.id.btnSetting:
        intent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);

    }
    ft.commit();
  }
}

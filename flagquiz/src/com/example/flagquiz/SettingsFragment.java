// SettingsFragment.java
// Subclass of PreferenceFragment for managing app settings
package com.example.flagquiz;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingsFragment extends PreferenceFragment
{   
   // creates preferences GUI from preferences.xml file in res/xml
   @Override
   public void onCreate(Bundle savedInstanceState) 
   {
      super.onCreate(savedInstanceState);
      addPreferencesFromResource(R.xml.preference); // load from XML
   } 
} // end class SettingsFragment




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

/**
 *
 * @author Janghun
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
 
public class MainActivity extends Activity implements
                  RadioGroup.OnCheckedChangeListener {
         /** Called when the activity is first created. */
         EditText url;
         RadioGroup command1;
         Button load;
         WebView webView;
 
         @Override
         public void onCreate(Bundle savedInstanceState) {
 
                  super.onCreate(savedInstanceState);
                  setContentView(R.layout.main);
 
                  url = (EditText) findViewById(R.id.url);
                  command1 = (RadioGroup) findViewById(R.id.command1);
                  load = (Button) findViewById(R.id.load);
                  webView = (WebView) findViewById(R.id.webView);
 
              
                  WebSettings webSettings = webView.getSettings();
                  webSettings.setJavaScriptEnabled(true);
                  webSettings.setBuiltInZoomControls(true);
                 
                  webView.setWebViewClient(new CustomWebClient());
            
                 
                  command1.setOnCheckedChangeListener(this);
 
        
                  load.setOnClickListener(new View.OnClickListener() {
                           public void onClick(View v) {
                                   // TODO Auto-generated method stub
                                   String address = url.getText().toString();
                                   webView.loadUrl(address);
                           }
                  });
 
         }
 
         public void onCheckedChanged(RadioGroup group, int checkedId) {
                  // TODO Auto-generated method stub
                  switch (checkedId) {
                 
                  case R.id.back2:
                           if (webView.canGoBackOrForward(-2)) {
                                   webView.goBackOrForward(-2);
                           }
                           break;
                  case R.id.back:
                           if (webView.canGoBack()) {
                                   webView.goBack();
                           }
                           break;
                  case R.id.forward:
                           if (webView.canGoForward()) {
                                   webView.goForward();
                           }
                           break;
                  case R.id.forward2:
                           if (webView.canGoBackOrForward(2)) {
                                   webView.goBackOrForward(2);
                           }
 
                           break;
                  }
 
         }
 
         
         class CustomWebClient extends WebViewClient {
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                           view.loadUrl(url);
                           return true;
                  }
 
                  @Override
                 public void onPageFinished(WebView view, String address) {
                           url.setText(address);
                  }
         }
}




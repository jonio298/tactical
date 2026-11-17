package com.sakuratactics.demo;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public final class MainActivity extends Activity {
  private WebView view;
  @Override public void onCreate(Bundle state) {
    super.onCreate(state);
    getWindow().getDecorView().setSystemUiVisibility(
      View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
      View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
      View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
    view = new WebView(this);
    WebSettings s = view.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(true);
    s.setAllowFileAccess(true);
    s.setAllowContentAccess(false);
    s.setJavaScriptCanOpenWindowsAutomatically(false);
    view.setWebViewClient(new WebViewClient());
    view.setWebChromeClient(new WebChromeClient());
    setContentView(view);
    view.loadUrl("file:///android_asset/index.html");
  }
  @Override protected void onDestroy() {
    if (view != null) { view.destroy(); view = null; }
    super.onDestroy();
  }
}

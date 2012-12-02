package org.dykman.jn.android.webkit;
public class WebChromeClient extends android.webkit.WebChromeClient{
protected org.dykman.j.JInterface jInterface = null;
protected java.lang.String jlocale = null;
protected java.lang.String jchildid = null;
protected java.lang.String jchildidx = null;
protected java.util.ArrayList jnOverrideList = null;
protected void jparseargs (java.lang.String jlocale, java.lang.String jchildid, java.lang.String joverride ) { this.jlocale = jlocale; this.jchildid = jchildid; if (jchildid != null && jchildid.length() > 0) jchildidx = jchildid + "_"; else jchildidx = ""; if (joverride != null && joverride.length() > 0) { java.lang.String[] ss = joverride.split(" "); for (int i = 0; i < ss.length; i++) setjnOverride(ss[i]); } }
public void clearjnOverride () { jnOverrideList.clear (); }
public void setjnOverride (java.lang.String arg1 ) { if (!testjnOverride (arg1)) jnOverrideList.add (arg1); }
public void setjnOverride (java.lang.String arg1, boolean arg2 ) { if (arg2) { if (!testjnOverride (arg1)) jnOverrideList.add (arg1); } else jnOverrideList.remove (arg1); }
public boolean testjnOverride (java.lang.String arg1 ) { return jnOverrideList.contains (arg1); }
public WebChromeClient(String jlocale,String jchildid,String joverride ){ super(); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", null ); }
@Override public void onProgressChanged(android.webkit.WebView arg1,int arg2) { if (!testjnOverride( "onProgressChanged" )) { super.onProgressChanged( arg1, arg2); return; } jInterface.Jnido( this, jchildidx + "onProgressChanged_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override public void onReceivedTitle(android.webkit.WebView arg1,java.lang.String arg2) { if (!testjnOverride( "onReceivedTitle" )) { super.onReceivedTitle( arg1, arg2); return; } jInterface.Jnido( this, jchildidx + "onReceivedTitle_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override public void onReceivedIcon(android.webkit.WebView arg1,android.graphics.Bitmap arg2) { if (!testjnOverride( "onReceivedIcon" )) { super.onReceivedIcon( arg1, arg2); return; } jInterface.Jnido( this, jchildidx + "onReceivedIcon_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override public void onReceivedTouchIconUrl(android.webkit.WebView arg1,java.lang.String arg2,boolean arg3) { if (!testjnOverride( "onReceivedTouchIconUrl" )) { super.onReceivedTouchIconUrl( arg1, arg2, arg3); return; } jInterface.Jnido( this, jchildidx + "onReceivedTouchIconUrl_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3 } ); }
@Override public void onShowCustomView(android.view.View arg1,android.webkit.WebChromeClient.CustomViewCallback arg2) { if (!testjnOverride( "onShowCustomView" )) { super.onShowCustomView( arg1, arg2); return; } jInterface.Jnido( this, jchildidx + "onShowCustomView_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override public void onHideCustomView(){ if (!testjnOverride( "onHideCustomView" )) { super.onHideCustomView(); return; } jInterface.Jnido( this, jchildidx + "onHideCustomView_" + jlocale + "_", null ); }
@Override public boolean onCreateWindow(android.webkit.WebView arg1,boolean arg2,boolean arg3,android.os.Message arg4) { if (!testjnOverride( "onCreateWindow" )) return super.onCreateWindow( arg1, arg2, arg3, arg4); return (java.lang.Boolean) jInterface.Jnido( this, jchildidx + "onCreateWindow_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3, arg4 } ); }
@Override public void onRequestFocus(android.webkit.WebView arg1) { if (!testjnOverride( "onRequestFocus" )) { super.onRequestFocus( arg1); return; } jInterface.Jnido( this, jchildidx + "onRequestFocus_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public void onCloseWindow(android.webkit.WebView arg1) { if (!testjnOverride( "onCloseWindow" )) { super.onCloseWindow( arg1); return; } jInterface.Jnido( this, jchildidx + "onCloseWindow_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public boolean onJsAlert(android.webkit.WebView arg1,java.lang.String arg2,java.lang.String arg3,android.webkit.JsResult arg4) { if (!testjnOverride( "onJsAlert" )) return super.onJsAlert( arg1, arg2, arg3, arg4); return (java.lang.Boolean) jInterface.Jnido( this, jchildidx + "onJsAlert_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3, arg4 } ); }
@Override public boolean onJsConfirm(android.webkit.WebView arg1,java.lang.String arg2,java.lang.String arg3,android.webkit.JsResult arg4) { if (!testjnOverride( "onJsConfirm" )) return super.onJsConfirm( arg1, arg2, arg3, arg4); return (java.lang.Boolean) jInterface.Jnido( this, jchildidx + "onJsConfirm_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3, arg4 } ); }
@Override public boolean onJsPrompt(android.webkit.WebView arg1,java.lang.String arg2,java.lang.String arg3,java.lang.String arg4,android.webkit.JsPromptResult arg5) { if (!testjnOverride( "onJsPrompt" )) return super.onJsPrompt( arg1, arg2, arg3, arg4, arg5); return (java.lang.Boolean) jInterface.Jnido( this, jchildidx + "onJsPrompt_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3, arg4, arg5 } ); }
@Override public boolean onJsBeforeUnload(android.webkit.WebView arg1,java.lang.String arg2,java.lang.String arg3,android.webkit.JsResult arg4) { if (!testjnOverride( "onJsBeforeUnload" )) return super.onJsBeforeUnload( arg1, arg2, arg3, arg4); return (java.lang.Boolean) jInterface.Jnido( this, jchildidx + "onJsBeforeUnload_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3, arg4 } ); }
@Override public void onExceededDatabaseQuota(java.lang.String arg1,java.lang.String arg2,long arg3,long arg4,long arg5,android.webkit.WebStorage.QuotaUpdater arg6) { if (!testjnOverride( "onExceededDatabaseQuota" )) { super.onExceededDatabaseQuota( arg1, arg2, arg3, arg4, arg5, arg6); return; } jInterface.Jnido( this, jchildidx + "onExceededDatabaseQuota_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3, arg4, arg5, arg6 } ); }
@Override public void onReachedMaxAppCacheSize(long arg1,long arg2,android.webkit.WebStorage.QuotaUpdater arg3) { if (!testjnOverride( "onReachedMaxAppCacheSize" )) { super.onReachedMaxAppCacheSize( arg1, arg2, arg3); return; } jInterface.Jnido( this, jchildidx + "onReachedMaxAppCacheSize_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3 } ); }
@Override public void onGeolocationPermissionsShowPrompt(java.lang.String arg1,android.webkit.GeolocationPermissions.Callback arg2) { if (!testjnOverride( "onGeolocationPermissionsShowPrompt" )) { super.onGeolocationPermissionsShowPrompt( arg1, arg2); return; } jInterface.Jnido( this, jchildidx + "onGeolocationPermissionsShowPrompt_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override public void onGeolocationPermissionsHidePrompt(){ if (!testjnOverride( "onGeolocationPermissionsHidePrompt" )) { super.onGeolocationPermissionsHidePrompt(); return; } jInterface.Jnido( this, jchildidx + "onGeolocationPermissionsHidePrompt_" + jlocale + "_", null ); }
@Override public boolean onJsTimeout(){ if (!testjnOverride( "onJsTimeout" )) return super.onJsTimeout(); return (java.lang.Boolean) jInterface.Jnido( this, jchildidx + "onJsTimeout_" + jlocale + "_", null ); }
@Override public void onConsoleMessage(java.lang.String arg1,int arg2,java.lang.String arg3) { if (!testjnOverride( "onConsoleMessage" )) { super.onConsoleMessage( arg1, arg2, arg3); return; } jInterface.Jnido( this, jchildidx + "onConsoleMessage_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3 } ); }
@Override public android.graphics.Bitmap getDefaultVideoPoster(){ if (!testjnOverride( "getDefaultVideoPoster" )) return super.getDefaultVideoPoster(); return (android.graphics.Bitmap) jInterface.Jnido( this, jchildidx + "getDefaultVideoPoster_" + jlocale + "_", null ); }
@Override public android.view.View getVideoLoadingProgressView(){ if (!testjnOverride( "getVideoLoadingProgressView" )) return super.getVideoLoadingProgressView(); return (android.view.View) jInterface.Jnido( this, jchildidx + "getVideoLoadingProgressView_" + jlocale + "_", null ); }
@Override public void getVisitedHistory(android.webkit.ValueCallback arg1) { if (!testjnOverride( "getVisitedHistory" )) { super.getVisitedHistory( arg1); return; } jInterface.Jnido( this, jchildidx + "getVisitedHistory_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
}
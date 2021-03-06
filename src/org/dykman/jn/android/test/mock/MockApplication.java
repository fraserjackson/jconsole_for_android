package org.dykman.jn.android.test.mock;
public class MockApplication extends android.test.mock.MockApplication{
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
public MockApplication(String jlocale,String jchildid,String joverride ){ super(); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", null ); }
@Override public void onCreate(){ if (!testjnOverride( "onCreate" )) { super.onCreate(); return; } jInterface.Jnido( this, jchildidx + "onCreate_" + jlocale + "_", null ); }
@Override public void onTerminate(){ if (!testjnOverride( "onTerminate" )) { super.onTerminate(); return; } jInterface.Jnido( this, jchildidx + "onTerminate_" + jlocale + "_", null ); }
@Override public void onConfigurationChanged(android.content.res.Configuration arg1) { if (!testjnOverride( "onConfigurationChanged" )) { super.onConfigurationChanged( arg1); return; } jInterface.Jnido( this, jchildidx + "onConfigurationChanged_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
}

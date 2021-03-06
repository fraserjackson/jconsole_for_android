package org.dykman.jn.android.graphics.drawable;
public class PaintDrawable extends android.graphics.drawable.PaintDrawable{
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
public PaintDrawable(String jlocale,String jchildid,String joverride ){ super(); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", null ); }
public PaintDrawable(int arg1, java.lang.String jlocale,String jchildid,String joverride ) { super( arg1); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public void setCornerRadius(float arg1) { if (!testjnOverride( "setCornerRadius" )) { super.setCornerRadius( arg1); return; } jInterface.Jnido( this, jchildidx + "setCornerRadius_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public void setCornerRadii(float[] arg1) { if (!testjnOverride( "setCornerRadii" )) { super.setCornerRadii( arg1); return; } jInterface.Jnido( this, jchildidx + "setCornerRadii_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override protected boolean inflateTag(java.lang.String arg1,android.content.res.Resources arg2,org.xmlpull.v1.XmlPullParser arg3,android.util.AttributeSet arg4) { if (!testjnOverride( "inflateTag" )) return super.inflateTag( arg1, arg2, arg3, arg4); return (java.lang.Boolean) jInterface.Jnido( this, jchildidx + "inflateTag_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3, arg4 } ); }
}

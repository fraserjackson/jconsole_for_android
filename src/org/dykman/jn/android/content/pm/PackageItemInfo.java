package org.dykman.jn.android.content.pm;
public class PackageItemInfo extends android.content.pm.PackageItemInfo{
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
public PackageItemInfo(String jlocale,String jchildid,String joverride ){ super(); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", null ); }
public PackageItemInfo(android.content.pm.PackageItemInfo arg1, java.lang.String jlocale,String jchildid,String joverride ) { super( arg1); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
protected PackageItemInfo(android.os.Parcel arg1, java.lang.String jlocale,String jchildid,String joverride ) { super( arg1); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public java.lang.CharSequence loadLabel(android.content.pm.PackageManager arg1) { if (!testjnOverride( "loadLabel" )) return super.loadLabel( arg1); return (java.lang.CharSequence) jInterface.Jnido( this, jchildidx + "loadLabel_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager arg1) { if (!testjnOverride( "loadIcon" )) return super.loadIcon( arg1); return (android.graphics.drawable.Drawable) jInterface.Jnido( this, jchildidx + "loadIcon_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public android.content.res.XmlResourceParser loadXmlMetaData(android.content.pm.PackageManager arg1,java.lang.String arg2) { if (!testjnOverride( "loadXmlMetaData" )) return super.loadXmlMetaData( arg1, arg2); return (android.content.res.XmlResourceParser) jInterface.Jnido( this, jchildidx + "loadXmlMetaData_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override protected void dumpFront(android.util.Printer arg1,java.lang.String arg2) { if (!testjnOverride( "dumpFront" )) { super.dumpFront( arg1, arg2); return; } jInterface.Jnido( this, jchildidx + "dumpFront_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override protected void dumpBack(android.util.Printer arg1,java.lang.String arg2) { if (!testjnOverride( "dumpBack" )) { super.dumpBack( arg1, arg2); return; } jInterface.Jnido( this, jchildidx + "dumpBack_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override public void writeToParcel(android.os.Parcel arg1,int arg2) { if (!testjnOverride( "writeToParcel" )) { super.writeToParcel( arg1, arg2); return; } jInterface.Jnido( this, jchildidx + "writeToParcel_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
}

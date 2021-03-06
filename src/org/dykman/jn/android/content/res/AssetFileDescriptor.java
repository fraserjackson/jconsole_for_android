package org.dykman.jn.android.content.res;
public class AssetFileDescriptor extends android.content.res.AssetFileDescriptor{
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
public AssetFileDescriptor(android.os.ParcelFileDescriptor arg1,long arg2,long arg3, java.lang.String jlocale,String jchildid,String joverride ) { super( arg1, arg2, arg3); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3 } ); }
@Override public java.lang.String toString(){ if (!testjnOverride( "toString" )) return super.toString(); return (java.lang.String) jInterface.Jnido( this, jchildidx + "toString_" + jlocale + "_", null ); }
@Override public long getLength(){ if (!testjnOverride( "getLength" )) return super.getLength(); return (java.lang.Long) jInterface.Jnido( this, jchildidx + "getLength_" + jlocale + "_", null ); }
@Override public void close() throws java.io.IOException{ if (!testjnOverride( "close" )) { super.close(); return; } jInterface.Jnido( this, jchildidx + "close_" + jlocale + "_", null ); }
@Override public android.os.ParcelFileDescriptor getParcelFileDescriptor(){ if (!testjnOverride( "getParcelFileDescriptor" )) return super.getParcelFileDescriptor(); return (android.os.ParcelFileDescriptor) jInterface.Jnido( this, jchildidx + "getParcelFileDescriptor_" + jlocale + "_", null ); }
@Override public java.io.FileDescriptor getFileDescriptor(){ if (!testjnOverride( "getFileDescriptor" )) return super.getFileDescriptor(); return (java.io.FileDescriptor) jInterface.Jnido( this, jchildidx + "getFileDescriptor_" + jlocale + "_", null ); }
@Override public long getStartOffset(){ if (!testjnOverride( "getStartOffset" )) return super.getStartOffset(); return (java.lang.Long) jInterface.Jnido( this, jchildidx + "getStartOffset_" + jlocale + "_", null ); }
@Override public long getDeclaredLength(){ if (!testjnOverride( "getDeclaredLength" )) return super.getDeclaredLength(); return (java.lang.Long) jInterface.Jnido( this, jchildidx + "getDeclaredLength_" + jlocale + "_", null ); }
@Override public java.io.FileInputStream createInputStream() throws java.io.IOException{ if (!testjnOverride( "createInputStream" )) return super.createInputStream(); return (java.io.FileInputStream) jInterface.Jnido( this, jchildidx + "createInputStream_" + jlocale + "_", null ); }
@Override public java.io.FileOutputStream createOutputStream() throws java.io.IOException{ if (!testjnOverride( "createOutputStream" )) return super.createOutputStream(); return (java.io.FileOutputStream) jInterface.Jnido( this, jchildidx + "createOutputStream_" + jlocale + "_", null ); }
@Override public int describeContents(){ if (!testjnOverride( "describeContents" )) return super.describeContents(); return (java.lang.Integer) jInterface.Jnido( this, jchildidx + "describeContents_" + jlocale + "_", null ); }
@Override public void writeToParcel(android.os.Parcel arg1,int arg2) { if (!testjnOverride( "writeToParcel" )) { super.writeToParcel( arg1, arg2); return; } jInterface.Jnido( this, jchildidx + "writeToParcel_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
}

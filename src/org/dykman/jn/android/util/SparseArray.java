package org.dykman.jn.android.util;
public class SparseArray extends android.util.SparseArray{
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
public SparseArray(String jlocale,String jchildid,String joverride ){ super(); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", null ); }
public SparseArray(int arg1, java.lang.String jlocale,String jchildid,String joverride ) { super( arg1); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public java.lang.Object get(int arg1) { if (!testjnOverride( "get" )) return super.get( arg1); return (java.lang.Object) jInterface.Jnido( this, jchildidx + "get_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public java.lang.Object get(int arg1,java.lang.Object arg2) { if (!testjnOverride( "get" )) return super.get( arg1, arg2); return (java.lang.Object) jInterface.Jnido( this, jchildidx + "get_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override public void put(int arg1,java.lang.Object arg2) { if (!testjnOverride( "put" )) { super.put( arg1, arg2); return; } jInterface.Jnido( this, jchildidx + "put_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override public void clear(){ if (!testjnOverride( "clear" )) { super.clear(); return; } jInterface.Jnido( this, jchildidx + "clear_" + jlocale + "_", null ); }
@Override public int size(){ if (!testjnOverride( "size" )) return super.size(); return (java.lang.Integer) jInterface.Jnido( this, jchildidx + "size_" + jlocale + "_", null ); }
@Override public void remove(int arg1) { if (!testjnOverride( "remove" )) { super.remove( arg1); return; } jInterface.Jnido( this, jchildidx + "remove_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public void delete(int arg1) { if (!testjnOverride( "delete" )) { super.delete( arg1); return; } jInterface.Jnido( this, jchildidx + "delete_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public int keyAt(int arg1) { if (!testjnOverride( "keyAt" )) return super.keyAt( arg1); return (java.lang.Integer) jInterface.Jnido( this, jchildidx + "keyAt_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public java.lang.Object valueAt(int arg1) { if (!testjnOverride( "valueAt" )) return super.valueAt( arg1); return (java.lang.Object) jInterface.Jnido( this, jchildidx + "valueAt_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public void setValueAt(int arg1,java.lang.Object arg2) { if (!testjnOverride( "setValueAt" )) { super.setValueAt( arg1, arg2); return; } jInterface.Jnido( this, jchildidx + "setValueAt_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override public int indexOfKey(int arg1) { if (!testjnOverride( "indexOfKey" )) return super.indexOfKey( arg1); return (java.lang.Integer) jInterface.Jnido( this, jchildidx + "indexOfKey_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public int indexOfValue(java.lang.Object arg1) { if (!testjnOverride( "indexOfValue" )) return super.indexOfValue( arg1); return (java.lang.Integer) jInterface.Jnido( this, jchildidx + "indexOfValue_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
}

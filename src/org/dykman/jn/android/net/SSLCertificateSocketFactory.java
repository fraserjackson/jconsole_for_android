package org.dykman.jn.android.net;
public class SSLCertificateSocketFactory extends android.net.SSLCertificateSocketFactory{
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
public SSLCertificateSocketFactory(int arg1, java.lang.String jlocale,String jchildid,String joverride ) throws java.security.NoSuchAlgorithmException,java.security.KeyManagementException{ super( arg1); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public java.net.Socket createSocket(java.net.Socket arg1,java.lang.String arg2,int arg3,boolean arg4) throws java.io.IOException { if (!testjnOverride( "createSocket" )) return super.createSocket( arg1, arg2, arg3, arg4); return (java.net.Socket) jInterface.Jnido( this, jchildidx + "createSocket_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3, arg4 } ); }
@Override public java.net.Socket createSocket(java.net.InetAddress arg1,int arg2,java.net.InetAddress arg3,int arg4) throws java.io.IOException { if (!testjnOverride( "createSocket" )) return super.createSocket( arg1, arg2, arg3, arg4); return (java.net.Socket) jInterface.Jnido( this, jchildidx + "createSocket_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3, arg4 } ); }
@Override public java.net.Socket createSocket(java.net.InetAddress arg1,int arg2) throws java.io.IOException { if (!testjnOverride( "createSocket" )) return super.createSocket( arg1, arg2); return (java.net.Socket) jInterface.Jnido( this, jchildidx + "createSocket_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override public java.net.Socket createSocket(java.lang.String arg1,int arg2,java.net.InetAddress arg3,int arg4) throws java.io.IOException { if (!testjnOverride( "createSocket" )) return super.createSocket( arg1, arg2, arg3, arg4); return (java.net.Socket) jInterface.Jnido( this, jchildidx + "createSocket_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3, arg4 } ); }
@Override public java.net.Socket createSocket(java.lang.String arg1,int arg2) throws java.io.IOException { if (!testjnOverride( "createSocket" )) return super.createSocket( arg1, arg2); return (java.net.Socket) jInterface.Jnido( this, jchildidx + "createSocket_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override public java.lang.String[] getDefaultCipherSuites(){ if (!testjnOverride( "getDefaultCipherSuites" )) return super.getDefaultCipherSuites(); return (java.lang.String[]) jInterface.Jnidox( this, jchildidx + "getDefaultCipherSuites_" + jlocale + "_", null ); }
@Override public java.lang.String[] getSupportedCipherSuites(){ if (!testjnOverride( "getSupportedCipherSuites" )) return super.getSupportedCipherSuites(); return (java.lang.String[]) jInterface.Jnidox( this, jchildidx + "getSupportedCipherSuites_" + jlocale + "_", null ); }
}

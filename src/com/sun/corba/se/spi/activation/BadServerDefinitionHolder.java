package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/BadServerDefinitionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u212/12974/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Monday, April 1, 2019 11:12:33 PM PDT
*/

public final class BadServerDefinitionHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.BadServerDefinition value = null;

  public BadServerDefinitionHolder ()
  {
  }

  public BadServerDefinitionHolder (com.sun.corba.se.spi.activation.BadServerDefinition initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.BadServerDefinitionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.BadServerDefinitionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.BadServerDefinitionHelper.type ();
  }

}

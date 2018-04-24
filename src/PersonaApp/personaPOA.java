package PersonaApp;


/**
* PersonaApp/personaPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from persona.idl
* lunes 23 de abril de 2018 08:01:10 PM COT
*/

public abstract class personaPOA extends org.omg.PortableServer.Servant
 implements PersonaApp.personaOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarpersona", new java.lang.Integer (0));
    _methods.put ("consultarpersona", new java.lang.Integer (1));
    _methods.put ("eliminarpersona", new java.lang.Integer (2));
    _methods.put ("actualizarpersona", new java.lang.Integer (3));
    _methods.put ("listarpersona", new java.lang.Integer (4));
    _methods.put ("shutdown", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // PersonaApp/persona/insertarpersona
       {
         int id = in.read_long ();
         String nombre = in.read_wstring ();
         String apellidos = in.read_wstring ();
         String direccion = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarpersona (id, nombre, apellidos, direccion);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // PersonaApp/persona/consultarpersona
       {
         int id = in.read_long ();
         String $result = null;
         $result = this.consultarpersona (id);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 2:  // PersonaApp/persona/eliminarpersona
       {
         int id = in.read_long ();
         boolean $result = false;
         $result = this.eliminarpersona (id);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // PersonaApp/persona/actualizarpersona
       {
         boolean $result = false;
         $result = this.actualizarpersona ();
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 4:  // PersonaApp/persona/listarpersona
       {
         String $result = null;
         $result = this.listarpersona ();
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 5:  // PersonaApp/persona/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:PersonaApp/persona:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public persona _this() 
  {
    return personaHelper.narrow(
    super._this_object());
  }

  public persona _this(org.omg.CORBA.ORB orb) 
  {
    return personaHelper.narrow(
    super._this_object(orb));
  }


} // class personaPOA

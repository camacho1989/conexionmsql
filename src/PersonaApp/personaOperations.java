package PersonaApp;


/**
* PersonaApp/personaOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from persona.idl
* lunes 23 de abril de 2018 08:01:10 PM COT
*/

public interface personaOperations 
{
  boolean insertarpersona (int id, String nombre, String apellidos, String direccion);
  String consultarpersona (int id);
  boolean eliminarpersona (int id);
  boolean actualizarpersona ();
  String listarpersona ();
  void shutdown ();
} // interface personaOperations


package tpvhostGenTpvhostRESTAzure.uiModels.DTOA;

import tpvhostGenTpvhostRESTAzure.uiModels.DTO.*;
import tpvhostGenTpvhostRESTAzure.uiModels.DTO.utils.*;
import tpvhostGenTpvhostRESTAzure.uiModels.DTO.enumerations.*;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Code autogenerated. Do not modify this file.
 */
public class ProveedorDTOA extends DTOA
{
	// region - Members, getters and setters

	private Integer id;
	public Integer getId () { return id; }
	public void setId (Integer id) { this.id = id; }

	
	private String nombre;
	public String getNombre () { return nombre; }
	public void setNombre (String nombre) { this.nombre = nombre; }
	
	private String numeroTelefono;
	public String getNumeroTelefono () { return numeroTelefono; }
	public void setNumeroTelefono (String numeroTelefono) { this.numeroTelefono = numeroTelefono; }
	
	private String email;
	public String getEmail () { return email; }
	public void setEmail (String email) { this.email = email; }
	
	
	
	
	// endregion
	
	
	
	// region - Constructor and JSON <-> DTOA <-> DTO
	
	public ProveedorDTOA ()
	{
		// Empty constructor
	}
	
	@Override
	public void setFromJSON (JSONObject json)
	{
		try
		{
			if (!JSONObject.NULL.equals(json.opt("Id")))
			{
				this.id = (Integer) json.opt("Id");
			}
			

			if (!JSONObject.NULL.equals(json.opt("Nombre")))
			{
			 
				this.nombre = (String) json.opt("Nombre");
			 
			}

			if (!JSONObject.NULL.equals(json.opt("NumeroTelefono")))
			{
			 
				this.numeroTelefono = (String) json.opt("NumeroTelefono");
			 
			}

			if (!JSONObject.NULL.equals(json.opt("Email")))
			{
			 
				this.email = (String) json.opt("Email");
			 
			}
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public JSONObject toJSON ()
	{
		JSONObject json = new JSONObject();
		
		try
		{
			if (this.id != null){
				json.put("Id", this.id);
			}
			
		
		  if (this.nombre != null)
			json.put("Nombre", this.nombre);
		
		
		  if (this.numeroTelefono != null)
			json.put("NumeroTelefono", this.numeroTelefono);
		
		
		  if (this.email != null)
			json.put("Email", this.email);
		
			
			
		}
		catch (JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
	
	@Override 
	public IDTO toDTO ()
	{
		ProveedorDTO dto = new ProveedorDTO ();
		
		// Attributes
		
	dto.setId (this.getId());

		
	dto.setNombre (this.getNombre());

	dto.setNumeroTelefono (this.getNumeroTelefono());

	dto.setEmail (this.getEmail());

		
		
		// Roles
		
		
		return dto;
	}

	// endregion
}

	
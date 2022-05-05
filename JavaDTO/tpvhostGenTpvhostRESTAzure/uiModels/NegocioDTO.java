	
		package tpvhostGenTpvhostRESTAzure.uiModels.DTO;
		
		import java.util.ArrayList;
		
		import org.json.JSONArray;
		import org.json.JSONException;
		import org.json.JSONObject;
		import  tpvhostGenTpvhostRESTAzure.uiModels.DTO.utils.*;
		import  tpvhostGenTpvhostRESTAzure.uiModels.DTO.enumerations.*;
		
		
		/**
		 * Code autogenerated. Do not modify this file.
		 */
		
		
		public class NegocioDTO 	    implements IDTO
	    {
				private Integer id;
				public Integer getId () { return id; } 
				public void setId  (Integer value) { id = value;  } 
				    	 
				private String nombre;
				public String getNombre () { return nombre; } 
				public void setNombre  (String value) { nombre = value;  } 
				    	 
				private String direccion;
				public String getDireccion () { return direccion; } 
				public void setDireccion  (String value) { direccion = value;  } 
				    	 
				private String ciudad;
				public String getCiudad () { return ciudad; } 
				public void setCiudad  (String value) { ciudad = value;  } 
				    	 
				private String cp;
				public String getCp () { return cp; } 
				public void setCp  (String value) { cp = value;  } 
				    	 
				private String provincia;
				public String getProvincia () { return provincia; } 
				public void setProvincia  (String value) { provincia = value;  } 
				    	 
				private String pais;
				public String getPais () { return pais; } 
				public void setPais  (String value) { pais = value;  } 
				    	 
				private ArrayList<Integer> servicios_oid;
				public ArrayList<Integer>  getServicios_oid () { return servicios_oid; } 
				public void setServicios_oid (ArrayList<Integer> value) { servicios_oid = value;  } 
				    	 
				private Integer empresa_oid;
				public Integer  getEmpresa_oid () { return empresa_oid; } 
				public void setEmpresa_oid (Integer value) { empresa_oid = value;  } 
				    	 
				private ArrayList<Integer> mesa_oid;
				public ArrayList<Integer>  getMesa_oid () { return mesa_oid; } 
				public void setMesa_oid (ArrayList<Integer> value) { mesa_oid = value;  } 
				    	 
				private ArrayList<Integer> caja_oid;
				public ArrayList<Integer>  getCaja_oid () { return caja_oid; } 
				public void setCaja_oid (ArrayList<Integer> value) { caja_oid = value;  } 
				    	 
				private ArrayList<Integer> compraProveedor_oid;
				public ArrayList<Integer>  getCompraProveedor_oid () { return compraProveedor_oid; } 
				public void setCompraProveedor_oid (ArrayList<Integer> value) { compraProveedor_oid = value;  } 
				    	 
				private ArrayList<Integer> producto_oid;
				public ArrayList<Integer>  getProducto_oid () { return producto_oid; } 
				public void setProducto_oid (ArrayList<Integer> value) { producto_oid = value;  } 
				    	 
				private ArrayList<Integer> empleado_oid;
				public ArrayList<Integer>  getEmpleado_oid () { return empleado_oid; } 
				public void setEmpleado_oid (ArrayList<Integer> value) { empleado_oid = value;  } 
				    	 
				private ArrayList<Integer> cliente_oid;
				public ArrayList<Integer>  getCliente_oid () { return cliente_oid; } 
				public void setCliente_oid (ArrayList<Integer> value) { cliente_oid = value;  } 
				    	 
	   
			    public JSONObject toJSON ()
				{
					JSONObject json = new JSONObject();
					
					try
					{
				
						  json.put("Id", this.id.intValue());
				
				
						  json.put("Nombre", this.nombre);
				
				
						  json.put("Direccion", this.direccion);
				
				
						  json.put("Ciudad", this.ciudad);
				
				
						  json.put("Cp", this.cp);
				
				
						  json.put("Provincia", this.provincia);
				
				
						  json.put("Pais", this.pais);
				

						if (this.servicios_oid != null)
						{
							JSONArray jsonArray = new JSONArray();
							for (int i = 0; i < this.servicios_oid.size(); ++i)
							{
								jsonArray.put(this.servicios_oid.get(i));
							}
							json.put("Servicios_oid", jsonArray);
						}
		

						if (this.empresa_oid != null)
						{
							json.put("Empresa_oid", this.empresa_oid.intValue());
						}

						if (this.mesa_oid != null)
						{
							JSONArray jsonArray = new JSONArray();
							for (int i = 0; i < this.mesa_oid.size(); ++i)
							{
								jsonArray.put(this.mesa_oid.get(i));
							}
							json.put("Mesa_oid", jsonArray);
						}
		

						if (this.caja_oid != null)
						{
							JSONArray jsonArray = new JSONArray();
							for (int i = 0; i < this.caja_oid.size(); ++i)
							{
								jsonArray.put(this.caja_oid.get(i));
							}
							json.put("Caja_oid", jsonArray);
						}
		

						if (this.compraProveedor_oid != null)
						{
							JSONArray jsonArray = new JSONArray();
							for (int i = 0; i < this.compraProveedor_oid.size(); ++i)
							{
								jsonArray.put(this.compraProveedor_oid.get(i));
							}
							json.put("CompraProveedor_oid", jsonArray);
						}
		

						if (this.producto_oid != null)
						{
							JSONArray jsonArray = new JSONArray();
							for (int i = 0; i < this.producto_oid.size(); ++i)
							{
								jsonArray.put(this.producto_oid.get(i));
							}
							json.put("Producto_oid", jsonArray);
						}
		

						if (this.empleado_oid != null)
						{
							JSONArray jsonArray = new JSONArray();
							for (int i = 0; i < this.empleado_oid.size(); ++i)
							{
								jsonArray.put(this.empleado_oid.get(i));
							}
							json.put("Empleado_oid", jsonArray);
						}
		

						if (this.cliente_oid != null)
						{
							JSONArray jsonArray = new JSONArray();
							for (int i = 0; i < this.cliente_oid.size(); ++i)
							{
								jsonArray.put(this.cliente_oid.get(i));
							}
							json.put("Cliente_oid", jsonArray);
						}
		
						
					}
					catch (JSONException e)
					{
						e.printStackTrace();
					}
				
				return json;
			}
		
			// endregion
		}
	   
	   
	   
		
	
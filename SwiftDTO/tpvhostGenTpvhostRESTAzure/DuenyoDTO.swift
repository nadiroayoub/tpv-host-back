	
		//
		// DuenyoDTO.swift
		// 
		// Code autogenerated. Do not modify this file.
		//
		
		import Foundation
		import SwiftyJSON
	
		 class DuenyoDTO 	    {
		 
				var dni: String?;
				    	 
		 
				var empresa_oid: [Int]?;
				    	 
		 
				var nombre: String?;
				    	 
		 
				var apellido: String?;
				    	 
		 
				var telefono: String?;
				    	 
		 
				var pass: String?;
				    	 
		 
				var id: Int?;
				    	 
	   	   
			// MARK: - Constructor
			
			
		
			init ()
			{
				// Empty constructor
			}
			 func toDictionary() -> [String : AnyObject]
		
		   
			{
				var dictionary: [String : AnyObject] = [:];
				
			


				
					dictionary["dni"] = self.dni;
				

					dictionary["empresa_oid"] = self.empresa_oid;
			

				
					dictionary["nombre"] = self.nombre;
				

				
					dictionary["apellido"] = self.apellido;
				

				
					dictionary["telefono"] = self.telefono;
				

				
					dictionary["pass"] = self.pass;
				

				
					dictionary["id"] = self.id;
				
						
				return dictionary;
			}
		}
		
	
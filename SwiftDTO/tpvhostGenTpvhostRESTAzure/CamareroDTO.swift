	
		//
		// CamareroDTO.swift
		// 
		// Code autogenerated. Do not modify this file.
		//
		
		import Foundation
		import SwiftyJSON
	
		 class CamareroDTO 	    {
		 
				var id: Int?;
				    	 
		 
				var rol_oid: [Int]?;
				    	 
		 
				var pedido_oid: [Int]?;
				    	 
	   	   
			// MARK: - Constructor
			
			
		
			init ()
			{
				// Empty constructor
			}
			 func toDictionary() -> [String : AnyObject]
		
		   
			{
				var dictionary: [String : AnyObject] = [:];
				
			


				
					dictionary["id"] = self.id;
				

					dictionary["rol_oid"] = self.rol_oid;
			

					dictionary["pedido_oid"] = self.pedido_oid;
			
						
				return dictionary;
			}
		}
		
	
	
		//
		// CocineroDTO.swift
		// 
		// Code autogenerated. Do not modify this file.
		//
		
		import Foundation
		import SwiftyJSON
	
		 class CocineroDTO 	    {
		 
				var id: Int?;
				    	 
		 
				var rol_oid: [Int]?;
				    	 
	   	   
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
			
						
				return dictionary;
			}
		}
		
	
package Saving;

import java.awt.Rectangle;
import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import command.Invoker;
import rivercrosserInterfaces.ICrosser;
import rivercrosserInterfaces.ICrossingStrategy;

public class data {
	
	Rectangle Farmer;
	Rectangle Wolf;
	Rectangle Goat;
	Rectangle Plant;
	
	boolean FarmerLeft;
	boolean WolfLeft;
	boolean GoatLeft;
	boolean PlantLeft;
	
	
	
	
	private boolean BOAT;
	private boolean LEFT;
	private boolean RIGHT;

	
	ArrayList<ICrosser> leftBank = new ArrayList<ICrosser>();
	ArrayList<ICrosser> rightBank = new ArrayList<ICrosser>();
	ArrayList<ICrosser> boat = new ArrayList<ICrosser>();
	
	private boolean leftOrRight;
	
	
	public void save( ICrosser Crosser1, ICrosser Crosser2, ICrosser Crosser3, ICrosser Crosser4, ArrayList<ICrosser> leftBank, ArrayList<ICrosser> rightBank, ArrayList<ICrosser> boat, Invoker inv) {
		
		
		try {
	    	 
	    	 
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.newDocument();
	        
	         Element rootElement = doc.createElement("Level1"); 
	         doc.appendChild(rootElement);
	         Element Farmer = doc.createElement("Farmer");
	         rootElement.appendChild(Farmer); 
	         Farmer.setAttribute("onBoat", Boolean.toString(boat.contains(Crosser1)));
	         Farmer.setAttribute("leftBank", Boolean.toString(leftBank.contains(Crosser1)));
	         Farmer.setAttribute("rightBank", Boolean.toString(rightBank.contains(Crosser1)));
	         
	         //System.out.println(" Mowgood ??"+Boolean.toString(boat.contains(Crosser1)));
	         
	         Element Wolf = doc.createElement("Wolf");
	         rootElement.appendChild(Wolf); 
	         Wolf.setAttribute("onBoat", Boolean.toString(boat.contains(Crosser2)));
	         Wolf.setAttribute("leftBank", Boolean.toString(leftBank.contains(Crosser2)));
	         Wolf.setAttribute("rightBank", Boolean.toString(rightBank.contains(Crosser2)));

	         Element Goat = doc.createElement("Goat");
	         rootElement.appendChild(Goat); 
	         Goat.setAttribute("onBoat", Boolean.toString(boat.contains(Crosser3)));
	         Goat.setAttribute("leftBank", Boolean.toString(leftBank.contains(Crosser3)));
	         Goat.setAttribute("rightBank", Boolean.toString(rightBank.contains(Crosser3)));

	        
	       
	         
	         Element Plant = doc.createElement("Plant");
	         rootElement.appendChild(Plant); 
	         Plant.setAttribute("OnBoat", Boolean.toString(boat.contains(Crosser4)));
	         Plant.setAttribute("leftBank", Boolean.toString(leftBank.contains(Crosser4)));
	         Plant.setAttribute("rightBank", Boolean.toString(rightBank.contains(Crosser4)));
	         

	         
	         leftOrRight = inv.isFromLeftToRightBank();
	         
	         Element Boat = doc.createElement("Boat");
	         rootElement.appendChild(Boat); 
	         Boat.setAttribute("leftBank", Boolean.toString(inv.isBoatOnTheLeftBank()));
	         
	        /* Element Moves = doc.createElement("Moves");
	         rootElement.appendChild(Moves); 
	         Boat.setAttribute("NoOfMoves", Integer.toString(moves));*/
	         
	         // write the content into xml file
	         TransformerFactory transformerFactory = TransformerFactory.newInstance();
	         Transformer transformer = transformerFactory.newTransformer();
	           DOMSource source = new DOMSource(doc);
	         StreamResult result = new StreamResult(new File("Save1.xml"));
	         transformer.transform(source, result);
	         
	         // Output to console for testing
	         //StreamResult consoleResult = new StreamResult(System.out);
	         //transformer.transform(source, consoleResult);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		
	}
	
	public void saveBounds1 (Rectangle Crosser1, Rectangle Crosser2, Rectangle Crosser3, Rectangle Crosser4, boolean Crosser1Check, boolean Crosser2Check, boolean Crosser3Check, boolean Crosser4Check) {
		
		Farmer = Crosser1;
		Wolf = Crosser2;
		Goat = Crosser3;
		Plant = Crosser4;
		
		FarmerLeft = Crosser1Check;
		WolfLeft = Crosser2Check;
		GoatLeft = Crosser3Check;
		PlantLeft = Crosser4Check;

		
	}
	
	
	public void load1(ICrosser Farmer, ICrosser Wolf, ICrosser Goat, ICrosser Plant, Invoker inv) {
		rightBank.clear();
		leftBank.clear();
		//boat.clear();

		
		try {
			 File inputFile = new File("Save1.xml");
		     DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		     DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		     Document doc = dBuilder.parse(inputFile);
		     doc.getDocumentElement().normalize();
		     
		    	/* Farmer = new Farmer("SpriteFarmer.png", "SpriteFarmerR.png");
		    	 Goat = new Creature("SpriteGoat.png","SpriteGoatR.png");
		    	 Wolf = new Creature("SpriteWolf.png", "SpriteWolfR.png");
		    	 Corn = new Creature("SpriteCorn.png", "SpriteCornR.png");*/
		    	 NodeList FarmerList = doc.getDocumentElement().getChildNodes();

		    	 
		    	 	Node farmer =FarmerList.item(0); 
		    	 	if (farmer.getNodeType() == Node.ELEMENT_NODE) {
		    	          

		    	 		Element FarmerElement = (Element) farmer;

		    	           BOAT = Boolean.parseBoolean(FarmerElement.getAttribute("OnBoat")) ;
		    	           LEFT =  Boolean.parseBoolean(FarmerElement.getAttribute("leftBank"));
		    	           RIGHT =  Boolean.parseBoolean(FarmerElement.getAttribute("rightBank"));

		    	           //Farmer.setOnBoat(BOAT);
		    	          // Farmer.setOnLeftRank(LEFT);
		    	          // Farmer.setLabelToBeShown("Farmer" + "\n"+"HARMLESS");

		    	           if(BOAT)
		    	           {

		    	        	  boat.add(Farmer);
		    	           }
		    	           else if (LEFT) {
		    	        	   leftBank.add(Farmer);
		    	           }
		    	           else if (RIGHT)
		    	        	   rightBank.add(Farmer);
		    	 		}
		    	 	Node goat =FarmerList.item(1); 
		    	 	if (goat.getNodeType() == Node.ELEMENT_NODE) {
		    	          Element GoatElement = (Element) goat;
		    	          BOAT = Boolean.parseBoolean(GoatElement.getAttribute("OnBoat")) ;
		      	           LEFT =  Boolean.parseBoolean(GoatElement.getAttribute("leftBank"));
		      	           //Goat.setOnBoat(BOAT);
		      	           //Goat.setOnLeftRank(LEFT);
		      	           //Goat.setEatingRank(1);
		      	           //Goat.setLabelToBeShown("Goat" + "\n"+"HERBIVORES");
		    	           if(BOAT )
		    	           {
		    	        	  boat.add(Goat);
		    	           }
		    	           else if (LEFT) {
		    	        	   leftBank.add(Goat);
		    	           }
		    	           else {
		    	        	   rightBank.add(Goat);
		    	           }
		    	           }
		    	 	
		    	 	Node wolf =FarmerList.item(2); 
		    	 	if (wolf.getNodeType() == Node.ELEMENT_NODE) {
		    	          Element WolfElement = (Element) wolf;
		    	          BOAT = Boolean.parseBoolean(WolfElement.getAttribute("OnBoat")) ;
		   	           	  LEFT =  Boolean.parseBoolean(WolfElement.getAttribute("leftBank"));
		   	           	 // Wolf.setOnBoat(BOAT);
		   	           	 // Wolf.setOnLeftRank(LEFT);
		   	           	 // Wolf.setEatingRank(2);
		   	           	 // Wolf.setLabelToBeShown("Wolf" + "\n"+"CARNIVORES");
		    	           if(BOAT)
		    	           {
		    	        	  boat.add(Wolf);
		    	           }
		    	           else if (LEFT) {
		    	        	   leftBank.add(Wolf);
		    	           }
		    	           else 
		    	        	   rightBank.add(Wolf);
		    	 		}
		    	 	
		    	 	Node corn =FarmerList.item(3); 
		    	 	if (corn.getNodeType() == Node.ELEMENT_NODE) {
		    	          Element CornElement = (Element) corn;
		    	          BOAT = Boolean.parseBoolean(CornElement.getAttribute("OnBoat")) ;
		     	           LEFT =  Boolean.parseBoolean(CornElement.getAttribute("leftBank"));
		    	          // Corn.setOnBoat(BOAT);
		    	          // Corn.setOnLeftRank(LEFT);
		    	          // Corn.setEatingRank(0);
		    	          // Corn.setLabelToBeShown("Corn" + "\n"+"PLANT");
		     	           if(BOAT)//boolean
		    	           {
		    	        	  boat.add(Plant);
		    	           }
		    	           else if (LEFT) {
		    	        	   leftBank.add(Plant);
		    	           }
		    	         else 
		    	        	   rightBank.add(Plant);
		    	 		}
		    	 	Node boat =FarmerList.item(4); 
		    	 	if (boat.getNodeType() == Node.ELEMENT_NODE) {
		    	          Element BoatElement = (Element) boat;
		    	          LEFT =  Boolean.parseBoolean(BoatElement.getAttribute("leftBank"));
			         // NoOfMoves = Integer.parseInt(BoatElement.getAttribute("NoOfMoves"));
		    	          

			          
		    	
		    }
		    

		    }
		   
			catch (Exception e) {
		        e.printStackTrace();
		     }
		
		System.out.println(rightBank);
		System.out.println(leftBank);
		System.out.println(boat);
		System.out.println(inv.isBoatOnTheLeftBank());
		
		rightBank = inv.getCrossersOnRightBank();
		leftBank = inv.getCrossersOnLeftBank();
		boat = inv.getCrossersOnBoat();
		
	}
	
	
	
	
	public void save2( ICrosser Crosser1, ICrosser Crosser2, ICrosser Crosser3, ICrosser Crosser4, ICrosser Crosser5, ArrayList<ICrosser> leftBank, ArrayList<ICrosser> rightBank, ArrayList<ICrosser> boat, Invoker inv) {
		
		
		try {
	    	 
	    	 
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.newDocument();
	        
	         Element rootElement = doc.createElement("Level2"); 
	         doc.appendChild(rootElement);
	         Element Farmer90 = doc.createElement("Farmer90");
	         rootElement.appendChild(Farmer90); 
	         Farmer90.setAttribute("onBoat", Boolean.toString(boat.contains(Crosser1)));
	         Farmer90.setAttribute("leftBank", Boolean.toString(leftBank.contains(Crosser1)));
	         Farmer90.setAttribute("rightBank", Boolean.toString(rightBank.contains(Crosser1)));
	         
	         //System.out.println(" Mowgood ??"+Boolean.toString(boat.contains(Crosser1)));
	         
	         Element Farmer80 = doc.createElement("Farmer80");
	         rootElement.appendChild(Farmer80); 
	         Farmer80.setAttribute("onBoat", Boolean.toString(boat.contains(Crosser2)));
	         Farmer80.setAttribute("leftBank", Boolean.toString(leftBank.contains(Crosser2)));
	         Farmer80.setAttribute("rightBank", Boolean.toString(rightBank.contains(Crosser2)));

	         Element Farmer60 = doc.createElement("Farmer60");
	         rootElement.appendChild(Farmer60); 
	         Farmer60.setAttribute("onBoat", Boolean.toString(boat.contains(Crosser3)));
	         Farmer60.setAttribute("leftBank", Boolean.toString(leftBank.contains(Crosser3)));
	         Farmer60.setAttribute("rightBank", Boolean.toString(rightBank.contains(Crosser3)));

	        
	       
	         
	         Element Farmer40 = doc.createElement("Farmer40");
	         rootElement.appendChild(Farmer40); 
	         Farmer40.setAttribute("OnBoat", Boolean.toString(boat.contains(Crosser4)));
	         Farmer40.setAttribute("leftBank", Boolean.toString(leftBank.contains(Crosser4)));
	         Farmer40.setAttribute("rightBank", Boolean.toString(rightBank.contains(Crosser4)));
	         
	         Element Wolf = doc.createElement("Wolf");
	         rootElement.appendChild(Wolf); 
	         Wolf.setAttribute("OnBoat", Boolean.toString(boat.contains(Crosser5)));
	         Wolf.setAttribute("leftBank", Boolean.toString(leftBank.contains(Crosser5)));
	         Wolf.setAttribute("rightBank", Boolean.toString(rightBank.contains(Crosser5)));
	         

	         
	         leftOrRight = inv.isFromLeftToRightBank();
	         
	         Element Boat = doc.createElement("Boat");
	         rootElement.appendChild(Boat); 
	         Boat.setAttribute("leftBank", Boolean.toString(inv.isBoatOnTheLeftBank()));
	         
	        /* Element Moves = doc.createElement("Moves");
	         rootElement.appendChild(Moves); 
	         Boat.setAttribute("NoOfMoves", Integer.toString(moves));*/
	         
	         // write the content into xml file
	         TransformerFactory transformerFactory = TransformerFactory.newInstance();
	         Transformer transformer = transformerFactory.newTransformer();
	           DOMSource source = new DOMSource(doc);
	         StreamResult result = new StreamResult(new File("Save2.xml"));
	         transformer.transform(source, result);
	         
	         // Output to console for testing
	         //StreamResult consoleResult = new StreamResult(System.out);
	         //transformer.transform(source, consoleResult);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		
	}
	
	
	
	
	
	
	public void load2(ICrosser Farmer90, ICrosser Farmer80, ICrosser Farmer60, ICrosser Farmer40, ICrosser Wolf, Invoker inv) {
		rightBank.clear();
		leftBank.clear();
		boat.clear();

		
		try {
			 File inputFile = new File("Save2.xml");
		     DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		     DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		     Document doc = dBuilder.parse(inputFile);
		     doc.getDocumentElement().normalize();
		     
		    	/* Farmer = new Farmer("SpriteFarmer.png", "SpriteFarmerR.png");
		    	 Goat = new Creature("SpriteGoat.png","SpriteGoatR.png");
		    	 Wolf = new Creature("SpriteWolf.png", "SpriteWolfR.png");
		    	 Corn = new Creature("SpriteCorn.png", "SpriteCornR.png");*/
		    	 NodeList FarmerList = doc.getDocumentElement().getChildNodes();

		    	 
		    	 	Node farmer90 =FarmerList.item(0); 
		    	 	if (farmer90.getNodeType() == Node.ELEMENT_NODE) {
		    	          

		    	 		Element Farmer90Element = (Element) farmer90;

		    	           BOAT = Boolean.parseBoolean(Farmer90Element.getAttribute("OnBoat")) ;
		    	           LEFT =  Boolean.parseBoolean(Farmer90Element.getAttribute("leftBank"));
		    	           RIGHT =  Boolean.parseBoolean(Farmer90Element.getAttribute("rightBank"));

		    	           //Farmer.setOnBoat(BOAT);
		    	          // Farmer.setOnLeftRank(LEFT);
		    	          // Farmer.setLabelToBeShown("Farmer" + "\n"+"HARMLESS");

		    	           if(BOAT)
		    	           {

		    	        	  boat.add(Farmer90);
		    	           }
		    	           else if (LEFT) {
		    	        	   leftBank.add(Farmer90);
		    	           }
		    	           else
		    	        	   rightBank.add(Farmer90);
		    	 		}
		    	 	Node farmer80 =FarmerList.item(1); 
		    	 	if (farmer80.getNodeType() == Node.ELEMENT_NODE) {
		    	          Element Farmer80Element = (Element) farmer80;
		    	          BOAT = Boolean.parseBoolean(Farmer80Element.getAttribute("OnBoat")) ;
		      	          LEFT =  Boolean.parseBoolean(Farmer80Element.getAttribute("leftBank"));
		      	          RIGHT =  Boolean.parseBoolean(Farmer80Element.getAttribute("rightBank"));
		      	           //Goat.setOnBoat(BOAT);
		      	           //Goat.setOnLeftRank(LEFT);
		      	           //Goat.setEatingRank(1);
		      	           //Goat.setLabelToBeShown("Goat" + "\n"+"HERBIVORES");
		    	           if(BOAT )
		    	           {
		    	        	  boat.add(Farmer80);
		    	           }
		    	           else if (LEFT) {
		    	        	   leftBank.add(Farmer80);
		    	           }
		    	           else
		    	        	   rightBank.add(Farmer80);
		    	           
		    	           }
		    	 	
		    	 	Node farmer60 =FarmerList.item(2); 
		    	 	if (farmer60.getNodeType() == Node.ELEMENT_NODE) {
		    	          Element Farmer60Element = (Element) farmer60;
		    	          BOAT = Boolean.parseBoolean(Farmer60Element.getAttribute("OnBoat")) ;
		   	           	  LEFT =  Boolean.parseBoolean(Farmer60Element.getAttribute("leftBank"));
		   	           	  RIGHT =  Boolean.parseBoolean(Farmer60Element.getAttribute("rightBank"));
		   	           	 // Wolf.setOnBoat(BOAT);
		   	           	 // Wolf.setOnLeftRank(LEFT);
		   	           	 // Wolf.setEatingRank(2);
		   	           	 // Wolf.setLabelToBeShown("Wolf" + "\n"+"CARNIVORES");
		    	           if(BOAT)
		    	           {
		    	        	  boat.add(Farmer60);
		    	           }
		    	           else if (LEFT) {
		    	        	   leftBank.add(Farmer60);
		    	           }
		    	           else 
		    	        	   rightBank.add(Farmer60);
		    	 		}
		    	 	
		    	 	Node farmer40 =FarmerList.item(3); 
		    	 	if (farmer40.getNodeType() == Node.ELEMENT_NODE) {
		    	          Element Farmer40Element = (Element) farmer40;
		    	          BOAT = Boolean.parseBoolean(Farmer40Element.getAttribute("OnBoat")) ;
		     	           LEFT =  Boolean.parseBoolean(Farmer40Element.getAttribute("leftBank"));
		     	           RIGHT =  Boolean.parseBoolean(Farmer40Element.getAttribute("rightBank"));

		    	          // Corn.setOnBoat(BOAT);
		    	          // Corn.setOnLeftRank(LEFT);
		    	          // Corn.setEatingRank(0);
		    	          // Corn.setLabelToBeShown("Corn" + "\n"+"PLANT");
		     	           if(BOAT)//boolean
		    	           {
		    	        	  boat.add(Farmer40);
		    	           }
		    	           else if (LEFT) {
		    	        	   leftBank.add(Farmer40);
		    	           }
		    	           else 
		    	        	   rightBank.add(Farmer40);
		    	 		
		    	 	}
		    	 	
		    	 	Node wolf =FarmerList.item(4); 
		    	 	if (wolf.getNodeType() == Node.ELEMENT_NODE) {
		    	          Element WolfElement = (Element) wolf;
		    	          BOAT = Boolean.parseBoolean(WolfElement.getAttribute("OnBoat")) ;
		     	           LEFT =  Boolean.parseBoolean(WolfElement.getAttribute("leftBank"));
		     	           RIGHT =  Boolean.parseBoolean(WolfElement.getAttribute("rightBank"));

		    	          // Corn.setOnBoat(BOAT);
		    	          // Corn.setOnLeftRank(LEFT);
		    	          // Corn.setEatingRank(0);
		    	          // Corn.setLabelToBeShown("Corn" + "\n"+"PLANT");
		     	           if(BOAT)//boolean
		    	           {
		    	        	  boat.add(Wolf);
		    	           }
		    	           else if (LEFT) {
		    	        	   leftBank.add(Wolf);
		    	           }
		    	           else 
		    	        	   rightBank.add(Wolf);
		    	 		
		    	 	}
		    	 	
		    	 	Node boat =FarmerList.item(4); 
		    	 	if (boat.getNodeType() == Node.ELEMENT_NODE) {
		    	          Element BoatElement = (Element) boat;
		    	          LEFT =  Boolean.parseBoolean(BoatElement.getAttribute("leftBank"));
			         // NoOfMoves = Integer.parseInt(BoatElement.getAttribute("NoOfMoves"));
			          
		    	
		    }
		    	 	
		    

		}
		    	 	
		   
			catch (Exception e) {
		        e.printStackTrace();
		     }
		
		System.out.println(rightBank);
		System.out.println(leftBank);
		System.out.println(boat);
		System.out.println(inv.isBoatOnTheLeftBank());
		
		rightBank = inv.getCrossersOnRightBank();
		leftBank = inv.getCrossersOnLeftBank();
		boat = inv.getCrossersOnBoat();
		
	}
}
	
	
	
	
	

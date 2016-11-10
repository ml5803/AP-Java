package caveExplorer;

public class Inventory {
	private boolean hasMap;
	private String map;
	
	public Inventory(){
		hasMap = false;
		updateMap();
	}
	
	public void updateMap() {
		// TODO Auto-generated method stub
		map = " ";
		String text = "";
		for (int i = 0; i < CaveExplorer.caves[0].length -1; i++){
			map+= "____"; 
		}
		map +="___\n"; //3 underscores
		for(CaveRoom[] row: CaveExplorer.caves){
			//rows of text
			//text = "|";
			for (int i = 0; i <3; i++){
				//a line of text for each room
				for(CaveRoom cr: row){
					if (cr.getDoor(CaveRoom.WEST)!=null && cr.getDoor(CaveRoom.WEST).isOpen()){
						text = " ";
					}else{
						text+="|";
					}
					if (i==0){
						text+="   ";// 3 spaces
					}else if (i==1){
						text+= " "+ cr.getContents() + " ";
					}else if (i==2){
						if(cr.getDoor(CaveRoom.SOUTH)!= null && cr.getDoor(CaveRoom.SOUTH).isOpen()){
							text+="   ";// 3 spaces
						}else{
							text+="___";// 3 horizontal lines
						}
					}
				}// last CaveRoom in row
				text+="|";
				map+=text+"\n";
			}
		}//last row
	}

	public  String getDescription(){
		if(hasMap){
			return map;
		}
		else{
			return "There is nothing in your inventory";
		}
	}

	public void setMap(boolean b) {
		hasMap = b;
	}
}

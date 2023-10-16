
//package enum;

public enum vehcolor { 
        BLACK(2000), WHITE(2500), RED(3000), SILVER(4500);

        
            //private int price;
	// Menu(int price) {
	// 	//super(name(),ordinal());
	// 	System.out.println("in paramed constr");
	// 	this.price=price;
	// }
        private int price;
        vehcolor(int price){
            //  System.out.println("in para constr");
             this.price =price;
        }

        @Override
        public String toString()
        {
            return name()+" @ "+price;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }

        public void showClr(){
            System.out.println("available colors with price are: " );
        	for (vehcolor m : vehcolor.values())
					System.out.println(m +" ");
        }
        /*@Override
        public boolean equals(Object o)
        {
            return true;
        }*/

 

    
}


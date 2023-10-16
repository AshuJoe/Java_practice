

public enum VehModels{
    HATCHBACK(200000), SUV(1500000), XUV(1800000), ATV(320000), MONSTER(400000);
    
    private int vprice; 

    VehModels(int vprice){
        this.vprice=vprice;
    }

    
    @Override
        public String toString()
        {
            return name()+" @ "+vprice;
        }

    public void showmodels(){
        for (VehModels i : VehModels.values())          
        System.out.println(i+ " ");
    }

    public int getprice(){

        return vprice;
    }
}
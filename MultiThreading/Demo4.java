class clock implements Runnable{
    public void run(){
        try{
            int SS = 00;
            int MM = 00;
            int HH = 00;
            while(true){
                SS++;
                if(SS==60){
                MM++;
                SS=0;
                if(MM==60){
                    HH++;
                    MM=0; 
                    SS=0;
                    if(HH==24){
                        HH=0;
                        MM=0;
                        SS=0;
                    }
                }
            }
                System.out.print("\rThe time is: " + HH + ": "+ MM + ": " + SS);
 
                Thread.sleep(1000);
            
            }
 
 
        }
        catch(Exception e){}
    }
}
 
class Demo4{
    public static void main(String [] args){
        clock c = new clock();
        Thread t = new Thread(c);
        try{
            t.start();
            Thread.sleep(1000);
        }
        catch(Exception e){}
    }
}
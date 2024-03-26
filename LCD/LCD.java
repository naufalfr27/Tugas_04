package LCD;

public class LCD {
    //isi bagian ini
    private String Status;
    private int volume;
    private int brightness;
    private String cable;

    public LCD(){
        this.Status = "off";
    }
    
    //buat method yang ada pada soal 
    public void turnOff(){
        this.Status = "off";
    }

    public void turnOn(){
        this.Status = "on";
    }

    public void Freeze(){
        this.Status = "freeze";
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume){
        this.volume = volume;        
    }

    public void volumeUp(){
        this.volume++;                
    }

    public void volumeDown(){
        this.volume--;                
    }

    public int getBrightness(){
        return this.brightness;
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    public void brightnessUp(){
        this.brightness++;     
    }

    public void brightnessDown(){
        this.brightness--;      
    }

    public void setCable(int option) {
        //lengkapi method ini dengan mennggunakan array
        String[] cable = {"VGA", "DVI", "HDMI", "DisplayPort"};
        if(option >= 0 || option < cable.length){
            this.cable = cable[option];
        } else{
            System.out.println("Pilihan tidak valid");
        }
    }
    
    public void displayMessage() {
        //lengkapi method ini
        System.out.println("LCD Status: " + this.Status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Cable: " + this.cable);
        
    }
}
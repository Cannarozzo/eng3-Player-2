
package flywight.media;

public class Audio extends Media{

    public Audio(String name, String artist, int duration) {
        super(name, artist, duration);
    }

    @Override
    public void play() {
        System.out.println("Playing" + this);
    }
    
    @Override
    public String toString(){
        return "Audio" + super.toString();
    }
    
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj==null||!(obj instanceof Audio))
            return false;
        Audio other = (Audio)obj;
        if (getName()==null){
            if (other.getName()!=null)
                return false;
                return true;
        }
        return getName().equals(other.getName());
    }
    
    
    public static void main(String ... args){
        Audio audio = new Audio("foo","foo",0);
        Audio audio2 = new Audio("foo","foo",0);
        
        System.out.println(audio.equals(audio2));
    }
}

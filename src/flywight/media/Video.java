
package flywight.media;

public class Video extends Media{

    public Video(String name, String artist, int duration) {
        super(name, artist, duration);
    }

    @Override
    public void play() {
       System.out.println("Playing" + this);
    }
    
    @Override
    public String toString(){
        return "Video" + super.toString();
    }
    
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj==null||!(obj instanceof Video))
            return false;
        Video other = (Video)obj;
        if (getName()==null){
            if (other.getName()!=null)
                return false;
                return true;
        }
        return getName().equals(other.getName());
    }
    
    
    public static void main(String ... args){
        Video v = new Video("foo","foo",0);
        Video v2 = new Video("foo","foo", 0);
        
        System.out.println(v.equals(v2));
    }
    
}

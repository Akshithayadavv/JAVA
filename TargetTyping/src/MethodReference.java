interface IMovie{
    public boolean check(int id);
}

public class MethodReference {
    public void testMovieMethodRef(){
        IMovie m1=(i)->i<100?true:false;
        IMovie m2=MethodReference::isClassic;
    }

    private void testMovieInstanceMethodRef(){
        MethodReference ref=new MethodReference();
        IMovie e1=(i)-> i>10 && i<100?true:false;
        IMovie e2=ref:: isTop10;
    }
    private  void testMovieArbitaryobjectMethod(){
        IMovie m1=SomeMethodReference::isComedy;


    }
    public boolean isTop10(int movieId){
        return true;
    }
    public static boolean isClassic(int movieId){
        return true;}
        public static void main(String[] args){
           MethodReference client =new MethodReference();
        }
    }
class SomeMethodReference{
        public static boolean isComedy(int i){
            return false;
        }
}



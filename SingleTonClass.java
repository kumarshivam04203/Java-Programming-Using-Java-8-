// write a java program to create a singleton class 

public class SingleTonClass{
    private static SingleTonClass instace;

    private SingleTonClass(){

    }
    private static SingleTonClass getInsance(){
        if(instace == null){
            synchronized (SingleTonClass.class){
                if(instace == null){
                    instace = new SingleTonClass();
                }
            }
        }
        return instace;
    }
    public static void main(String[] args) {
        SingleTonClass singleTonClass1 = SingleTonClass.getInsance();
        SingleTonClass singleTonClass2 = SingleTonClass.getInsance();

        if(singleTonClass1 == singleTonClass2){
            System.out.println("Both object are same");
        }else{
            System.out.println("Both object are different");
        }
    }
}
public class TestSingleton{
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
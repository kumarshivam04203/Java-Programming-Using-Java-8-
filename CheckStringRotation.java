public class CheckStringRotation{
    public static void main(String[] args) {
        String str1 = "cloudtech";
        String str2 = "cloudtech";

        if(str1.length() != str2.length()){
            System.out.println("String does not rotation");
        }

        str1 = str1+str1; // cloudtechcloudtech
        if(str1.indexOf(str2 ) != -1){
            System.out.println("String is rotation");
        }else{
            System.out.println("String does not rotation");
        }
    }
}
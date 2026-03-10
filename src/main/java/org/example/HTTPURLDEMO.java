//package org.example;
//
//import java.net.*;
//import java.net.HttpURLConnection;
//
//
//public class HTTPURLDEMO {
//    public static void main(String[] args) {
//        try {
//            URL url = new URL("https://www.google.com/search?q=greek+for+greek&oq=greek+for&gs_lcrp=EgZjaHJvbWUqCggAEAAYsQMYgAQyCggAEAAYsQMYgAQyBwgBEAAYgAQyBwgCEAAYgAQyBwgDEAAYgAQyBggEEEUYOTIPCAUQLhgKGMcBGNEDGIAEMgcIBhAAGIAEMgcIBxAAGIAEMgcICBAAGIAEMgcICRAAGIAE0gEJNDA2OWowajE1qAIIsAIB8QVPK9vcz7v4cg&sourceid=chrome&ie=UTF-8");
//            HttpURLConnection huc =(HttpURLConnection)url.openConnection();
//
////            for(int i=1;i<=8;i++){
////                System.out.println(huc.getHeaderFieldKey(i)+"="+huc.getHeaderFieldKey(i));
////
////            }
//            int i = 0;
//            while (huc.getHeaderFieldKey(i) != null) {
//                System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
//                i++;
//            }
////            huc.disconnect();
//
//        }catch(Exception e){
//            System.out.println(e);
//        }
//    }
//}

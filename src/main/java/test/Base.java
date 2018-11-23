package test;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        final Base64.Decoder decoder = Base64.getDecoder();
//        final Base64.Encoder encoder = Base64.getEncoder();
//        final String text = "zho";
//        final byte[] textByte = text.getBytes("ISO-8859-1");
////编码
//        final String encodedText = encoder.encodeToString(textByte);
//        System.out.println(encodedText);
//        System.out.println(new String(decoder.decode(encodedText), "ISO-8859-1"));
//        File file=new File("/Users/LG/Documents/游泳信息表.xlsx");
//        System.out.println(file.getName());
//        System.out.println(file.getAbsolutePath());
        String filpath=new String("/a/shp/");
        System.out.println(filpath.replace("/",""));


    }
}

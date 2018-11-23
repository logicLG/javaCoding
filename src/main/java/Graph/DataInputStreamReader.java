package Graph;

import java.io.*;

public class DataInputStreamReader {
    public static void main(String[] args) throws IOException {

        InputStream is = null;
        DataInputStream dis = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        is = new FileInputStream("/Users/LG/Documents/pratice/idea project/javaCoding/src/Graph/tinyG.txt");
        DataInputStream dataInputStream=new DataInputStream(is);
        System.out.println(dataInputStream.readLine());
//        InputStreamReader inputStreamReader=new InputStreamReader(is);
//
//        BufferedReader br = new BufferedReader(inputStreamReader);
//        System.out.println(br.readLine());

//        int[] i = {65};
//
//        try{
//            // create file output stream
//            fos = new FileOutputStream("/Users/LG/Documents/pratice/idea project/javaCoding/src/Graph/test");
//
//            // create data output stream
//            dos = new DataOutputStream(fos);
//
//            // for each int in int buffer
//            for(int j:i)
//            {
//                // write int to data output stream
//                dos.writeInt(j);
//            }
//
//            // force data to the underlying file output stream
//            dos.flush();
//
//            // create file input stream
//            is = new FileInputStream("/Users/LG/Documents/pratice/idea project/javaCoding/src/Graph/test");
//
//            // create new data input stream
//            dis = new DataInputStream(is);
//
//            // available stream to be read
//            while(dis.available()>0)
//            {
//                // read four bytes from data input, return int
//                int k = dis.readInt();
//
//                // print int
//                System.out.print(k+" ");
//            }
//        }catch(Exception e){
//            // if any error occurs
//            e.printStackTrace();
//        }finally{
//
//            // releases all system resources from the streams
//            if(is!=null)
//                is.close();
//            if(dis!=null)
//                dis.close();
//            if(fos!=null)
//                fos.close();
//            if(dos!=null)
//                dos.close();
//        }
    }
}

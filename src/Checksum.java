import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

public class Checksum {
    public static void main(String[] args) {
        String test = "test";
        byte[] bytes = test.getBytes();

        String test2 = "test";
        byte[] bytes2 = test2.getBytes();

        System.out.println(getCRC32Checksum(bytes));
        System.out.println(getCRC32Checksum(bytes2));



    }

    public static long getCRC32Checksum(byte[] bytes) {
//        Checksum crc32 = new CRC32();  Baeldung used Checksum here, but it causes an error
        CRC32 crc32 = new CRC32();
        crc32.update(bytes, 0, bytes.length);
        return crc32.getValue();
    }

    /*when using larger data sets of binary data, we would not want to use the approach above because
    * every byte is loaded to memory */
    public static long getChecksumCRC32(InputStream stream, int bufferSize)
            throws IOException {
        CheckedInputStream checkedInputStream = new CheckedInputStream(stream, new CRC32());
        byte[] buffer = new byte[bufferSize];
        while (checkedInputStream.read(buffer, 0, buffer.length) >= 0) {}
        return checkedInputStream.getChecksum().getValue();
    }



}

//example from Baeldung https://www.baeldung.com/java-checksums

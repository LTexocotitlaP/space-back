package mx.com.chicatanas.infrastructure.util;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class ImageUtils {

    public static byte[] compressImage(byte[] data) {
        Deflater deflater = new Deflater();
        deflater.setLevel(Deflater.BEST_COMPRESSION);
        deflater.setInput(data);
        deflater.finish();

        ByteArrayOutputStream output = new ByteArrayOutputStream(data.length);
        byte[] tmp = new byte[4096];
        while (!deflater.finished()) {
            int size = deflater.deflate(tmp);
            output.write(tmp, 0, size);
        }
        return output.toByteArray();
    }

    public static byte[] decompressImage(byte[] data) {
        Inflater inflater = new Inflater();
        inflater.setInput(data);
        ByteArrayOutputStream output = new ByteArrayOutputStream(data.length);
        byte[] tmp = new byte[4096];
        try {
            while (!inflater.finished()) {
                int count = inflater.inflate(tmp);
                output.write(tmp, 0, count);
            }
        } catch (Exception ignored) { }
        return output.toByteArray();
    }
}


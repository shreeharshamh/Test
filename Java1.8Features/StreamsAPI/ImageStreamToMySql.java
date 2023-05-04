import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;

public class ImageStreamToMySql {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/imagedb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Ranger#5407";
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public static void main(String[] args) {
        String folderPath = "C:/Users/Windows/Desktop/Resources/Images/BikeImages"; // Change this to the path of your image folder

        try {
            Map<String, BufferedImage> imageMap = getImagesFromFolder(folderPath);
            storeImagesInDatabase(imageMap);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static Map<String, BufferedImage> getImagesFromFolder(String folderPath) throws IOException {
        File folder = new File(folderPath);

        Map<String, BufferedImage> imageMap = new HashMap<>();

        // Get a list of files in the folder that have an image file extension
        File[] imageFiles = folder.listFiles((dir, name) -> name.endsWith(".png") || name.endsWith(".jpg") || name.endsWith(".jpeg"));

        // Use Java streams to read each image file and add it to the imageMap
        imageMap = Arrays.stream(imageFiles)
                .collect(Collectors.toMap(File::getName, ImageStreamToMySql::readImage));

        return imageMap;
    }

    private static BufferedImage readImage(File file) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
    
    public static void storeImagesInDatabase(Map<String, BufferedImage> imageMap) throws SQLException, IOException {
        
        try (
            
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO images (name, data) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            for (Map.Entry<String, BufferedImage> entry : imageMap.entrySet()) {
                String name = entry.getKey();
                BufferedImage image = entry.getValue();
                
                // Convert the image to a byte array for storage in the database
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "jpg", baos);
                byte[] imageData = baos.toByteArray();
                baos.close();

                stmt.setString(1, name);
                stmt.setBytes(2, imageData);
                stmt.executeUpdate();
            }
        }
    }
}
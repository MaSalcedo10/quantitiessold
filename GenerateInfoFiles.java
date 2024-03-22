import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateInfoFiles {
    public static void main(String[] args) {
        try {
            createSalesMenFiles(10); // Generar 10 archivos de ventas de vendedores
            createProductsFile(20); // Generar archivo de productos con 20 productos
            createSalesManInfoFile(10); // Generar archivo de información de vendedores con 10 vendedores
            System.out.println("Archivos generados con éxito.");
        } catch (IOException e) {
            System.err.println("Error al generar los archivos: " + e.getMessage());
        }
    }

    // Métodos de generación de archivos de prueba
    private static void createSalesMenFiles(int count) throws IOException {
        for (int i = 1; i <= count; i++) {
            int positionListSalesmen =  generateRandomListSalesmen();
            try (FileWriter writer = new FileWriter( "D:\\POLITECNICO\\Ingenieria de software\\6 SEMESTRE\\CONCEPTOS FUNDAMENTALES DE PROGRAMACION\\TRABAJO COLABORATIVO\\quantitiessold\\files\\sales"+LIST_SALESMEN[positionListSalesmen][0] +"_"+ LIST_SALESMEN[positionListSalesmen][1] + ".txt")) {
                for (int j = 1; j <= 10; j++) {
                    int positionListProducts = generateRandomListProducts();
                    writer.write(LIST_PRODUCTS[positionListProducts][0]  + ";" + generateRandomQuantity() + "\n");
                }
            }
        }
    }

    private static void createProductsFile(int count) throws IOException {
        try (FileWriter writer = new FileWriter("D:\\POLITECNICO\\Ingenieria de software\\6 SEMESTRE\\CONCEPTOS FUNDAMENTALES DE PROGRAMACION\\TRABAJO COLABORATIVO\\quantitiessold\\files\\products\\products.txt")) {
            Random random = new Random();
            for (int i = 1; i <= count; i++) {
                int randomNumber = random.nextInt(1000);
                int positionListProducts = generateRandomListProducts();
                writer.write( LIST_PRODUCTS[positionListProducts][0] + ";" +
                        LIST_PRODUCTS[positionListProducts][1] + ";" +
                        LIST_PRODUCTS[positionListProducts][2] + "\n");
            }
        }
    }

    private static void createSalesManInfoFile(int count) throws IOException {
        try (FileWriter writer = new FileWriter("D:\\POLITECNICO\\Ingenieria de software\\6 SEMESTRE\\CONCEPTOS FUNDAMENTALES DE PROGRAMACION\\TRABAJO COLABORATIVO\\quantitiessold\\files\\salesmen\\salesmen_info.txt")) {
            Random random = new Random();
            for (int i = 1; i <= count; i++) {
                int positionListSalesmen =  generateRandomListSalesmen();
                writer.write(LIST_SALESMEN[positionListSalesmen][0] +";"+
                        LIST_SALESMEN[positionListSalesmen][1] +";"+
                        LIST_SALESMEN[positionListSalesmen][2] +";"+
                        LIST_SALESMEN[positionListSalesmen][3] + "\n");
            }
        }
    }

    private static int generateRandomQuantity() {
        return new Random().nextInt(100) + 1;
    }

    private static Integer generateRandomListSalesmen() {
        Random random = new Random();
        int index = random.nextInt(LIST_SALESMEN.length);
        return index;
    }

    private static Integer generateRandomListProducts() {
        Random random = new Random();
        int index = random.nextInt(LIST_PRODUCTS.length);
        return index;
    }

    private static String[][] LIST_SALESMEN = {
            {"Cedula", "1234", "Diana Patricia", "Lopez Trujillo"},
            {"Tarjeta de identidad", "5678", "Johanna Jisell", "Gutierrez Aranda"},
            {"Pasaporte", "91011", "Carlos Andres", "Martinez Hernandez"},
            {"Nit", "121314", "Luis Alberto", "Rodriguez Gomez"},
            {"Cedula", "151617", "Ana Maria", "Perez Sanchez"},
            {"Tarjeta de identidad", "181920", "Pedro Andres", "Garcia Diaz"},
            {"Pasaporte", "212223", "Sofia Juliana", "Lopez Gutierrez"},
            {"Nit", "242526", "Andres Felipe", "Martinez Gomez"},
            {"Cedula", "272829", "Juliana Andrea", "Gutierrez Rodriguez"},
            {"Tarjeta de identidad", "303132", "Juan David", "Sanchez Perez"},
            {"Pasaporte", "333435", "Maria Fernanda", "Diaz Hernandez"},
            {"Nit", "363738", "Camila Alejandra", "Perez Garcia"},
            {"Cedula", "394041", "Daniel Alejandro", "Rodriguez Martinez"},
            {"Tarjeta de identidad", "424344", "Laura Marcela", "Sanchez Gomez"},
            {"Pasaporte", "454647", "Diego Esteban", "Gomez Perez"},
            {"Nit", "484950", "Valentina Sofia", "Hernandez Diaz"},
            {"Cedula", "515253", "Mariana Isabel", "Martinez Sanchez"},
            {"Tarjeta de identidad", "545556", "Jose Manuel", "Garcia Diaz"},
            {"Pasaporte", "575859", "Catalina Andrea", "Diaz Rodriguez"},
            {"Nit", "606162", "Mateo Alejandro", "Sanchez Hernandez"}
    };

    private static final String[][] LIST_PRODUCTS = {
            {"1","Traje","250000"},
            {"2","Brasier","40000"},
            {"3","Sudadera","80000"},
            {"4","Zapatilla","160000"},
            {"5","Esqueleto","25000"},
            {"6","Pijama","100000"},
            {"7","Botas","98000"},
            {"8","Gorra","30000"},
            {"9","Corbata","25000"},
            {"10","Calcetines","12000"},
            {"11","Falda","50000"},
            {"12","Blusa","60000"},
            {"13","Vestido","120000"},
            {"14","Chaqueta","180000"},
            {"15","Guantes","65000"},
            {"16","Bufanda","15000"},
            {"17","Zapatos","300000"},
            {"18","Sombrero","75000"},
            {"19","Pantalón","75000"},
            {"20","Camisa","","45000"}
    };
}

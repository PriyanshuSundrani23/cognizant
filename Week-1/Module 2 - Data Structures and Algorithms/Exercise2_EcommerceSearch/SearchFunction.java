import java.util.Arrays;

public class SearchFunction {

    // Linear Search
    public static Product linearSearch(Product[] products, String productId) {
        for (Product p : products) {
            if (p.getProductId().equals(productId)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(productId);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("P03", "Tablet", "Electronics"),
            new Product("P01", "Laptop", "Electronics"),
            new Product("P04", "Desk", "Furniture"),
            new Product("P02", "Phone", "Electronics")
        };

        // Linear Search Test
        System.out.println("Linear Search:");
        Product found = linearSearch(products, "P04");
        System.out.println(found != null ? "Found: " + found : "Not Found");

        // Binary Search Test (Requires Sorted Array)
        Arrays.sort(products); // Sorting by productId as defined in compareTo
        System.out.println("\nBinary Search (After sorting):");
        found = binarySearch(products, "P02");
        System.out.println(found != null ? "Found: " + found : "Not Found");
    }
}

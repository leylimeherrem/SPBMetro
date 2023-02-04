public class Basket {

    public static int count;
    private static String items = "";
    private static int totalPrice = 0;
    private int limit;

    public static int totalItems;

    public static int allBasketsCost;

    public static void increaseTotalItems(int count) {
    Basket.totalItems = totalItems + count;
    }

    public static void increaseTotalCost(int totalPrice) {
        Basket.allBasketsCost = allBasketsCost + totalPrice;
    }

    //метод расчёта средней цены товара во всех корзинах
    public static double averageItemPrice() {
        return allBasketsCost / totalItems;
    }


    //метод расчёта средней стоимости корзины
    public static double averageBasketPrice() {
        return allBasketsCost / Basket.count;
    }

    public static int getTotalItems() {
        return totalItems;
    }

    public static void setTotalItems(int totalItems) {
        Basket.totalItems =+ totalItems;
    }

    public static int getAllBasketsCost() {
        return allBasketsCost;
    }

    public static void setAllBasketsCost(int allBasketsCost) {
        Basket.allBasketsCost = allBasketsCost;
    }

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

}


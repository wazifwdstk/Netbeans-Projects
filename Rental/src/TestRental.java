    public static void main(String[] args) {
       
       HotelRoom room1 = new HotelRoom(1,101, "Deluxe") {};
       HotelRoom room2 = new HotelRoom(2, 202, "Premium") {};
       
       System.out.println(room1.toString());
       System.out.println();
       System.out.println(room2.toString());
       System.out.println();
       System.out.println("\n\n Rental rate comparison result = " +room2.compareTo(room1));
    }
}
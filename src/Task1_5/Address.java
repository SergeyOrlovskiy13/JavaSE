package Task1_5;

public class Address {
        public String getCountry() {
                return Country;
        }

        public String getCity() {
                return City;
        }

        public String getStreet() {
                return Street;
        }

        public String getHouse() {
                return House;
        }

        public String getApartment() {
                return Apartment;
        }

        public String getIndex() {
                return Index;
        }

        public void setIndex(String index) {
                Index = index;
        }

        public void setCountry(String country) {
                Country = country;
        }

        public void setCity(String city) {
                City = city;
        }

        public void setStreet(String street) {
                Street = street;
        }

        public void setHouse(String house) {
                House = house;
        }

        public void setApartment(String apartment) {
                Apartment = apartment;
        }
        public String Index;
        public String Country ;
        public String City;
        public String Street;
        public String House;
        public String Apartment;

        public Address(){
        }
        public Address(String Index,String Country,
                       String City, String Street, String House,String Apartment){
                this.Index = Index;
                this.Country = Country;
                this.City = City;
                this.Street =Street;
                this.House = House;
                this.Apartment =Apartment;

        }
        public static void main(String[] args) {
                Address a= new Address("02600","Ukraine","Kiev","Borispolska","21","9");
                System.out.println("Index = " + a.getIndex());
                System.out.println("Country = " + a.getCountry());
                System.out.println("City = " + a.getCity());
                System.out.println("street = " + a.getStreet());
                System.out.println("House = " + a.getHouse());
                System.out.println("Apartment = " + a.getApartment());
                a.setHouse("34");
                a.setCity("Kharkov");
                a.setIndex("03560");
                a.setStreet("Pobedu");
                a.setApartment("15");
                System.out.println("Index = " + a.getIndex());
                System.out.println("Country = " + a.getCountry());
                System.out.println("City = " + a.getCity());
                System.out.println("street = " + a.getStreet());
                System.out.println("House = " + a.getHouse());
                System.out.println("Apartment = " + a.getApartment());
        }

}


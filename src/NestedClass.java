class NestedClass { // Outer class

    class Inner{ // Inner class

        public void m1(){
            System.out.println("inner class instance m1()");
        }

    }

    public static void main(String[] args) { 
        // create an object to inner class
        NestedClass.Inner obj = new NestedClass().new Inner();
        // call method of an inner class
        obj.m1();
    }

}
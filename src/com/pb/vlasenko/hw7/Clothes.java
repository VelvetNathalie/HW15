package com.pb.vlasenko.hw7;

public abstract class Clothes {

    public enum Size {
        M("Medium",38),
        L("Large",40),
        S("Small",36),
        XS("eXtra Small",34),
        XXS("eXtra eXtra Small",32);

        private String Size;

        public String getSize() {
            return Size;
        }

        public void setSize(String size) {
            Size = size;
        }

        private String description;

        public void setEuroSize(int euroSize) {
            this.euroSize = euroSize;
        }

        private int euroSize;

        //Size(int euroSize) {
          //  this.euroSize = euroSize;
       // }

       // Size(String description) {
           // this.description = description;
       // }

        public String getDescription() {
            switch (description)
            {
                case "XXS":
                    System.out.println("Детский размер  " + XXS);
                    break;
                case "XS":
                    System.out.println("Взрослый размер  " + XS);
                    break;
                case "S":
                    System.out.println("Взрослый размер   " + S);
                    break;
                case "M":
                    System.out.println("Взрослый размер   " + M);
                    break;
                case "L":
                    System.out.println("Взрослый размер 40 " + L);
                    break;

                //throw new IllegalStateException("Unexpected value: " + description);
            }
            return description;
        }


        Size(String description, int euroSize) {
         this.description = description;
        this.euroSize = euroSize;
         }

        public int getEuroSize()

            {
                switch (euroSize) {
                    case 32:
                        System.out.println("Детский размер 32  " + XXS);
                        break;
                    case 34:
                        System.out.println("Взрослый размер 34  " + XS);
                        break;
                    case 36:
                        System.out.println("Взрослый размер 36  " + S);
                        break;
                    case 38:
                        System.out.println("Взрослый размер  38  " + M);
                        break;
                    case 40:
                        System.out.println("Взрослый размер 40 " + L);
                        break;

                }

            return euroSize;
        }
    }

            String name;
            String colour;
            int price;
            String size;

            public String getName () {
                return name;
            }

            public void setName (String name){
                this.name = name;
            }

            public String getColour () {
                return colour;
            }

            public void setColour (String colour){
                this.colour = colour;
            }

            public int getPrice () {
                return price;
            }

            public void setPrice ( int price){
                this.price = price;
            }


     Clothes(String size, String name, String colour, int price)
     {
       this.size = size;
     this.name = name;
     this.colour = colour;
     this.price = price;


    }
    String getinfo()
    {
        return "размер: "+ size + ", название "+name+", цвет: "+colour+", цена: "+price+". ";
    }

    }





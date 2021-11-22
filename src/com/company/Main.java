package com.company;

public class Main {

    public static void main (String[] args ){


                bosd nike = new bosd(9999,888,"the zachita");
                System.out.println(" Boss.health " +  nike.getHealth() + " " + nike.getDamage() + " " + nike.getBossDeafanse ());
            }

            public static heroes[] createHeroes() {
                heroes nike = new heroes(9999,100,"");
                heroes nike2 = new heroes(888,230);
                heroes nike3 = new heroes(77,17,"the bronya");
                heroes[] typeHeroes = {nike,nike2,nike3};
                return typeHeroes;
            }
        }
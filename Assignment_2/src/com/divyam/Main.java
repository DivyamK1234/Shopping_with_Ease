package com.divyam;
import java.util.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<category> category_list = new ArrayList<>();
        ArrayList<product> products = new ArrayList<>();
        ArrayList<Giveaway> gawaydeals = new ArrayList<>();
        ArrayList<Discount> discountDeals = new ArrayList<>();
        ArrayList<Customer> customersList = new ArrayList<>();
        ArrayList<Order> cartsList = new ArrayList<>();
        ArrayList<giveawayOrder> gawayordersList = new ArrayList<>();
        int giveawayID = 0;
        int discountID = 0;

        while (true) {
            System.out.println("Welcome to Flipzone");
            System.out.println("        1)Enter as Admin");
            System.out.println("        2)Explore the product catalog");
            System.out.println("        3)Show Available Deals");
            System.out.println("        4)Enter as Customer");
            System.out.println("        5)Exit the Application");

            int select = sc.nextInt();

            if (select == 5) {
                break;
            }

            if (select == 1) {
                System.out.println("Dear Admin,");
                System.out.println("Please enter your username and password");
                String g = sc.nextLine();
                String name1 = sc.nextLine();
                String pass = sc.nextLine();

                System.out.println("Welcome "+name1+"!!!!");

                while (true) {
                    System.out.println();
                    System.out.println("Please choose any one of the following actions:");
                    System.out.println("1) Add category");
                    System.out.println("2) Delete category");
                    System.out.println("3) Add Product");
                    System.out.println("4) Delete Product");
                    System.out.println("5) Set Discount on Product");
                    System.out.println("6) Add giveaway deal");
                    System.out.println("7) Back");

                    int select1 = sc.nextInt();

                    if (select1==2) {
                        System.out.print("Enter category id: ");
                        float cid = sc.nextFloat();

                        category_list.removeIf(gry -> gry.idd == cid);
                    }

                    if (select1==4) {
                        System.out.print("Enter product id: ");
                        float pid = sc.nextFloat();

                        products.removeIf(prd -> prd.id == pid);
                        System.out.println("Product Deleted !!!");
                    }

                    if (select1==7) {
                        break;
                    }

                    if (select1==1) {
                        System.out.println("Add Category ID");
                        int cat_id = sc.nextInt();

                        System.out.println("Add name of the category");
                        String a = sc.nextLine();
                        String prod_name = sc.nextLine();

                        int flg = 0;

                        for (category cat: category_list) {
                            if (cat.idd==cat_id) {
                                System.out.println("Dear Admin, the category ID is already used!!! Please set a different and a unique category ID");
                                flg ++;
                                break;
                            }
                        }

                        if (flg==1) {
                            continue;
                        }

                        if (flg==0) {
                            category_list.add(new category(cat_id,prod_name));
                        }

                        if (prod_name.equals("Home Appliances")){
                            System.out.println();
                            System.out.println("Add a Product:-");
                            System.out.println();
                            System.out.print("Product Name: ");
                            String nn = sc.nextLine();
                            System.out.print("Product ID: ");
                            float idd = sc.nextFloat();
                            System.out.print("Capacity: ");
                            String ab = sc.nextLine();
                            String cpc = sc.nextLine();
                            System.out.print("Power Consumption: ");
                            String pc = sc.nextLine();
                            System.out.print("Price: ");
                            float pp = sc.nextInt();

                            int flag=0;
                            for (product pd: products) {
                                if (pd.id==idd) {
                                    System.out.println("Dear Admin, the product ID is already used!!! Please set a different and a unique product ID");
                                    flag ++;
                                    break;
                                }
                            }

                            if (flag==1) {
                                continue;
                            }

                            if (flag==0) {
                                products.add(new product(nn, idd, pp));
                                System.out.println("Product Added!!");
                                System.out.println();
                            }

                        }
                        else if (prod_name.equals("Electronics and Gadgets")) {
                            System.out.print("Product Name: ");
                            String nn = sc.nextLine();
                            System.out.print("Product ID: ");
                            float idd = sc.nextFloat();
                            System.out.print("Operating System: ");
                            String df = sc.nextLine();
                            String os = sc.nextLine();
                            System.out.print("Storage capacity: ");
                            String ssc = sc.nextLine();
                            System.out.print("RAM: ");
                            String ram = sc.nextLine();
                            System.out.print("Price: ");
                            float pp = sc.nextInt();

                            int flag=0;
                            for (product pd: products) {
                                if (pd.id==idd) {
                                    System.out.println("Dear Admin, the product ID is already used!!! Please set a different and a unique product ID");
                                    flag++;
                                    break;
                                }
                            }

                            if (flag==1) {
                                continue;
                            }

                            if (flag==0) {
                                products.add(new product(nn, idd, pp));
                                System.out.println("Product Added!!");
                                System.out.println();
                            }

                        }
                        else if (prod_name.equals("Groceries and Vegetables")) {
                            System.out.print("Product Name: ");
                            String nmm = sc.nextLine();
                            System.out.print("Product ID: ");
                            float pidd = sc.nextFloat();
                            System.out.print("Items: ");
                            String dd = sc.nextLine();
                            String it = sc.nextLine();
                            System.out.print("Serves: ");
                            String sr = sc.nextLine();
                            System.out.print("Time sufficient for consumption: ");
                            String ts = sc.nextLine();
                            System.out.print("Price: ");
                            float pp = sc.nextInt();

                            int flag=0;
                            for (product pd: products) {
                                if (pd.id==pidd) {
                                    System.out.println("Dear Admin, the product ID is already used!!! Please set a different and a unique product ID");
                                    flag ++;
                                    break;
                                }
                            }

                            if (flag==1) {
                                continue;
                            }

                            if (flag==0) {
                                products.add(new product(nmm, pidd, pp));
                                System.out.println("Product Added!!");
                                System.out.println();
                            }

                        }
                        else {
                            System.out.print("Product Name: ");
                            String pn = sc.nextLine();
                            System.out.print("Product ID: ");
                            float pid = sc.nextFloat();
                            System.out.print("Price: ");
                            float ppr = sc.nextFloat();

                            int flag=0;
                            for (product pd: products) {
                                if (pd.id==pid) {
                                    System.out.println("Dear Admin, the product ID is already used!!! Please set a different and a unique product ID");
                                    flag++;
                                    break;
                                }
                            }

                            if (flag==1) {
                                continue;
                            }

                            if (flag==0) {
                                products.add(new product(pn, pid, ppr));
                                System.out.println("Product Added!!");
                                System.out.println();
                            }

                        }
                    }

                    if (select1==3) {
                        System.out.print("Enter category ID: ");
                        float idi = sc.nextFloat();

                        int glg = 0;
                        for (category pdd: category_list) {
                            if (pdd.idd == idi) {
                                glg++;
                            }
                        }

                        if (glg==0) {
                            System.out.println("The category does not exist. Please Add it first !!!");
                            continue;
                        }

                        System.out.println();
                        System.out.println("Add a product:-");
                        System.out.print("Product Name: ");
                        String aa = sc.nextLine();
                        String pddn = sc.nextLine();
                        System.out.print("Product ID: ");
                        float pddi = sc.nextFloat();
                        System.out.print("Price: ");
                        float ppri = sc.nextFloat();

                        int flaag=0;
                        for (product pd: products) {
                            if (pd.id==pddi) {
                                System.out.println("Dear Admin, the product ID is already used!!! Please set a different and a unique product ID");
                                flaag++;
                                break;
                            }
                        }

                        if (flaag==1) {
                            continue;
                        }

                        if (flaag==0) {
                            products.add(new product(pddn, pddi, ppri));
                            System.out.println("Product Added!!");
                            System.out.println();
                        }
                    }

                    if (select1==6) {
                        System.out.println("Dear Admin give the Product IDs you want to combine and giveaway a deal for");
                        System.out.print("Enter the first product ID: ");
                        float p1 = sc.nextFloat();
                        System.out.print("Enter the second product ID: ");
                        float p2 = sc.nextFloat();

                        for (product pd: products) {
                            if (pd.id==p1) {
                                for (product pd2 : products) {
                                    if (pd2.id == p2) {
                                        System.out.print("Enter the amount for Normal User: ");
                                        float nu = sc.nextFloat();
                                        System.out.print("Enter the amount for Prime Users: ");
                                        float pu = sc.nextFloat();
                                        System.out.print("Enter the amount for Elite Users: ");
                                        float eu = sc.nextFloat();

                                        gawaydeals.add(new Giveaway(p1,p2,giveawayID,nu,pu,eu));
                                        giveawayID++;
                                        System.out.println("GiveAway Deal Added !!!!");
                                    }
                                }
                            }
                        }
                    }

                    if (select1 == 5) {
                        System.out.println("Dear Admin give the Product ID you want to add discount for:-");
                        System.out.println("Enter the Product ID : ");
                        float iddi = sc.nextFloat();

                        for (product pd: products) {
                            if (pd.id==iddi) {
                                System.out.print("Enter the discount % for normal users: ");
                                float dnu = sc.nextFloat();
                                System.out.print("Enter the discount % for prime users: ");
                                float pnu = sc.nextFloat();
                                System.out.print("Enter the discount % for elite users: ");
                                float enu = sc.nextFloat();

                                float dnorm = pd.price - (pd.price*(dnu/100));
                                float dprim = pd.price - (pd.price*(pnu/100));
                                float delit = pd.price - (pd.price*(enu/100));

                                discountDeals.add(new Discount(dnorm,dprim,delit,iddi,discountID));
                                System.out.println("Discount applied !!!");
                                discountID++;
                            }
                        }
                    }
                }
            }

            if (select==4) {
                while (true) {
                    System.out.println();
                    System.out.println("1) Sign Up");
                    System.out.println("2) Log In");
                    System.out.println("3) Back");

                    int select3 = sc.nextInt();

                    if (select3 == 3) {
                        break;
                    }

                    if (select3 == 1) {
                        System.out.print("Enter Name: ");
                        String ap = sc.nextLine();
                        String nm = sc.nextLine();
                        System.out.print("Enter Password: ");
                        String pp = sc.nextLine();
                        System.out.print("Enter Number: ");
                        String phnNum = sc.nextLine();
                        System.out.println("Enter Email: ");
                        String email = sc.nextLine();

                        customersList.add (new Customer(nm,pp,1000,true,false,false));
                        System.out.println("Customer Successfully Registered !!!");
                    }

                    if (select3 == 2) {
                        System.out.println("Enter Name: ");
                        String jj = sc.nextLine();
                        String nmm = sc.nextLine();
                        System.out.println("Enter Password: ");
                        String pass = sc.nextLine();

                        for (Customer cu: customersList) {
                            if (cu.name.equals(nmm)) {
                                for (Customer cu1: customersList) {
                                    if (cu.password.equals(pass)) {
                                        while (true) {
                                            System.out.println();
                                            System.out.println("Welcome " + nmm + " !!!!");
                                            System.out.println("    1) Browse Products");
                                            System.out.println("    2) Browse Deals");
                                            System.out.println("    3) Add a product to cart");
                                            System.out.println("    4) Add products in deal to cart");
                                            System.out.println("    5) View Coupons");
                                            System.out.println("    6) Check Account Balance");
                                            System.out.println("    7) View Cart");
                                            System.out.println("    8) Empty Cart");
                                            System.out.println("    9) Checkout Cart");
                                            System.out.println("    10) Upgrade Customer Status");
                                            System.out.println("    11) Add amount to wallet");
                                            System.out.println("    12) Back");

                                            int select4 = sc.nextInt();


                                            if (select4 == 6) {
                                                System.out.println("Account Balance is Rupees : "+cu.wallet);
                                            }

                                            if (select4 == 12) {
                                                break;
                                            }

                                            if (select4 == 10) {
                                                System.out.println("Current Status :- ");
                                                System.out.println("NORMAL : "+cu.normal);
                                                System.out.println("PRIME : "+cu.prime);
                                                System.out.println("ELITE : "+cu.elite);
                                                System.out.println();
                                                System.out.println("Choose New Status: ");
                                                String aabb = sc.nextLine();
                                                String stat = sc.nextLine();

                                                if (stat.equals("ELITE")) {
                                                    if (cu.wallet >= 300) {
                                                        cu.elite = true;
                                                        cu.normal = false;
                                                        cu.prime = false;
                                                        cu.wallet -= 300;

                                                        System.out.println("Status Updated to ELITE !!!");
                                                        System.out.println();
                                                    } else {
                                                        System.out.println("Insufficient Balance !!!");
                                                    }
                                                }

                                                if (stat.equals("PRIME")) {
                                                    if (cu.wallet >= 200) {
                                                        cu.elite = false;
                                                        cu.normal = false;
                                                        cu.prime = true;
                                                        cu.wallet -= 200;
                                                        System.out.println("Status Updated to PRIME !!!");
                                                        System.out.println();
                                                    } else {
                                                        System.out.println("Insufficient Balance !!!");
                                                    }
                                                }

                                            }

                                            if (select4 == 3) {
                                                System.out.println("Enter product ID: ");
                                                float pdd = sc.nextFloat();
                                                System.out.println("Quantity: ");
                                                int qty = sc.nextInt();

                                                for (product pod: products) {
                                                    if (pod.id == pdd) {
                                                        cartsList.add(new Order(pod.name, pdd,qty,(pod.price*qty), cu.name));
                                                        System.out.println("Items successfully Added to Cart !!!");
                                                        break;
                                                    }
                                                }
                                            }

                                            if (select4 == 9) {
                                                int ftf = 0;
                                                for (Order ckout: cartsList) {
                                                    if (ckout.person.equals(cu.name)) {
                                                        if (cu.wallet >= ckout.amount) {
                                                            ftf++;
                                                            System.out.println("Your Order is successfully placed !!! . Details:- ");
                                                            if (cu.elite) {
                                                                System.out.println("Product Name: "+ckout.na);
                                                                System.out.println("Product ID: "+ckout.productID);
                                                                System.out.println("Quantity: "+ckout.quantity);
                                                                System.out.println("Price: "+ckout.amount);

                                                                System.out.println("Delivery Charges: "+100);
                                                                System.out.println("Discount: 10% of "+ckout.amount+" = "+(ckout.amount*0.10));
                                                                System.out.println("Total Cost: Rs "+(ckout.amount-(ckout.amount*0.10)+100));
                                                                System.out.println("Your Order will be delivered within 2 days");
                                                                cu.wallet -= (ckout.amount-(ckout.amount*0.10)+100);
                                                                System.out.println();

                                                            }

                                                            else if (cu.prime) {
                                                                System.out.println("Product Name: "+ckout.na);
                                                                System.out.println("Product ID: "+ckout.productID);
                                                                System.out.println("Quantity: "+ckout.quantity);
                                                                System.out.println("Price: "+ckout.amount);

                                                                double delivery_charges = 100+ (ckout.amount*0.02);
                                                                System.out.println("Delivery Charges: "+delivery_charges);
                                                                System.out.println("Discount: 5% of "+ckout.amount+" = "+(ckout.amount*0.05));
                                                                System.out.println("Total Cost: Rs "+(ckout.amount-(ckout.amount*0.05)+delivery_charges));
                                                                System.out.println("Your Order will be delivered within 3-6 days");
                                                                cu.wallet -= (ckout.amount-(ckout.amount*0.05)+delivery_charges);
                                                                System.out.println();
                                                            }

                                                            else if (cu.normal) {
                                                                System.out.println("Product Name: "+ckout.na);
                                                                System.out.println("Product ID: "+ckout.productID);
                                                                System.out.println("Quantity: "+ckout.quantity);
                                                                System.out.println("Price: "+ckout.amount);

                                                                double delivery_charges = 100+(ckout.amount*0.05);
                                                                System.out.println("Delivery Charges: "+delivery_charges);
                                                                System.out.println("Discount: Rs.0");
                                                                System.out.println("Total Cost: Rs "+(ckout.amount+delivery_charges));
                                                                System.out.println("Your Order will be delivered within 7-10 days");
                                                                cu.wallet -= (ckout.amount+delivery_charges);
                                                                System.out.println();
                                                            }
                                                        }
                                                    }
                                                }
                                                if (ftf==0) {
                                                    System.out.println("Insufficient balance!! Please try again !!");
                                                }

                                                int tft = 0;
                                                for (giveawayOrder gdo: gawayordersList) {
                                                    if (cu.name.equals(gdo.person_name)) {
                                                        if (cu.wallet >= gdo.amount) {
                                                            tft++;
                                                            if (gdo.status == 1) {
                                                                System.out.println("Your Order is successfully Placed !!!. Details:-");
                                                                System.out.println("Product 1 ID: " + gdo.pid1);
                                                                System.out.println("Product 2 ID: " + gdo.pid2);
                                                                System.out.println("Price: " + gdo.amount);

                                                                double delivery_charges = 100+ gdo.amount*0.05;
                                                                System.out.println("Delivery Charges: "+delivery_charges);
                                                                System.out.println("Total Cost: "+(delivery_charges+ gdo.amount));
                                                                System.out.println("Your Order will be delivered within 7-10 days");
                                                                cu.wallet -= (gdo.amount+delivery_charges);
                                                                System.out.println();
                                                            }
                                                            else if (gdo.status == 2){
                                                                System.out.println("Your Order is successfully Placed !!!. Details:-");
                                                                System.out.println("Product 1 ID: " + gdo.pid1);
                                                                System.out.println("Product 2 ID: " + gdo.pid2);
                                                                System.out.println("Price: " + gdo.amount);

                                                                double delivery_charges = 100 + gdo.amount*0.02;
                                                                System.out.println("Delivery Charges: "+delivery_charges);
                                                                System.out.println("Total Cost: "+(delivery_charges+ gdo.amount));
                                                                System.out.println("Your Order will be delivered within 3-6 days");
                                                                cu.wallet -= (gdo.amount+delivery_charges);
                                                                System.out.println();
                                                            }
                                                            else if (gdo.status == 3) {
                                                                System.out.println("Your Order is successfully Placed !!!. Details:-");
                                                                System.out.println("Product 1 ID: " + gdo.pid1);
                                                                System.out.println("Product 2 ID: " + gdo.pid2);
                                                                System.out.println("Price: " + gdo.amount);

                                                                double delivery_charges = 100;
                                                                System.out.println("Delivery Charges: "+delivery_charges);
                                                                System.out.println("Total Cost: "+(delivery_charges+ gdo.amount));
                                                                System.out.println("Your Order will be delivered within 2 days");
                                                                cu.wallet -= (gdo.amount+delivery_charges);
                                                                System.out.println();
                                                            }
                                                        }
                                                    }
                                                }

                                                if (ftf ==0) {
                                                    System.out.println("Insufficient balance!! Please try again !!");
                                                }
                                            }

                                            if (select4 == 11) {
                                                System.out.println("Enter the amount you want to Add: ");
                                                float amt = sc.nextFloat();

                                                cu.wallet += amt;
                                                System.out.println("Amount successfully Added !!!");
                                            }

                                            if (select4 == 1) {
                                                for (product prrod: products) {
                                                    System.out.println("-------------------------------");
                                                    System.out.println("Product Name: "+prrod.name);
                                                    System.out.println("Product ID: "+prrod.id);
                                                    System.out.println("Price: "+prrod.price);
                                                    System.out.println("-------------------------------");
                                                }
                                            }

                                            if (select4 == 2) {
                                                for (Giveaway ggw: gawaydeals) {
                                                    System.out.println("-------------------------------");
                                                    System.out.println("Product 1: "+ggw.product1);
                                                    System.out.println("Product 2: "+ggw.product2);
                                                    System.out.println("Get both of them in just:-");
                                                    System.out.println("For NORMAL users: "+ggw.normal);
                                                    System.out.println("For PRIME users: "+ggw.prime);
                                                    System.out.println("For ELITE users: "+ggw.elite);
                                                    System.out.println("-------------------------------");
                                                }
                                            }

                                            if (select4 == 4) {
                                                System.out.println("Adding deal:-");
                                                System.out.println("Enter Product ID 1: ");
                                                float pp1 = sc.nextFloat();
                                                System.out.println("Enter Product ID 2: ");
                                                float pp2 = sc.nextFloat();

                                                for (Giveaway ggw: gawaydeals) {
                                                    if (ggw.product1 == pp1) {
                                                        for (Giveaway ggw2: gawaydeals) {
                                                            if (ggw2.product2 == pp2) {
                                                                if (cu.normal) {
                                                                    gawayordersList.add(new giveawayOrder(cu.name, pp1, pp2, ggw.normal,1));
                                                                    System.out.println("Giveaway Deal added to Cart !!!");
                                                                }
                                                                else if (cu.prime){
                                                                    gawayordersList.add(new giveawayOrder(cu.name, pp1, pp2, ggw.prime,2));
                                                                    System.out.println("Giveaway Deal added to Cart !!!");

                                                                }
                                                                else if (cu.elite) {
                                                                    gawayordersList.add(new giveawayOrder(cu.name, pp1, pp2, ggw.elite,3));
                                                                    System.out.println("Giveaway Deal added to Cart !!!");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }

                                            }

                                            if (select4 == 7) {
                                                for (Order od: cartsList) {
                                                    if (cu.name.equals(od.person)) {
                                                        System.out.println("--------------------------------------");
                                                        System.out.println("Product Name: "+od.na);
                                                        System.out.println("Product ID: "+od.productID);
                                                        System.out.println("Quantity: "+od.quantity);
                                                        System.out.println("Price: "+od.amount);
                                                        System.out.println("--------------------------------------");
                                                    }
                                                }
                                            }

                                            if (select4 == 6) {
                                                for (Order odd: cartsList) {
                                                    if (cu.name.equals(odd.person)) {
                                                        cartsList.remove(odd);
                                                    }
                                                }
                                            }

                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }

                }
            }

            if (select == 2) {
                for (product prrod: products) {
                    System.out.println("-------------------------------");
                    System.out.println("Product Name: "+prrod.name);
                    System.out.println("Product ID: "+prrod.id);
                    System.out.println("Price: "+prrod.price);
                    System.out.println("-------------------------------");
                }
            }

            if (select == 3) {
                for (Giveaway ggw: gawaydeals) {
                    System.out.println("-------------------------------");
                    System.out.println("Product 1: "+ggw.product1);
                    System.out.println("Product 2: "+ggw.product2);
                    System.out.println("Get both of them in just:-");
                    System.out.println("For NORMAL users: "+ggw.normal);
                    System.out.println("For PRIME users: "+ggw.prime);
                    System.out.println("For ELITE users: "+ggw.elite);
                    System.out.println("-------------------------------");
                }
            }
        }
    }
}



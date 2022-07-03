import java.util.*;
import java.io.*;
public class Prob21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int l = 0; l < n; l++) {
			int I = in.nextInt();
			int c = in.nextInt();
			in.nextLine();
			HashMap<String, Double> prices = new HashMap<String, Double>();
			HashMap<String, Integer> num = new HashMap<String, Integer>();
			for(int i = 0; i < I; i++) {
				String[] line = in.nextLine().split(" ");
				num.put(line[1], Integer.parseInt(line[0]));
				prices.put(line[1], Double.parseDouble(line[2]));
			}
			HashMap<Integer, HashMap> commands = new HashMap<Integer, HashMap>();
			for(int i = 0; i < c; i++) {
				String[] line = in.nextLine().split(" ");
				int id = Integer.parseInt(line[0]);
				if(!commands.containsKey(id)) {
					commands.put(id, new HashMap<String, Integer>());
				}
				if(line[1].equals("CHECKOUT")) {
					ArrayList<String> out = new ArrayList<String>();
					ArrayList<String> remove = new ArrayList<String>();
					double cost = 0;
					HashMap<String, Integer> temp = commands.get(id);
					for(String item: temp.keySet()) {
						int want = temp.get(item);
						int ava = num.get(item);
						if(want > ava) {
							out.add(item);
							remove.add(item);
						} else {
							cost+=prices.get(item)*temp.get(item);
							num.put(item, ava-want);
							remove.add(item);
							
						}
					}
					for(int j = 0; j < remove.size(); j++) {
						commands.get(id).remove(remove.get(j));
					}
					Collections.sort(out);
					for(int j = 0; j < out.size(); j++) {
						System.out.println("Out of stock of " + out.get(j));
					}
					System.out.printf("Customer " + id + "'s total: $%.2f\n", Math.round(cost*100)/100d);
				} else {
					
					String item = line[2];
					if(!commands.get(id).containsKey(item)) {
						commands.get(id).put(item, 0);
					}
					
					int amount = Integer.parseInt(line[3]);
					if(line[1].equals("ADD")) {
						if(num.get(item) < (int)commands.get(id).get(item)+amount) {
							System.out.println("Not enough " + item + " for customer " + id);
							continue;
						} else {
						
							if(commands.get(id).containsKey(item)) {
								commands.get(id).put(item, (int)commands.get(id).get(item)+amount);
							} else {
								commands.get(id).put(item, amount);
							}
							System.out.println("Added " + amount +" " + item + " to customer " + id + "'s cart");
							
						}
						
						
					} else if(line[1].equals("REMOVE")) {
						if(!commands.get(id).containsKey(item) || (int)commands.get(id).get(item) < amount) {
							System.out.println("Customer " + id + " does not have that many " + item + "s");
							continue;
						} else {
							
							commands.get(id).put(item, (int)commands.get(id).get(item)-amount);
							System.out.println("Removed " + amount +" " + item + " from customer " + id + "'s cart");
						}
					}
					
					
				}
				
				
			}
			ArrayList<String> left = new ArrayList<String>();
			left.addAll(num.keySet());
			Collections.sort(left);;
			for(String s: left) {
				if(num.get(s) > 0) {
					System.out.println(s + " - " + num.get(s));
				}
				
			}
			//System.out.println(commands);
		}
		
		//System.out.println(Arrays.toString(num));
		//System.out.println(prices);
		
	}
	public static class qua {
		int q;
		String n;
		public qua(int x, String y) {
			q = x;
			n = y;
		}
		public String toString() {
			return q + " " + n;
		}
	}
}
/*
1
1 2
1 CHeese 2.5
1 ADD CHeese 1
1 ADD CHeese 1



1
3 8
2 Candy_Bar 1.50
3 Soda_Bottle 1.60
2 Cheese_Pack 2.50
1 ADD Candy_Bar 1
2 ADD Candy_Bar 2
1 ADD Soda_Bottle 3
1 REMOVE Soda_Bottle 1
2 CHECKOUT
1 CHECKOUT
3 ADD Candy_Bar 1
3 ADD Cheese_Pack 2



*/
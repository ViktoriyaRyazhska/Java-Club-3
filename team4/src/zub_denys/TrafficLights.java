package zub_denys;

public class TrafficLights {

  public static String updateLight(String current) {
    if (current == "green") {
      return "yellow";
    } else if (current == "yellow") {
      return "red";
    } else if (current == "red") {
      return "green";
    }
    return current;
  }
  public static void main(String[] args) {
    System.out.println(updateLight("green"));
  }
}
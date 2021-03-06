package ssta.pe.p081_090;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author ssta
 */
public class Problem84 {

  public static void main(String[] args) {
    System.out.println(new Problem84().solve());
  }

  private String solve() {
    Integer[] board = new Integer[40];
    for (int i = 0; i < board.length; i++) {
      board[i] = 0;
    }
    int trials = 1000;
    Random rnd = new Random();
    int doubles = 0;

    // where we currently are (start at Go)
    int position = 0;

    for (int i = 0; i < trials; i++) {
      int d1 = rnd.nextInt(4) + 1;
      int d2 = rnd.nextInt(4) + 1;

      if (d1 == d2) {
        doubles += 1;
        if (doubles > 2) {
          // go to jail
          position = 10;
          doubles = 0;
        } else {
          // move
          position = (position + d1 + d2) % 40;
          // chance
          if (position == 7 || position == 22 || position == 36) {
            // 10 of 16 cards make us move
            int x = rnd.nextInt(16) + 1;
            if (x == 1) {
              // advance to go
              position = 0;
            } else if (x == 2) {
              // go to jail
              position = 10;
            } else if (x == 3) {
              // co to c1 (11)
              position = 11;
            } else if (x == 4) {
              // go to e3 (24)
              position = 24;
            } else if (x == 5) {
              // go to h2 (39)
              position = 39;
            } else if (x == 6) {
              // go to R1 (5)
              position = 5;
            } else if (x == 7 || x == 8) {
              // go to next R (5, 15, 25, 35)
              if (position == 7) {
                position = 15;
              } else if (position == 22) {
                position = 25;
              } else {
                position = 5;
              }
            } else if (x == 9) {
              // go to next U (12 or 28)
              if (position == 22) {
                position = 28;
              } else {
                position = 12;
              }
            } else if (x == 10) {
              // go back three squares
              // this is why we need to do chance first, because we might land on CC from here
              position -= 3;
            }
          }
          // CC
          if (position == 2 || position == 17 || position == 33) {
            // 2 of 16 cards make us move
            int x = rnd.nextInt(16) + 1;
            if (x == 1) {
              // advance to go
              position = 0;
            } else if (x == 2) {
              // go to jail
              position = 10;
            }
          }
          // go to jail
          if (position == 30) {
            position = 10;
          }
        }
      }
      board[position]++;
    }

    System.out.println(Arrays.toString(board));
    
    
    Integer[] indices = new Integer[board.length];
    for (int i = 0; i < indices.length; i++) {
      indices[i] = i;
    }

    Arrays.sort(indices, (Integer i1, Integer i2) -> board[i1].compareTo(board[i2]));

    // we want the "top 3" off the indices array now.
    String s = String.valueOf(indices[0]) + String.valueOf(indices[1]) + String.valueOf(indices[2]);
    return s;
  }

}

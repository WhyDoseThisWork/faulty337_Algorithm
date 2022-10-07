// class Pair implements Comparable<Pair> {
//     int first, second;
    
//     Pair(int f, int s) {
//         this.first = f;
//         this.second = s;
//     }
    
//     public int compareTo(Pair p) {
//         if(this.first < p.first) {
//             return -1; // 오름차순
//         }
//         else if(this.first == p.first) {
//             if(this.second < p.second) {
//                 return -1;
//             }
//         }
//         return 1; // 이미 this.first가 더 큰 것이 됐으므로, 1로 해준다. -1로
//         // -1로 하면 결과가 이상하게 출력됨.
//     }
// }
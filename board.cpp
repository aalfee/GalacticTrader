#include <iostream>
using namespace std; 

int main() {
    int board[10][5] = {
        (0,0,0,0,0,0,0,0,0,0),
        (0,0,0,0,0,0,0,0,0,0),
        (20,0,0,0,0,0,0,0,0,20),
        (0,0,0,0,0,0,0,0,0,0),
        (0,0,0,0,0,0,0,0,0,0),
    };

for(int i = 0; i < board.length(); i++){
    for(int j = 0; j < board[].length(); j++){
        cout << board[i][j];
    }
    cout << endl;
}


    return 0;
}
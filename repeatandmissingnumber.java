public class repeatandmissingnumber {
    public static void missandrepeat(int grid[][]){
        int n=grid.length;
        int repeat=-1;
        int missing=-1;
        int largest=n*n;
    int freq[]=new int[largest+1];
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            freq[grid[i][j]]++;
        }
    }
    for(int i=0;i<freq.length;i++){
        if(freq[i]==2){
            repeat=i;
        } if(freq[i]==0){
            missing=i;
        }
        
    }
System.out.println(repeat);
System.out.println(missing);

    
    }
    public static void main(String[] args) {
        int grid[][]={{1,3},{2,2}};
        missandrepeat(grid);

    }
}

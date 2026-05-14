// Write program to find the maximum and minimum element in an array.
public static void main(String[] args){
    int arr[] = {2, 10, 13, 30, 18, 8};
    int ans = 0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>ans){
            ans = arr[i];
        }
    }
    System.out.println(ans);
}

// Output: 30

// Write a program to find the maximum element in an array by using a library function(Math.max).
public static void main(String[] args){
    int arr[] = {2, 10, 13, 30, 18, 8};
    int ans = arr[0];
    for(int i=0; i<arr.length; i++){
        ans = Math.max(arr[i], ans);
    }
    System.out.println(ans);
}

// Output: 30


// Write a program to find the minimum element in an array by using a library function(Math.min).
public static void main(String[] args){
    int arr[] = {2, 10, 13, 30, 18, 8};
    int ans = arr[0];
    for(int i=0; i<arr.length; i++){
        ans = Math.min(arr[i], ans);
    }
    System.out.println(ans);
}   
// Output: 2

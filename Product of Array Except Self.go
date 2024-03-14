func productExceptSelf(nums []int) []int {
    sol := make([]int,len(nums))

        sol[0] = 1
        sol[len(nums)-1]= 1

            for i,_ := range nums {
                if i == 0 {continue}
                sol[i] = sol[i-1] * nums[i-1]
                    } 
            

        rightMult := 1
            for i := len(nums)-2 ; i >= 0; i-- {
                rightMult = nums[i+1] * rightMult
                sol[i] = sol[i]  * rightMult 
            }
        
        
    
    return sol
}

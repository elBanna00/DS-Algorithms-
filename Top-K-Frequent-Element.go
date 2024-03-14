func topKFrequent(nums []int, k int) []int {
    countmap := map[int]int{}
    for _,y := range nums{
        countmap[y]++
    }
    freq := make([][]int, len(nums)+1, len(nums)+1)
    for k,v := range countmap{
        freq[v] = append(freq[v],k)
    }
    res := []int{}
    for y := len(freq)-1 ; y >= 0; y-- {
        for _,j := range freq[y] {
            res = append(res,j)
            if len(res) == k {return res}
        }
    } 
    return res
}

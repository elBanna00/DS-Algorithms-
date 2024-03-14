func isPalindrome(s string) bool {
    start,end := 0,len(s)-1
    for end > start {
        st := rune(s[start])
        e := rune(s[end])
        if !unicode.IsLetter(st) && !unicode.IsNumber(st) {
            start ++
        } else if  !unicode.IsLetter(e) && !unicode.IsNumber(e) {
            end--
        } else if (unicode.ToLower(st) == unicode.ToLower(e)){
            start++
            end--
        } else {return false}
        
    }
    return true
}
    

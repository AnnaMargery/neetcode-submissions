class Solution {
    public int countSeniors(String[] details) {

    //Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
    // Output: 2
    //10 chars (0-9)- phone
    //11 char- (10)gender
    //12-13 chars 11-12 Age
    //14-15 chars 13-14 sit
    // return the number of passengers over 60

 return (int)Arrays.stream(details)
    .map(info -> Integer.parseInt(info.substring(11, 13)))
    .filter(age -> age > 60)
    .count();
    }
}
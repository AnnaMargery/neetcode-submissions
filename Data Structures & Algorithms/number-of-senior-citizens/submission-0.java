class Solution {
    public int countSeniors(String[] details) {
        // fisrt 0-9 chars- phone
        // 10 - gender
        // 11-12 age
        // 13-14 - seat allocated
        // return the number of passangers over 60 years

        // details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
        int counter = 0;
        for (int i = 0; i < details.length; i++) {
            String word = details[i];
            StringBuilder builder = new StringBuilder();

            builder.append(word.charAt(11));
            builder.append(word.charAt(12));
            if (Integer.parseInt(builder.toString()) > 60) {
                counter++;
            }
        }
        return counter;
    }
}
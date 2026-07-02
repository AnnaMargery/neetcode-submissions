class Solution {
    public int numUniqueEmails(String[] emails) {
        
    /*
    Problem decomposition:
    // divide- split local name from domain name for each email
    // analyze localname - perform actions to receive a local name after transitions - basically check if 
    "." AND/OR "+" is present- receive final email address
    // compare this address with basic and decide if it will go to the same address or different.
    - local name contains the same characters but just with "." - the same address
    - when "+" sign is present we are splitting again and veryfying what has left,
    //consider how to store it
    */

    Set<String> uniqueEmails = new HashSet<>();

    for(int i=0; i < emails.length; i++){
        String[] splittedEmail = emails[i].split("@");
        String localName= splittedEmail[0];
        if(localName.contains("+")){
           String[] splittedByPlus= localName.split("\\+");
           localName = splittedByPlus[0];
        }
        if(localName.contains(".")){
            localName= localName.replace(".","");
        }
        
        uniqueEmails.add(localName+"@"+splittedEmail[1]);
    }
        return uniqueEmails.size();
    }
}
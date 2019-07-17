class IsbnVerifier {

    boolean isValid(String stringToVerify) {
    stringToVerify = stringToVerify.replaceAll("-",""); // remove "-" from string.
    int sum = 0;

    if(!validateString(stringToVerify))
      return false;

    return calculateModuloSum(stringToVerify, sum);
    }

    private boolean validateString(String stringToVerify){
      stringToVerify = stringToVerify.replaceAll("[^0-9X]",""); //remove every character except digit and X.
      return (stringToVerify.length() == 10); //length of a valid string should be 10.
    }

    private boolean calculateModuloSum(String stringToVerify, int sum){
      int digit;

      if(stringToVerify.charAt(stringToVerify.length() - 1) == 'X'){
      stringToVerify = stringToVerify.replace("X", ""); // remove X.
      sum += 10 * 1; //X is the last digit and it's value is 10. So it it supposed too be multiplied by 1, i.e 10*1;
      }

      for(int i = 0; i < stringToVerify.length(); i++){
        digit = Character.getNumericValue(stringToVerify.charAt(i)); //convert character to integer.
        sum += digit * (10 - i);
      }
      return (sum % 11 == 0);
    }
}

class Solution{
	public static String isMatching(String str){
		 String[] tokens = str.split("", str.length());
        String[] stack = new String[str.length()];
        int size = 0;
        boolean flag = false;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("{")
                || tokens[i].equals("[") || tokens[i].equals("(")) {
                stack[size++] = tokens[i];
            } else if (size > 0) {
                if (tokens[i].equals("}") && stack[size - 1].equals("{")) {
                    size--;
                 } else if (tokens[i].equals(
                    "]") && stack[size - 1].equals("[")) {
                    size--;
                 } else if (tokens[i].equals(
                    ")") && stack[size - 1].equals("(")) {
                    size--;
                }
            }
        }
        if (size == 0) {
            return "YES";
        } else {
            return "NO";
        }
	}
}

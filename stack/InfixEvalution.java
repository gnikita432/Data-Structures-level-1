//Infix Evaluation

class solution {

    public static void infixevalution(String exp){

        Stack <Integer> oprand = new Stack<>();
        Stack <Character> oprator = new Stack<>();
        
        for(int i =0 ; i<exp.length() ; i++){
          char ch = exp.charAt(i);
          if(ch == '('){
             oprator.push(ch); 
          }
          else if( Character.isDigit(ch)){
             oprand.push(ch-'0'); 
          }
          else if(ch == ')'){
              while(oprator.peek()!='('){
                 char op = oprator.pop();
                 int v2  = oprand.pop();
                 int v1  = oprand.pop();
              
               int opv =operation(v1,v2,op);
               oprand.push(opv);
              }
               oprator.pop();
          }
          else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
              while( oprator.size()>0 && oprator.peek()!='('&&precedence(ch)<=precedence(oprator.peek())){
                char op = oprator.pop();
                 int v2  = oprand.pop();
                 int v1  = oprand.pop();
             
               int opv =operation(v1,v2,op);
               oprand.push(opv); 
               }
               oprator.push(ch);
              }
            
          }
             while(oprator.size()!=0){
                 char op = oprator.pop();
                 int v2  = oprand.pop();
                 int v1  = oprand.pop();
             
               int opv =operation(v1,v2,op);
               oprand.push(opv);
             }
              
          
            System.out.println(oprand.peek());
        }
      
    
    
    // precedence
    public static int precedence(char oprator){
        if(oprator=='-'){
        return 1 ;
        }
        else if(oprator =='+'){
        return 1 ;
        }
        else if(oprator == '*'){
        return 2;
        }
        else {
        return 2;
        }
    }
    // operation
     public static int operation(int v1 , int v2 ,char oprator){
        if(oprator=='-'){
        return v1-v2 ;
        }
        else if(oprator =='+'){
        return v1+v2 ;
        }
        else if(oprator == '*'){
        return v1*v2;
        }
        else {
        return v1/v2;
        }
    }
}

/* Sample Input
2 + 6 * 4 / 8 - 3

Sample Output
2 */

public class Number{
public static final String[] units={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};

public static final String[] tens={
"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"
};

public static String convert(final int n){
if(n<0){
return "Minus"+ convert(-n);
}
if(n<20){
return units[n];
}
if(n<100){

return tens[n/10]+((n%10!=0)?" " :"")+units[n%10];
}
if(n<1000){
return units[n/100]+"Hundred"+((n%100!=0)?" ":"")+convert(n%100);
}

if(n<100000){
return convert(n/1000)+"THousand"+((n%10000!=0)?" ":"")+convert(n%1000);
}
if(n<1000000){
return convert(n/100000)+"Lakh"+((n%100000!=0)?" ":"")+convert(n%100000);
}
return convert(n/10000000)+"Core"+((n%10000000!=0)?"":"")+convert(n%10000000);

}
public static void main(final String [] args){
int n=152;
System.out.println(convert(n));
}
}
package cheng;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpringMain
{

	
	
	public static void main(String[] args)
	{
		
		
		
		
		//变量
	  String str = "3+(4*(5-2)+100)/8.0"; //这表示Context中user对象中的getName方法
		
	  //1.创建表达式解析器/
	  ExpressionParser parser = new SpelExpressionParser();
	  //2.用解析器去解析字符串
	  Expression expr=  parser.parseExpression(str);
	  
	  //如果涉及到变量，需要使用ExpressionContext
	
	 //ctx.setRootObject(new );
	  //3.调用Experssion的getValue()方法
	  System.out.println(expr.getValue());
	}
}

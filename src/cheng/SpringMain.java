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
		
		
		
		
		//����
	  String str = "3+(4*(5-2)+100)/8.0"; //���ʾContext��user�����е�getName����
		
	  //1.�������ʽ������/
	  ExpressionParser parser = new SpelExpressionParser();
	  //2.�ý�����ȥ�����ַ���
	  Expression expr=  parser.parseExpression(str);
	  
	  //����漰����������Ҫʹ��ExpressionContext
	
	 //ctx.setRootObject(new );
	  //3.����Experssion��getValue()����
	  System.out.println(expr.getValue());
	}
}

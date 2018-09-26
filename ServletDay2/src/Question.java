import java.util.ArrayList;

public class Question {
	String statement;
	char answer;
	
	Question(String statement, char answer)
	{
		this.statement = statement;
		this.answer = answer;
	}
}

class QuestionSet
{
	ArrayList<Question> qs = new ArrayList<Question>();
	QuestionSet()
	{
		Question q1 = new Question("swdw wdw dwq ?", 'n');
		qs.add(q1);
		Question q2 = new Question("bnggt efre wde ?", 'y');
		qs.add(q2);
		Question q3 = new Question("fwhy swc des ?", 'n');
		qs.add(q3);
		Question q4 = new Question("wed rgas sesaa ?", 'n');
		qs.add(q4);
		Question q5 = new Question("wdewqv ergfer edcd ?", 'y');
		qs.add(q5);
		Question q6 = new Question("weffwe ewf ewdfweq ?", 'n');
		qs.add(q6);
		Question q7 = new Question("uxsa edfrn swev ?", 'y');
		qs.add(q7);
		Question q8 = new Question("dcvs deswq wdws ?", 'y');
		qs.add(q8);
		Question q9 = new Question("qqq qqqq qqqq ?", 'n');
		qs.add(q9);
		Question q10 = new Question("zzzzz zzzz zzz ?", 'y');
		qs.add(q10);
	}
	
	Question getQuestion(String choice)
	{
		int c = Integer.parseInt(choice);
		Question qq = qs.get(c-1);
		return qq;
	}
}
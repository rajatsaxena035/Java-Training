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
	Question q1 = new Question("swdw wdw dwq ?", 'n');
	Question q2 = new Question("bnggt efre wde ?", 'y');
	Question q3 = new Question("fwhy swc des ?", 'n');
	Question q4 = new Question("wed rgas sesaa ?", 'n');
	Question q5 = new Question("wdewqv ergfer edcd ?", 'y');
	Question q6 = new Question("weffwe ewf ewdfweq ?", 'n');
	Question q7 = new Question("uxsa edfrn swev ?", 'y');
	Question q8 = new Question("dcvs deswq wdws ?", 'y');
	Question q9 = new Question("qqq qqqq qqqq ?", 'n');
	Question q10 = new Question("zzzzz zzzz zzz ?", 'y');
}
import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;

public class FunctionInterfaceExample2
{
	static Integer addList(List<Integer> list)
	{
		return list.stream()
					.mapToInt(Integer::intValue)
	}
}
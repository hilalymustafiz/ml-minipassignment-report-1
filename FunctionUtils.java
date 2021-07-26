package mpp;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public abstract class FunctionUtils {
  // Function1: getAllFailedGradesFromUniversity
  static Function<University, List<Grade>> getAllFailedGradesFromUniversity = university ->
    university
      .getDepartments()
      .stream()
      .flatMap(department -> department.getFaculty().stream())
      .flatMap(professor -> professor.getGrades().stream())
      .filter(
        grade -> grade.getLetter() == Letter.F || grade.getLetter() == Letter.C
      )
      .collect(Collectors.toList());
}

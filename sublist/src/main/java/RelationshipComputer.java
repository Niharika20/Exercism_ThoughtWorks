import java.util.*;

class RelationshipComputer<T> {

	Relationship computeRelationship(List<T> A, List<T> B){

		if(A.size() == B.size())
			return isSublistPresent(A,B) ? Relationship.EQUAL : Relationship.UNEQUAL;

		else if(A.size() > B.size())
			return isSublistPresent(A,B) ? Relationship.SUPERLIST : Relationship.UNEQUAL;

		else
			return isSublistPresent(B,A) ? Relationship.SUBLIST : Relationship.UNEQUAL;
	}

	boolean isSublistPresent(List<T> source, List<T> target){

		//source is the list where sublist needs to be present,
		//target is the last which is to be checked if sublist or not.
		//indexOfSubList method returns the index of first character of sublist if present in source.
		return (Collections.indexOfSubList(source,target) > -1);
	}
}
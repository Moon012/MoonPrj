package Study.DataStruct.Node.Simple;

/**
 * @FileName    : ExcuteNode.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 1. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : 단순 연결 리스트 테스트 
 */

public class ExecuteNode {

	public static void main(String[] args) {
		
		
		Singly_Linked_List sll = new Singly_Linked_List();
		sll.addNode(1);
		sll.addNode(2);
		sll.addNode(13);
		sll.addNode(14);
		

		sll.display();
		
		System.out.println("");
		System.out.println("추가 노드");
		sll.insertNode(5);
		sll.display();
		
		System.out.println("");
		System.out.println("찾기 노드");
		
		LinkNode linkNode = sll.findNode(13);
		
		if(linkNode == null){
			System.out.println("찾을 수 없습니다.");
		}else {
			System.out.println(linkNode.getData());
		}
		
		System.out.println("");
		System.out.println("삭제 노드");
		
		sll.delete(5);
		sll.display();
		
		System.out.println("");
		System.out.println("처음 노드 삭제");
		
		sll.delete(1);
		sll.display();
		
	}

}

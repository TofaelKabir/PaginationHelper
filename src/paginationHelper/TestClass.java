package paginationHelper;

public class TestClass {

	public static void main(String[] args) {
		Object[] arr = { 'a', 'b', 'c', 'd', "AString", "BString", 5, 2, true, false, 2.5, 2f };
		PaginationHelper helper = new PaginationHelper(arr, 0);
		System.out.println(helper.pageCount());
		System.out.println(helper.itemCount());
		System.out.println(helper.pageItemCount(2));
		System.out.println(helper.pageIndex(-2));
	}

}

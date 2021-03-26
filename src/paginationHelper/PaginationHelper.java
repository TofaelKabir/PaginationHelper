package paginationHelper;

public class PaginationHelper {

	Object[] arrayOfObj;
	int itemPerPage;

	public PaginationHelper(Object[] arrayOfObj, int itemPerPage) {
		this.arrayOfObj = arrayOfObj;
		this.itemPerPage = itemPerPage;
	}
	
	// This method will return total number of pages
	public int pageCount() {
		int pageCounts = 0;
		try {
			pageCounts = arrayOfObj.length / itemPerPage;
			pageCounts = arrayOfObj.length % itemPerPage != 0 ? pageCounts + 1 : pageCounts;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return pageCounts;
	}

	// This method will return item count
	public int itemCount() {
		return arrayOfObj.length;
	}

	// This method will take parameter pageNumber and return itemCount
	public int pageItemCount(int pageNumber) {
		int itemCount = 0;
		int totalPageCount = pageCount();
		if (pageNumber >= totalPageCount || pageNumber < 0) {
			itemCount = -1;
		} else {
			itemCount = totalPageCount - 1 == pageNumber ? arrayOfObj.length % itemPerPage : itemPerPage;
		}
		return itemCount;
	}

	// This method will take parameter itemIndex and return pageIndexNo
	public int pageIndex(int itemIndex) {
		int pageIndexNo = 0;
		if (itemIndex > itemCount() || itemIndex < 0) {
			pageIndexNo = -1;
		} else {
			try {
				pageIndexNo = itemIndex / itemPerPage;
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
		return pageIndexNo;
	}
}

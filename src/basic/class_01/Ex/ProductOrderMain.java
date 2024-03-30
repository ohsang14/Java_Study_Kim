package basic.class_01.Ex;

//상품명: 두부, 가격: 2000, 수량: 2
// 상품명: 김치, 가격: 5000, 수량: 1
// 상품명: 콜라, 가격: 1500, 수량: 2
// 총 결제 금액: 12000
public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder [] orders= new ProductOrder[3];

        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.ProductName ="두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;
        orders[0] = productOrder1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.ProductName ="김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;
        orders[1] = productOrder2;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.ProductName ="콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;
        orders[2] = productOrder3;


        // 상품 주문 정보와 최종 금액 출력
        int max = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.ProductName+
                    "가격: " + order.price+
                    "개수: " + order.quantity);
            max += order.price * order.quantity;
        }
        System.out.println("총 금액: " + max);
    }
}

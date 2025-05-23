# 상속이란?
자바에는 상속(Inheritance)이라는 개념이 존재합니다. 
쉽게 말해 부모 클래스(상위 클래스)와 자식 클래스(하위 클래스)가 있으며, 
자식 클래스는 부모 클래스를 선택해서, 그 부모의 멤버를 상속받아 그대로 쓸 수 있게 됩니다. 
상속을 하는 이유는 간단합니다. 이미 마련되어 있던 클래스를 재사용해서 만들 수 있기 때문에 효율적이고, 
개발 시간을 줄여주게 됩니다. 
상속을 하더라도 자식 클래스가 부모의 모든 것들을 물려받는 것은 아닙니다.
부모 클래스의 private 접근 제한을 갖는 필드 및 메소드는 자식이 물려받을 수 없습니다.
부모와 자식 클래스가 서로 다른 패키지에 있다면, 부모의 default 접근 제한을 갖는 필드 및 메소드도 자식이 물려받을 수 없습니다.
(default 접근 제한은 ‘같은 패키지에 있는 클래스’만 접근이 가능하게끔 하는 접근 제한자이기 때문입니다.)
그 이외의 경우는 모두 상속의 대상이 됩니다.
클래스 상속
상속받고자 하는 자식 클래스명 옆에 extends 키워드를 붙이고, 상속할 부모 클래스명을 적습니다.
자바는 다중 상속을 허용하지 않으므로, extends 뒤에는 하나의 부모 클래스만 와야 합니다.
```
public Class Parent{ .... }; // 부모 클래스
public Class Child extends parent { .... }; // 자식 클래스
```
다음은 코드 예시입니다. (ParentBook 클래스를 ChildBook 클래스가 상속, 둘은 같은 패키지로 가정)
```
public class ParentBook{
String name; //필드
int price;

public void Print(){ // 메소드
System.out.println("책의 이름과 가격 : "+name+" "+price);
}
```
```
public class ChildBook extends ParentBook{
ChildBook (String name, int price){ // 생성자
this.name = name;  //  ChildBook이 ParetBook의 필드를 상속받아서 가능한 선언
this.price = price; //  "
}
``
public static void main (String[] args){
ChildBook Child = new ChildBook("나의 라임오렌지 나무", 10000);
System.out.print("[구현 결과 1] ");
Child.Print();
}
```
[구현 결과 1] 책의 이름과 가격 : 나의 라임오렌지 나무 10000

ChildBook 클래스가 ParentBook의 필드와 메소드를 상속받았습니다.
그러므로 ChildBook 클래스 내에 따로 필드나 메소드가 선언되어 있지 않았는데도,
생성자의 this.name 선언이나, main 메소드의 Child.Print() 가 컴파일 에러가 나지 않게 됩니다.

어렵게 생각하지 마시고 부모의 필드와 메소드를 그대로 가져다 쓴다고 생각하시면 편합니다.

부모 생성자의 호출 : super(…);
자바에서는 자식 객체를 생성하면, 부모 객체를 먼저 생성한 후, 자식 객체가 그 다음에 생성됩니다.

위에서 살펴보았던 코드에서는 따로 부모 객체를 생성하는 과정이 코드상에는 구현되어 있지 않았는데,
사실 내부적으로는 부모 객체 생성 후, 자식 객체가 생성되는 것이었습니다.

객체는 생성자를 호출해야만 생성되는데, 부모 객체를 생성할 때 부모 생성자를 어디서 호출할까요? 
계속 위에서 살펴보았던 코드로 설명을 하겠습니다.

일단 생성자는 ‘명시적인 생성자 선언’이 없다면, 컴파일러는 알아서 기본 생성자를 생성하여 호출합니다.

위에서 봤던 코드에서는 부모 클래스(ParentBook)는 명시적 생성자 선언이 없었고, 자식 클래스(ChildBook)는 명시적 생성자 선언이 존재합니다.

그러면 이 때 부모 클래스의 생성자 선언은, 자식 클래스의 생성자 선언 내부에 맨 첫줄에 super(); 라고 생성됩니다.

부모의 기본 생성자 선언을 포함해서 명시적 생성자 선언이 없었으므로, 컴파일러가 super(); 를 알아서 생성합니다. 
그리고 그 super(); 는 부모 클래스의 기본 생성자를 컴파일러가 호출하는 것입니다.

앞으로 ‘super’ 키워드는 부모 클래스(객체)를 나타내는 것임을 기억하면 됩니다.

그렇다면 부모에게 기본 생성자는 없고, 매개 변수가 있는 명시적 생성자만 있다면 어떻게 될까요?

자식 클래스에서는 반드시 생성자 내부 첫줄에 super( 매개값 , 매개값, …); 과 같이 선언해 주어야 합니다.\

컴파일러는 기본 생성자만 담당해 주기 때문입니다.
```
public class ParentBook{
String name; //필드
int price;

public ParentBook (String name, int price){ // 부모의 생성자가 있는 경우
this.name = name;
this.price = price;
}
public void Print(){ // 메소드
System.out.println("책의 이름과 가격 : "+name+" "+price);
}
```
```
public class ChildBook extends ParentBook{
ChildBook (){ // 자식 생성자
super("나의 라임오렌지 나무", 10000); // 반드시 자식 생성자 첫줄에 선언
}

public static void main (String[] args){
ChildBook Child = new ChildBook();
System.out.print("[구현 결과 2] : ");
Child.Print();
}
```
[구현 결과 2] 책의 이름과 가격 : 나의 라임오렌지 나무 10000

만일 부모에게 매개변수를 포함한 명시적 생성자 선언이 있었는데, 자식 생성자에서 super 를 통하여 호출해주지 않았을 경우 컴파일 에러가 납니다.

또한, 앞에서도 말했다시피 반드시 자식 생성자 내부의 첫 줄에 super(…..); 를 써야만 컴파일 에러가 나지 않습니다.
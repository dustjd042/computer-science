
### 다중 상속 다이아몬드 문제
* 아래와 같은 구성에서 C 클래스 `print()` 실행하는 경우 B, C 어떠한 `print()` 함수 실행이 필요한지 모호하다.
```java
class A {
    void print() {
        System.out.println("A");
    }
}

class B extends A {}

class C extends A {}

class D extends B, C {}
```
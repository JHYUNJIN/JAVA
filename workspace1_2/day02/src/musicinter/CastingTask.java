package musicinter;

public class CastingTask {
/*
 * 음악 재생프로그램
 * 부모는 Music클래스
 * 구현하지않는 mode메소드 만들기
 * 
 * 자식은 Ballad, HipHop, Rock클래스
 * 
 * 발라드클래스
 * mode메소드를 오버라이딩 -> "발라드 모드" 출력
 * onlyBallad메소드 만들기 -> "onlyBallad 실행" 출력
 * 
 * * 힙합클래스
 * mode메소드를 오버라이딩 -> "힙합 모드" 출력
 * onlyHipHop메소드 만들기 -> "onlyHipHop 실행" 출력
 * 
 * * 락클래스
 * mode메소드를 오버라이딩 -> "락 모드" 출력
 * onlyRock메소드 만들기 -> "onlyRock 실행" 출력
 */
   void check(Music music) {
      if(music instanceof Ballad) {
         Ballad ballad = (Ballad)music;
         ballad.mode();
         ballad.onlyBallad();
      }else if (music instanceof Hiphop) {
         Hiphop hiphop = (Hiphop)music;
         hiphop.mode();
         hiphop.onlyHiphop();
      }else if (music instanceof Rock) {
         Rock rock = (Rock)music;
         rock.mode();
         rock.onlyRock();
      }
   }
   public static void main(String[] args) {
      CastingTask ct = new CastingTask();
      
      Music music1 = new Hiphop();
      ct.check(music1);
      
      Ballad ballad = new Ballad();
      ct.check(ballad);
   }
}















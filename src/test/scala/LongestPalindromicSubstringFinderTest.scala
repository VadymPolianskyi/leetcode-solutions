package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class LongestPalindromicSubstringFinderTest extends AnyFunSuite {

  private val finder = new LongestPalindromicSubstringFinder()

  test("Find single symbol palindrome") {
    val res = finder.find("epdyev")
    assertResult("e")(res)
  }

  test("Find two repeated symbols palindrome") {
    val res = finder.find("epddyev")
    assertResult("dd")(res)
  }

  test("Find palindrome 1") {
    val res = finder.find("babad")
    assertResult("bab")(res)
  }

  test("Find palindrome 2") {
    val res = finder.find("jkfdshfiuewjkfhdsjfkdugoplkjjfhjjhfjjklpogudklsfjdshifdsfhouifsdfbusdbfiuoshfh")
    assertResult("kdugoplkjjfhjjhfjjklpogudk")(res)
  }

  test("Find palindrome 3") {
    val res = finder.find("cyyoacmjwjubfkzrrbvquqkwhsxvmytmjvbborrtoiyotobzjmohpadfrvmxuagbdczsjuekjrmcwyaovpiogspbslcppxojgbfxhtsxmecgqjfuvahzpgprscjwwutwoiksegfreortttdotgxbfkisyakejihfjnrdngkwjxeituomuhmeiesctywhryqtjimwjadhhymydlsmcpycfdzrjhstxddvoqprrjufvihjcsoseltpyuaywgiocfodtylluuikkqkbrdxgjhrqiselmwnpdzdmpsvbfimnoulayqgdiavdgeiilayrafxlgxxtoqskmtixhbyjikfmsmxwribfzeffccczwdwukubopsoxliagenzwkbiveiajfirzvngverrbcwqmryvckvhpiioccmaqoxgmbwenyeyhzhliusupmrgmrcvwmdnniipvztmtklihobbekkgeopgwipihadswbqhzyxqsdgekazdtnamwzbitwfwezhhqznipalmomanbyezapgpxtjhudlcsfqondoiojkqadacnhcgwkhaxmttfebqelkjfigglxjfqegxpcawhpihrxydprdgavxjygfhgpcylpvsfcizkfbqzdnmxdgsjcekvrhesykldgptbeasktkasyuevtxrcrxmiylrlclocldmiwhuizhuaiophykxskufgjbmcmzpogpmyerzovzhqusxzrjcwgsdpcienkizutedcwrmowwolekockvyukyvmeidhjvbkoortjbemevrsquwnjoaikhbkycvvcscyamffbjyvkqkyeavtlkxyrrnsmqohyyqxzgtjdavgwpsgpjhqzttukynonbnnkuqfxgaatpilrrxhcqhfyyextrvqzktcrtrsbimuokxqtsbfkrgoiznhiysfhzspkpvrhtewthpbafmzgchqpgfsuiddjkhnwchpleibavgmuivfiorpteflholmnxdwewj")
    assertResult("xrcrx")(res)
  }

}

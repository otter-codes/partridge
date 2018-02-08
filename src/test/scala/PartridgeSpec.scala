import org.scalatest.{MustMatchers, WordSpec}

class PartridgeSpec extends WordSpec with MustMatchers {

  "Partridge" when {

    "part is called" must {

      "return 'Lynn, I've pierced my foot on a spike!!' if empty args" in {
        Partridge.part(Array("")) mustEqual "Lynn, I've pierced my foot on a spike!!"
      }

      "return 'Lynn, I've pierced my foot on a spike!!' if no matches found" in {
        Partridge.part(Array("Sausage", "Pie")) mustEqual "Lynn, I've pierced my foot on a spike!!"
      }

      "return win phrase with one exclamation point when given one match for terms" in {
        Partridge.part(Array("Grouse", "Partridge", "Pheasant")) mustEqual "Mine's a Pint!"
      }


      "return win phrase with three exclamation points when three matches for terms " in {
        Partridge.part(Array("PearTree","Chat","Dan","Bob", "Jones")) mustEqual "Mine's a Pint!!!"
      }


      "return win phrase with eight exclamation points when given exact match for terms " in {
        Partridge.part(Array("PearTree","Chat","Dan","Toblerone","Lynn","AlphaPapa","Nomad","Partridge")) mustEqual "Mine's a Pint!!!!!!!!"
      }

    }

    "apple is called" must {

      "return 'Help yourself to a honeycomb Yorkie for the glovebox' when given value of 4" in {
        Partridge.apple(4) mustEqual "Help yourself to a honeycomb Yorkie for the glovebox"
      }

      "return 'Help yourself to a honeycomb Yorkie for the glovebox' when given value of 1" in {
        Partridge.apple(1) mustEqual "Help yourself to a honeycomb Yorkie for the glovebox"
      }

      "return 'Help yourself to a honeycomb Yorkie for the glovebox' when given value of 31" in {
        Partridge.apple("31") mustEqual "Help yourself to a honeycomb Yorkie for the glovebox"
      }

      "return 'It's hotter than the sun!!' when given value of '32'" in {
        Partridge.apple("32") mustEqual "It's hotter than the sun!!"
      }

      "return 'It's hotter than the sun!!' when given value of '50'" in {
        Partridge.apple("50") mustEqual "It's hotter than the sun!!"
      }

    }

    "london is called" must {

      "return 'No, seriously, run. You will miss it.' if args do not match all expected stations" in {
        Partridge.london(Array("London", "Norwich")) mustEqual "No, seriously, run. You will miss it."
      }

      "return 'Smell my cheese you mother!' if args contains all expected stations" in {
        Partridge.london(Array("Norwich", "Tooting", "Bank",
          "Rejection", "Disappointment", "Backstabbing Central",
          "Exeter", "Shattered Dreams Parkway", "Belgium","London")) mustEqual "Smell my cheese you mother!"
      }

    }

  }

}

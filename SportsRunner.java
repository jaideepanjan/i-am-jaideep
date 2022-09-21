class SportsRunner{
	
public static void main(String [] players)
{
 System.out.println("entered the main: of cricket members");
 String [] playersname={"viratkohli","dhoni","sachin tendulkar","ABD","babar azam","david warner","rashidkhan","DK","jasonroy","harasanga"};
 Sports.cricketTeamMembers(playersname); 
 System.out.println("exited the main: cricketmembers");
 
 System.out.println("entered the main: kabbaddiTeamMembersJerseyNos");
 int [] jerseynos={28,34,17,16,21,01,24,96,8,18};
 Sports.kabbaddiTeamMembersJerseyNos(jerseynos); 
 System.out.println("exited the main: kabbaddiTeamMembersJerseyNos");
 
 System.out.println("entered the main: footBallTeamMembersSalary");
 double [] salary={8.5,4.8,17.25,14.6,19.5,25.3,45.9,85.56,87.34,69.6}; //salaries are lakhs
 Sports.footBallTeamMembersSalary(salary); 
 System.out.println("exited the main: footBallTeamMembersSalary");
 
 System.out.println("entered the main: hockeyTeamMembersAndNoofMatches");
 int [] noofMatches={8,4,17,12,5,7,9,6,14,6}; 
 Sports.hockeyTeamMembersAndNoofMatches(noofMatches); 
 System.out.println("exited the main: hockeyTeamMembersAndNoofMatches");
 
 System.out.println("entered the main: ludoTeamMobileNomber");
 long [] numbers={7411833326L,8796541364L,9875661317L,89745998512L,7458961335L,7676263695L,9785463215L,98546323L,8547963214L,63636259856L}; 
 Sports.ludoTeamMobileNomber(numbers); 
 System.out.println("exited the main: ludoTeamMobileNomber");
 
 System.out.println("entered the main: kokoTeamMembersCountryCode");
 byte [] codenumber={85,8,15,6,5,23,9,6,84,96}; 
 Sports.kokoTeamMembersCountryCode(codenumber); 
 System.out.println("exited the main: kokoTeamMembersCountryCode");
 
 System.out.println("entered the main: lagoriTeamMembersAlive");
 boolean [] alivestatus={true,false,false,true,false,true,true,false,false,true};
 Sports.lagoriTeamMembersAlive(alivestatus); 
 System.out.println("exited the main: lagoriTeamMembersAlive");
}
}
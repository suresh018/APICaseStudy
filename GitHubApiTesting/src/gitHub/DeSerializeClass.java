package gitHub;

public class DeSerializeClass {
	//Plan plan=new Plan();
	class UserDetails{
		String login;
	    String id;
	    String node_id;
	    String avatar_url;
	    String gravatar_id;
		String url;
	    String html_url;
	    String followers_url;
	    String following_url;
	    String gists_url;
	    String starred_url;
	    String subscriptions_url;
	    String organizations_url;
	    String repos_url;
	    String events_url;
	    String received_events_url;
	    String type;
	    Boolean site_admin;
	    String name;
	    String company;
	    String blog;
	    String location;
	    String email;
	    String hireable;
	    String bio;
	    int public_repos;
	    int public_gists;
	    int followers;
	    int following;
	    String created_at;
	    String updated_at;
	    int private_gists;
	    int total_private_repos;
	    int owned_private_repos;
	    int disk_usage;
	    int collaborators;
	    Boolean two_factor_authentication;
	    
		Plan plan=new Plan();
	}

}
class Plan{
	String name;
	long space;
	int collaborators;
	int private_repos;
}

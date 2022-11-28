	// generated by info.scce.dime.generator.dad.AuthenticationGenerator

	package info.scce.dime.auth;

	@javax.transaction.Transactional
	public class AuthenticationImpl implements info.scce.dime.auth.AuthenticationInterface {

		@javax.inject.Inject
		private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BaseUserController controller;

		@Override
		public org.apache.shiro.authc.AuthenticationInfo doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken token) throws org.apache.shiro.authc.AuthenticationException {

			final org.apache.shiro.authc.UsernamePasswordToken upToken = (org.apache.shiro.authc.UsernamePasswordToken) token;
			final java.lang.String userName = upToken.getUsername();

			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser user;

			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser searchObject = controller.createSearchObject(null);
			searchObject.setusername(userName);

			final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser> users = controller.findByProperties(searchObject);

			if (users.size() != 1) {
				throw new org.apache.shiro.authc.AuthenticationException("Identification not unique");
			}
			user = users.get(0);

	        java.lang.String[] passwordAndSalt = user.getpassword().split(":");

	        final org.apache.shiro.authc.SimpleAuthenticationInfo sai = new org.apache.shiro.authc.SimpleAuthenticationInfo();
	        sai.setPrincipals(new org.apache.shiro.subject.SimplePrincipalCollection(user.getDywaId(), info.scce.dime.auth.AuthenticationInterface.REALM));
	        sai.setCredentials(passwordAndSalt[0]);
	        sai.setCredentialsSalt(
	        	org.apache.shiro.util.ByteSource.Util.bytes(
	        		java.util.Base64.getDecoder().decode(
	        			passwordAndSalt[1]
	        		)
	        	)
	        );

	        return sai;
		}
	}
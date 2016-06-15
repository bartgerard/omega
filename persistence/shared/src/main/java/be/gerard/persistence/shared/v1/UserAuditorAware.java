package be.gerard.persistence.shared.v1;

import org.springframework.data.domain.AuditorAware;

/**
 * UserAuditorAware
 *
 * @author bartgerard
 * @version v0.0.1
 */
public class UserAuditorAware implements AuditorAware<String> {

    @Override
    public String getCurrentAuditor() {
        return "TODO";
        /*
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            return null;
        }

        return ((User) authentication.getPrincipal()).getUsername();
        */
    }

}

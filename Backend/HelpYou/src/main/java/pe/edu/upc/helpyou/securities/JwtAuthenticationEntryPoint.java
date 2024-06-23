package pe.edu.upc.helpyou.securities;

<<<<<<< HEAD
=======
import jakarta.servlet.ServletException;
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Serializable;
<<<<<<< HEAD

//Clase 7
=======
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = -7858869558953243875L;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {

        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
<<<<<<< HEAD
}
=======


}

>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4

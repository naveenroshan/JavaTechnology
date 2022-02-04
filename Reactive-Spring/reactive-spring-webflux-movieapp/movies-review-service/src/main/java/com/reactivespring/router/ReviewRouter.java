package com.reactivespring.router;


import com.reactivespring.handler.ReviewHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class ReviewRouter {

    @Bean
    public RouterFunction<ServerResponse> reviewRoute(ReviewHandler reviewHandler){
        return route()
                .GET("/v1/helloworld",(request -> ServerResponse.ok().bodyValue("helloFromDemoFunctionalProgram")))
                .nest(path("/v1/reviews"), builder -> {
                    builder
                            .POST("",request -> reviewHandler.addReview(request))
                            .GET("", request -> reviewHandler.getReviewAll(request))
                            .PUT("/{id}",request -> reviewHandler.updateReview(request))
                            .DELETE("/{id}",request -> reviewHandler.deleteReview(request));
                })
                .build();
    }
}

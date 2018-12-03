(ns ring-graphql-playground.main
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [ring.middleware.resource :refer [wrap-resource]]))

(defn app [request]
  {:status 200 :headers {} :body "ok"})

(defn -main [& args]
  (run-jetty (wrap-resource app "/") {:port 3000}))

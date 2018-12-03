(ns ring-graphql-playground.core)

(defn wrap-graphql-playground [handler]
  (fn [request]
    (handler request)))

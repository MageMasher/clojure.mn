(defproject clojuremn "1.0.0-SNAPSHOT"
  :description "The web site for Clojure dot MN, the Minnesota Clojure group."
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [ring/ring-core "0.3.11"]
                 [ring/ring-jetty-adapter "0.3.11"]
                 [hiccup "0.3.6"]]
  :main clojuremn.core
  :dev-dependencies [[swank-clojure "1.3.0"]]
  :exclusions [org.mortbay.jetty/servlet-api])

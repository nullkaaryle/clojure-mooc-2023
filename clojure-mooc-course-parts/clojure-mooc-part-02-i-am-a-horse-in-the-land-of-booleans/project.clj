(defproject i-am-a-horse-in-the-land-of-booleans "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :profiles {:dev {:dependencies [[midje "1.9.4"]]
                   :plugins      [[lein-midje "3.2.1"]]}})
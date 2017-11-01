(defproject fridur "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0-beta3"]
				[im.chit/hara "2.5.10"]
				[im.chit/lucid "1.3.13"]
				[com.rpl/specter "1.0.4"]
				[prismatic/plumbing "0.5.4"]  ]
  :main ^:skip-aot fridur.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

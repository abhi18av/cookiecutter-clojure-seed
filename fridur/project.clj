(defproject fridur "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0-beta4"]
  ;; https://github.com/dgrnbrg/spyscope
  ;; [metosin/spec-tools "0.5.1"]
  ;; [spectrum "0.1.4"]
				[im.chit/hara "2.5.10"]
				[im.chit/lucid "1.3.13"]
				[com.rpl/specter "1.0.4"]
				[prismatic/plumbing "0.5.4"] 
		 		[codax "1.1.0-SNAPSHOT"]
		 		[datawalk "0.1.10"]
         ]
  :main ^:skip-aot fridur.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

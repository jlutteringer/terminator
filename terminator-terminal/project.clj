(defproject alloy.terminator/terminator-terminal "0.0.1-SNAPSHOT"
	:plugins [[lein-modules "0.3.11"] [lein-cljsbuild "1.1.0"]]
	:description "FIXME: write description"
	:dependencies [[alloy.terminator/terminator-core :version]]
	:source-paths ["src"]

	:cljsbuild {:builds [{:source-paths ["src"]
												:compiler {
																	 :output-to "target/assets/js/stele/core.js"
																	 :optimizations :whitespace
																	 :pretty-print true
																	 }}]}
	:clean-targets ^{:protect false} [:target-path "target/assets/js"])
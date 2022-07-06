(ns site
  (:require [hiccup2.core :as html]))

(defn base [& content]
  [:html {:lang "de"}
   [:head
    [:meta {:charset "utf-8"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
    [:title "Sumthing"]]
   [:body
    [:main#main
     content]]])

;; -----------------------------------------------------------------------------

(defn index-page []
  (base
   [:h1 "Sumthing"]
   [:form {:method :get
           :action "/api/sum"}
    [:input {:type :number
             :name "x"}]
    [:input {:type :number
             :name "y"}]
    [:button {:type :submit}
     "Berechne Summe"]]))

;; -----------------------------------------------------------------------------

(spit "public/index.html" (html/html (index-page)))

(ns r3f-for-testing.r3f-only
  (:require
   [applied-science.js-interop :as j]
   [reagent.dom :as rdom]
   ["three" :as three]
   ["@react-three/fiber" :refer [Canvas]]
;;    ["@react-three/drei" :refer [OrbitControls]]
   ))


(defn RootPage []
  [:> Canvas {:camera {:position [1 3 3]}}
   [:ambientLight {:intensity 0.5}]
;;    [:> OrbitControls]
   [:gridHelper {:args [100 100] :position [0 0 0]}]
   [:mesh {:on-click (fn [e]
                       (let [inter (j/get-in e [:intersections 0 :point])]
                         (js/console.log "box click" inter)))
           :on-pointer-over #(js/console.log "hover on")
           :on-pointer-out  #(js/console.log "hover out")
           :args [1 2 3]}
    [:boxGeometry {:args [1 1 1]}]
    [:meshStandardMaterial {:color "red"
                            :side three/DoubleSide
                            :opacity 0.1
                            :transparent true}]]])



(defn mount-root []
  (rdom/render [RootPage]
               (.getElementById js/document "app")))

(defn ^:export init! []
  (mount-root))


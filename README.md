# r3f for testing

### @react-three/drei can't go through shadow-cljs since v4.0


r3f+drei, version at 2021-03-26, ok

package.json

    {
        "devDependencies": {
            "shadow-cljs": "^2.16.9"
        },
        "dependencies": {
            "@react-three/drei": "^3.11.2", 
            "react-three-fiber": "^5.3.22",
            "react": "^17.0.2",
            "react-dom": "^17.0.2",
            "three": "^0.128.0"
        }
    }



r3f+drei, version at 2021-03-30, failed


    shadow-cljs - watching build :r3f-and-drei
    [:r3f-and-drei] Configuring build.
    [:r3f-and-drei] Compiling ...
    [:r3f-and-drei] Build failure:
    Closure compilation failed with 2 errors
    --- node_modules/three-stdlib/index.cjs.js:2
    Illegal variable reference before declaration: i
    --- node_modules/three-stdlib/index.cjs.js:2
    Illegal variable reference before declaration: t


- "@react-three/drei": "^4.0.0",     // (2021-03-29)  three-stdlib is now the defacto pacakge over three/examples. minimum supported version of react-three/fiber is ">=6.0"
- "@react-three/fiber": "^6.0.0",    //  (2021-03-30), rename react-three-fiber to @react-three/fiber

package.json

    {
        "devDependencies": {
            "shadow-cljs": "^2.16.9"
        },
        "dependencies": {
            "@react-three/drei": "^4.0.0", 
            "@react-three/fiber": "^6.0.0",
            "react": "^17.0.2",
            "react-dom": "^17.0.2",
            "three": "^0.128.0"
        }
    }


r3f-only, 2021-10-06, for all versions, ok

- "@react-three/fiber": "^7.0.10",    //  (2021-10-06)

package.json

    {
        "devDependencies": {
            "shadow-cljs": "^2.16.9"
        },
        "dependencies": {
            "@react-three/fiber": "^7.0.10",
            "react": "^17.0.2",
            "react-dom": "^17.0.2",
            "three": "^0.128.0"
        }
    }
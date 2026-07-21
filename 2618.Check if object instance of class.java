/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
    // null and undefined are not instances of anything
    if (obj === null || obj === undefined) {
        return false;
    }

    // classFunction must be a function
    if (typeof classFunction !== "function") {
        return false;
    }

    // Traverse the prototype chain
    let prototype = Object.getPrototypeOf(obj);

    while (prototype !== null) {
        if (prototype === classFunction.prototype) {
            return true;
        }
        prototype = Object.getPrototypeOf(prototype);
    }

    return false;
};
 

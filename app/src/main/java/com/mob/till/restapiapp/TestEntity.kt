package com.mob.till.restapiapp

class TestEntity {
    var test: String? = null
        private set

    constructor() {}
    constructor(test: String?) {
        this.test = test
    }
}
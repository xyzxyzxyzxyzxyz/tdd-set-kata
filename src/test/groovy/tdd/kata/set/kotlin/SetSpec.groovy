package tdd.kata.set.kotlin

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

import java.util.stream.IntStream

class SetSpec extends Specification{

    @Subject def Set

    def setup() {
    }


    def "TEMPLATE"(){
        given: "SCENARIO"
            def set = new Set()
        when: "ACTIONS"
            set = set
        then: "RESULTS"
            set = set
    }

    /*

        then:
            thrown(Exception)   // Exception has been thrown
        expect: = when + then

     */

}

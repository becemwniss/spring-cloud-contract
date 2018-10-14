import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should login"
    request {
        url "/login"
        method POST()
    }
    response {
        status 200
        body (
                id: 1,
                name: "foo",
                surname: "bee"
        )
    }

}

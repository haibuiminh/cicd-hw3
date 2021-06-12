var expect  = require("chai").expect;
var request = require("request");

describe("Test Teacher Api Status", function() {
    let url = 'http://localhost:5000/api/users/get-list-user?type=1';
    it("returns status 200", function(done) {
        request(url, function(error, response, body) {
          expect(response.statusCode).to.equal(200);
          done();
        });
      });
})
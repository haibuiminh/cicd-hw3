const assert = require('assert');
const userController = require('../components/users/controller/userController');
describe('Test User Controller', () => {
 it('should return true', () => {
        assert.equal(userController.leapYear(2020), true);
    });
 it('should return false', () => {
        assert.equal(userController.leapYear(2021), false);
    });
});
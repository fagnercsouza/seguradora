const proxy = [
    {
        context: '/api',
        target: 'http://localhost:8080',
        pathRewrilte: {'^/api':''}
    }
];

module.exports = proxy;
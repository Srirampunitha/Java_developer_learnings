//creating a server
var http = require('http')
http.createServer(function(req,res)
{
    res.writeHead(200, {'Content-Type':'Json'})
res.write("Hi Aarthi!!")
res.end();
}).listen(2505)
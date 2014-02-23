/**
 * Created by fran on 2/23/14.
 */
var soap = require('soap');
var rootLib = '/usr/local/lib/node_modules/npm/node_modules/';
var express = require(rootLib + 'express')
    , http = require('http')
    , path = require('path')
    , socketio = require(rootLib + 'socket.io');

//global variables
var url = 'http://wss.prepa.com/services/BreakdownReport?wsdl';
var args = {name: 'value'};
var municipalities = ["ADJUNTAS", "AGUADA", "AGUADILLA", "AGUAS BUENAS", "AIBONITO", "ANASCO", "ARECIBO",
    "ARROYO", "BARCELONETA", "BARRANQUITAS", "BAYAMON", "CABO ROJO", "CAGUAS", "CAMUY",
    "CANOVANAS", "CAROLINA", "CATANO", "CAYEY", "CEIBA", "CIALES", "CIDRA", "COAMO",
    "COMERIO", "COROZAL", "CULEBRA", "DORADO", "FAJARDO", "FLORIDA", "GUANICA", "GUAYAMA",
    "GUAYANILLA", "GUAYNABO", "GURABO", "HATILLO", "HORMIGUEROS", "HUMACAO", "ISABELA",
    "JAYUYA", "JUANA DIAZ", "JUNCOS", "LAJAS", "LARES", "LAS MARIAS", "LAS PIEDRAS",
    "LOIZA", "LUQUILLO", "MANATI", "MARICAO", "MAUNABO", "MAYAGUEZ", "MOCA", "MOROVIS",
    "NAGUABO", "NARANJITO", "OROCOVIS", "PATILLAS", "PENUELAS", "PONCE", "QUEBRADILLAS",
    "RINCON", "RIO GRANDE", "SABANA GRANDE", "SALINAS", "SAN GERMAN", "SAN JUAN", "SAN LORENZO",
    "SAN SEBASTIAN", "SANTA ISABEL", "TOA ALTA", "TOA BAJA", "TRUJILLO ALTO", "UTUADO", "VEGA ALTA",
    "VEGA BAJA", "VIEQUES", "VILLALBA", "YABUCOA", "YAUCO"];

var app = express()
    , server = http.createServer(app)
    , io = socketio.listen(server);
var header = {'Access-Control-Allow-Origin': '*'};

app.configure(function () {
    app.set('port', process.env.PORT || 8002);
    app.set('views', '../index.html');
//    app.set('view engine', 'hjs');
    app.use(express.favicon());
    app.use(express.logger('dev'));
    app.use(express.bodyParser());
    app.use(express.methodOverride());
//    app.use(expre/ss.cookieParser(config.cookiesecret));
    app.use(app.router);
//    app.use(express.static(path.join(__dirname, 'public')));
});

app.configure('development', function () {
    app.use(express.errorHandler());
});

var allowCrossDomain = function (req, res, next) {
    res.header('Access-Control-Allow-Origin', "*");
    res.header('Access-Control-Allow-Methods', 'GET,PUT,POST,DELETE');
    res.header('Access-Control-Allow-Headers', 'Content-Type');
};

app.configure(function () {
    app.use(allowCrossDomain);
});

server.listen(app.get('port'), function () {
    console.log("Express server listening on port " + app.get('port'));
});


io.configure('production', function () {
    io.enable('browser client etag');
    io.set('log level', 1);
});

io.configure('development', function () {
    io.set('log level', 1);
});

io.sockets.on('connection', function (socket) {
    socket.on('event', function (event) {
        socket.join(event);
    });
});

app.get('/doTest/:id', function (req, res) {
//    res.set('Access-Control-Allow-Origin', '*');
    console.info("ID " + req.params.id);
    var header = {'Access-Control-Allow-Origin': '*'};
    res.set(header).status(200).send("Hola francisco esto es solo una test");
});

app.get('/getBreakdownsSummary/', function (req, res) {
//    res.set('Access-Control-Allow-Origin', '*');
//    var results = 'nothing';
    soap.createClient(url, function (err, client) {
        client.getBreakdownsSummary(args, function (err, result) {
            console.log(result);
            var header = {'Access-Control-Allow-Origin': '*'};
            res.set(header).status(200).send(result);
        });
    });
//    console.info("town " + req.params.town);

});

app.get('/getBreakdownsByTownOrCity/:town', function (req, res) {
//    res.set('Access-Control-Allow-Origin', '*');
//    var results = 'nothing';
    var argsTown = {townOrCity: req.params.town};

    soap.createClient(url, function (err, client) {
        client.getBreakdownsByTownOrCity(argsTown, function (err, result) {
            console.log(result);
            var header = {'Access-Control-Allow-Origin': '*'};
            res.set(header).status(200).send(result);
        });
    });
});

app.get('/getAllTowns/', function (req, res) {

    var header = {'Access-Control-Allow-Origin': '*'};
    soap.createClient(url, function (err, client) {
        client.getBreakdownsSummary(args, function (err, result) {

            console.log(result.return);
            var allTown = [];
            for (var mun in municipalities) {
                var summary = {};
                for (var breakdownSummary in result.return) {
                    if (municipalities[mun].trim() === result.return[breakdownSummary].r1TownOrCity.trim()) {
//                        console.log("*" + result.return[breakdownSummary].r1TownOrCity.trim() + "*");
//                        console.log("*" + municipalities[mun].trim() + "*");
//                        console.log("*" + result.return[breakdownSummary].r2TotalBreakdowns + "*");
                        summary.r1TownOrCity = result.return[breakdownSummary].r1TownOrCity;
                        summary.r2TotalBreakdowns = result.return[breakdownSummary].r2TotalBreakdowns;
                    } else {
                        var exist = false;

                        for (var town in allTown) {

                            console.log(allTown[town].r1TownOrCity);
                            if(municipalities[mun].trim() === allTown[town].r1TownOrCity.trim()){
                                console.log("Exist" + allTown[town].r2TotalBreakdowns);
                                exist = true;
                                break;
                            }

                        }
                        if (exist === false) {
                            summary.r1TownOrCity = municipalities[mun];
                            summary.r2TotalBreakdowns = 0;
                        }
                    }
                }
                allTown.push(summary);
            }
            res.set(header).status(200).send(allTown);

        });
    });
});











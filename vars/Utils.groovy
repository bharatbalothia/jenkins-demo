import groovy.json.JsonSlurper



def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def readPrint() {
    
    def rootDir = pwd()
    println("Current Directory: " + rootDir)

    def data = new JsonSlurper().parse("${rootDir}/data.json" as File)

    def report = data.reports[0]

    def headers = report.columnHeader.metricHeader.metricHeaderEntries
    println report.data.rows.collectMany{
        [ headers, it.metrics[0].values].transpose().collect{ h, v ->
            [name: h.name, value: v, report_date: it.dimensions[0]]
        }
    }
}

return this
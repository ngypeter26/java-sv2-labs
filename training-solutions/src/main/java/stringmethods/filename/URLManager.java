package stringmethods.filename;

public class URLManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public URLManager(String url) {
        protocol = getProtocolFromURl(url);
        host = getHostFromURL(url);
        port = getPortFromURL(url);

        }
        public String getProtocolFromURl(String url){
            url = url.trim();
            int index = url.indexOf("://");
            return url.substring(0,index);
        }
    public String getHostFromURL(String url){
        url = url.trim();
        int startIndex = url.indexOf("://");
        int endIndex;
        if ( url.lastIndexOf(":") == url.indexOf(":")){ // nincs benne port
            endIndex = url.lastIndexOf("/");
        }else{
            endIndex = url.lastIndexOf(":");
        }
        return url.substring(startIndex,endIndex);
    }

    public Integer getPortFromURL(String url){
        url = url.trim();
        if ( url.lastIndexOf(":") == url.indexOf(":")){ // nincs benne port
           return 10;
        }else{
            int startIndex = url.lastIndexOf(":");
            int endIndex = url.lastIndexOf("/");
            String portString= url.substring(startIndex,endIndex);
            return Integer.parseInt(portString);
        }
    }

    public String getPathFromURL(String url){
        url = url.trim();
        int startIndex = url.lastIndexOf("://");
        int endIndex;
        if ( url.lastIndexOf(":") == url.indexOf(":")){ // nincs benne port
            endIndex = url.lastIndexOf("/");
        }else{
            endIndex = url.lastIndexOf(":");
        }
        return url.substring(startIndex,endIndex);
    }






    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public boolean hasProperty(String key) {
        return false;
    }

    public String getProperty(String key) {
        return key;
    }

    public static void main(String[] args) {
        URLManager urlManager = new URLManager("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");



    }
}



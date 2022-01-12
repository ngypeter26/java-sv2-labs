package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {
    private List<DnsEntry> nameServer = new ArrayList<>();


    public void addEntry(String hostName, String hostIp){
        if (isAlreadyExist( hostName, hostIp)){
            throw new IllegalArgumentException("Already exists");
        }
        nameServer.add(new DnsEntry(hostName,hostIp));
    }
    public void removeEntryByName (String hostName){
        nameServer.remove(getEntryByName(hostName));
    }
    public void removeEntryByIp (String hostIp){
        nameServer.remove(getEntryByIp(hostIp));
    }
    public String getIpByName(String hostName){
        return getEntryByName(hostName).hostIp;
    }
    public String getNameByIp (String hostIp){
        return getEntryByIp(hostIp).hostName;
    }



    private DnsEntry getEntryByName(String hostName){
        for (DnsEntry entry : nameServer){
            if(entry.hostName.equals(hostName)){
                return entry;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }
    private DnsEntry getEntryByIp(String hostIp){
        for (DnsEntry entry : nameServer){
            if(entry.hostIp.equals(hostIp)){
                return entry;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private boolean isAlreadyExist(String hostName,String hostIp){
        for (DnsEntry entry : nameServer){
            if(entry.hostIp.equals(hostIp) || entry.hostName.equals(hostName)){
                return true;
            }
        }
        return false;
    }

    private static class DnsEntry{
        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }
    }


}

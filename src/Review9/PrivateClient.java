package Review9;

public class PrivateClient {
    private String name;
    private  long ssn;

    PrivateClient(String name,long ssn){
        if(name!=null && !name.isEmpty()){
            this.name=name;

        }
        if(ssn!=0){
            this.ssn=ssn;

        }

    }
    public String getName() {
        final String name1 = name;
        return name1;
    }

        public long getSsn(){
            return ssn;
        }

        }



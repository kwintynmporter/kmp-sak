class Help {
    public static void printHelp() {
        System.out.println("\n Copy and paste one of these examples to see what each of these lines do."); 
        System.out.println("\nHttpRequest [URL] examples:");
        System.out.println("java sak -HttpRequest https://www.cnn.com");
        System.out.println("java sak -HttpRequest https://thunderbird-data-ejpv2.azurewebsites.net/jexjka.json");
        System.out.println("\nHttpRequestIndex [URL] example:");
        System.out.println("java sak -HttpRequestIndex https://thunderbird-index.azurewebsites.net/w0a6zk195d.json");  
        System.out.println("\nPlease type the option you would like to execute, including the \"-\" before it.");
        System.out.println("NOTE: Not case sensitive.");     
    }
}
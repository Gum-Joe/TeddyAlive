package com.gumjoe.teddyalive;

import com.google.common.base.Charsets;
import com.google.common.base.Predicate;
import com.google.common.base.Throwables;
import com.google.common.collect.Iterables;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import com.google.gson.Gson;
import difflib.DiffUtils;
import difflib.Patch;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.util.*;

import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.output.TeeOutputStream;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.ResetCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.revwalk.RevCommit;
/**
 * Hello world!
 *
 */
public class teddyalive 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Welcome to TeddyAlive" );
        //Starting
        //loading
        File bin = new File("./bin");
        if (!bin.exists()){
            System.out.println( "TeddyAlive does not exist!" );
            String s = null;
            try {
             
        // clone bin
            // using the Runtime exec method:
            Process p = Runtime.getRuntime().exec("git clone https://github.com/Gum-Joe/TeddyAlive.git ./bin");
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(p.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(p.getErrorStream()));
 
            // read the output from the command
            
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
             
            // read any errors from the attempted command
            
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
             
            
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
   
        }
        
        File sdk = new File("./sdk");
        if (!sdk.exists()){
            String y = null;
            try {
             
        // clone sdk
            // using the Runtime exec method:
            Process z = Runtime.getRuntime().exec("git clone https://github.com/Gum-Joe/TeddyAlive -b sdk ./sdk");
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(z.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(z.getErrorStream()));
 
            // read the output from the command
            
            while ((y = stdInput.readLine()) != null) {
                System.out.println(y);
            }
             
            // read any errors from the attempted command
            
            while ((y = stdError.readLine()) != null) {
                System.out.println(y);
            }
             

        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
        
        }
        
        File musiclib = new File("./bin/libs/beets");
        if (!musiclib.exists()){
            String k = null;
            try {
             
        // clone music lib
            // using the Runtime exec method:
            Process j = Runtime.getRuntime().exec("git clone https://github.com/sampsyo/beets.git ./bin/libs/beets");
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(j.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(j.getErrorStream()));
 
            // read the output from the command
            
            while ((k = stdInput.readLine()) != null) {
                System.out.println(k);
            }
             
            // read any errors from the attempted command
            
            while ((k = stdError.readLine()) != null) {
                System.out.println(k);
            }
             

        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
        }
        
        
        System.out.println( "Downloading/Updateing Files" );
        System.out.println( "Updating Repo @ https://github.com/Gum-Joe/TeddyAlive.git" );
        ProcessBuilder pb = new ProcessBuilder("git", "pull", "https://github.com/Gum-Joe/MinecraftServerStarterKit.git");
        Process p = pb.start();
        // Checking for new plugins
        File plugin = new File("./plugins/.");
        if (plugin.exists()){
             System.out.println( "Updateing files..." );
            String t = null;
            try {
             
        // clone music lib
            // using the Runtime exec method:
            Process r = Runtime.getRuntime().exec("patch -b ./bin/Commands/CommandHelp.py ./plugins/*/*.patch");
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(r.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(r.getErrorStream()));
 
            // read the output from the command
            
            while ((t = stdInput.readLine()) != null) {
                System.out.println(t);
            }
             
            // read any errors from the attempted command
            
            while ((t = stdError.readLine()) != null) {
                System.out.println(t);
            }
             

        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
        }
File Auth = new File("./bin/OAuth.sh");
        if (!Auth.exists()){
            System.out.println( "Authenticater does not exits" );
            System.exit(1);
        }
        
        System.out.println( "Hello! To continue, just type you command" );
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("\nEnter it to continue... ");
        String Command = userInputScanner.nextLine();
        Process process;
        String s = null;
 
       //running the command
 try {
             
        // run the Java file "ps -ef" command
            // using the Runtime exec method:
            Process a = Runtime.getRuntime().exec("java -jar ./bin/Command" + Command + "/target/TeddyAliveCommand" + Command + ".jar");
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(a.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(a.getErrorStream()));
 
            // read the output from the command
           
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
             
            // read any errors from the attempted command
            
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
             
            System.exit(0);
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
            
             
    }
}

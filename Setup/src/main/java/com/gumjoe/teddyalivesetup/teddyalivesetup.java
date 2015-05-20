package com.gumjoe.teddyalivesetup;

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
import java.io.*;
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
public class teddyalivesetup 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello, Welcome to Teddy Setup v0.1 ALPHA" );
        System.out.println( "Starting to download TeddyAlive" );
        //run
        // build my command as a list of strings
String s = null;
 
        try {
             
        // run the Unix "ps -ef" command
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


// Run

String b = null;
try {
             
        // run the Unix "ps -ef" command
            // using the Runtime exec method:
            Process a = Runtime.getRuntime().exec("sh ./bin/SetupDepone.sh");
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(a.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(a.getErrorStream()));
 
            // read the output from the command
            
            while ((b = stdInput.readLine()) != null) {
                System.out.println(b);
            }
             
            // read any errors from the attempted command
            
            while ((b = stdError.readLine()) != null) {
                System.out.println(b);
            }
             

        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
        
        //clone sdk
        String y = null;
try {
             
        // run the Unix "ps -ef" command
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

//Running
String n = null;
try {
             
        // run the Unix "ps -ef" command
            // using the Runtime exec method:
            Process m = Runtime.getRuntime().exec("java -jar ./bin/TeddyAlive/target/TeddyAlive.jar");
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(m.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(m.getErrorStream()));
 
            // read the output from the command
            
            while ((n = stdInput.readLine()) != null) {
                System.out.println(n);
            }
             
            // read any errors from the attempted command
            
            while ((n = stdError.readLine()) != null) {
                System.out.println(n);
            }
             

        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
    
    
    }
}

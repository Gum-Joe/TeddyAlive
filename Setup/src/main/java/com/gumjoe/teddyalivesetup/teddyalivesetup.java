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
        String s = null;
			
           //first
            try {
            
            Process s = Runtime.getRuntime().exec("git clone https://github.com/Gum-Joe/TeddyAlive.git -b clone ./bin");
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(s.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(s.getErrorStream()));
 
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
         
         System.out.println("Getting more files");
        //sec
        String clonetwoout = null;
        
        try {
            
            Process clonetwo = Runtime.getRuntime().exec("git clone https://github.com/Gum-Joe/TeddyAlive.git ./sdk_commandbuilder");
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(clonetwoout.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(clonetwoout.getErrorStream()));
            // read the output from the command
            while (clonetwoout = stdInput.readLine()) != null) {
                System.out.println(clonetwoout);
            }
             
            // read any errors from the attempted command
            while ((clonetwoout = stdError.readLine()) != null) {
                System.out.println(clonetwoout);
            }
             
            
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
        //runing
        System.out.println("Running...");
        String runso = null;
        
        try {
            
            Process runs = Runtime.getRuntime().exec("java -jar ./bin/TeddyAlive.jar");
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(runso.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(runso.getErrorStream()));
 
            // read the output from the command
            while ((runso = stdInput.readLine()) != null) {
                System.out.println(runso);
            }
             
            // read any errors from the attempted command
            while ((runso = stdError.readLine()) != null) {
                System.out.println(runso);
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

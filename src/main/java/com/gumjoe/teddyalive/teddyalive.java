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
import com.gumjoe.universalutils.*;
import com.gumjoe.universalsetupapi.*;

public class teddyalive
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Welcome to TeddyAlive" );
        System.out.println( "Running version: " + version.versionnumber + "-" + version.versiontype + "-" + version.realesetype + " on " + System.getProperty( "os.name" ) );
        //Starting
        //loading
        File bin = new File("./bin");
        File install = new File("./install");
        if (!bin.exists()){
            System.out.println( "TeddyAlive does not exist!" );
           setup.setup( "Teddy Alive", "Get requirements from Github", "com.gumjoe.teddyalive", "com.gumjoe", "Gum-Joe", "1", "2", "clone", "git", "https://github.com/Gum-Joe/TeddyAlive.git", bin, install  );
   
        }
        
        File sdk = new File("./sdk");
        if (!sdk.exists()){
            cloneBranch.clone("https://github.com/Gum-Joe/TeddyAlive", "sdk", sdk);
        }
        
        File musiclib = new File("./libs/beets");
        if (!musiclib.exists()){
            subSetup.subSetup( "beets", "Get music lib from GitHub", "Teddy Alive", "External Package for Teddy Alive", "sampsyo", "sampsyo", "2", "2", "clone", "git", "https://github.com/sampsyo/beets.git", musiclib, install  );
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
        System.out.print("\nEnter your command to continue... ");
        String Command = userInputScanner.nextLine();
        Process process;
        if(Command.equals("Stop")){
            System.out.println("Ok, exiting")
            System.exit(0)
        }
           commandRunner.runCommand( Command );
             
    }

}



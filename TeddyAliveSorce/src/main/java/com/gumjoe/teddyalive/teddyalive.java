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
        System.out.println( "Downloading/Updateing Files" );
        System.out.println( "Updating Repo @ https://github.com/Gum-Joe/TeddyAlive.git" );
        ProcessBuilder pb = new ProcessBuilder("git", "pull", "https://github.com/Gum-Joe/MinecraftServerStarterKit.git");
        Process p = pb.start();
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
        if (Command == "Stop") {
          System.out.println("Stopping ");
          System.exit(0);
        }else{
            System.err.println("InvalidCommand ");
            System.err.println("");
            System.err.println(" Please type a valid command ");
            //re run
        }
        if (Command == "Help") {
          ProcessBuilder CStop = new ProcessBuilder("java", "-jar", "./bin/CommandStop.jar");
          Process CSt = pb.start();
        } else {
            System.err.println("InvalidCommand ");
            System.err.println("");
            System.err.println(" Please type a valid command ");
            //re run
            
        }
    }
}

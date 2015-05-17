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
String command = "git clone https://github.com/Gum-Joe/TeddyAlive.git -b clone ./bin"
 
// execute my command
SystemCommandExecutor commandExecutor = new SystemCommandExecutor(command);
int result = commandExecutor.executeCommand();
 
// get the output from the command
StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
StringBuilder stderr = commandExecutor.getStandardErrorFromCommand();
 
// print the output from the command
System.out.println("STDOUT");
System.out.println(stdout);
System.out.println("STDERR");
System.out.println(stderr);

//runing the thing

System.out.println( "Running..." );
    List<String> commandtwo = new ArrayList<String>();
commandtwo.add("java");
commandtwo.add("-jar");
commandtwo.add("./bin/TeddyAlive.jar");
 
// execute my command
SystemCommandExecutor commandExecutortwo = new SystemCommandExecutor(commandtwo);
int result = commandExecutortwo.executeCommand();
 
// get the output from the command
StringBuilder stdout = commandExecutortwo.getStandardOutputFromCommand();
StringBuilder stderr = commandExecutortwo.getStandardErrorFromCommand();
 
// print the output from the command
System.out.println("STDOUT");
System.out.println(stdout);
System.out.println("STDERR");
System.out.println(stderr);
    
    
    }
}

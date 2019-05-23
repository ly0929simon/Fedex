--------------------------------------------------------------------
Samples for calling FedEx Web Services (java)
--------------------------------------------------------------------

jdk 1.5 was used for testing.

When new wsdls are available, you will have to re-create the java files in the stub package for each sample project.


1. Download axis files (this is a one-time step)
----------------------------------------------------------------------
You will need to download Axis 1.4 components from www.apache.org at http://archive.apache.org/dist/ws/axis/1_4/
Download axis-bin-1_4.zip or axis-src-1_4.zip. Unzip it into any folder on your drive.
Add the following jar files from the "axis-1_4\lib" folder into your CLASSPATH 
(for best results with your IDE, follow the one-time procedure shown right after the list of jar files below):
	axis.jar, 
	axis-ant.jar, 
	commons-discovery-0.2.jar, 
	commons-logging-1.0.4.jar, 
	jaxrpc.jar, 
	log4j-1.2.8.jar, 
	saaj.jar, 
	wsdl4j-1.5.1.jar
The following files are not provided with axis but can be obtained from the web. Without these you may get some compilation warnings/errors.
It is more convenient if you also copy them into "axis-1_4\lib".
	activation.jar, 
	mailapi.jar


2. Set CLASSPATH (this is a one-time step)
--------------------------------------------------------------------
On Eclipse-based IDEs, go to Window, Preferences, Java, Build Path, 
Classpath variables, add "New" variable. Call this "AXIS_HOME", 
and point it to where you unzipped axis components (the folder "axis-1_4", or similar if you use a different version).

(Doing this one-time procedure will automatically take care of classpath references for axis jars in each of the sample projects, 
when you open each project as shown below).


3. How to make use of the sample projects
--------------------------------------------------------------------

For testing, you do not have to create a new project from scratch for any of the sample projects.
Each of the projects provided here has an associated ".project" file with it. 
This can be used to directly import all existing project files into a new project on Eclipse-based IDEs.
In the IDE, click on File, Import, Existing projects into workspace. Select "Root Directory", then point to the folder containing a ".project" file.
The corresponding project name shows up. Select it and click OK. This will create the project in the IDE, with all required and referenced files.


4. How to re-create the java files in the "stub" package for each project
---------------------------------------------------------------------------------------------------------
WSDL2Java is contained in axis.jar. This is needed to (re)generate the files in the "stub" package - i.e. create java files from a wsdl.
This will be more convenient if you first add axis.jar to your system classpath. 

*The following is a one-time step:*
On windows, go to control panel, system, advanced, environment variables, system variables, new - 
create a variable called CLASSPATH and add "<full path>\axis.jar" to it.
If you had any command prompt open before doing this, you will have to close it and start a new one to be able to recognize the jar files mentioned above.
*End of one-time step*

Now, start a command prompt, and use the command:
java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.ship.stub <full_path>/myfile1.wsdl

example:
java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.ship.stub http://www.fedex.com/...../TrackService_v4.wsdl
depending on your environment, you may have to use a "?" instead of "." just before "wsdl"
see the command below:
java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.ship.stub http://www.fedex.com/...../TrackService?wsdl
or
java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.ship.stub C:\projects\wsdl\TrackService_v4.wsdl
or similar.

This will create all files in the stub package, and place them in the folder where you are running the command prompt.
You can then copy the newly created "com" folder and its contents into the appropriate sample project root directory.
----
Now, for each project, make sure there are no compile errors in the web service client main class, and run the project to get the desired output.


5. Date format
----------------
Axis 1.4 maps all xsd:dateTime WSDL/Schema types to Calendar class. The default serialized format of Calendar is:

"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"

Some web services may generate warning with the above format. To override this format each project has a client-config.wsdd file which defines custom type mapping for Calendar. Using this, the Axis client will serialize the Calendar objects in the following format:

"yyyy-MM-dd'T'HH:mm:ss.SSS(+|-)HH:mm"


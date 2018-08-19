package app.orbitahealth.sdk;

import com.google.gson.JsonElement;
import com.squareup.okhttp.ResponseBody;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import app.orbitahealth.sdk.requestmodel.LineChart;
import app.orbitahealth.sdk.requestmodel.PostCommentModel;
import app.orbitahealth.sdk.requestmodel.SearchMedicine;
import app.orbitahealth.sdk.requestmodel.WizardTrackingModel;
import app.orbitahealth.sdk.requestmodel.addgroupmember.AddGroupMemberRequest;
import app.orbitahealth.sdk.requestmodel.addgroupmember.SendInvitationRequest;
import app.orbitahealth.sdk.requestmodel.addhealthdata.AddHealthDataRequest;
import app.orbitahealth.sdk.requestmodel.addmedicinemodel.AddMedicine;
import app.orbitahealth.sdk.requestmodel.addmemberrequest.AddMember;
import app.orbitahealth.sdk.requestmodel.addpills.AddPills;
import app.orbitahealth.sdk.requestmodel.addsurveydata.AddSurveyDataRequest;
import app.orbitahealth.sdk.requestmodel.assignmember.AssignMemberModel;
import app.orbitahealth.sdk.requestmodel.assignuser.AssignUser;
import app.orbitahealth.sdk.requestmodel.carenotes.CareNotesListRequest;
import app.orbitahealth.sdk.requestmodel.createactivity.CreateActivity;
import app.orbitahealth.sdk.requestmodel.deletemember.DeleteMember;
import app.orbitahealth.sdk.requestmodel.devicedisconnect.ProviderName;
import app.orbitahealth.sdk.requestmodel.patientweight.PatientWeight;
import app.orbitahealth.sdk.requestmodel.removepills.RemovePills;
import app.orbitahealth.sdk.requestmodel.searchgroups.SearchGroupRequest;
import app.orbitahealth.sdk.requestmodel.sendposts.NewPostRequest;
import app.orbitahealth.sdk.requestmodel.signupmodel.User;
import app.orbitahealth.sdk.requestmodel.updategroupmember.UpdateRoleRequest;
import app.orbitahealth.sdk.requestmodel.updateuserprofile.UpdateUserProfileRequest;
import app.orbitahealth.sdk.responsemodel.CareCircleDetails;
import app.orbitahealth.sdk.responsemodel.DeviceAuthenticationModel;
import app.orbitahealth.sdk.responsemodel.HasMore;
import app.orbitahealth.sdk.responsemodel.LikesCountResponse;
import app.orbitahealth.sdk.responsemodel.OrganizationResponse;
import app.orbitahealth.sdk.responsemodel.SearchMedicineResponse;
import app.orbitahealth.sdk.responsemodel.activityresponse.ActivityResponse;
import app.orbitahealth.sdk.responsemodel.addmedicineresponse.AddMedicineResponse;
import app.orbitahealth.sdk.responsemodel.carecircleidresponse.CareCircleIdResponse;
import app.orbitahealth.sdk.responsemodel.carecircleinvitedetails.CareCircleInviteDetails;
import app.orbitahealth.sdk.responsemodel.carecirclemembersearch.MemberSearchResponse;
import app.orbitahealth.sdk.responsemodel.caregiverresponse.CaregiverResponse;
import app.orbitahealth.sdk.responsemodel.bodyweightresponse.ResponseChartData;
import app.orbitahealth.sdk.responsemodel.carenotes.CarenotesAddResponse;
import app.orbitahealth.sdk.responsemodel.carenotes.CarenotesListResponse;
import app.orbitahealth.sdk.responsemodel.conversationlistresponse.ConversationListResponse;
import app.orbitahealth.sdk.responsemodel.createactivityresponse.CreateActivityResponse;
import app.orbitahealth.sdk.responsemodel.deviceinforesponse.DeviceInfoResponse;
import app.orbitahealth.sdk.responsemodel.deviceresponse.DeviceCallback;
import app.orbitahealth.sdk.responsemodel.devicestatusresponse.DeviceStatusResponse;
import app.orbitahealth.sdk.responsemodel.getassignedtasks.ExerciseTaskDescriptionResponse;
import app.orbitahealth.sdk.responsemodel.getassignedtasks.MedicationTaskDescriptionResponse;
import app.orbitahealth.sdk.responsemodel.getassignedtasks.SurveyTaskResultResponse;
import app.orbitahealth.sdk.responsemodel.getassignedtasks.SurveyTaskSchemaResponse;
import app.orbitahealth.sdk.responsemodel.getassignedtasks.Task;
import app.orbitahealth.sdk.responsemodel.getcommentsresponse.GetCommentsResponse;
import app.orbitahealth.sdk.responsemodel.getdashboard.GetDashboard;
import app.orbitahealth.sdk.responsemodel.getinsights.GetInsightsResponse;
import app.orbitahealth.sdk.responsemodel.getmedicineresponse.GetMedicineResponse;
import app.orbitahealth.sdk.responsemodel.getmemberlist.GetMemberList;
import app.orbitahealth.sdk.responsemodel.getpersona.GetPersona;
import app.orbitahealth.sdk.responsemodel.getposts.GetPostsResponse;
import app.orbitahealth.sdk.responsemodel.getposts.NewPost;
import app.orbitahealth.sdk.responsemodel.getsurveyresultgraphdata.GetSurveyResultsResponse;
import app.orbitahealth.sdk.responsemodel.getsurveyresultgraphdata.SurveyInsightsResponse;
import app.orbitahealth.sdk.responsemodel.getuserprofile.GetUserResponse;
import app.orbitahealth.sdk.responsemodel.healthdataresponse.HealthDataResponse;
import app.orbitahealth.sdk.responsemodel.healthdataresponse.MetaResponse;
import app.orbitahealth.sdk.responsemodel.healthdataresponse.PageDatum;
import app.orbitahealth.sdk.responsemodel.messagesrecipientsearch.RecipientSearchResponse;
import app.orbitahealth.sdk.responsemodel.orbitabuttonevents.OrbitaButtonEvents;
import app.orbitahealth.sdk.responsemodel.orbitabuttonevents.OrbitaEvents;
import app.orbitahealth.sdk.responsemodel.orbitabuttonsconnected.OrbitaButtonsConnected;
import app.orbitahealth.sdk.responsemodel.patientheightresponse.PatientHeightResponse;
import app.orbitahealth.sdk.responsemodel.patientpasswordchange.PatientPasswordChange;
import app.orbitahealth.sdk.responsemodel.patientweightresponse.PatientWeightResponse;
import app.orbitahealth.sdk.responsemodel.personastyperesponse.PersonaTypesResponse;
import app.orbitahealth.sdk.responsemodel.pillboxresponse.getpillsresponse.PillBoxDetails;
import app.orbitahealth.sdk.responsemodel.postcommentsresponse.PostCommentResponse;
import app.orbitahealth.sdk.responsemodel.searchgroups.SearchGroupResponse;
import app.orbitahealth.sdk.responsemodel.wizardResponse.WizardTrackingResponse;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Multipart;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Part;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.mime.TypedFile;

/**
 * The interface that contais all the end points for API calls
 */
public interface Services {

    /**
     * SignUp a new User
     * @param user - The details of the new user
     * @param callback - The success reponse
     */
    @Headers("Content-Type : application/json")
    @POST("/api/users/signup")
    void getSignup(@Body User user, Callback<SignUpResponse> callback);


    /**
     * Test the entered password
     * @param user - the password entered by the user
     * @param callback - returns success if the password matches the password policy
     */
    @Headers("Content-Type : application/json")
    @POST("/api/passwordstrategy/passwordtest")
    void verifyPassword(@Body User user , Callback<PasswordValidateResponse> callback);


    /**
     * Login a authenticated user
     * @param user - email id and password
     * @param userAgent - the device information from which he is logging in
     * @param callback - a JWT token is recieved if the login is successful
     */
    @POST("/login")
    void getSignIn(@ Body User user,@Header("User-Agent") String userAgent, Callback<SignInResponse> callback);

    @POST("/login")
    void getSignIn(@ Body User user,@Header("Content-Type") String content,@Header("User-Agent") String userAgent, Callback<SignInResponse> callback);



    /**
     * Forget Password api
     * @param user - the registered email address of the user
     * @param callback - success response and a verification mail will be triggered by back end
     */
    @Headers("Content-Type : application/json")
    @POST("/api/users/password/forgot\n")
    void getForgotPassword(@Body User user, Callback<ForgotPasswordResponse> callback);


    /**
     * Upload an image into the server
     * @param image - the image file
     * @param token - auth token
     * @param cb - returns the image url on success
     */
    @Multipart @Headers("Content-Type : application/json")
    @POST("/api/uploads/avatar/{id}")
    void upload(@Part("image") TypedFile image, @Header("X-IndividualUser-Token") String token, Callback<ImageUploadResponse> cb);
    @Multipart @Headers("Content-Type : application/json")
    @POST("/api/uploads/avatar/{id}")
    void upload(@Part("image") TypedFile image,Callback<ImageUploadResponse> cb);

    /*@PUT("/api/users/{userId}")
    void updateUser(@Body AssignMemberModel assignMemberModel, @Header("Authorization") String token, @Path("userId") String username, Callback<String> callback );*/

    @PUT("/api/users/{userId}")
    void updateUser(@Body AssignUser assignUser, @Header("Authorization") String token, @Path("userId") String username, Callback<String> callback );
    @PUT("/api/users/{userId}")
    void updateUser(@Body AssignUser assignUser, @Path("userId") String username, Callback<String> callback );
    @PUT("/api/users/{userId}")
    void updateUser(@Header("Authorization") String token, @Body UpdateUserProfileRequest body, @Path("userId") String userId, Callback<Void> callback );


    /**
     * Get the details of the loggen in user
     * @param token - auth token
     * @param userId - userId of the logged in user
     * @param caregiverResponseCallback - returns the details of the user
     */
    @GET("/api/users/{userId}")
    void getMemberDetails(@Header("Authorization") String token,@Path("userId") String userId,Callback<CaregiverResponse> caregiverResponseCallback);
    @GET("/api/users/{userId}")
    void getMemberDetails(@Path("userId") String userId,Callback<CaregiverResponse> caregiverResponseCallback);
    @GET("/api/users/{userId}")
    void getUserDetails(@Header("Authorization") String token,@Path("userId") String userId,Callback<GetUserResponse> userResponseCallback);
    @GET("/api/users/{userId}")
    GetUserResponse getUserDetails(@Header("Authorization") String token,@Path("userId") String userId);

    /**
     * Create a care circle for an authenticated user
     * @param createCareCircle - the user id of the logged in user
     * @param token - auth token
     * @param callback - success reponse containing various fields inckuding name, createdAt and group id
     */
    @POST("/api/orbita/carecircles")
    void createCareCircle(@Body CreateCareCircle createCareCircle,@Header("Authorization") String token, Callback<CreateCareCircleResponse> callback);
    @POST("/api/orbita/carecircles")
    void createCareCircle(@Body CreateCareCircle createCareCircle, Callback<CreateCareCircleResponse> callback);


    /**
     * Assign member to an existing care circle
     * @param assignMemberModel - The request object containing the member details (patient or member)
     * @param token - auth token
     * @param username - the group or cc is
     * @param callback - success response
     */
    @PUT("/api/orbita/carecircles/{userId}/patient")
    void memberType(@Body AssignMemberModel assignMemberModel,@Header("Authorization") String token, @Path("userId") String username,Callback<String> callback);
    @PUT("/api/orbita/carecircles/{userId}/patient")
    void memberType(@Body AssignMemberModel assignMemberModel, @Path("userId") String username,Callback<String> callback);


    /*@POST("/api/groups/search")
    void getPatientId(@Header("Authorization") String token,@Body GetMember user, Callback<String> callback);*/

    /**
     * Get the patient id from the current group
     * @param token  - auth token
     * @param userId - the care circle id
     * @param callback - the patient id
     */
    @GET("/api/orbita/carecircles/{userId}/patient")
    void getPatientId(@Header("Authorization") String token,@Path("userId") String userId,Callback<CareCircleDetails> callback);
    @GET("/api/orbita/carecircles/{userId}/patient")
    void getPatientId(@Path("userId") String userId,Callback<CareCircleDetails> callback);

    @GET("/api/groups/{id}/member")
    void getPatient(@Header("Authorization") String token ,@Path("id") String id, Callback<CareCircleDetails> callback);
    @GET("/api/groups/{id}/member")
    void getPatient(@Path("id") String id, Callback<CareCircleDetails> callback);
    @GET("/api/groups/{groupId}/member")
    void getGroupMembers(@Header("Authorization") String Token, @Path("groupId") String groupId, @Query("limit") int pageSize, @Query("page") int page, Callback<CareCircleDetails> callback);

    /**
     * Get the smart devices oAuth URL
     * @param token - auth token
     * @param id - th epatient id
     * @param deviceName - microsoft or fitbit
     * @param callback - the oAuth URL for the corresponding device
     */
    @GET("/api/orbita/device/{deviceName}/authenticate")
    void getDeviceUrl(@Header("Authorization") String token, @Query("patientId") String id, @Path("deviceName") String deviceName, Callback<DeviceAuthenticationModel> callback);
    @GET("/api/orbita/device/{deviceName}/authenticate")
    void getDeviceUrl( @Query("patientId") String id, @Path("deviceName") String deviceName, Callback<DeviceAuthenticationModel> callback);

    /**
     *
     * @param token -the authorization token
     * @param providerName -name of the device provider
     * @param action -action name to perform [authenticate, callback, disconnect]
     * @param patientid -patient user id to connect
     * @param patientId -patient user id to connect
     * @param deviceName -name of the device to connect
     * @param authenticationResponse -returns authentication url to call for oAuth login
     */
    @GET("/api/orbita/device/{provider}/{action}/{id}")
    void getDeviceUrl(@Header("Authorization") String token, @Path("provider") String providerName, @Path("action") String action, @Path("id") String patientid, @Query("patientId") String patientId, @Query("device") String deviceName, Callback<Map<String, String>> authenticationResponse);

    /**
     * Get the oAuth URL for Withings devices
     * @param token - auth token
     * @param id - patient id
     * @param deviceName - withings
     * @param device - withingsscale or withingsbpmonitor
     * @param callback - the oAuth URL for the above devices
     */
    @GET("/api/orbita/device/{deviceName}/authenticate")
    void getWithingsUrl(@Header("Authorization") String token ,@Query("patientId") String id,@Path("deviceName") String deviceName,@Query("device") String device,Callback<DeviceAuthenticationModel> callback);
    @GET("/api/orbita/device/{deviceName}/authenticate")
    void getWithingsUrl(@Query("patientId") String id,@Path("deviceName") String deviceName,@Query("device") String device,Callback<DeviceAuthenticationModel> callback);


    /**
     * Update the wizard status
     * @param token - auth token
     * @param wizardTrackingModel - the object that updates the status of the wizard setup
     * @param userId - the current logged in user id or caregiver id
     * @param callback - response that shows the state of the setup wizard
     */
    @PUT("/api/orbita/caregiver/{userId}/wizardtracking")
    void updateWizardTrack(@Header("Authorization") String token, @Body WizardTrackingModel wizardTrackingModel, @Path("userId") String userId, Callback<WizardTrackingResponse> callback);
    @PUT("/api/orbita/caregiver/{userId}/wizardtracking")
    void updateWizardTrack(@Body WizardTrackingModel wizardTrackingModel, @Path("userId") String userId, Callback<WizardTrackingResponse> callback);

    /**
     * get the wizard status
     * @param token - auth token
     * @param userId - the current logged in user id or caregiver id
     * @param callback - response that shows the state of the setup wizard
     */
    @GET("/api/orbita/caregiver/{userId}/wizardtracking")
    void getWizardStatus(@Header("Authorization") String token ,@Path("userId") String userId, Callback<WizardTrackingResponse> callback);
    @GET("/api/orbita/caregiver/{userId}/wizardtracking")
    void getWizardStatus(@Path("userId") String userId, Callback<WizardTrackingResponse> callback);

    /**
     * upload the weight of the patient
     * @param token - auth token
     * @param weight - the object that contains the weight of the patient along with the unit of measurement
     * @param callback - success response
     */
    @POST("/api/bodyweight")
    void uploadWeight(@Header("Authorization") String token ,@Body PatientWeight weight, Callback<String> callback);
    @POST("/api/bodyweight")
    void uploadWeight(@Body PatientWeight weight, Callback<String> callback);

    /**
     * upload the height of the patient
     * @param token - auth token
     * @param height - the object that contains the height of the patient along with the unit of measurement
     * @param callback - success response
     */
    @POST("/api/bodyheight")
    void uploadHeight(@Header("Authorization") String token ,@Body PatientWeight height, Callback<String> callback);
    @POST("/api/bodyheight")
    void uploadHeight(@Body PatientWeight height, Callback<String> callback);

    /**
     * get the list of activities for the current patient
     * @param token - auth token
     * @param carecircleId = the carecircle id or group id
     * @param patientId - the patient id in the carecircle
     * @param page - the page count
     * @param callback - a list of objects containing the setails of the activities of the patient
     */
    @GET("/api/orbita/carecircles/{carecircleId}/activities/patient/{patientId}")
    void getActivityStream(@Header("Authorization") String token,@Path("carecircleId") String carecircleId, @Path("patientId") String patientId,@Query("page") int page, Callback<ActivityResponse> callback );
    @GET("/api/orbita/carecircles/{carecircleId}/activities/patient/{patientId}")
    void getActivityStream(@Path("carecircleId") String carecircleId, @Path("patientId") String patientId,@Query("page") int page, Callback<ActivityResponse> callback );

    /**
     * Fetch the carecircle id
     * @param token - auth token
     * @param id - the id of the logged in user or caregiver id
     * @param callback - the carecircle id
     */
    @GET("/api/orbita/caregiver/{id}/carecircles")
    void getCarecircleid(@Header("Authorization") String token,@Path("id") String id,Callback<CareCircleIdResponse> callback);
    @GET("/api/orbita/caregiver/{id}/carecircles")
    void getCarecircleid(@Path("id") String id,Callback<CareCircleIdResponse> callback);

    /**
     * getting the lke status for a particular activity
     * @param token - aut token
     * @param activityId - the id of the activity
     * @param userId - the id of the logged in user or caregiver id
     * @param callback - a boolean that states whether the activity has been liked or not
     */
    @GET("/api/activity/{activityId}/likes/{userId}")
    void getLikesStatus(@Header("Authorization") String token, @Path("activityId") String activityId, @Path("userId") String userId, Callback<HasMore.GetLikeResponse> callback);
    @GET("/api/activity/{activityId}/likes/{userId}")
    void getLikesStatus(@Path("activityId") String activityId, @Path("userId") String userId, Callback<HasMore.GetLikeResponse> callback);


    /**
     * Update the like status for a particular activity
     * @param token - aut token
     * @param activityId - the id of the activity
     * @param userId - the id of the logged in user or caregiver id
     * @param callback - a the number of likes count
     */
    @PUT("/api/activity/{activityId}/likes/{userId}")
    void putLikesStatus(@Header("Authorization") String token, @Body User user, @Path("activityId") String activityId, @Path("userId") String userId, Callback<LikesCountResponse> callback);
    @PUT("/api/activity/{activityId}/likes/{userId}")
    void putLikesStatus(@Body User user, @Path("activityId") String activityId, @Path("userId") String userId, Callback<LikesCountResponse> callback);


    /**
     * get the number of comments for a particular activity
     * @param token - auth token
     * @param activityId - the selected activity id
     * @param sortParam - the order in which the comments have to be sorted
     * @param callback - a list of objects containing the comments for the particular activity
     */
    @GET("/api/activity/{activityId}/comments")
    void getComments(@Header("Authorization") String token,@Path("activityId") String activityId,@Query("sort") String sortParam, Callback<GetCommentsResponse> callback);
    @GET("/api/activity/{activityId}/comments")
    void getComments(@Path("activityId") String activityId,@Query("sort") String sortParam, Callback<GetCommentsResponse> callback);
    /**
     * Post a comment for a particular activity
     * @param token - auth token
     * @param activityId - the selected activity id
     * @param postCommentModel - the object the contains the comment text
     * @param callback - success response that displays the comment text and the time of creation
     */
    @POST("/api/activity/{activityId}/comments")
    void postComments(@Header("Authorization") String token,@Path("activityId") String activityId, @Body PostCommentModel postCommentModel,Callback<PostCommentResponse> callback);
    @POST("/api/activity/{activityId}/comments")
    void postComments(@Path("activityId") String activityId, @Body PostCommentModel postCommentModel,Callback<PostCommentResponse> callback);

    /**
     * get the callback URL for microsoft band
     * @param token - auth token
     * @param code - query param returned by microsoft
     * @param state - query param returned by microsoft
     * @param callbackCallback - a status code
     */
    @GET("/api/orbita/device/microsoftband/callback")
    void getMicrosoftCallback(@Header("Authorization") String token,@Query("code") String code, @Query("state") String state,Callback<DeviceCallback> callbackCallback);
    @GET("/api/orbita/device/microsoftband/callback")
    void getMicrosoftCallback(@Query("code") String code, @Query("state") String state,Callback<DeviceCallback> callbackCallback);
    @GET("/api/orbita/device/microsoftband/callback/{id}")
    void getMicrosoftCallback(@Header("Authorization") String token, @Path("id") String patientId, @Query("code") String code, @Query("state") String state,Callback<DeviceCallback> callbackCallback);

    /**
     * get the callback url for Fitbit
     * @param token - the auth token
     * @param state - query param returned by fitbit
     * @param code - query param returned by fitbit
     * @param callback - a status code
     */
    @GET("/api/orbita/device/fitbit/callback")
    void getFitbitCallback(@Header("Authorization") String token,@Query("state") String state, @Query("code") String code,Callback<DeviceCallback> callback);
    @GET("/api/orbita/device/fitbit/callback")
    void getFitbitCallback(@Query("state") String state, @Query("code") String code,Callback<DeviceCallback> callback);
    @GET("/api/orbita/device/fitbit/callback/{id}")
    void getFitbitCallback(@Header("Authorization") String token, @Path("id") String patientId, @Query("state") String state, @Query("code") String code,Callback<DeviceCallback> callback);


    /**
     * get the callback url for withings
     * @param token - the auth token
     * @param authkey - query param returned by withings
     * @param device - query param returned by withings
     * @param userid - query param returned by withings
     * @param oauthtoken - query param returned by withings
     * @param oauthverifier - query param returned by withings
     * @param callback - a status code
     */
    @GET("/api/orbita/device/withings/callback")
    void getWithingsCallback(@Header("Authorization") String token,@Query("authkey") String authkey, @Query("device") String device, @Query("userid") String userid, @Query("oauthtoken") String oauthtoken, @Query("oauthverifier") String oauthverifier, Callback<DeviceCallback> callback);
    @GET("/api/orbita/device/withings/callback")
    void getWithingsCallback(@Query("authkey") String authkey, @Query("device") String device, @Query("userid") String userid, @Query("oauthtoken") String oauthtoken, @Query("oauthverifier") String oauthverifier, Callback<DeviceCallback> callback);
    @GET("/api/orbita/device/withings/callback/{id}")
    void getWithingsCallback(@Header("Authorization") String token, @Path("id") String patientId, @Query("authkey") String authkey, @Query("device") String device, @Query("userid") String userid, @Query("oauthtoken") String oauthtoken, @Query("oauthverifier") String oauthverifier, Callback<DeviceCallback> callback);

    /**
     * get the callback url for iHealth
     * @param token - the auth token
     * @param patientId - patient user id
     * @param code - query param returned by iHealth
     * @param callback - a status code
     */
    @GET("/api/orbita/device/ihealth/callback/{id}")
    void getIhealthCallback(@Header("Authorization") String token, @Path("id") String patientId, @Query("code") String code,Callback<DeviceCallback> callback);


    /**
     * disconnect the already connected smart devices
     * @param token - auth token
     * @param provider - microsoftband, fitbit, withings
     * @param deviceName - microsoft, fitbit, withingsscale, withingsbpmonitor
     * @param callback - success response
     */
    @PATCH("/api/orbita/device/{deviceName}/disconnectSettings")
    void disconnectDevices(@Header("Authorization") String token,@Body ProviderName provider,@Path("deviceName") String deviceName,Callback<String> callback);
    @PATCH("/api/orbita/device/{deviceName}/disconnectSettings")
    void disconnectDevices(@Body ProviderName provider,@Path("deviceName") String deviceName,Callback<String> callback);
    @PATCH("/api/orbita/device/{provider}/{action}")
    void disconnectDevices(@Header("Authorization") String token, @Path("action") String action, @Body Map<String, Object> payload,@Path("provider") String providerName, Callback<String> callback);


    /**
     * Create an activity for the care stream
     * @param token  -auth token
     * @param createActivity - the request object containing the description, type and other attributes like images and files
     * @param createActivityResponseCallback - the success response displaying the activity id and time of creation
     */
    @POST("/api/activities")
    void createActivity(@Header("Authorization") String token,@Body CreateActivity createActivity,Callback<CreateActivityResponse> createActivityResponseCallback);
    @POST("/api/activities")
    void createActivity(@Body CreateActivity createActivity,Callback<CreateActivityResponse> createActivityResponseCallback);


    /**
     * To get the status of smart devices that are connected or disconnected
     * @param token - auth token
     * @param userId - the id of the logged in user or caregiver id
     * @param callback - the response containing the ststus of connected devices
     */
    @GET("/api/users/{userId}")
    void getDeviceStatus(@Header("Authorization") String token, @Path("userId") String userId, Callback<DeviceStatusResponse> callback);
    @GET("/api/users/{userId}")
    void getDeviceStatus(@Path("userId") String userId, Callback<DeviceStatusResponse> callback);
    @PATCH("/api/schema/deviceinfo/data")
    void getAvailbleDevices(@Header("Authorization") String token, @Query("limit") int limit, @Query("page") int page, @Body Map<String, String> payload, Callback<DeviceInfoResponse> deviceInfoResponseCallback);



    /**
     * to change the password of the logged in user
     * @param changePassword - the object containing the current password and new password
     * @param token - auth token
     * @param userId - the logged in user id
     * @param callback - the success response
     */
    @PUT("/api/users/password/change/{userId}")
    void patientChangePassword(@Body PatientChangePassword changePassword, @Header("Authorization") String token, @Path("userId") String userId, Callback<PatientPasswordChange> callback );
    @PUT("/api/users/password/change/{userId}")
    void patientChangePassword(@Body PatientChangePassword changePassword,@Path("userId") String userId, Callback<PatientPasswordChange> callback );


    /**
     * to add medicine medicine to the medicine cabinet
     * @param addMedicine - the object containing the required informaation about the new medicine
     * @param token - the auth token
     * @param patientid - the id of the patient in the care circle
     * @param callback - he success response
     */
    @POST("/api/orbita/patient/{patientid}/medicine")
    void addMedicine(@Body AddMedicine addMedicine, @Header("Authorization") String token,@Path("patientid") String patientid,Callback<AddMedicineResponse> callback);
    @POST("/api/orbita/patient/{patientid}/medicine")
    void addMedicine(@Body AddMedicine addMedicine,@Path("patientid") String patientid,Callback<AddMedicineResponse> callback);

    /**
     * to get the details of particular activity by passing the activity id
     * @param token - the auth token
     * @param activityId - the id of the activity whose details are required
     * @param callback - the response containing the details of the particular activity
     */
    @GET("/api/activities/{activityId}")
    void getActivity(@Header("Authorization") String token,@Path("activityId") String activityId,Callback<app.orbitahealth.sdk.responsemodel.activityresponse.Activity> callback);
    @GET("/api/activities/{activityId}")
    void getActivity(@Path("activityId") String activityId,Callback<app.orbitahealth.sdk.responsemodel.activityresponse.Activity> callback);

    /**
     * to update the details of the patient in the particular care circle
     * @param token - the auth token
     * @param updatePatient - the object containing the updated details of the patient
     * @param carecircleId - the care circle id in which the patient belongs to
     * @param patientId - the id of the patient
     * @param callback - success response
     */
    @PUT("/api/orbita/carecircles/{carecircleId}/patient/{patientId}")
    void updatePatient(@Header("Authorization") String token,@Body AssignUser updatePatient,@Path("carecircleId") String carecircleId,@Path("patientId") String patientId, Callback<CaregiverResponse> callback);
    @PUT("/api/orbita/carecircles/{carecircleId}/patient/{patientId}")
    void updatePatient(@Body AssignUser updatePatient,@Path("carecircleId") String carecircleId,@Path("patientId") String patientId, Callback<CaregiverResponse> callback);


    /**
     * to update the selectyes medicine
     * @param addMedicine - the objects containing the details of the updated medicine
     * @param token - the auth token
     * @param patientid - the id of the patient
     * @param medicineid - the id of the selected medicine
     * @param callback - the success response
     */
    @PUT("/api/orbita/patient/{patientid}/medicine/{id}")
    void updateMedicine(@Body AddMedicine addMedicine,@Header("Authorization") String token,@Path("patientid") String patientid,@Path("id") String medicineid,Callback<AddMedicineResponse> callback);
    @PUT("/api/orbita/patient/{patientid}/medicine/{id}")
    void updateMedicine(@Body AddMedicine addMedicine,@Path("patientid") String patientid,@Path("id") String medicineid,Callback<AddMedicineResponse> callback);

    /**
     * to delate the selectes medicine
     * @param token - the auth token
     * @param patientid - the id of the patient
     * @param medicineid - the id of the selected medicine
     * @param callback - the success response
     */

    @DELETE("/api/orbita/patient/{patientid}/medicine/{id}")
    void deleteMedicine(@Header("Authorization") String token,@Path("patientid") String patientid,@Path("id") String medicineid,Callback<String> callback);
    @DELETE("/api/orbita/patient/{patientid}/medicine/{id}")
    void deleteMedicine(@Path("patientid") String patientid,@Path("id") String medicineid,Callback<String> callback);

    /**
     * to get the details of the pillbox of the current patient
     * @param token - the auth token
     * @param patientid - the patient id
     * @param callback - the response containing the pillbox slots
     */
    @GET("/api/orbita/patient/{patientid}/pillbox")
    void getPillBoxDetails(@Header("Authorization") String token,@Path("patientid") String patientid,Callback<PillBoxDetails> callback);
    @GET("/api/orbita/patient/{patientid}/pillbox")
    void getPillBoxDetails(@Path("patientid") String patientid,Callback<PillBoxDetails> callback);

    /**
     * to get the deatils of all the edicine in the particular pillbox
     * @param token - the auth token
     * @param patientid - the patient id
     * @param page - the page number which will be passed in order to get the particular data
     * @param callback - the details of all the medicines in the particular pillbox
     */
    @GET("/api/orbita/patient/{patientid}/medicine")
    void getMedicine(@Header("Authorization") String token,@Path("patientid") String patientid,@Query("page") int page,Callback<GetMedicineResponse> callback);
    @GET("/api/orbita/patient/{patientid}/medicine")
    void getMedicine(@Path("patientid") String patientid,@Query("page") int page,Callback<GetMedicineResponse> callback);

    /**
     * to fetch all the weight values of the patient
     * @param token - the auth token
     * @param patientid - the id of the patient
     * @param callback - the array containing all the values of weight of the patient
     */
    @GET("/api/bodyweight/user/{patientId}")
    void getPatientWeight(@Header("Authorization") String token,@Path("patientId") String patientid,Callback<PatientWeightResponse> callback);
    @GET("/api/bodyweight/user/{patientId}")
    void getPatientWeight(@Path("patientId") String patientid,Callback<PatientWeightResponse> callback);

    /**
     * to fetch all the height values of the patient
     * @param token - the auth token
     * @param patientid - the id of the patient
     * @param callback - the array containing all the values of height of the patient
     */
    @GET("/api/bodyheight/user/{patientId}")
    void getPatientHeight(@Header("Authorization") String token,@Path("patientId") String patientid,Callback<PatientHeightResponse> callback);
    @GET("/api/bodyheight/user/{patientId}")
    void getPatientHeight(@Path("patientId") String patientid,Callback<PatientHeightResponse> callback);


    /**
     * add pills that are present in the medicine cabinet into the pillbox
     * @param addPills - the object that contains the details of all the pills that are to be added into the pillbox
     * @param token - the auth token
     * @param patientid - the id of the patient
     * @param pillid - the id of the particular pillbox
     * @param callback - the success response
     */
    @PATCH("/api/orbita/patient/{patientid}/pillbox/{id}")
    void addPills(@Body AddPills addPills,@Header("Authorization") String token,@Path("patientid") String patientid,@Path("id") String pillid,Callback<String> callback);
    @PATCH("/api/orbita/patient/{patientid}/pillbox/{id}")
    void addPills(@Body AddPills addPills,@Path("patientid") String patientid,@Path("id") String pillid,Callback<String> callback);


    /**
     * to remove the selected pill from the pillbox
     * @param removePills - the object that containd the details of the pill that is to be removed from the pillbox
     * @param token - the auth token
     * @param patientid - the id of the patient
     * @param pillid - the pillbox id
     * @param callback - the success response
     */
    @PATCH("/api/orbita/patient/{patientid}/pillbox/{id}")
    void removePills(@Body RemovePills removePills,@Header("Authorization") String token,@Path("patientid") String patientid,@Path("id") String pillid,Callback<String> callback);
    @PATCH("/api/orbita/patient/{patientid}/pillbox/{id}")
    void removePills(@Body RemovePills removePills,@Path("patientid") String patientid,@Path("id") String pillid,Callback<String> callback);


    /**
     * to get the persona details of the logged in user (Caregiver ,Patient or Member)
     * @param token - the auth token
     * @param callback - the default role of the user that has logged in
     */
    @GET("/api/orbita/persona")
    void getPersona(@Header("Authorization") String token,Callback<GetPersona> callback);
    @GET("/api/orbita/persona")
    void getPersona(Callback<GetPersona> callback);

    /**
     * to asynchronously get the patient list of the logged in user (Caregiver ,Patient or advocate)
     * @param request
     * @param token
     */
    @PATCH("/api/orbita/persona")
    void getPersona(@Body Map<String, Object> request, @Header("Authorization") String token, Callback<MemberSearchResponse> callback);

    /**
     * to synchronously get the patient list of the logged in user (Caregiver ,Patient or advocate)
     * @param request
     * @param token
     * @return
     */
    @PATCH("/api/orbita/persona")
    MemberSearchResponse getPersona(@Body Map<String, Object> request, @Header("Authorization") String token);

    /**
     * to fethch the list of members in the current care circle
     * @param token - the auth token
     * @param carecircleId - the id of the care circle for which the members' data need to be fetched
     * @param callback - the list containing the members of the care circle
     */
    @GET("/api/orbita/carecircles/{carecircleId}/member")
    void getMemberList(@Header("Authorization") String token, @Path("carecircleId") String carecircleId,Callback<GetMemberList> callback);
    @GET("/api/orbita/carecircles/{carecircleId}/member")
    void getMemberList(@Path("carecircleId") String carecircleId,Callback<GetMemberList> callback);

    /**
     * to delete members from the care circle
     * @param deleteMember - the object that contains the details of the members that needed to be removed
     * @param token - the auth token
     * @param carecircleId  - the care circle id from which the members are to be removed
     * @param callback
     */
    @PATCH("/api/orbita/carecircles/{carecircleId}/member")
    void deleteMember(@Body DeleteMember deleteMember,@Header("Authorization") String token, @Path("carecircleId") String carecircleId,Callback<String> callback);
    @PATCH("/api/orbita/carecircles/{carecircleId}/member")
    void deleteMember(@Body DeleteMember deleteMember,@Path("carecircleId") String carecircleId,Callback<String> callback);


    /**
     *  to search for a particular medicine from the third party API
     * @param token - the auth token
     * @param searchMedicine - the object containing the text entered by the user
     * @param callback - the suggestion of medicines
     */
    @POST("/api/orbita/drug/search")
    void searchMedicine(@Header("Authorization") String token,@Body SearchMedicine searchMedicine,Callback<SearchMedicineResponse> callback);
    @POST("/api/orbita/drug/search")
    void searchMedicine(@Body SearchMedicine searchMedicine,Callback<SearchMedicineResponse> callback);

    /**
     * to assign members to the care circle
     * @param assignMemberModel - the details of the members that are to be addes
     * @param token - the auth token
     * @param carecircleId - the id of the particular care circle
     * @param callback - the success response
     */
    @Headers("Content-Type : application/json")
    @PUT("/api/orbita/carecircles/{carecircleId}/member")
    void assignMember(@Body AddMember assignMemberModel,@Header("Authorization") String token, @Path("carecircleId") String carecircleId,Callback<String> callback);
    @PUT("/api/orbita/carecircles/{carecircleId}/member")
    void assignMember(@Body AddMember assignMemberModel, @Path("carecircleId") String carecircleId,Callback<String> callback);


    /**
     * to obtain the details of the weight of the patient in orfer to plot the graph
     * @param token - the auth token
     * @param lineChart - the object that contains the start date and end date from which the data needs to be fetched
     * @param patientid - the id  of the patinet
     * @param callback - the list of weight data from the prescribed start date and end date
     */
    @PATCH("/api/bodyweight/user/{patientid}/journal")
    void getBodyWeight(@Header("Authorization") String token, @Body LineChart lineChart, @Path("patientid") String patientid, Callback<ResponseChartData> callback);
    @PATCH("/api/bodyweight/user/{patientid}/journal")
    void getBodyWeight(@Body LineChart lineChart,@Header("Authorization") String token,  @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);
    @PATCH("/api/bodyweight/user/{patientid}/journal")
    void getBodyWeight(@Body LineChart lineChart, @Path("patientid") String patientid, Callback<ResponseChartData> callback);



    /**
     * to obtain the details of the height of the patient in orfer to plot the graph
     * @param token - the auth token
     * @param lineChart - the object that contains the start date and end date from which the data needs to be fetched
     * @param patientid - the id  of the patinet
     * @param callback - the list of height data from the prescribed start date and end date
     */
    @PATCH("/api/bodyheight/user/{patientid}/journal")
    void getBodyHeight(@Header("Authorization") String token, @Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);
    @PATCH("/api/bodyheight/user/{patientid}/journal")
    void getBodyHeight(@Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);


    /**
     * to obtain the details of the heart rate of the patient in orfer to plot the graph
     * @param token - the auth token
     * @param lineChart - the object that contains the start date and end date from which the data needs to be fetched
     * @param patientid - the id  of the patinet
     * @param callback - the list of heart rate data from the prescribed start date and end date
     */
    @PATCH("/api/heartrate/user/{patientid}/journal")
    void getHeartRate(@Header("Authorization") String token, @Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.heartrateresponse.ResponseChartData> callback);
    @PATCH("/api/heartrate/user/{patientid}/journal")
    void getHeartRate(@Body LineChart lineChart,@Header("Authorization") String token, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);
    @PATCH("/api/heartrate/user/{patientid}/journal")
    void getHeartRate(@Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.heartrateresponse.ResponseChartData> callback);


    /**
     * to obtain the details of the blood pressure of the patient in orfer to plot the graph
     * @param token - the auth token
     * @param lineChart - the object that contains the start date and end date from which the data needs to be fetched
     * @param patientid - the id  of the patinet
     * @param callback - the list of blood pressure data from the prescribed start date and end date
     */
    @PATCH("/api/bloodpressure/user/{patientid}/journal")
    void getBloodPressure(@Header("Authorization") String token, @Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bloodpressureresponse.ResponseChartData> callback);
    @PATCH("/api/bloodpressure/user/{patientid}/journal")
    void getBloodPressure(@Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bloodpressureresponse.ResponseChartData> callback);

    /**
     * to fetch the details of the list of health activities and display it in the dashboard
     * @param token - the auth token
     * @param lineChart -
     * @param id - the patient id
     * @param callback - the list of health activities that are recorded for the current patient
     */
    @PATCH("/api/orbita/patient/{patientid}/dashboard")
    void getDashboard(@Header("Authorization") String token,@Body LineChart lineChart,@Path("patientid") String id, Callback<GetDashboard> callback);
    @PATCH("/api/orbita/patient/{patientid}/dashboard")
    void getDashboard(@Body LineChart lineChart,@Path("patientid") String id, Callback<LinkedHashMap> callback);
    @PATCH("/api/orbita/patient/{patientid}/dashboard")
    void getDashBoard(@Header("Authorization") String token,@Body Map<String, String> payload,@Path("patientid") String id, Callback<GetDashboard> callback);


    /**
     * to resend invite an invite that was already sent to the user
     * @param token - the auth token
     * @param carecircleId - the care circle id in which the member belongs to
     * @param userid - the logged in user id
     * @param callback - the invite statusof the member
     */
    @GET("/api/orbita/carecircles/{carecircleId}/resend/{userid}")
    void reSendInvite(@Header("Authorization") String token, @Path("carecircleId") String carecircleId,@Path("userid")String userid,Callback<CareCircleInviteDetails> callback);
    @GET("/api/orbita/carecircles/{carecircleId}/resend/{userid}")
    void reSendInvite(@Path("carecircleId") String carecircleId,@Path("userid")String userid,Callback<CareCircleInviteDetails> callback);


    /**
     * to cancel the invite already sent to the member
     * @param token - the auth token
     * @param lineChart - the object body
     * @param carecircleId - the care cicle id to which the member belongs to
     * @param userid - the id of the logged in user
     * @param callback - the success response
     */
    @PATCH("/api/orbita/carecircles/{carecircleId}/cancel/{userid}")
    void cancelInvite(@Header("Authorization") String token,@Body LineChart lineChart,@Path("carecircleId") String carecircleId,@Path("userid")String userid,Callback<String> callback);
    @PATCH("/api/orbita/carecircles/{carecircleId}/cancel/{userid}")
    void cancelInvite(@Body LineChart lineChart,@Path("carecircleId") String carecircleId,@Path("userid")String userid,Callback<String> callback);


    /**
     * to get the status of the user (whethe he has accepted the invite or not)
     * @param token  -the auth token
     * @param userid - the id of the loggen in user
     * @param callback - the response containing the details of the user along with the invite status
     */
    @GET("/api/users/{userid}")
    void getUserState(@Header("Authorization") String token,@Path("userid")String userid,Callback<DeviceStatusResponse> callback);
    @GET("/api/users/{userid}")
    void getUserState(@Path("userid")String userid,Callback<DeviceStatusResponse> callback);

    @PATCH("/api/bodytemperature/user/{patientid}/journal")
    void getBodytemperature(@Header("Authorization") String token, @Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);
    @PATCH("/api/bodytemperature/user/{patientid}/journal")
    void getBodytemperature(@Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);

    @PATCH("/api/bloodglucose/user/{patientid}/journal")
    void getBloodGlucose(@Header("Authorization") String token, @Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);
    @PATCH("/api/bloodglucose/user/{patientid}/journal")
    void getBloodGlucose(@Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);

    @PATCH("/api/ambienttemperature/user/{patientid}/journal")
    void getAmbientTemperature(@Header("Authorization") String token, @Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);
    @PATCH("/api/ambienttemperature/user/{patientid}/journal")
    void getAmbientTemperature(@Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);

    @PATCH("/api/caloriesburned/user/{patientid}/journal")
    void getCaloriesBurned(@Header("Authorization") String token, @Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);
    @PATCH("/api/caloriesburned/user/{patientid}/journal")
    void getCaloriesBurned(@Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);

    @PATCH("/api/sleepduration/user/{patientid}/journal")
    void getSleepDuration(@Header("Authorization") String token, @Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);
    @PATCH("/api/sleepduration/user/{patientid}/journal")
    void getSleepDuration(@Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);

    @PATCH("/api/rrinterval/user/{patientid}/journal")
    void getRrInterval(@Header("Authorization") String token, @Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);
    @PATCH("/api/rrinterval/user/{patientid}/journal")
    void getRrInterval(@Body LineChart lineChart, @Path("patientid") String patientid, Callback<app.orbitahealth.sdk.responsemodel.bodyheightresponse.ResponseChartData> callback);

    @GET("/api/orbita/orbitabutton/patient/{patientId}")
    void getButtonsConnected(@Header("Authorization") String token,@Path("patientId") String patientId, Callback<OrbitaButtonsConnected> callback);
    @GET("/api/orbita/orbitabutton/patient/{patientId}")
    void getButtonsConnected(@Path("patientId") String patientId, Callback<OrbitaButtonsConnected> callback);

    @GET("/api/orbita/orbitabutton/{buttonId}/patient/{patientId}")
    void getButtonEvents(@Header("Authorization") String token,@Path("patientId") String patientId,@Path("buttonId") String buttonId,Callback<OrbitaButtonEvents> callback);
    @GET("/api/orbita/orbitabutton/{buttonId}/patient/{patientId}")
    void getButtonEvents(@Path("patientId") String patientId,@Path("buttonId") String buttonId,Callback<OrbitaButtonEvents> callback);

    @PUT("/api/orbita/orbitabutton/{buttonId}/patient/{patientId}")
    void putButtonEvents(@Header("Authorization") String token,@Body OrbitaEvents orbitaEvents,@Path("patientId") String patientId,@Path("buttonId") String buttonId,Callback<LinkedHashMap> callback);
    @PUT("/api/orbita/orbitabutton/{buttonId}/patient/{patientId}")
    void putButtonEvents(@Body OrbitaEvents orbitaEvents,@Path("patientId") String patientId,@Path("buttonId") String buttonId,Callback<LinkedHashMap> callback);

    /**
     * to care notes for particular patient user
     * @param token -the authorization token
     * @param notesRequest -payload with patient id
     * @param limit -count of the result
     * @param page -page to load
     * @param response -list of available notes or empty array if no note is present
     */
    @PATCH("/api/schema/carenotes/data")
    void getCarenotes(@Header("Authorization") String token, @Body CareNotesListRequest notesRequest, @Query("limit") int limit, @Query("page") int page, Callback<CarenotesListResponse> response);

    /**
     * to add a care note for a patient user
     * @param token -the authorization token
     * @param payload -map of title, content with patient id
     * @param response -note with a unique id
     */
    @POST("/api/schema/carenotes/data")
    void addCarenotes(@Header("Authorization") String token, @Body Map<String, String> payload, Callback<CarenotesAddResponse> response);

    /**
     * to update a existing care note
     * @param token -the authorization token
     * @param noteId -the existing note id
     * @param payload -map of title, content with patient id
     * @param responseCallback -note with a unique id
     */
    @PUT("/api/schema/carenotes/data/{noteId}")
    void updateCarenotes(@Header("Authorization") String token, @Path("noteId") String noteId, @Body Map<String, String> payload, Callback<CarenotesAddResponse> responseCallback);

    /**
     * to delete a existing care note
     * @param token -the authorization token
     * @param noteId -the existing note id
     * @param response -empty response
     */
    @DELETE("/api/schema/carenotes/data/{noteId}")
    void deleteCarenotes(@Header("Authorization") String token, @Path("noteId") String noteId, Callback<String> response);

    /**
     *  to get the meta data of the particular health data type
     * @param token -the authorization token
     * @param dataType -the health data type
     * @param response -meta data of the particular health data
     */
    @GET("/api/metadata/details/{dataType}")
    void getHealthDataValueMeta(@Header("Authorization") String token, @Path("dataType") String dataType, Callback<MetaResponse> response);

    /**
     * to get Data for particular health data type
     * @param token -the authorization token
     * @param dataType -the health data type
     * @param userId -id of the user to get data
     * @param limit -count of the values to return
     * @param page -no. of page to return
     * @param object -Json object carrying a sortTime attribute
     * @param healthDataResponseCallback -result for particular with the specified count
     */
    @GET("/api/{healthDataType}/user/{userId}")
    void getHealthData(@Header("Authorization") String token, @Path("healthDataType") String dataType, @Path("userId") String userId, @Query("limit") int limit, @Query("page") int page, @Query("sort") String object, Callback<HealthDataResponse> healthDataResponseCallback);

    /**
     *  to get group for particular patient id
     * @param token -the authorization token
     * @param request -query object with patient id
     * @param searchGroupResponseCallback -groups for given patient id
     */
    @POST("/api/groups/search")
    void getPatientGroup(@Header("Authorization") String token, @Body SearchGroupRequest request, Callback<SearchGroupResponse> searchGroupResponseCallback);

    /**
     *  to get members of particular group
     * @param token -the authorization token
     * @param groupId -group id to search
     * @param userRole -role to search
     * @param membersResponseCallback -member of the given group, for given role
     */
    @GET("/api/orbita/carecircles/{groupId}/{role}")
    void getGroupMembers(@Header("Authorization") String token, @Path("groupId") String groupId, @Path("role") String userRole, Callback<CareCircleDetails> membersResponseCallback);

    /**
     *  to update member role of particular group
     * @param token -the authorization token
     * @param groupId -group id to change
     * @param userRole -role to change
     * @param body -object of role and user details
     * @param response -empty response for successful request
     */
    @POST("/api/orbita/carecircles/{groupId}/{role}")
    void updateGroupMemberRole(@Header("Authorization") String token, @Path("groupId") String groupId, @Path("role") String userRole, @Body UpdateRoleRequest body, Callback<Void> response);

    /**
     *  to get available persona types
     * @param token -the authorization token
     * @param personaTypesResponseCallback -list of available persona type information
     */
    @GET("/api/personas/types/")
    void getAvailablePersonas(@Header("Authorization") String token, Callback<PersonaTypesResponse> personaTypesResponseCallback);

    /**
     *  to send Invitation request to add a new user
     * @param token -the authorization token
     * @param payload -object of email and role details
     * @param response -empty response for successful request
     */
    @POST("/api/users/invite")
    void sendInviteRequest(@Header("Authorization") String token, @Body SendInvitationRequest payload, Callback<Void> response);

    /**
     *  to add advocate member role to particular group
     * @param token -the authorization token
     * @param groupId -group id to add
     * @param userRole -role to add
     * @param body -object of role and new user details
     * @param response -empty response for successful request
     */
    @PUT("/api/orbita/carecircles/{groupId}/{role}")
    void addAdvocateMemberRole(@Header("Authorization") String token, @Path("groupId") String groupId, @Path("role") String userRole, @Body AddGroupMemberRequest body, Callback<Void> response);

    /**
     *  to delete a advocate member role
     * @param token
     * @param groupId
     * @param body
     * @param response
     */
    @PATCH("/api/groups/{groupId}/member")
    void deleteAdvocateMemberRole(@Header("Authorization") String token, @Path("groupId") String groupId, @Body AddGroupMemberRequest body, Callback<Void> response);

    /**
     *  to get threads of particular user
     * @param token -the authorization token
     * @param limit -count of result
     * @param page -page to return
     * @param conversationListResponseCallback -list of threads
     */
    @GET("/api/conversations/")
    void getConversationThreads(@Header("Authorization") String token, @Query("limit") int limit, @Query("page") int page, Callback<ConversationListResponse> conversationListResponseCallback);

    /**
     *  to get conversation of the particular thread
     * @param token -the authorization token
     * @param conversationId -conversation id
     * @param limit -count of result
     * @param page -page to return
     * @param viewState -posts to return from [inbox, archive, hidden]
     * @param getPostsResponseCallback -list of posts
     */
    @GET("/api/conversations/{conversationId}/posts")
    void getPosts(@Header("Authorization") String token, @Path("conversationId") String conversationId, @Query("limit") int limit, @Query("page") int page, @Query("viewState") String viewState, Callback<GetPostsResponse> getPostsResponseCallback);

    /**
     *  to get tasks to the particular user id
     * @param token -the authorization token
     * @param userId -existing user id
     * @param fromDate -start date to filter
     * @param toDate -end date to filter
     * @return list of tasks
     */
    @GET("/api/tasks/assigned/{userId}")
    List<Task> getAssignedTasks(@Header("Authorization") String token, @Path("userId") String userId, @Query("fromDate") String fromDate, @Query("toDate") String toDate);

    /**
     *  to get description for "Perform Exercise" task
     * @param token -the authentication token
     * @param exerciseId -exercise id
     * @param payload -journey id
     * @param exerciseDescriptionResponseCallback -exercise description with protocol information
     */
    @PATCH("/api/schema/exercise/journeydata/{exerciseData}")
    void getExerciseDescription(@Header("Authorization") String token, @Path("exerciseData") String exerciseId, @Body Map<String, String> payload, Callback<ExerciseTaskDescriptionResponse> exerciseDescriptionResponseCallback);

    /**
     *  to update the existing as completed
     * @param token -the authorization token
     * @param taskId -task id
     * @param payload -status update
     * @param taskCallback -empty response
     */
    @PUT("/api/tasks/{taskId}")
    void completeTask(@Header("Authorization") String token, @Path("taskId") String taskId, @Body Object payload, Callback<Task> taskCallback);

    /**
     *  to send Health data for particular Health data
     * @param token -the authorization token
     * @param dataType -the health data type
     * @param payload -object with value and recorded time and more
     * @param dataAddedCallback
     */
    @POST("/api/{healthDataType}")
    void sendHealthData(@Header("Authorization") String token, @Path("healthDataType") String dataType, @Body AddHealthDataRequest payload, Callback<PageDatum> dataAddedCallback);

    /**
     *  to get health data for particular data type
     * @param token -the authorization token
     * @param dataType -the health data type
     * @param dataId -the data id
     * @param response -sometimes array and sometimes object, get response from onSuccess handle by parsing using JSONParser
     */
    @GET("/api/{healthDataType}/{dataId}")
    void getHealthData(@Header("Authorization") String token, @Path("healthDataType") String dataType, @Path("dataId") String dataId, Callback<JsonElement> response);

    /**
     *  to get survey schema for particular survey task
     * @param token -the authorization token
     * @param surveyId -the survey id
     * @param surveyTaskSchemaResponseCallback -survey schema
     */
    @GET("/api/schema/survey/data/{surveyId}")
    void getSurveyTaskSchema(@Header("Authorization") String token, @Path("surveyId") String surveyId, Callback<SurveyTaskSchemaResponse> surveyTaskSchemaResponseCallback);

    /**
     *  to send survey result for particular survey task
     * @param token -the authorization header
     * @param payLoad -the object of survey result, taken time and more
     * @param surveyTaskResultResponseCallback-survey data response
     */
    @POST("/api/schema/surveydata/data")
    void sendSurveyResult(@Header("Authorization") String token, @Body AddSurveyDataRequest payLoad, Callback<SurveyTaskResultResponse> surveyTaskResultResponseCallback);

    /**
     *  to get survey result for particular survey task
     * @param token -the authorization token
     * @param surveyId -the survey id
     * @param surveyTaskResultResponseCallback-survey result
     */
    @GET("/api/schema/surveydata/data/{surveyId}")
    void getSurveyTaskResult(@Header("Authorization") String token, @Path("surveyId") String surveyId, Callback<SurveyTaskResultResponse> surveyTaskResultResponseCallback);

    /**
     *  to get survey result for particular user
     * @param token -the authorization token
     * @param limit -count of result
     * @param page -page to return
     * @param getSurveyResultsResponseCallback-survey results
     */
    @PATCH("/api/schema/surveydata/data/")
    void getSurveyResults(@Header("Authorization") String token, @Body Map<String, Object> payload, @Query("limit") int limit, @Query("page") int page, Callback<GetSurveyResultsResponse> getSurveyResultsResponseCallback);

    /**
     *  to get survey result for particular user
     * @param token -the authorization token
     * @param limit -count of result
     * @param page -page to return
     * @return survey results
     */
    @PATCH("/api/schema/surveydata/data/")
    GetSurveyResultsResponse getSurveyResults(@Header("Authorization") String token, @Body Map<String, Object> payload, @Query("limit") int limit, @Query("page") int page);

    /**
     *  to get description for "Take Medication" task
     * @param token -the authentication token
     * @param medicationId -medication id
     * @param payload -journey id
     * @param medicationTaskDescriptionResponseCallback -medication description with intake information
     */
    @PATCH("/api/schema/medication/journeydata/{medicationData}")
    void getMedicationDescription(@Header("Authorization") String token, @Path("medicationData") String medicationId, @Body Map<String, String> payload, Callback<MedicationTaskDescriptionResponse> medicationTaskDescriptionResponseCallback);

    /**
     *  to get insights for particular patient
     * @param token -the authorization token
     * @param patientId -the patient id
     * @param limit -count of the values to return
     * @param page -no. of page to return
     * @param object -Json object carrying a sortTime attribute
     * @param getInsightsResponseCallback -list of insights
     */
    @GET("/api/notifications/users/{patientId}")
    void getPatientInsights(@Header("Authorization") String token, @Path("patientId") String patientId, @Query("limit") int limit, @Query("page") int page, @Query("sort") String object, Callback<GetInsightsResponse> getInsightsResponseCallback);

    /**
     *  to get insights of a particular survey, for a particular user
     * @param token -the authorization token
     * @param surveyId -the survey id
     * @param userId -the user id
     * @return insight with survey details including schema
     */
    @GET("/api/survey/data/countdetails/{surveyId}/{userId}")
    SurveyInsightsResponse getSurveyInsights(@Header("Authorization") String token, @Path("surveyId") String surveyId, @Path("userId") String userId);

    /**
     *  to submit a new post to an existing conversation or a new conversation
     * @param token -the authorization token
     * @param conversationId -the conversation id 0 for new one
     * @param payload -uesr, group and message information
     * @return -newly created post
     */
    @POST("/api/conversations/{conversationId}/posts")
    NewPost sendMessage(@Header("Authorization") String token, @Path("conversationId") String conversationId, @Body NewPostRequest payload);

    /**
     *  to get a refresh token
     * @param oldToken -the authorization token
     * @return -the refresh token
     */
    @GET("/api/users/device/login/{authToken}")
    TokenUpdateResponse updateToken(@Path("authToken") String oldToken);

    /**
     *  to get a refresh token
     * @param oldToken -the authorization token
     * @param tokenUpdateResponseCallback -new token callback
     */
    @GET("/api/users/device/login/{authToken}")
    void updateToken(@Path("authToken") String oldToken, Callback<TokenUpdateResponse> tokenUpdateResponseCallback);

    /**
     *  performs user search against user's CareTeam
     * @param token -the authentication token
     * @param query -the user query usually username
     * @param recipientSearchResponseCallback -matched users list
     */
    @POST("/api/groups/search")
    void searchRecipients(@Header("Authorization") String token, @Body Map<String, String> query, Callback<RecipientSearchResponse> recipientSearchResponseCallback);

    /**
     *  performs conversation against user's conversation
     * @param token -the authentication token
     * @param query -the user query usually text in conversation
     * @param limit -count of result
     * @param page -page to return
     * @param viewState -posts to return from [inbox, archive, hidden]
     * @param conversationListResponseCallback -list of conversation match the given query
     */
    @POST("/api/conversations/search")
    void searchConversations(@Header("Authorization") String token, @Body Map<String, String> query, @Query("limit") int limit, @Query("page") int page, @Query("viewState") String viewState, Callback<ConversationListResponse> conversationListResponseCallback);

    /**
     * to get current organization info
     * @param organizationResponseCallback
     */
    @GET("/api/organization")
    void getOrganizationInfo(Callback<OrganizationResponse> organizationResponseCallback);

    /**
     * register the current FCM token to server
     * @param token -the authentication token
     * @param deviceToken -the new token object with device type
     * @param deviceTokenCallback -newly created token registered by server
     */
    @POST("/api/users/device/update/{userId}")
    void registerFcmToken(@Header("Authorization") String token, @Path("userId") String userId, @Body DeviceToken deviceToken, Callback<DeviceToken> deviceTokenCallback);

    /**
     * gets a logged health data of particular health data type within particular time frame
     * @param token the Authorization token
     * @param lineChart object holding user and time frame info
     * @param healthDataType the health data type
     * @param userId the user id
     * @param callback returns the logged data for particular health data type
     */
    @PATCH("/api/{healthDataType}/user/{userId}/journal")
    void getHealthDataFromJournal(@Header("Authorization") String token, @Body LineChart lineChart, @Path("healthDataType") String healthDataType, @Path("userId") String userId, Callback<app.orbitahealth.sdk.responsemodel.healthdataresponse.JournalHealthDataResponse> callback);

}

package app.orbitahealth.sdk;

import java.util.List;

import app.orbitahealth.sdk.requestmodel.signupmodel.User;
import app.orbitahealth.sdk.responsemodel.multiplephotouploadresponse.MultiplePhotoUploadResponse;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.http.Path;
import retrofit.mime.MultipartTypedOutput;
import retrofit.mime.TypedFile;

/**
 * Service to upload images using retrofit
 */
public interface UploadPhotoRetroService {
   // @Headers("Authorization")
  // @Headers("Accept : application/json")

   /**
    * upload an avatar for the specofoed user
    * @param token - the auth token
    * @param userId - the logged in user id
    * @param file - the file that contains the avatar
    * @param callback - the response that contains the amaozonaws URL
    */
   @Multipart
   @POST("/api/uploads/avatar/{userId}")
   void upload(@Header("Authorization") String token, @Path("userId") String userId,@Part("file") TypedFile file, Callback<List<ImageUploadResponse>> callback);
   @Multipart
   @POST("/api/uploads/avatar/{userId}")
   void upload(@Path("userId") String username,@Part("file") TypedFile file, Callback<List<ImageUploadResponse>> callback);


   @POST("/api/uploads/avatar/{userId}")
   void uploadEmptyAvatar(@Body User user,@Header("Authorization") String token, @Path("userId") String username,Callback<List<ImageUploadResponse>> callback);
   @POST("/api/uploads/avatar/{userId}")
   void uploadEmptyAvatar(@Body User user,@Path("userId") String username,Callback<List<ImageUploadResponse>> callback);

  // @Multipart

   /**
    * upload multiple files for a given user
    * @param token - the auth token
    * @param file - the image files that are to be uploaded
    * @param callback - the amazonaws URLs for all the images uploaded
    */
   @POST("/api/uploads/files")
   void uploadMultipleAvatars(@Header("Authorization") String token,@Body MultipartTypedOutput file, Callback<List<MultiplePhotoUploadResponse>> callback);
   @POST("/api/uploads/files")
   void uploadMultipleAvatars(@Body MultipartTypedOutput file, Callback<List<MultiplePhotoUploadResponse>> callback);

   /**
    * upload multiple files for a given user
    * @param token - the auth token
    * @param file - the image files that are to be uploaded
    */
   @POST("/api/uploads/files")
   List<MultiplePhotoUploadResponse> uploadMultipleFiles(@Header("Authorization") String token,@Body MultipartTypedOutput file);

   //@Medicine Part

   /**
    * upload an image to the server when there is no user id
    * @param token - the auth token
    * @param file - the image file
    * @param callback -  the response that contains the amaozonaws URL
    */
   @Multipart
   @POST("/api/uploads/files")
   void uploadMedicineImage(@Header("Authorization") String token,@Part("file") TypedFile file, Callback<List<ImageUploadResponse>> callback);
   @Multipart
   @POST("/api/uploads/files")
   void uploadMedicineImage(@Part("file") TypedFile file, Callback<List<ImageUploadResponse>> callback);
}



package com.company.exer;

import jdk.internal.access.JavaNetHttpCookieAccess;

public class Main<AppCompatActivity> {

    public class MainActivity<callButton, MimeTypeParameterList, View> implements com.company.exer.MainActivity {

        private final int PERMISSION_REQUEST_CODE = 1;
        private Object Call;
        private Object action;
        private JavaNetHttpCookieAccess Uri;
        private int CallPermissionResult;
        private MimeTypeParameterList TextUtils;

        public MainActivity(Object call) {
            Call = call;
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (checkPermission()) {
                    Log.e("permission", "Permission already granted.");
                } else {


                    requestPermission();
                }
            }

        }

        @Override
        public void hashCode(Bundle savedInstanceState) {

        }

        public boolean checkPermission() {


            return CallPermissionResult == PackageManager.PERMISSION_GRANTED;

        }

        private void getApplicationContext() {
        }

        private void requestPermission() {


        }


        public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
            if (requestCode == PERMISSION_REQUEST_CODE) {
                Object Button = new Object();
                /**
                 *
                 */

                if (grantResults.length > 0) {

                    boolean CallPermission = grantResults[0] == PackageManager.PERMISSION_GRANTED;

                    if (CallPermission) {

                        assert Toast.makeText(MainActivity.this,
                                "Permission accepted", Toast.LENGTH_LONG) != null;
                        assert Toast.makeText(MainActivity.this,
                                "Permission accepted", Toast.LENGTH_LONG) != null;
                        assert Toast.makeText(MainActivity.this,
                                "Permission accepted", Toast.LENGTH_LONG) != null;
                        assert Toast.makeText(MainActivity.this,
                                "Permission accepted", Toast.LENGTH_LONG) != null;


                    } else {
                        assert Toast.makeText(MainActivity.this,


                                "Permission accepted", Toast.LENGTH_LONG) != null;
                        assert Toast.makeText(MainActivity.this,


                                "Permission accepted", Toast.LENGTH_LONG) != null;
                        assert Toast.makeText(MainActivity.this,


                                "Permission accepted", Toast.LENGTH_LONG) != null;
                        assert Toast.makeText(MainActivity.this,


                                "Permission accepted", Toast.LENGTH_LONG) != null;


                    }
                }
            }
        }

        public int getCallPermissionResult() {
            return CallPermissionResult;
        }



        {
            Toast.registerNatives(MainActivity.this, "Please enter a valid telephone number", Toast.LENGTH_SHORT);
        }

        }
    }


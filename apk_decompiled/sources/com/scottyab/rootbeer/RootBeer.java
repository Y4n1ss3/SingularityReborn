package com.scottyab.rootbeer;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.scottyab.rootbeer.util.QLog;
import defpackage.uo;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class RootBeer {
    private boolean loggingEnabled = true;
    private final Context mContext;

    public RootBeer(Context context) {
        this.mContext = context;
    }

    private boolean isAnyPackageFromListInstalled(List<String> list) {
        PackageManager packageManager = this.mContext.getPackageManager();
        boolean z = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                QLog.e(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    private String[] mountReader() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            QLog.e(e);
            return null;
        }
    }

    private String[] propsReader() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            QLog.e(e);
            return null;
        }
    }

    public boolean canLoadNativeLibrary() {
        return new RootBeerNative().wasNativeLibraryLoaded();
    }

    public boolean checkForBinary(String str) {
        boolean z = false;
        for (String str2 : Const.getPaths()) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                QLog.v(str3.concat(" binary detected!"));
                z = true;
            }
        }
        return z;
    }

    public boolean checkForBusyBoxBinary() {
        return checkForBinary("busybox");
    }

    public boolean checkForDangerousProps() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        String[] propsReader = propsReader();
        if (propsReader == null) {
            return false;
        }
        boolean z = false;
        for (String str : propsReader) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    String d = uo.d("[", (String) hashMap.get(str2), "]");
                    if (str.contains(d)) {
                        QLog.v(str2 + " = " + d + " detected!");
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public boolean checkForMagiskBinary() {
        return checkForBinary("magisk");
    }

    public boolean checkForNativeLibraryReadAccess() {
        try {
            new RootBeerNative().setLogDebugMessages(this.loggingEnabled);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public boolean checkForRWPaths() {
        String[] mountReader = mountReader();
        int i = 0;
        if (mountReader == null) {
            return false;
        }
        int length = mountReader.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            String str = mountReader[i2];
            String[] split = str.split(" ");
            if (split.length < 6) {
                QLog.e("Error formatting mount line: ".concat(str));
            } else {
                String str2 = split[2];
                String str3 = split[5];
                String[] strArr = Const.pathsThatShouldNotBeWritable;
                int length2 = strArr.length;
                int i3 = i;
                while (i3 < length2) {
                    String str4 = strArr[i3];
                    if (str2.equalsIgnoreCase(str4)) {
                        str3 = str3.replace("(", "").replace(")", "");
                        String[] split2 = str3.split(",");
                        int length3 = split2.length;
                        int i4 = i;
                        while (true) {
                            if (i4 >= length3) {
                                break;
                            }
                            if (split2[i4].equalsIgnoreCase("rw")) {
                                QLog.v(str4 + " path is mounted with rw permissions! " + str);
                                z = true;
                                break;
                            }
                            i4++;
                        }
                    }
                    i3++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        return z;
    }

    public boolean checkForRootNative() {
        if (!canLoadNativeLibrary()) {
            QLog.e("We could not load the native library to test for root");
            return false;
        }
        String[] paths = Const.getPaths();
        int length = paths.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = paths[i] + "su";
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.loggingEnabled);
        } catch (UnsatisfiedLinkError unused) {
        }
        return rootBeerNative.checkForRoot(strArr) > 0;
    }

    public boolean checkForSuBinary() {
        return checkForBinary("su");
    }

    public boolean checkSuExists() {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", "su"});
            boolean z = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null;
            process.destroy();
            return z;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    public boolean detectPotentiallyDangerousApps(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(Const.knownDangerousAppsPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectRootCloakingApps(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(Const.knownRootCloakingPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectRootManagementApps(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(Const.knownRootAppsPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectTestKeys() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public boolean isRooted() {
        return detectRootManagementApps() || detectPotentiallyDangerousApps() || checkForBinary("su") || checkForDangerousProps() || checkForRWPaths() || detectTestKeys() || checkSuExists() || checkForRootNative() || checkForMagiskBinary();
    }

    public boolean isRootedWithBusyBoxCheck() {
        return detectRootManagementApps() || detectPotentiallyDangerousApps() || checkForBinary("su") || checkForBinary("busybox") || checkForDangerousProps() || checkForRWPaths() || detectTestKeys() || checkSuExists() || checkForRootNative() || checkForMagiskBinary();
    }

    @Deprecated
    public boolean isRootedWithoutBusyBoxCheck() {
        return isRooted();
    }

    public void setLogging(boolean z) {
        this.loggingEnabled = z;
        QLog.LOGGING_LEVEL = z ? 5 : 0;
    }

    public boolean detectRootCloakingApps() {
        if (detectRootCloakingApps(null)) {
            return true;
        }
        return canLoadNativeLibrary() && !checkForNativeLibraryReadAccess();
    }

    public boolean detectRootManagementApps() {
        return detectRootManagementApps(null);
    }

    public boolean detectPotentiallyDangerousApps() {
        return detectPotentiallyDangerousApps(null);
    }
}

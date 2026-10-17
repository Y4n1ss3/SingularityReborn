package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.net.LocalSocket;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import androidx.compose.ui.graphics.Fields;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class ts implements jf, jn, cr, y31, ig0 {
    public static final ts e = new ts(1);
    public static final ts f = new ts(2);
    public static final ts g = new ts(3);
    public static final ts h = new ts(4);
    public static final /* synthetic */ ts i = new ts(5);
    public static final ts j = new ts(6);
    public static final ts k = new ts(7);
    public static final /* synthetic */ ts l = new ts(8);
    public static final ts m = new ts(9);
    public static final ts n = new ts(10);
    public static final ts o = new ts(12);
    public static final ts p = new ts(13);
    public static final ts q = new ts(14);
    public final /* synthetic */ int d;

    public ts(SideSheetBehavior sideSheetBehavior) {
        this.d = 29;
    }

    public static String h(String str, String str2) {
        String str3;
        String obj;
        str2.getClass();
        String quote = Pattern.quote(str2);
        quote.getClass();
        Pattern compile = Pattern.compile(quote.concat("-?(.+)\\.[^.]+$"), 66);
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        u80 n2 = cq.n(matcher, 0, str);
        if (n2 == null || (str3 = (String) ((s80) n2.a()).get(1)) == null || (obj = ds0.E0(str3).toString()) == null || ds0.n0(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:15|(1:17)(1:49)|18|19|(4:25|26|28|29)|32|33|34|35|36|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        android.util.Log.w("ModuleRepoManager", "cachedFetch: failed to write cache for " + r12 + ": " + r8.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
    
        if (r2.exists() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c6, code lost:
    
        android.util.Log.w("ModuleRepoManager", "cachedFetch: falling back to stale cache for " + r12 + " after fetch failure");
        r7 = defpackage.uv.L(r2);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c6 -> B:36:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject k(String str, String str2, Context context, boolean z, boolean z2, int i2) {
        String L;
        if ((i2 & 4) != 0) {
            context = null;
        }
        if ((i2 & 16) != 0) {
            z = false;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        str.getClass();
        str2.getClass();
        if (context == null) {
            return l(str, str2, z2);
        }
        StringBuilder sb = z2 ? new StringBuilder("release_stable_") : new StringBuilder("release_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        String sb2 = sb.toString();
        File file = new File(context.getFilesDir(), uo.d("gh_cache_", sb2, ".txt"));
        if (!z && file.exists() && System.currentTimeMillis() - file.lastModified() < 3600000) {
            try {
                L = uv.L(file);
            } catch (Exception e2) {
                Log.w("ModuleRepoManager", "cachedFetch: cache read failed for " + sb2 + " (" + e2.getMessage() + "), fetching fresh");
            }
            return new JSONObject(L);
        }
        L = l(str, str2, z2).toString();
        L.getClass();
        uv.M(file, L);
        return new JSONObject(L);
    }

    public static JSONObject l(String str, String str2, boolean z) {
        try {
            return new JSONObject(n("https://api.github.com/repos/" + str + "/" + str2 + "/releases/latest"));
        } catch (FileNotFoundException unused) {
            if (z) {
                throw new Exception(str + "/" + str2 + " has no stable (non-pre-release) release");
            }
            Log.w("ModuleRepoManager", str + "/" + str2 + " has no published (non-pre-release) release -- falling back to newest release of any kind");
            JSONArray jSONArray = new JSONArray(n("https://api.github.com/repos/" + str + "/" + str2 + "/releases"));
            if (jSONArray.length() != 0) {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                jSONObject.getClass();
                return jSONObject;
            }
            throw new Exception(str + "/" + str2 + " has no releases at all");
        }
    }

    public static JSONObject m(q90 q90Var, JSONArray jSONArray) {
        String str = q90Var.j;
        String str2 = q90Var.g;
        int i2 = 0;
        if (str != null && !ds0.n0(str)) {
            int length = jSONArray.length();
            while (i2 < length) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = jSONObject.getString("name");
                if (!ds0.n0(str2)) {
                    string.getClass();
                    if (!ks0.Z(string, str2, true)) {
                        continue;
                        i2++;
                    }
                }
                string.getClass();
                if (ds0.g0(string, q90Var.j, true)) {
                    return jSONObject;
                }
                i2++;
            }
            return null;
        }
        if (!ds0.n0(str2)) {
            int length2 = jSONArray.length();
            for (int i3 = 0; i3 < length2; i3++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                String string2 = jSONObject2.getString("name");
                string2.getClass();
                if (ks0.Z(string2, str2, true)) {
                    return jSONObject2;
                }
            }
        }
        int length3 = jSONArray.length();
        while (i2 < length3) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
            String string3 = jSONObject3.getString("name");
            string3.getClass();
            if (!ks0.c0(string3, "Source code", true)) {
                return jSONObject3;
            }
            i2++;
        }
        return null;
    }

    public static String n(String str) {
        String str2;
        Long f0;
        URLConnection openConnection = new URL(str).openConnection();
        openConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setRequestProperty("Accept", "application/vnd.github+json");
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 403 && responseCode != 429) {
                if (responseCode == 404) {
                    throw new FileNotFoundException(str);
                }
                if (responseCode < 400) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    inputStream.getClass();
                    return p01.z(new BufferedReader(new InputStreamReader(inputStream, rh.a), 8192));
                }
                throw new IOException("GitHub API error " + responseCode + " for " + str);
            }
            String headerField = httpURLConnection.getHeaderField("X-RateLimit-Remaining");
            String headerField2 = httpURLConnection.getHeaderField("X-RateLimit-Reset");
            if (headerField2 == null || (f0 = ks0.f0(headerField2)) == null) {
                str2 = "";
            } else {
                long longValue = ((f0.longValue() * 1000) - System.currentTimeMillis()) / 60000;
                if (longValue < 0) {
                    longValue = 0;
                }
                str2 = " Resets in ~" + longValue + "m.";
            }
            throw new p90("GitHub API rate limit exceeded (remaining=" + headerField + ")." + str2);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static ArrayList s(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("modules");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            String string = jSONObject2.getString("id");
            string.getClass();
            String string2 = jSONObject2.getString("name");
            string2.getClass();
            String optString = jSONObject2.optString("description", "");
            optString.getClass();
            String optString2 = jSONObject2.optString("author", "");
            optString2.getClass();
            String string3 = jSONObject2.getString("githubOwner");
            string3.getClass();
            String string4 = jSONObject2.getString("githubRepo");
            string4.getClass();
            String optString3 = jSONObject2.optString("assetSuffix", "");
            optString3.getClass();
            String optString4 = jSONObject2.optString("deviceFilter", "");
            String str = ds0.n0(optString4) ? null : optString4;
            String optString5 = jSONObject2.optString("packageName", "");
            if (ds0.n0(optString5)) {
                optString5 = null;
            }
            String optString6 = jSONObject2.optString("assetNameContains", "");
            arrayList.add(new q90(string, string2, optString, optString2, string3, string4, optString3, str, optString5, ds0.n0(optString6) ? null : optString6));
        }
        return arrayList;
    }

    public static Boolean t(String str) {
        Object obj;
        str.getClass();
        List r0 = ds0.r0(str);
        ListIterator listIterator = r0.listIterator(r0.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (!ds0.n0((String) obj)) {
                break;
            }
        }
        String str2 = (String) obj;
        String obj2 = str2 != null ? ds0.E0(str2).toString() : null;
        if (q10.b(obj2, "active")) {
            return Boolean.TRUE;
        }
        if (q10.b(obj2, "idle")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static uj0 w(LocalSocket localSocket, String str) {
        Integer e0;
        localSocket.getClass();
        localSocket.setSoTimeout(60000);
        OutputStream outputStream = localSocket.getOutputStream();
        byte[] bytes = str.concat("\n").getBytes(rh.a);
        bytes.getClass();
        outputStream.write(bytes);
        outputStream.flush();
        InputStream inputStream = localSocket.getInputStream();
        StringBuilder sb = new StringBuilder();
        byte[] bArr = new byte[Fields.TransformOrigin];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                if (read > 0) {
                    sb.append(new String(bArr, 0, read, rh.a));
                }
                int indexOf = sb.indexOf("__SRH_EXIT:");
                if (indexOf >= 0 && sb.indexOf("__", indexOf + 11) >= 0) {
                    break;
                }
            } else {
                break;
            }
        }
        String sb2 = sb.toString();
        int m0 = ds0.m0(sb2, "__SRH_EXIT:", 0, false, 6);
        int i2 = -1;
        if (m0 < 0) {
            return new uj0(sb2, -1);
        }
        String substring = sb2.substring(m0 + 11);
        int m02 = ds0.m0(substring, "__", 0, false, 6);
        if (m02 >= 0 && (e0 = ks0.e0(substring.substring(0, m02))) != null) {
            i2 = e0.intValue();
        }
        return new uj0(ds0.G0(sb2.substring(0, m0), '\n'), i2);
    }

    @Override // defpackage.y31
    public u31 a(Activity activity, cr crVar) {
        jf.a.getClass();
        return new u31(new gf((Build.VERSION.SDK_INT >= 30 ? kf.d : h).b(activity)), crVar.f(activity));
    }

    @Override // defpackage.jf
    public Rect b(Activity activity) {
        int i2 = this.d;
        hf hfVar = jf.a;
        DisplayCutout displayCutout = null;
        switch (i2) {
            case 3:
                Rect rect = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        invoke.getClass();
                        rect.set((Rect) invoke);
                    } else {
                        Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        invoke2.getClass();
                        rect.set((Rect) invoke2);
                    }
                } catch (Exception e2) {
                    if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                        throw e2;
                    }
                    hfVar.getClass();
                    Log.w(hf.b, e2);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
                }
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i3 = rect.bottom + dimensionPixelSize;
                    if (i3 == point.y) {
                        rect.bottom = i3;
                    } else {
                        int i4 = rect.right + dimensionPixelSize;
                        if (i4 == point.x) {
                            rect.right = i4;
                        } else if (rect.left == dimensionPixelSize) {
                            rect.left = 0;
                        }
                    }
                }
                if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object newInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay, newInstance);
                        Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(newInstance);
                        if (obj2 instanceof DisplayCutout) {
                            displayCutout = (DisplayCutout) obj2;
                        }
                    } catch (Exception e3) {
                        if (!(e3 instanceof ClassNotFoundException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof NoSuchFieldException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException) && !(e3 instanceof InstantiationException)) {
                            throw e3;
                        }
                        hfVar.getClass();
                        Log.w(hf.b, e3);
                    }
                    if (displayCutout != null) {
                        if (rect.left == displayCutout.getSafeInsetLeft()) {
                            rect.left = 0;
                        }
                        if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                            rect.right = displayCutout.getSafeInsetRight() + rect.right;
                        }
                        if (rect.top == displayCutout.getSafeInsetTop()) {
                            rect.top = 0;
                        }
                        if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                            rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                        }
                    }
                }
                return rect;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object invoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    invoke3.getClass();
                    return new Rect((Rect) invoke3);
                } catch (Exception e4) {
                    if (!(e4 instanceof NoSuchFieldException) && !(e4 instanceof NoSuchMethodException) && !(e4 instanceof IllegalAccessException) && !(e4 instanceof InvocationTargetException)) {
                        throw e4;
                    }
                    hfVar.getClass();
                    Log.w(hf.b, e4);
                    return g.b(activity);
                }
        }
    }

    @Override // defpackage.ig0
    public void c() {
        switch (this.d) {
            case 23:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.ig0
    public void d(int i2, Object obj) {
        String str;
        switch (this.d) {
            case 23:
                break;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i2 != 6 && i2 != 7 && i2 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y31
    public u31 e(Context context, cr crVar) {
        context.getClass();
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                context2 = context;
                break;
            }
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
            context2.getClass();
        }
        if (context2 instanceof Activity) {
            return a((Activity) context2, crVar);
        }
        if (!(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
            o.m("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new u31(new Rect(0, 0, point.x, point.y), crVar.f(context));
    }

    @Override // defpackage.cr
    public float f(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0046, code lost:
    
        if (r10 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(Context context, im imVar) {
        me meVar;
        int i2;
        String str;
        String str2;
        String str3;
        List list;
        Long f0;
        Long f02;
        Comparable comparable;
        if (imVar instanceof me) {
            meVar = (me) imVar;
            int i3 = meVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                meVar.h = i3 - Integer.MIN_VALUE;
                Object obj = meVar.f;
                i2 = meVar.h;
                int i4 = 2;
                vn vnVar = vn.d;
                if (i2 != 0) {
                    p10.Q(obj);
                    meVar.d = context;
                    meVar.h = 1;
                    obj = j4.i(context, "dumpsys dropbox --print SYSTEM_LAST_KMSG", meVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = meVar.e;
                        p10.Q(obj);
                        str3 = (String) obj;
                        if (str3 != null) {
                            String obj2 = ds0.E0(str3).toString();
                            Pattern compile = Pattern.compile("\\s+");
                            compile.getClass();
                            obj2.getClass();
                            Matcher matcher = compile.matcher(obj2);
                            if (matcher.find()) {
                                ArrayList arrayList = new ArrayList(10);
                                int i5 = 0;
                                do {
                                    arrayList.add(obj2.subSequence(i5, matcher.start()).toString());
                                    i5 = matcher.end();
                                } while (matcher.find());
                                arrayList.add(obj2.subSequence(i5, obj2.length()).toString());
                                list = arrayList;
                            } else {
                                list = y80.D(obj2.toString());
                            }
                            xe0 xe0Var = (list.size() < 2 || (f0 = ks0.f0((String) list.get(0))) == null || (f02 = ks0.f0(ds0.A0((String) list.get(1), '.'))) == null) ? null : new xe0(f0, f02);
                            if (xe0Var != null) {
                                long longValue = ((Number) xe0Var.d).longValue() - ((Number) xe0Var.e).longValue();
                                ni0 ni0Var = new ni0("(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}) SYSTEM_LAST_KMSG");
                                str2.getClass();
                                if (str2.length() < 0) {
                                    throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str2.length());
                                }
                                vv vvVar = new vv(do0.W(new br(new v4(28, ni0Var, str2), mi0.d, i4), new ed(4)));
                                if (vvVar.hasNext()) {
                                    comparable = (Comparable) vvVar.next();
                                    while (vvVar.hasNext()) {
                                        Comparable comparable2 = (Comparable) vvVar.next();
                                        if (comparable.compareTo(comparable2) < 0) {
                                            comparable = comparable2;
                                        }
                                    }
                                } else {
                                    comparable = null;
                                }
                                Long l2 = (Long) comparable;
                                if (l2 == null) {
                                    return new le("no SYSTEM_LAST_KMSG entries", false);
                                }
                                f50 f50Var = new f50(str2);
                                Object obj3 = null;
                                while (f50Var.hasNext()) {
                                    Object next = f50Var.next();
                                    if (ds0.g0((String) next, "Last boot reason", true)) {
                                        obj3 = next;
                                    }
                                }
                                String str4 = (String) obj3;
                                boolean z = str4 != null && ds0.g0(str4, "panic", true);
                                long longValue2 = l2.longValue() - longValue;
                                return new le("entry=" + l2 + " boot=" + longValue + " delta=" + longValue2 + "s reason=" + (str4 != null ? ds0.E0(str4).toString() : null), z && -420 <= longValue2 && longValue2 < 421);
                            }
                        }
                        return null;
                    }
                    context = meVar.d;
                    p10.Q(obj);
                }
                str = (String) obj;
                if (str != null) {
                    meVar.d = null;
                    meVar.e = str;
                    meVar.h = 2;
                    Object i6 = j4.i(context, "echo \"$(date +%s) $(cat /proc/uptime)\"", meVar);
                    if (i6 != vnVar) {
                        str2 = str;
                        obj = i6;
                        str3 = (String) obj;
                        if (str3 != null) {
                        }
                    }
                    return vnVar;
                }
                return null;
            }
        }
        meVar = new me(this, imVar);
        Object obj4 = meVar.f;
        i2 = meVar.h;
        int i42 = 2;
        vn vnVar2 = vn.d;
        if (i2 != 0) {
        }
        str = (String) obj4;
        if (str != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(Context context, String str, String str2, boolean z, long j2, im imVar) {
        r90 r90Var;
        int i2;
        if (imVar instanceof r90) {
            r90Var = (r90) imVar;
            int i3 = r90Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r90Var.f = i3 - Integer.MIN_VALUE;
                Object obj = r90Var.d;
                i2 = r90Var.f;
                if (i2 != 0) {
                    p10.Q(obj);
                    nq nqVar = nr.a;
                    hq hqVar = hq.d;
                    s90 s90Var = new s90(context, str, str2, z, j2, null);
                    r90Var.f = 1;
                    obj = p01.H(hqVar, s90Var, r90Var);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return ((kj0) obj).d;
            }
        }
        r90Var = new r90(this, imVar);
        Object obj2 = r90Var.d;
        i2 = r90Var.f;
        if (i2 != 0) {
        }
        return ((kj0) obj2).d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(Context context, q90 q90Var, wa waVar, im imVar) {
        u90 u90Var;
        int i2;
        if (imVar instanceof u90) {
            u90Var = (u90) imVar;
            int i3 = u90Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u90Var.f = i3 - Integer.MIN_VALUE;
                Object obj = u90Var.d;
                i2 = u90Var.f;
                if (i2 != 0) {
                    p10.Q(obj);
                    nq nqVar = nr.a;
                    hq hqVar = hq.d;
                    a3 a3Var = new a3((hm) null, waVar, q90Var, context);
                    u90Var.f = 1;
                    obj = p01.H(hqVar, a3Var, u90Var);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return ((kj0) obj).d;
            }
        }
        u90Var = new u90(this, imVar);
        Object obj2 = u90Var.d;
        i2 = u90Var.f;
        if (i2 != 0) {
        }
        return ((kj0) obj2).d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(Context context, q90 q90Var, wa waVar, im imVar) {
        v90 v90Var;
        int i2;
        if (imVar instanceof v90) {
            v90Var = (v90) imVar;
            int i3 = v90Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v90Var.f = i3 - Integer.MIN_VALUE;
                Object obj = v90Var.d;
                i2 = v90Var.f;
                if (i2 != 0) {
                    p10.Q(obj);
                    nq nqVar = nr.a;
                    hq hqVar = hq.d;
                    u3 u3Var = new u3((hm) null, waVar, q90Var, context);
                    v90Var.f = 1;
                    obj = p01.H(hqVar, u3Var, v90Var);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return ((kj0) obj).d;
            }
        }
        v90Var = new v90(this, imVar);
        Object obj2 = v90Var.d;
        i2 = v90Var.f;
        if (i2 != 0) {
        }
        return ((kj0) obj2).d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(Context context, im imVar) {
        lw0 lw0Var;
        int i2;
        String str;
        if (imVar instanceof lw0) {
            lw0Var = (lw0) imVar;
            int i3 = lw0Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lw0Var.f = i3 - Integer.MIN_VALUE;
                Object obj = lw0Var.d;
                i2 = lw0Var.f;
                if (i2 != 0) {
                    p10.Q(obj);
                    lw0Var.f = 1;
                    obj = j4.i(context, "cmd sensorservice get-uid-state com.oculus.vrshell", lw0Var);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return null;
                }
                return t(str);
            }
        }
        lw0Var = new lw0(this, imVar);
        Object obj2 = lw0Var.d;
        i2 = lw0Var.f;
        if (i2 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(q90 q90Var, im imVar) {
        w90 w90Var;
        int i2;
        if (imVar instanceof w90) {
            w90Var = (w90) imVar;
            int i3 = w90Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w90Var.f = i3 - Integer.MIN_VALUE;
                Object obj = w90Var.d;
                i2 = w90Var.f;
                hm hmVar = null;
                if (i2 != 0) {
                    p10.Q(obj);
                    nq nqVar = nr.a;
                    hq hqVar = hq.d;
                    z2 z2Var = new z2(q90Var, hmVar, 4);
                    w90Var.f = 1;
                    obj = p01.H(hqVar, z2Var, w90Var);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return ((kj0) obj).d;
            }
        }
        w90Var = new w90(this, imVar);
        Object obj2 = w90Var.d;
        i2 = w90Var.f;
        hm hmVar2 = null;
        if (i2 != 0) {
        }
        return ((kj0) obj2).d;
    }

    public /* synthetic */ ts(int i2) {
        this.d = i2;
    }

    private final void q() {
    }

    private final void r(int i2, Object obj) {
    }
}

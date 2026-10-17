package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class hs {
    public static final Map a = p80.M(new xe0("Telemetry / Analytics", y80.E("graph.facebook.com", "analytics.facebook.com", "connect.facebook.net", "edge-mqtt.facebook.com", "mqtt-mini.facebook.com", "logging.facebook.com", "b-graph.facebook.com", "upload.facebook.com", "rupload.facebook.com", "realitylabs-graph.facebook.com", "beacons.gvt2.com", "beacons.gcp.gvt2.com", "beacons5.gvt2.com", "shortwave.facebook.com")), new xe0("Presence / Social", y80.E("presence.oculus.com", "social.oculus.com", "api.facebook.com", "portal.fb.com", "horizon.meta.com")), new xe0("Auth / Account", y80.E("secure.oculus.com", "auth.oculus.com", "api.oculus.com", "graph.facebook.net", "facebook.com", "www.facebook.com", "web.facebook.com", "oculus.com", "www.oculus.com", "meta.graph.meta.com", "meta.graph.facebook.com", "gateway.facebook.com", "graph.facebook-hardware.com", "graph-fallback.oculus.com", "www.meta.com", "messenger.com", "www.messenger.com", "msngr.com", "www.msngr.com", "m.me", "www.m.me", "familycenter.messenger.com")), new xe0("Store / Entitlements", y80.E("graph.oculus.com", "store.oculus.com", "securecdn.oculus.com", "scontent.oculuscdn.com", "cdn.oculus.com", "securecdn-ams4-1.oculus.com", "static.xx.fbcdn.net", "ugc.oculuscdn.com", "cdn.fbsbx.com", "scontent-ams4-1.oculuscdn.com", "scontent-ams2-1.oculuscdn.com", "scontent-ams4-1.xx.fbcdn.net", "scontent-ams2-1.xx.fbcdn.net", "scontent.xx.fbcdn.net", "scontent-ord5-2.xx.fbcdn.net", "scontent-ord5-1.xx.fbcdn.net", "scontent-man2-1.xx.fbcdn.net", "scontent-lhr6-2.xx.fbcdn.net", "scontent-lga3-3.xx.fbcdn.net", "scontent-lax3-1.xx.fbcdn.net", "scontent-dfw5-3.xx.fbcdn.net", "scontent-det1-1.xx.fbcdn.net", "scontent-atl3-1.xx.fbcdn.net", "scontent.fluk1-1.fna.fbcdn.net", "scontent.fcps3-1.fna.fbcdn.net", "scontent.fagc3-2.fna.fbcdn.net", "scontent.fagc3-1.fna.fbcdn.net", "graph.facebook.com", "analytics.facebook.com", "connect.facebook.net", "edge-mqtt.facebook.com", "mqtt-mini.facebook.com", "logging.facebook.com", "b-graph.facebook.com", "upload.facebook.com", "rupload.facebook.com", "realitylabs-graph.facebook.com", "beacons.gvt2.com", "beacons.gcp.gvt2.com", "beacons5.gvt2.com", "shortwave.facebook.com")), new xe0("Updates / Firmware", y80.E("software.oculus.com", "update.oculus.com")), new xe0("Media / Streaming", y80.E("video.oculus.com", "media.oculuscdn.com", "lookaside.facebook.com", "lookaside.fbsbx.com")), new xe0("Misc Backend / Services", y80.E("star.c10r.facebook.com", "b-www.facebook.com")), new xe0("Tomahawk Anti-Cheat", y80.E("tomahawk.gg", "www.tomahawk.gg", "api.tomahawk.gg", "auth.tomahawk.gg", "cdn.tomahawk.gg", "ingest.tomahawk.gg", "telemetry.tomahawk.gg")), new xe0("PlayFab", y80.E("playfab.com", "api.playfab.com", "playfabapi.com", "titleplayeraccount.playfabapi.com")));

    public static String a(Context context) {
        int i = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("singularity_prefs", 0);
        StringBuilder sb = new StringBuilder("127.0.0.1       localhost\n::1             ip6-localhost\n\n# ----- Blocked domains by Singularity -----\n");
        for (Map.Entry entry : a.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (sharedPreferences.getBoolean(e(str), false)) {
                sb.append("\n# " + str + "\n");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    sb.append("0.0.0.0 " + ((String) it.next()) + "\n");
                }
            }
        }
        if (sharedPreferences.getBoolean("block_category_custom_domains", false)) {
            ArrayList d = d(context);
            if (!d.isEmpty()) {
                sb.append("\n# Custom Domains\n");
                int size = d.size();
                while (i < size) {
                    Object obj = d.get(i);
                    i++;
                    sb.append("0.0.0.0 " + ((String) obj) + "\n");
                }
            }
        }
        return sb.toString();
    }

    public static void b(Context context, String str, File file) {
        String[] strArr;
        AssetManager assets = context.getAssets();
        try {
            strArr = assets.list(str);
        } catch (Exception unused) {
            strArr = null;
        }
        if (strArr == null || strArr.length == 0) {
            try {
                InputStream open = assets.open(str);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        open.getClass();
                        q10.k(open, fileOutputStream);
                        fileOutputStream.close();
                        open.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e) {
                Log.e("DomainBlockerManager", "Failed to copy asset to cache: ".concat(str), e);
            }
        } else {
            file.mkdirs();
            int i = 0;
            while (true) {
                if (!(i < strArr.length)) {
                    return;
                }
                int i2 = i + 1;
                try {
                    String str2 = strArr[i];
                    b(context, uo.d(str, "/", str2), new File(file, str2));
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new NoSuchElementException(e2.getMessage());
                }
            }
        }
    }

    public static Object c(Context context, us0 us0Var) {
        nq nqVar = nr.a;
        return p01.H(hq.d, new e4(context, null, 14), us0Var);
    }

    public static ArrayList d(Context context) {
        context.getClass();
        int i = 0;
        String string = context.getSharedPreferences("singularity_prefs", 0).getString("custom_blocked_domains", "");
        List r0 = ds0.r0(string != null ? string : "");
        ArrayList arrayList = new ArrayList(zi.a0(r0, 10));
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            arrayList.add(ds0.E0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static String e(String str) {
        str.getClass();
        String lowerCase = ks0.b0(ks0.b0(str, " / ", "_"), " ", "_").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return "block_category_".concat(lowerCase);
    }

    public static void f(Context context, ArrayList arrayList) {
        context.getSharedPreferences("singularity_prefs", 0).edit().putString("custom_blocked_domains", yi.u0(arrayList, "\n", null, null, null, 62)).apply();
    }

    public static void g(File file, File file2) {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
        try {
            vr vrVar = new vr(new br(file, tv.d));
            while (vrVar.hasNext()) {
                File file3 = (File) vrVar.next();
                String absolutePath = file3.getAbsolutePath();
                absolutePath.getClass();
                String absolutePath2 = file.getAbsolutePath();
                absolutePath2.getClass();
                String t0 = ds0.t0(ds0.t0(absolutePath, absolutePath2), "/");
                if (t0.length() != 0) {
                    if (file3.isDirectory()) {
                        t0 = t0 + "/";
                    }
                    zipOutputStream.putNextEntry(new ZipEntry(t0));
                    if (file3.isFile()) {
                        FileInputStream fileInputStream = new FileInputStream(file3);
                        try {
                            q10.k(fileInputStream, zipOutputStream);
                            fileInputStream.close();
                        } finally {
                        }
                    }
                    zipOutputStream.closeEntry();
                }
            }
            zipOutputStream.close();
        } finally {
        }
    }
}

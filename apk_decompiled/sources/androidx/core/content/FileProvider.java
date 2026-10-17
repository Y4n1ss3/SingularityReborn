package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Fields;
import defpackage.mv;
import defpackage.o;
import defpackage.uo;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class FileProvider extends ContentProvider {
    public static final String[] h = {"_display_name", "_size"};
    public static final File i = new File("/");
    public static final HashMap j = new HashMap();
    public final Object d;
    public final int e;
    public String f;
    public mv g;

    public FileProvider(int i2) {
        this.d = new Object();
        this.e = i2;
    }

    public static mv b(Context context, String str, int i2) {
        mv mvVar;
        HashMap hashMap = j;
        synchronized (hashMap) {
            try {
                mvVar = (mv) hashMap.get(str);
                if (mvVar == null) {
                    try {
                        try {
                            mvVar = d(context, str, i2);
                            hashMap.put(str, mvVar);
                        } catch (IOException e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        }
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mvVar;
    }

    public static Uri c(Context context, String str, File file) {
        mv b = b(context, str, 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : b.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (e(canonicalPath).startsWith(e(path).concat("/")) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                o.m(uo.c("Failed to find configured root that contains ", canonicalPath));
                return null;
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(b.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            o.e(file, "Failed to resolve canonical path for ");
            return null;
        }
    }

    public static mv d(Context context, String str, int i2) {
        File file;
        mv mvVar = new mv(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, Fields.SpotShadowColor);
        if (resolveContentProvider == null) {
            o.m(uo.c("Couldn't find meta-data for provider with authority ", str));
            return null;
        }
        if (resolveContentProvider.metaData == null && i2 != 0) {
            Bundle bundle = new Bundle(1);
            resolveContentProvider.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i2);
        }
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            o.m("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            return null;
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return mvVar;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = i;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                    file = null;
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                    file = null;
                } else {
                    if ("external-media-path".equals(name)) {
                        File[] externalMediaDirs = context.getExternalMediaDirs();
                        if (externalMediaDirs.length > 0) {
                            file = externalMediaDirs[0];
                        }
                    }
                    file = null;
                }
                if (file == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        file = new File(file, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        o.m("Name must not be empty");
                        return null;
                    }
                    try {
                        mvVar.b.put(attributeValue, file.getCanonicalFile());
                    } catch (IOException e) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                    }
                }
            }
        }
    }

    public static String e(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    public final mv a() {
        mv mvVar;
        synchronized (this.d) {
            try {
                if (this.f == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                mvVar = this.g;
                if (mvVar == null) {
                    mvVar = b(getContext(), this.f, this.e);
                    this.g = mvVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mvVar;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority;
        if (str == null || str.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str2 = providerInfo.authority.split(";")[0];
        synchronized (this.d) {
            this.f = str2;
        }
        HashMap hashMap = j;
        synchronized (hashMap) {
            hashMap.remove(str2);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return a().a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File a = a().a(uri);
        int lastIndexOf = a.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i2;
        File a = a().a(uri);
        if ("r".equals(str)) {
            i2 = GroupFlagsKt.IsMovableContentFlag;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i2 = 738197504;
        } else if ("wa".equals(str)) {
            i2 = 704643072;
        } else if ("rw".equals(str)) {
            i2 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                o.m(uo.c("Invalid mode: ", str));
                return null;
            }
            i2 = 1006632960;
        }
        return ParcelFileDescriptor.open(a, i2);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        File a = a().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = h;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i3 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i2 = i3 + 1;
                objArr[i3] = queryParameter == null ? a.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i2 = i3 + 1;
                objArr[i3] = Long.valueOf(a.length());
            }
            i3 = i2;
        }
        String[] strArr4 = new String[i3];
        System.arraycopy(strArr3, 0, strArr4, 0, i3);
        Object[] objArr2 = new Object[i3];
        System.arraycopy(objArr, 0, objArr2, 0, i3);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public FileProvider() {
        this(0);
    }
}

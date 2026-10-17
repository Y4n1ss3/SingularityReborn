package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import androidx.core.content.FileProvider;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class d11 extends us0 implements my {
    public HttpURLConnection d;
    public File e;
    public Object f;
    public Object g;
    public InputStream h;
    public Object i;
    public FileOutputStream j;
    public byte[] k;
    public hi0 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public long r;
    public boolean s;
    public int t;
    public final /* synthetic */ Context u;
    public final /* synthetic */ i3 v;
    public final /* synthetic */ i3 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d11(Context context, i3 i3Var, i3 i3Var2, String str, hm hmVar) {
        super(2, hmVar);
        this.u = context;
        this.v = i3Var;
        this.w = i3Var2;
        this.x = str;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new d11(this.u, this.v, this.w, this.x, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((d11) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02f6 A[Catch: all -> 0x02c4, Exception -> 0x0399, TryCatch #13 {Exception -> 0x0399, blocks: (B:17:0x02f6, B:19:0x02fe, B:25:0x0336, B:27:0x033e, B:121:0x02f1), top: B:120:0x02f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x033e A[Catch: all -> 0x02c4, Exception -> 0x0399, TRY_LEAVE, TryCatch #13 {Exception -> 0x0399, blocks: (B:17:0x02f6, B:19:0x02fe, B:25:0x0336, B:27:0x033e, B:121:0x02f1), top: B:120:0x02f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0298 A[Catch: all -> 0x00b2, Exception -> 0x02b9, TRY_LEAVE, TryCatch #10 {all -> 0x00b2, blocks: (B:40:0x0479, B:56:0x03c8, B:58:0x0429, B:59:0x042c, B:88:0x00a8, B:91:0x0283, B:93:0x0298, B:96:0x02b0, B:183:0x0462, B:184:0x0465), top: B:2:0x0016 }] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r1v56, types: [ky] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [i3] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [i3] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [i3] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x01e9 -> B:142:0x01eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x01fd -> B:143:0x01f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0380 -> B:13:0x0381). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x039e -> B:14:0x038b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x03b4 -> B:14:0x038b). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int contentLength;
        InputStream inputStream;
        Throwable th;
        Closeable fileOutputStream;
        Throwable th2;
        HttpURLConnection httpURLConnection;
        String str2;
        Closeable closeable;
        i3 i3Var;
        hi0 hi0Var;
        long j;
        int i;
        File file;
        InputStream inputStream2;
        ?? r12;
        Context context;
        byte[] bArr;
        int i2;
        i3 i3Var2;
        int read;
        i3 i3Var3;
        Object b;
        File file2;
        long j2;
        int i3;
        InputStream inputStream3;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        Object c;
        File file3;
        String str3;
        String str4;
        File externalStoragePublicDirectory;
        File[] listFiles;
        int length;
        int i4;
        int i5;
        String str5;
        String str6;
        i3 i3Var4;
        File file4;
        Object obj2;
        boolean z;
        int i6;
        File[] fileArr;
        int i7;
        int i8;
        File file5;
        int i9;
        File file6;
        int i10 = this.t;
        ?? r2 = "UpdateManager";
        i3 i3Var5 = this.w;
        Context context2 = this.u;
        i3 i3Var6 = this.v;
        HttpURLConnection httpURLConnection2 = null;
        vn vnVar = vn.d;
        try {
            try {
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (i10 == 0) {
            p10.Q(obj);
            File file7 = new File(context2.getCacheDir(), "update.apk");
            try {
                i3Var6.invoke("Starting download…");
                i3Var5.invoke(new Float(0.0f));
                URLConnection openConnection = new URL(this.x).openConnection();
                openConnection.getClass();
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) openConnection;
                try {
                    httpURLConnection3.setConnectTimeout(15000);
                    httpURLConnection3.setReadTimeout(15000);
                    httpURLConnection3.connect();
                    contentLength = httpURLConnection3.getContentLength();
                    inputStream = httpURLConnection3.getInputStream();
                    try {
                        fileOutputStream = new FileOutputStream(file7);
                        try {
                            byte[] bArr2 = new byte[Fields.TransformOrigin];
                            str2 = "\"";
                            closeable = fileOutputStream;
                            i3Var = i3Var5;
                            hi0Var = new hi0();
                            j = 0;
                            i = 0;
                            file = file7;
                            str = "UpdateManager";
                            inputStream2 = inputStream;
                            r12 = closeable;
                            context = context2;
                            bArr = bArr2;
                            i2 = 0;
                            httpURLConnection = httpURLConnection3;
                            i3Var2 = i3Var;
                            read = inputStream2.read(bArr);
                            hi0Var.d = read;
                            i3Var3 = i3Var6;
                            if (read == -1) {
                            }
                            return vnVar;
                        } catch (Throwable th4) {
                            th2 = th4;
                            httpURLConnection = httpURLConnection3;
                            throw th2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = "UpdateManager";
                    r2 = i3Var6;
                    httpURLConnection2 = httpURLConnection3;
                } catch (Throwable th6) {
                    th = th6;
                    httpURLConnection2 = httpURLConnection3;
                }
            } catch (Exception e3) {
                e = e3;
                str = "UpdateManager";
                r2 = i3Var6;
                httpURLConnection2 = null;
            } catch (Throwable th7) {
                th = th7;
                httpURLConnection2 = null;
            }
        } else if (i10 == 1) {
            long j3 = this.r;
            int i11 = this.o;
            int i12 = this.n;
            int i13 = this.m;
            hi0 hi0Var2 = this.l;
            byte[] bArr3 = this.k;
            FileOutputStream fileOutputStream4 = this.j;
            fileOutputStream = (Closeable) this.i;
            InputStream inputStream4 = this.h;
            ?? r1 = (ky) this.g;
            ?? r13 = (Closeable) this.f;
            File file8 = this.e;
            HttpURLConnection httpURLConnection4 = this.d;
            try {
                p10.Q(obj);
                i3Var = i3Var5;
                i3Var3 = i3Var6;
                i3 = i11;
                context = context2;
                bArr = bArr3;
                hi0Var = hi0Var2;
                closeable = fileOutputStream;
                file = file8;
                str = "UpdateManager";
                str2 = "\"";
                j2 = j3;
                contentLength = i13;
                i3Var2 = r1;
                fileOutputStream3 = fileOutputStream4;
                inputStream = r13;
                inputStream3 = inputStream4;
            } catch (Throwable th8) {
                httpURLConnection = httpURLConnection4;
                inputStream = r13;
                th2 = th8;
                try {
                    throw th2;
                } catch (Throwable th9) {
                    try {
                        q10.g(fileOutputStream, th2);
                        throw th9;
                    } catch (Throwable th10) {
                        th = th10;
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th11) {
                            q10.g(inputStream, th);
                            throw th11;
                        }
                    }
                }
            }
            try {
                try {
                    int i14 = i12;
                    httpURLConnection = httpURLConnection4;
                    inputStream2 = inputStream3;
                    j = j2;
                    i2 = i14;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream2.write(bArr, 0, hi0Var.d);
                    read = inputStream2.read(bArr);
                    hi0Var.d = read;
                    i3Var3 = i3Var6;
                    if (read == -1) {
                        int i15 = i2;
                        int i16 = i;
                        j2 = j + read;
                        if (contentLength > 0) {
                            float f = j2 / contentLength;
                            nq nqVar = nr.a;
                            rz rzVar = f80.a;
                            vn vnVar2 = vnVar;
                            c11 c11Var = new c11(i3Var2, f, null);
                            this.d = httpURLConnection;
                            this.e = file;
                            this.f = inputStream;
                            this.g = i3Var2;
                            this.h = inputStream2;
                            this.i = closeable;
                            this.j = r12;
                            this.k = bArr;
                            this.l = hi0Var;
                            this.m = contentLength;
                            this.n = i15;
                            i3 = i16;
                            this.o = i3;
                            this.r = j2;
                            inputStream3 = inputStream2;
                            this.t = 1;
                            Object H = p01.H(rzVar, c11Var, this);
                            vnVar = vnVar2;
                            if (H != vnVar) {
                                httpURLConnection4 = httpURLConnection;
                                i12 = i15;
                                fileOutputStream3 = r12;
                                int i142 = i12;
                                httpURLConnection = httpURLConnection4;
                                inputStream2 = inputStream3;
                                j = j2;
                                i2 = i142;
                                fileOutputStream2 = fileOutputStream3;
                                i = i3;
                                fileOutputStream2.write(bArr, 0, hi0Var.d);
                                i3Var6 = i3Var3;
                                r12 = fileOutputStream2;
                                read = inputStream2.read(bArr);
                                hi0Var.d = read;
                                i3Var3 = i3Var6;
                                if (read == -1) {
                                    try {
                                        q10.g(closeable, null);
                                        try {
                                            try {
                                                q10.g(inputStream, null);
                                                r2 = i3Var3;
                                            } catch (Throwable th12) {
                                                th = th12;
                                                httpURLConnection2 = httpURLConnection;
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            r2 = i3Var3;
                                            httpURLConnection2 = httpURLConnection;
                                            r2.invoke("An error occurred: " + e.getMessage());
                                            Integer num = new Integer(Log.e(str, "Download/Install error", e));
                                            if (httpURLConnection2 != null) {
                                            }
                                            return num;
                                        }
                                        try {
                                            r2.invoke("Download complete. Installing…");
                                            i3Var.invoke(new Float(1.0f));
                                            zj0 zj0Var = zj0.a;
                                            this.d = httpURLConnection;
                                            this.e = file;
                                            this.f = null;
                                            this.g = null;
                                            this.h = null;
                                            this.i = null;
                                            this.j = null;
                                            this.k = null;
                                            this.l = null;
                                            this.m = contentLength;
                                            this.t = 2;
                                            b = zj0.b(this);
                                            if (b != vnVar) {
                                                file2 = file;
                                                r2 = r2;
                                                if (!((Boolean) b).booleanValue()) {
                                                }
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            httpURLConnection2 = httpURLConnection;
                                            r2.invoke("An error occurred: " + e.getMessage());
                                            Integer num2 = new Integer(Log.e(str, "Download/Install error", e));
                                            if (httpURLConnection2 != null) {
                                            }
                                            return num2;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        th = th;
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            i3 = i16;
                            j = j2;
                            i2 = i15;
                            fileOutputStream2 = r12;
                            i = i3;
                            fileOutputStream2.write(bArr, 0, hi0Var.d);
                            i3Var6 = i3Var3;
                            r12 = fileOutputStream2;
                            read = inputStream2.read(bArr);
                            hi0Var.d = read;
                            i3Var3 = i3Var6;
                            if (read == -1) {
                            }
                        }
                    }
                    return vnVar;
                } catch (Throwable th14) {
                    th2 = th14;
                    fileOutputStream = closeable;
                    throw th2;
                }
                i = i3;
            } catch (Throwable th15) {
                th2 = th15;
                fileOutputStream = closeable;
                throw th2;
            }
            i3Var6 = i3Var3;
            r12 = fileOutputStream2;
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        boolean z2 = this.s;
                        int i17 = this.q;
                        i9 = this.p;
                        int i18 = this.o;
                        i8 = this.n;
                        i7 = this.m;
                        File file9 = (File) this.i;
                        File[] fileArr2 = (File[]) this.g;
                        File file10 = (File) this.f;
                        File file11 = this.e;
                        HttpURLConnection httpURLConnection5 = this.d;
                        try {
                            p10.Q(obj);
                            context = context2;
                            fileArr = fileArr2;
                            obj2 = obj;
                            file4 = file9;
                            i6 = i17;
                            file6 = file10;
                            httpURLConnection = httpURLConnection5;
                            str4 = "\"";
                            str3 = "UpdateManager";
                            r2 = i3Var6;
                            i5 = i18;
                            file5 = file11;
                            z = z2;
                            if (((Boolean) obj2).booleanValue()) {
                            }
                        } catch (Exception e6) {
                            e = e6;
                            httpURLConnection2 = httpURLConnection5;
                        } catch (Throwable th16) {
                            th = th16;
                            httpURLConnection2 = httpURLConnection5;
                        }
                    } else {
                        if (i10 != 5) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i19 = this.p;
                        int i20 = this.o;
                        i8 = this.n;
                        i7 = this.m;
                        File[] fileArr3 = (File[]) this.g;
                        file6 = (File) this.f;
                        File file12 = this.e;
                        HttpURLConnection httpURLConnection6 = this.d;
                        try {
                            p10.Q(obj);
                            str = "UpdateManager";
                            context = context2;
                            i3Var4 = i3Var6;
                            fileArr = fileArr3;
                            i5 = i20;
                            file5 = file12;
                            i9 = i19;
                            str4 = "\"";
                            File file13 = file5;
                            externalStoragePublicDirectory = file6;
                            file2 = file13;
                            int i21 = i7;
                            length = i9;
                            contentLength = i21;
                            File[] fileArr4 = fileArr;
                            i4 = i8;
                            listFiles = fileArr4;
                            httpURLConnection = httpURLConnection6;
                            i5++;
                            str3 = str;
                            r2 = i3Var4;
                            if (i5 < length) {
                                File file14 = listFiles[i5];
                                z = file14.delete();
                                if (z) {
                                    i3Var4 = r2;
                                    str = str3;
                                    i5++;
                                    str3 = str;
                                    r2 = i3Var4;
                                    if (i5 < length) {
                                    }
                                } else {
                                    zj0 zj0Var2 = zj0.a;
                                    this.d = httpURLConnection;
                                    this.e = file2;
                                    this.f = externalStoragePublicDirectory;
                                    this.g = listFiles;
                                    this.h = null;
                                    this.i = file14;
                                    this.m = contentLength;
                                    this.n = i4;
                                    this.o = i5;
                                    this.p = length;
                                    this.q = 0;
                                    this.s = z;
                                    this.t = 4;
                                    obj2 = zj0.b(this);
                                    if (obj2 == vnVar) {
                                        return vnVar;
                                    }
                                    File file15 = externalStoragePublicDirectory;
                                    file5 = file2;
                                    file6 = file15;
                                    int i22 = length;
                                    i7 = contentLength;
                                    i9 = i22;
                                    int i23 = i4;
                                    fileArr = listFiles;
                                    i8 = i23;
                                    file4 = file14;
                                    i6 = 0;
                                    r2 = r2;
                                    if (((Boolean) obj2).booleanValue()) {
                                        i3Var4 = r2;
                                        str = str3;
                                        File file16 = file5;
                                        externalStoragePublicDirectory = file6;
                                        file2 = file16;
                                        int i24 = i7;
                                        length = i9;
                                        contentLength = i24;
                                        File[] fileArr5 = fileArr;
                                        i4 = i8;
                                        listFiles = fileArr5;
                                        i5++;
                                        str3 = str;
                                        r2 = i3Var4;
                                        if (i5 < length) {
                                        }
                                    } else {
                                        try {
                                            try {
                                                zj0 zj0Var3 = zj0.a;
                                                String absolutePath = file4.getAbsolutePath();
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("rm -f \"");
                                                sb.append(absolutePath);
                                                sb.append(str4);
                                                String sb2 = sb.toString();
                                                this.d = httpURLConnection;
                                                this.e = file5;
                                                this.f = file6;
                                                this.g = fileArr;
                                                this.h = null;
                                                this.i = null;
                                                this.m = i7;
                                                this.n = i8;
                                                this.o = i5;
                                                this.p = i9;
                                                this.q = i6;
                                                this.s = z;
                                                this.t = 5;
                                                if (zj0.c(sb2, false, this) != vnVar) {
                                                    httpURLConnection6 = httpURLConnection;
                                                    File file132 = file5;
                                                    externalStoragePublicDirectory = file6;
                                                    file2 = file132;
                                                    int i212 = i7;
                                                    length = i9;
                                                    contentLength = i212;
                                                    File[] fileArr42 = fileArr;
                                                    i4 = i8;
                                                    listFiles = fileArr42;
                                                    httpURLConnection = httpURLConnection6;
                                                    i5++;
                                                    str3 = str;
                                                    r2 = i3Var4;
                                                    if (i5 < length) {
                                                    }
                                                }
                                                return vnVar;
                                            } catch (Exception e7) {
                                                e = e7;
                                                httpURLConnection2 = httpURLConnection;
                                                r2 = i3Var4;
                                                r2.invoke("An error occurred: " + e.getMessage());
                                                Integer num22 = new Integer(Log.e(str, "Download/Install error", e));
                                                if (httpURLConnection2 != null) {
                                                }
                                                return num22;
                                            }
                                            i3Var4 = r2;
                                        } catch (Exception e8) {
                                            e = e8;
                                            httpURLConnection2 = httpURLConnection;
                                            r2.invoke("An error occurred: " + e.getMessage());
                                            Integer num222 = new Integer(Log.e(str, "Download/Install error", e));
                                            if (httpURLConnection2 != null) {
                                            }
                                            return num222;
                                        }
                                        str = str3;
                                    }
                                }
                            }
                            i3Var4 = r2;
                            str = str3;
                            httpURLConnection2 = httpURLConnection;
                            try {
                                File file17 = new File(externalStoragePublicDirectory, "singularity-update-" + System.currentTimeMillis() + ".apk");
                                uv.J(file2, file17, false);
                                file2.delete();
                                Context context3 = context;
                                Uri c2 = FileProvider.c(context3, context.getPackageName() + ".provider", file17);
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setDataAndType(c2, "application/vnd.android.package-archive");
                                intent.addFlags(268435457);
                                intent.setClassName("com.android.packageinstaller", "com.android.packageinstaller.InstallStart");
                                context3.startActivity(intent);
                                i3Var4.invoke("Prompting system installer…");
                                w01 w01Var = w01.a;
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                return w01Var;
                            } catch (Exception e9) {
                                e = e9;
                                r2 = i3Var4;
                                r2.invoke("An error occurred: " + e.getMessage());
                                Integer num2222 = new Integer(Log.e(str, "Download/Install error", e));
                                if (httpURLConnection2 != null) {
                                }
                                return num2222;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            str = "UpdateManager";
                            r2 = i3Var6;
                            httpURLConnection2 = httpURLConnection6;
                        } catch (Throwable th17) {
                            th = th17;
                            httpURLConnection2 = httpURLConnection6;
                        }
                    }
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
                file3 = this.e;
                httpURLConnection2 = this.d;
                try {
                    p10.Q(obj);
                    c = obj;
                    str = "UpdateManager";
                    r2 = i3Var6;
                    try {
                        str5 = (String) c;
                        file3.delete();
                        if (q10.b(ds0.E0(str5).toString(), "Success")) {
                            r2.invoke("Installation failed (root). See logs for details.");
                            str6 = str;
                            try {
                                Log.e(str6, "Install failed: " + str5);
                            } catch (Exception e11) {
                                e = e11;
                                str = str6;
                            }
                        } else {
                            str6 = str;
                        }
                        w01 w01Var2 = w01.a;
                        if (httpURLConnection2 != null) {
                        }
                        return w01Var2;
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
                str = "UpdateManager";
                r2 = i3Var6;
                r2.invoke("An error occurred: " + e.getMessage());
                Integer num22222 = new Integer(Log.e(str, "Download/Install error", e));
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return num22222;
            }
            int i25 = this.m;
            file2 = this.e;
            HttpURLConnection httpURLConnection7 = this.d;
            try {
                p10.Q(obj);
                str = "UpdateManager";
                str2 = "\"";
                httpURLConnection = httpURLConnection7;
                context = context2;
                r2 = i3Var6;
                contentLength = i25;
                b = obj;
                if (!((Boolean) b).booleanValue()) {
                    try {
                        zj0 zj0Var4 = zj0.a;
                        String str7 = "pm install -r \"" + file2.getAbsolutePath() + str2;
                        this.d = httpURLConnection;
                        this.e = file2;
                        this.m = contentLength;
                        this.t = 3;
                        c = zj0.c(str7, false, this);
                        if (c != vnVar) {
                            file3 = file2;
                            httpURLConnection2 = httpURLConnection;
                            r2 = r2;
                            str5 = (String) c;
                            file3.delete();
                            if (q10.b(ds0.E0(str5).toString(), "Success")) {
                            }
                            w01 w01Var22 = w01.a;
                            if (httpURLConnection2 != null) {
                            }
                            return w01Var22;
                        }
                        return vnVar;
                    } catch (Exception e14) {
                        e = e14;
                        httpURLConnection2 = httpURLConnection;
                        r2.invoke("An error occurred: " + e.getMessage());
                        Integer num222222 = new Integer(Log.e(str, "Download/Install error", e));
                        if (httpURLConnection2 != null) {
                        }
                        return num222222;
                    }
                }
                str3 = str;
                str4 = str2;
                try {
                    externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    if (!externalStoragePublicDirectory.exists()) {
                        externalStoragePublicDirectory.mkdirs();
                    }
                    listFiles = externalStoragePublicDirectory.listFiles(new b11());
                    if (listFiles != null) {
                        try {
                            length = listFiles.length;
                            i4 = 0;
                            i5 = 0;
                            r2 = r2;
                            if (i5 < length) {
                            }
                        } catch (Exception e15) {
                            e = e15;
                            str = str3;
                            httpURLConnection2 = httpURLConnection;
                            r2.invoke("An error occurred: " + e.getMessage());
                            Integer num2222222 = new Integer(Log.e(str, "Download/Install error", e));
                            if (httpURLConnection2 != null) {
                            }
                            return num2222222;
                        }
                    }
                    i3Var4 = r2;
                    str = str3;
                    httpURLConnection2 = httpURLConnection;
                    File file172 = new File(externalStoragePublicDirectory, "singularity-update-" + System.currentTimeMillis() + ".apk");
                    uv.J(file2, file172, false);
                    file2.delete();
                    Context context32 = context;
                    Uri c22 = FileProvider.c(context32, context.getPackageName() + ".provider", file172);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setDataAndType(c22, "application/vnd.android.package-archive");
                    intent2.addFlags(268435457);
                    intent2.setClassName("com.android.packageinstaller", "com.android.packageinstaller.InstallStart");
                    context32.startActivity(intent2);
                    i3Var4.invoke("Prompting system installer…");
                    w01 w01Var222 = w01.a;
                    if (httpURLConnection2 != null) {
                    }
                    return w01Var222;
                } catch (Exception e16) {
                    e = e16;
                    str = str3;
                    httpURLConnection2 = httpURLConnection;
                    r2.invoke("An error occurred: " + e.getMessage());
                    Integer num22222222 = new Integer(Log.e(str, "Download/Install error", e));
                    if (httpURLConnection2 != null) {
                    }
                    return num22222222;
                }
            } catch (Exception e17) {
                e = e17;
                str = "UpdateManager";
                httpURLConnection2 = httpURLConnection7;
            } catch (Throwable th18) {
                th = th18;
                httpURLConnection2 = httpURLConnection7;
            }
        }
    }
}

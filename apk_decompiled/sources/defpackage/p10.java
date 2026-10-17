package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewParent;
import com.lumi.singularity.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class p10 {
    public static c8 f;
    public static final ox i;
    public static final ox j;
    public static final i11 a = i11.e;
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] d = new Object[0];
    public static final c8 e = new c8(null, null, null);
    public static final byte[] g = {112, 114, 111, 0};
    public static final byte[] h = {112, 114, 109, 0};

    static {
        int i2 = 4;
        i = new ox("NONE", i2);
        j = new ox("PENDING", i2);
    }

    public p10(p01 p01Var) {
        new Rect();
    }

    public static int[] D(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) y80.M(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static ir[] E(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, ir[] irVarArr) {
        byte[] bArr3 = q10.m;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, q10.n)) {
                o.f("Unsupported meta version");
                return null;
            }
            int M = (int) y80.M(fileInputStream, 2);
            byte[] L = y80.L(fileInputStream, (int) y80.M(fileInputStream, 4), (int) y80.M(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                o.f("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(L);
            try {
                ir[] G = G(byteArrayInputStream, bArr2, M, irVarArr);
                byteArrayInputStream.close();
                return G;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(q10.h, bArr2)) {
            o.f("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            o.f("Unsupported meta version");
            return null;
        }
        int M2 = (int) y80.M(fileInputStream, 1);
        byte[] L2 = y80.L(fileInputStream, (int) y80.M(fileInputStream, 4), (int) y80.M(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            o.f("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(L2);
        try {
            ir[] F = F(byteArrayInputStream2, M2, irVarArr);
            byteArrayInputStream2.close();
            return F;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static ir[] F(ByteArrayInputStream byteArrayInputStream, int i2, ir[] irVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new ir[0];
        }
        if (i2 != irVarArr.length) {
            o.f("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int M = (int) y80.M(byteArrayInputStream, 2);
            iArr[i3] = (int) y80.M(byteArrayInputStream, 2);
            strArr[i3] = new String(y80.K(byteArrayInputStream, M), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ir irVar = irVarArr[i4];
            if (!irVar.b.equals(strArr[i4])) {
                o.f("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            irVar.e = i5;
            irVar.h = D(byteArrayInputStream, i5);
        }
        return irVarArr;
    }

    public static ir[] G(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, ir[] irVarArr) {
        ir irVar;
        if (byteArrayInputStream.available() == 0) {
            return new ir[0];
        }
        if (i2 != irVarArr.length) {
            o.f("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            y80.M(byteArrayInputStream, 2);
            String str = new String(y80.K(byteArrayInputStream, (int) y80.M(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long M = y80.M(byteArrayInputStream, 4);
            int M2 = (int) y80.M(byteArrayInputStream, 2);
            if (irVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i4 = 0; i4 < irVarArr.length; i4++) {
                    if (irVarArr[i4].b.equals(substring)) {
                        irVar = irVarArr[i4];
                        break;
                    }
                }
            }
            irVar = null;
            if (irVar == null) {
                o.f("Missing profile key: ".concat(str));
                return null;
            }
            irVar.d = M;
            int[] D = D(byteArrayInputStream, M2);
            if (Arrays.equals(bArr, q10.l)) {
                irVar.e = M2;
                irVar.h = D;
            }
        }
        return irVarArr;
    }

    public static ir[] H(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, q10.i)) {
            o.f("Unsupported version");
            return null;
        }
        int M = (int) y80.M(fileInputStream, 1);
        byte[] L = y80.L(fileInputStream, (int) y80.M(fileInputStream, 4), (int) y80.M(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            o.f("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(L);
        try {
            ir[] I = I(byteArrayInputStream, str, M);
            byteArrayInputStream.close();
            return I;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static ir[] I(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new ir[0];
        }
        ir[] irVarArr = new ir[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int M = (int) y80.M(byteArrayInputStream, 2);
            int M2 = (int) y80.M(byteArrayInputStream, 2);
            irVarArr[i4] = new ir(str, new String(y80.K(byteArrayInputStream, M), StandardCharsets.UTF_8), y80.M(byteArrayInputStream, 4), M2, (int) y80.M(byteArrayInputStream, 4), (int) y80.M(byteArrayInputStream, 4), new int[M2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            ir irVar = irVarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = irVar.f;
            int i7 = irVar.g;
            TreeMap treeMap = irVar.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) y80.M(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int M3 = (int) y80.M(byteArrayInputStream, 2);
                while (M3 > 0) {
                    y80.M(byteArrayInputStream, 2);
                    int M4 = (int) y80.M(byteArrayInputStream, 1);
                    if (M4 != 6 && M4 != 7) {
                        while (M4 > 0) {
                            y80.M(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int M5 = (int) y80.M(byteArrayInputStream, 1); M5 > 0; M5--) {
                                y80.M(byteArrayInputStream, 2);
                            }
                            M4--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    M3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                o.f("Read too much data during profile line parse");
                return null;
            }
            irVar.h = D(byteArrayInputStream, irVar.e);
            BitSet valueOf = BitSet.valueOf(y80.K(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return irVarArr;
    }

    public static final void J(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static je K(Context context, Uri uri, File file) {
        Uri uri2;
        String str;
        InputStream openInputStream;
        FileOutputStream fileOutputStream;
        Cursor query;
        context.getClass();
        String str2 = null;
        try {
            uri2 = uri;
            try {
                query = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            uri2 = uri;
        }
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex("_display_name");
                str = (columnIndex < 0 || !query.moveToFirst()) ? null : query.getString(columnIndex);
                query.close();
                if (str == null && (str = uri2.getLastPathSegment()) == null) {
                    str = "";
                }
                file.mkdirs();
                if (!ks0.Z(str, ".zip", true)) {
                    openInputStream = context.getContentResolver().openInputStream(uri2);
                    if (openInputStream == null) {
                        throw new ke("Could not open the selected zip file");
                    }
                    try {
                        ZipInputStream zipInputStream = new ZipInputStream(openInputStream);
                        try {
                            boolean z = false;
                            String str3 = null;
                            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                                String name = nextEntry.getName();
                                name.getClass();
                                String z0 = ds0.z0(name);
                                if (!nextEntry.isDirectory() && z0.length() > 0) {
                                    if (ks0.Z(z0, ".glb", true)) {
                                        fileOutputStream = new FileOutputStream(new File(file, z0));
                                        try {
                                            q10.k(zipInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            str2 = z0;
                                        } finally {
                                        }
                                    } else if (z0.equalsIgnoreCase("StartupSoundOverlay.apk")) {
                                        fileOutputStream = new FileOutputStream(new File(file, "StartupSoundOverlay.apk"));
                                        try {
                                            q10.k(zipInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            z = true;
                                        } finally {
                                        }
                                    } else if (z0.equalsIgnoreCase("bootanimation.txt")) {
                                        str3 = new String(q10.z(zipInputStream), rh.a);
                                    }
                                }
                                zipInputStream.closeEntry();
                            }
                            zipInputStream.close();
                            openInputStream.close();
                            if (str2 == null) {
                                throw new ke("This zip is missing a .glb boot animation file");
                            }
                            if (str3 != null) {
                                return new je(r(str3, "name"), r(str3, "author"), str2, z);
                            }
                            throw new ke("This zip is missing bootanimation.txt");
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    if (!ks0.Z(str, ".glb", true)) {
                        throw new ke("Please select a .glb file or a .zip boot animation pack");
                    }
                    File file2 = new File(file, str);
                    openInputStream = context.getContentResolver().openInputStream(uri2);
                    if (openInputStream == null) {
                        throw new ke("Could not open the selected file");
                    }
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                        try {
                            q10.k(openInputStream, fileOutputStream);
                            fileOutputStream.close();
                            openInputStream.close();
                            return new je(null, null, str, false);
                        } finally {
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
        str = null;
        if (str == null) {
            str = "";
        }
        file.mkdirs();
        if (!ks0.Z(str, ".zip", true)) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String N(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final ai0 O(pw pwVar, zl zlVar, tr0 tr0Var, Float f2) {
        zg.b.getClass();
        yg ygVar = yg.a;
        bg bgVar = new bg(pwVar, st.d);
        wr0 b2 = b(f2);
        kn knVar = (kn) bgVar.b;
        iw iwVar = (iw) bgVar.a;
        xn xnVar = tr0Var.equals(ep0.a) ? xn.d : xn.g;
        x2 x2Var = new x2(tr0Var, iwVar, b2, f2, null, 5);
        kn w = p01.w(zlVar, knVar);
        k f40Var = xnVar == xn.e ? new f40(w, x2Var) : new rr0(w, true);
        f40Var.Z(xnVar, f40Var, x2Var);
        return new ai0(b2);
    }

    public static final String P(Object[] objArr, int i2, int i3, x xVar) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == xVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final void Q(Object obj) {
        if (obj instanceof jj0) {
            throw ((jj0) obj).d;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean R(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, ir[] irVarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = q10.l;
        byte[] bArr3 = q10.k;
        byte[] bArr4 = q10.h;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = q10.i;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] o = o(irVarArr, bArr5);
                y80.Y(byteArrayOutputStream, irVarArr.length, 1);
                y80.Y(byteArrayOutputStream, o.length, 4);
                byte[] l = y80.l(o);
                y80.Y(byteArrayOutputStream, l.length, 4);
                byteArrayOutputStream.write(l);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                y80.Y(byteArrayOutputStream, irVarArr.length, 1);
                for (ir irVar : irVarArr) {
                    int size = irVar.i.size() * 4;
                    String s = s(irVar.a, irVar.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    y80.Z(byteArrayOutputStream, s.getBytes(charset).length);
                    y80.Z(byteArrayOutputStream, irVar.h.length);
                    y80.Y(byteArrayOutputStream, size, 4);
                    y80.Y(byteArrayOutputStream, irVar.c, 4);
                    byteArrayOutputStream.write(s.getBytes(charset));
                    Iterator it = irVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        y80.Z(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        y80.Z(byteArrayOutputStream, 0);
                    }
                    for (int i4 : irVar.h) {
                        y80.Z(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = q10.j;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] o2 = o(irVarArr, bArr6);
                y80.Y(byteArrayOutputStream, irVarArr.length, 1);
                y80.Y(byteArrayOutputStream, o2.length, 4);
                byte[] l2 = y80.l(o2);
                y80.Y(byteArrayOutputStream, l2.length, 4);
                byteArrayOutputStream.write(l2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            y80.Z(byteArrayOutputStream, irVarArr.length);
            for (ir irVar2 : irVarArr) {
                String str = irVar2.a;
                TreeMap treeMap = irVar2.i;
                String s2 = s(str, irVar2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                y80.Z(byteArrayOutputStream, s2.getBytes(charset2).length);
                y80.Z(byteArrayOutputStream, treeMap.size());
                y80.Z(byteArrayOutputStream, irVar2.h.length);
                y80.Y(byteArrayOutputStream, irVar2.c, 4);
                byteArrayOutputStream.write(s2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    y80.Z(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : irVar2.h) {
                    y80.Z(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            y80.Z(byteArrayOutputStream2, irVarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (ir irVar3 : irVarArr) {
                y80.Y(byteArrayOutputStream2, irVar3.c, 4);
                y80.Y(byteArrayOutputStream2, irVar3.d, 4);
                y80.Y(byteArrayOutputStream2, irVar3.g, 4);
                String s3 = s(irVar3.a, irVar3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = s3.getBytes(charset3).length;
                y80.Z(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(s3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            b41 b41Var = new b41(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(b41Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < irVarArr.length) {
                try {
                    ir irVar4 = irVarArr[i8];
                    y80.Z(byteArrayOutputStream3, i8);
                    y80.Z(byteArrayOutputStream3, irVar4.e);
                    i9 = i9 + 4 + (irVar4.e * i6);
                    int[] iArr = irVar4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        y80.Z(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            b41 b41Var2 = new b41(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(b41Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < irVarArr.length; i14++) {
                try {
                    ir irVar5 = irVarArr[i14];
                    Iterator it3 = irVar5.i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        U(byteArrayOutputStream4, i15, irVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            V(byteArrayOutputStream4, irVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            y80.Z(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i13 + 6;
                            y80.Y(byteArrayOutputStream3, length4, 4);
                            y80.Z(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i16 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            b41 b41Var3 = new b41(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(b41Var3);
            long size2 = 12 + (arrayList.size() * 16);
            y80.Y(byteArrayOutputStream, arrayList.size(), 4);
            int i17 = 0;
            while (i17 < arrayList.size()) {
                b41 b41Var4 = (b41) arrayList.get(i17);
                int i18 = b41Var4.a;
                byte[] bArr7 = b41Var4.b;
                if (i18 != 1) {
                    i2 = i12;
                    if (i18 == i2) {
                        j2 = 1;
                    } else if (i18 == 3) {
                        j2 = 2;
                    } else if (i18 == 4) {
                        j2 = 3;
                    } else {
                        if (i18 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                y80.Y(byteArrayOutputStream, j2, 4);
                y80.Y(byteArrayOutputStream, size2, 4);
                if (b41Var4.c) {
                    long length5 = bArr7.length;
                    byte[] l3 = y80.l(bArr7);
                    arrayList2.add(l3);
                    y80.Y(byteArrayOutputStream, l3.length, 4);
                    y80.Y(byteArrayOutputStream, length5, 4);
                    length = l3.length;
                } else {
                    arrayList2.add(bArr7);
                    y80.Y(byteArrayOutputStream, bArr7.length, 4);
                    y80.Y(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                i12 = i2;
            }
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i19));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void S(ByteArrayOutputStream byteArrayOutputStream, ir irVar) {
        V(byteArrayOutputStream, irVar);
        int i2 = irVar.g;
        int[] iArr = irVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            y80.Z(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : irVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void T(ByteArrayOutputStream byteArrayOutputStream, ir irVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        y80.Z(byteArrayOutputStream, str.getBytes(charset).length);
        y80.Z(byteArrayOutputStream, irVar.e);
        y80.Y(byteArrayOutputStream, irVar.f, 4);
        y80.Y(byteArrayOutputStream, irVar.c, 4);
        y80.Y(byteArrayOutputStream, irVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void U(ByteArrayOutputStream byteArrayOutputStream, int i2, ir irVar) {
        int i3 = irVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : irVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void V(ByteArrayOutputStream byteArrayOutputStream, ir irVar) {
        int i2 = 0;
        for (Map.Entry entry : irVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                y80.Z(byteArrayOutputStream, intValue - i2);
                y80.Z(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static final zl a(kn knVar) {
        if (knVar.get(ts.l) == null) {
            knVar = knVar.plus(new b20(null));
        }
        return new zl(knVar);
    }

    public static final wr0 b(Object obj) {
        if (obj == null) {
            obj = y80.e;
        }
        return new wr0(obj);
    }

    public static void c(StringBuilder sb, Object obj, ky kyVar) {
        if (kyVar != null) {
            sb.append((CharSequence) kyVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(gg0 gg0Var, rn0 rn0Var, im imVar) {
        fg0 fg0Var;
        int i2;
        try {
            if (imVar instanceof fg0) {
                fg0Var = (fg0) imVar;
                int i3 = fg0Var.f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fg0Var.f = i3 - Integer.MIN_VALUE;
                    Object obj = fg0Var.e;
                    i2 = fg0Var.f;
                    int i4 = 1;
                    if (i2 != 0) {
                        Q(obj);
                        if (fg0Var.getContext().get(ts.l) != gg0Var) {
                            o.f("awaitClose() can only be invoked from the producer context");
                            return null;
                        }
                        fg0Var.d = rn0Var;
                        fg0Var.f = 1;
                        gg ggVar = new gg(1, d41.C(fg0Var));
                        ggVar.u();
                        gg0Var.a0(new ab(ggVar, i4));
                        Object s = ggVar.s();
                        vn vnVar = vn.d;
                        if (s == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i2 != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rn0Var = fg0Var.d;
                        Q(obj);
                    }
                    rn0Var.invoke();
                    return w01.a;
                }
            }
            if (i2 != 0) {
            }
            rn0Var.invoke();
            return w01.a;
        } catch (Throwable th) {
            rn0Var.invoke();
            throw th;
        }
        fg0Var = new fg0(imVar);
        Object obj2 = fg0Var.e;
        i2 = fg0Var.f;
        int i42 = 1;
    }

    public static final int e(int[] iArr, int i2, int i3) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int f(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final Bundle g(xe0... xe0VarArr) {
        Bundle bundle = new Bundle(xe0VarArr.length);
        for (xe0 xe0Var : xe0VarArr) {
            String str = (String) xe0Var.d;
            Object obj = xe0Var.e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final void h(un unVar, CancellationException cancellationException) {
        z10 z10Var = (z10) unVar.getCoroutineContext().get(ts.l);
        if (z10Var != null) {
            z10Var.cancel(cancellationException);
        } else {
            o.p(unVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String l(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static long m(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final Object n(my myVar, hm hmVar) {
        tl0 tl0Var = new tl0(hmVar, hmVar.getContext());
        return y80.S(tl0Var, tl0Var, myVar);
    }

    public static byte[] o(ir[] irVarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (ir irVar : irVarArr) {
            i3 += ((((irVar.g * 2) + 7) & (-8)) / 8) + (irVar.e * 2) + s(irVar.a, irVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + irVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, q10.j)) {
            int length = irVarArr.length;
            while (i2 < length) {
                ir irVar2 = irVarArr[i2];
                T(byteArrayOutputStream, irVar2, s(irVar2.a, irVar2.b, bArr));
                S(byteArrayOutputStream, irVar2);
                i2++;
            }
        } else {
            for (ir irVar3 : irVarArr) {
                T(byteArrayOutputStream, irVar3, s(irVar3.a, irVar3.b, bArr));
            }
            int length2 = irVarArr.length;
            while (i2 < length2) {
                S(byteArrayOutputStream, irVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static final jj0 p(Throwable th) {
        th.getClass();
        return new jj0(th);
    }

    public static p10 q(p01 p01Var, int i2) {
        if (i2 == 0) {
            return new zd0(p01Var);
        }
        if (i2 == 1) {
            return new zd0(p01Var);
        }
        o.m("invalid orientation");
        return null;
    }

    public static String r(String str, String str2) {
        String str3;
        Pattern compile = Pattern.compile("\"" + str2 + "\"\\s*:\\s*\"([^\"]*)\"", 66);
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        u80 n = cq.n(matcher, 0, str);
        if (n == null || (str3 = (String) ((s80) n.a()).get(1)) == null || ds0.n0(str3)) {
            return null;
        }
        return str3;
    }

    public static String s(String str, String str2, byte[] bArr) {
        byte[] bArr2 = q10.k;
        byte[] bArr3 = q10.l;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class t(ji jiVar) {
        Class cls = jiVar.d;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    public static final ViewParent u(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static boolean v(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final int w(zb zbVar, Object obj, int i2) {
        int i3 = zbVar.f;
        if (i3 == 0) {
            return -1;
        }
        try {
            int e2 = e(zbVar.d, i3, i2);
            if (e2 < 0 || q10.b(obj, zbVar.e[e2])) {
                return e2;
            }
            int i4 = e2 + 1;
            while (i4 < i3 && zbVar.d[i4] == i2) {
                if (q10.b(obj, zbVar.e[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = e2 - 1; i5 >= 0 && zbVar.d[i5] == i2; i5--) {
                if (q10.b(obj, zbVar.e[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            o.a();
            return 0;
        }
    }

    public static final boolean x(un unVar) {
        z10 z10Var = (z10) unVar.getCoroutineContext().get(ts.l);
        if (z10Var != null) {
            return z10Var.isActive();
        }
        return true;
    }

    public static bo0 y(my myVar) {
        bo0 bo0Var = new bo0();
        bo0Var.f = d41.g(bo0Var, bo0Var, myVar);
        return bo0Var;
    }

    public abstract void A(f90 f90Var);

    public abstract void B(h0 h0Var, h0 h0Var2);

    public abstract void C(h0 h0Var, Thread thread);

    public abstract void L(boolean z);

    public abstract void M(boolean z);

    public abstract boolean i(i0 i0Var, e0 e0Var);

    public abstract boolean j(i0 i0Var, Object obj, Object obj2);

    public abstract boolean k(i0 i0Var, h0 h0Var, h0 h0Var2);

    public abstract void z(Throwable th);
}

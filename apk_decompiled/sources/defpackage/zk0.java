package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class zk0 implements z11, jn {
    public static zk0 e;
    public final /* synthetic */ int d;

    public /* synthetic */ zk0(int i) {
        this.d = i;
    }

    public static Typeface d(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily f = f((fy[]) list.get(0), contentResolver);
            if (f == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(f);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily f2 = f((fy[]) list.get(i2), contentResolver);
                if (f2 != null) {
                    customFallbackBuilder.addCustomFallback(f2);
                }
            }
            return customFallbackBuilder.setStyle(e(f, i).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    public static Font e(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int g = g(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int g2 = g(fontStyle, font2.getStyle());
            if (g2 < g) {
                font = font2;
                g = g2;
            }
        }
        return font;
    }

    public static FontFamily f(fy[] fyVarArr, ContentResolver contentResolver) {
        int i;
        ParcelFileDescriptor openFileDescriptor;
        int length = fyVarArr.length;
        FontFamily.Builder builder = null;
        while (i < length) {
            fy fyVar = fyVarArr[i];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(fyVar.a, "r", null);
            } catch (IOException e2) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            }
            if (openFileDescriptor == null) {
                i = openFileDescriptor == null ? i + 1 : 0;
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(fyVar.c).setSlant(fyVar.d ? 1 : 0).setTtcIndex(fyVar.b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int g(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.z11
    public w11 a(Class cls) {
        return q10.m(cls);
    }

    @Override // defpackage.z11
    public w11 b(Class cls, ja0 ja0Var) {
        return a(cls);
    }

    @Override // defpackage.z11
    public w11 c(ji jiVar, ja0 ja0Var) {
        Class cls = jiVar.d;
        cls.getClass();
        return b(cls, ja0Var);
    }

    public String toString() {
        switch (this.d) {
            case 4:
                return "SharingStarted.Eagerly";
            case 5:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class fj0 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, ej0 ej0Var, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            Typeface typeface2 = (Typeface) q01.b.a(q01.d(resources, i, charSequence2, typedValue.assetCookie, i2));
            if (typeface2 != null) {
                if (ej0Var != null) {
                    ej0Var.callbackSuccessAsync(typeface2, null);
                }
                typeface = typeface2;
            } else {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        zx y = q10.y(resources.getXml(i), resources);
                        if (y == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (ej0Var != null) {
                                ej0Var.callbackFailAsync(-3, null);
                            }
                        } else {
                            typeface = q01.b(context, y, resources, i, charSequence2, typedValue.assetCookie, i2, ej0Var, z);
                        }
                    } else {
                        Typeface c2 = q01.c(resources, i, charSequence2, typedValue.assetCookie, i2);
                        if (ej0Var != null) {
                            if (c2 != null) {
                                ej0Var.callbackSuccessAsync(c2, null);
                            } else {
                                ej0Var.callbackFailAsync(-3, null);
                            }
                        }
                        typeface = c2;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    if (ej0Var != null) {
                        ej0Var.callbackFailAsync(-3, null);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    if (ej0Var != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (ej0Var != null) {
            ej0Var.callbackFailAsync(-3, null);
        }
        if (typeface == null || ej0Var != null) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}

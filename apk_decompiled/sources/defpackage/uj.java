package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class uj {
    public final Shader a;
    public final int b;

    public uj(Shader shader, int i) {
        this.a = shader;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e7, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static uj a(Resources resources, int i, Resources.Theme theme) {
        int next;
        int i2;
        int i3;
        float f;
        float f2;
        Shader radialGradient;
        int i4;
        TypedArray obtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new uj(null, ej.b(resources, xml, asAttributeSet, theme).getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = sh0.d;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? obtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? obtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? obtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? obtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? obtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? obtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? obtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? obtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? obtainAttributes.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            i2 = 0;
            i3 = obtainAttributes.getColor(1, 0);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i6 = 1;
        int i7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? obtainAttributes.getInt(6, i2) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? obtainAttributes.getFloat(5, 0.0f) : 0.0f;
        obtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f3;
            if (next2 == i6) {
                f2 = f4;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f4;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = sh0.e;
                if (theme == null) {
                    obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                    i4 = 0;
                } else {
                    i4 = 0;
                    obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                }
                boolean hasValue = obtainStyledAttributes.hasValue(i4);
                boolean hasValue2 = obtainStyledAttributes.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = obtainStyledAttributes.getColor(0, 0);
                float f11 = obtainStyledAttributes.getFloat(1, 0.0f);
                obtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f11));
            }
            f3 = f;
            f4 = f2;
            i6 = 1;
        }
        bg bgVar = arrayList2.size() > 0 ? new bg(arrayList2, arrayList) : null;
        if (bgVar == null) {
            bgVar = z ? new bg(color, color2, i3) : new bg(color, i3);
        }
        if (i5 != 1) {
            if (i5 != 2) {
                radialGradient = new LinearGradient(f, f2, f5, f6, (int[]) bgVar.a, (float[]) bgVar.b, i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) bgVar.a, (float[]) bgVar.b);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f7, f8, f10, (int[]) bgVar.a, (float[]) bgVar.b, i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        return new uj(radialGradient, 0);
    }
}

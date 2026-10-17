package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.compose.ui.graphics.vector.PathParser;
import defpackage.dq;
import defpackage.ej;
import defpackage.fc;
import defpackage.p10;
import defpackage.q10;
import defpackage.uj;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidVectorParser {
    public static final int $stable = 8;
    private int config;
    public final PathParser pathParser;
    private final XmlPullParser xmlParser;

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i) {
        this.xmlParser = xmlPullParser;
        this.config = i;
        this.pathParser = new PathParser();
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i2 & 2) != 0) {
            i = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i);
    }

    private final void updateConfig(int i) {
        this.config = i | this.config;
    }

    public final XmlPullParser component1() {
        return this.xmlParser;
    }

    public final int component2() {
        return this.config;
    }

    public final AndroidVectorParser copy(XmlPullParser xmlPullParser, int i) {
        return new AndroidVectorParser(xmlPullParser, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return q10.b(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public final int getConfig() {
        return this.config;
    }

    public final float getDimension(TypedArray typedArray, int i, float f) {
        float dimension = typedArray.getDimension(i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(TypedArray typedArray, int i, float f) {
        float f2 = typedArray.getFloat(i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return f2;
    }

    public final int getInt(TypedArray typedArray, int i, int i2) {
        int i3 = typedArray.getInt(i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return i3;
    }

    public final boolean getNamedBoolean(TypedArray typedArray, String str, int i, boolean z) {
        if (p10.v(this.xmlParser, str)) {
            z = typedArray.getBoolean(i, z);
        }
        updateConfig(typedArray.getChangingConfigurations());
        return z;
    }

    public final ColorStateList getNamedColorStateList(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        ColorStateList colorStateList = null;
        if (p10.v(this.xmlParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
            }
            if (i2 < 28 || i2 > 31) {
                Resources resources = typedArray.getResources();
                int resourceId = typedArray.getResourceId(i, 0);
                ThreadLocal threadLocal = ej.a;
                try {
                    colorStateList = ej.a(resources, resources.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        updateConfig(typedArray.getChangingConfigurations());
        return colorStateList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r6 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uj getNamedComplexColor(TypedArray typedArray, Resources.Theme theme, String str, int i, int i2) {
        uj ujVar;
        if (p10.v(this.xmlParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 < 28 || i3 > 31) {
                try {
                    ujVar = uj.a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    ujVar = null;
                }
            } else {
                ujVar = new uj(null, typedValue.data);
            }
            updateConfig(typedArray.getChangingConfigurations());
            return ujVar;
        }
        ujVar = new uj(null, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return ujVar;
    }

    public final float getNamedFloat(TypedArray typedArray, String str, int i, float f) {
        if (p10.v(this.xmlParser, str)) {
            f = typedArray.getFloat(i, f);
        }
        updateConfig(typedArray.getChangingConfigurations());
        return f;
    }

    public final int getNamedInt(TypedArray typedArray, String str, int i, int i2) {
        if (p10.v(this.xmlParser, str)) {
            i2 = typedArray.getInt(i, i2);
        }
        updateConfig(typedArray.getChangingConfigurations());
        return i2;
    }

    public final String getString(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public int hashCode() {
        return Integer.hashCode(this.config) + (this.xmlParser.hashCode() * 31);
    }

    public final TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        updateConfig(obtainAttributes.getChangingConfigurations());
        return obtainAttributes;
    }

    public final void setConfig(int i) {
        this.config = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.xmlParser);
        sb.append(", config=");
        return fc.e(sb, this.config, ')');
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i, int i2, dq dqVar) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}

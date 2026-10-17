package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.o;
import defpackage.p10;
import defpackage.uj;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    private static final String SHAPE_CLIP_PATH = "clip-path";
    private static final String SHAPE_GROUP = "group";
    private static final String SHAPE_PATH = "path";

    public static final ImageVector.Builder createVectorImageBuilder(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long m4797getUnspecified0d7_KjU;
        int m4699getSrcIn0nO6VwU;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = androidVectorParser.getNamedBoolean(obtainAttributes, "autoMirrored", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "viewportWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "viewportHeight", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (namedFloat2 <= 0.0f) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float dimension = androidVectorParser.getDimension(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
        float dimension2 = androidVectorParser.getDimension(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
        if (obtainAttributes.hasValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
            TypedValue typedValue = new TypedValue();
            obtainAttributes.getValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
            if (typedValue.type == 2) {
                m4797getUnspecified0d7_KjU = Color.Companion.m4797getUnspecified0d7_KjU();
            } else {
                ColorStateList namedColorStateList = androidVectorParser.getNamedColorStateList(obtainAttributes, theme, "tint", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT());
                m4797getUnspecified0d7_KjU = namedColorStateList != null ? ColorKt.Color(namedColorStateList.getDefaultColor()) : Color.Companion.m4797getUnspecified0d7_KjU();
            }
        } else {
            m4797getUnspecified0d7_KjU = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        long j = m4797getUnspecified0d7_KjU;
        int i = androidVectorParser.getInt(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
        if (i == -1) {
            m4699getSrcIn0nO6VwU = BlendMode.Companion.m4699getSrcIn0nO6VwU();
        } else if (i == 3) {
            m4699getSrcIn0nO6VwU = BlendMode.Companion.m4701getSrcOver0nO6VwU();
        } else if (i == 5) {
            m4699getSrcIn0nO6VwU = BlendMode.Companion.m4699getSrcIn0nO6VwU();
        } else if (i != 9) {
            switch (i) {
                case Matrix.TranslateZ /* 14 */:
                    m4699getSrcIn0nO6VwU = BlendMode.Companion.m4690getModulate0nO6VwU();
                    break;
                case 15:
                    m4699getSrcIn0nO6VwU = BlendMode.Companion.m4695getScreen0nO6VwU();
                    break;
                case 16:
                    m4699getSrcIn0nO6VwU = BlendMode.Companion.m4693getPlus0nO6VwU();
                    break;
                default:
                    m4699getSrcIn0nO6VwU = BlendMode.Companion.m4699getSrcIn0nO6VwU();
                    break;
            }
        } else {
            m4699getSrcIn0nO6VwU = BlendMode.Companion.m4698getSrcAtop0nO6VwU();
        }
        int i2 = m4699getSrcIn0nO6VwU;
        float m7611constructorimpl = Dp.m7611constructorimpl(dimension / resources.getDisplayMetrics().density);
        float m7611constructorimpl2 = Dp.m7611constructorimpl(dimension2 / resources.getDisplayMetrics().density);
        obtainAttributes.recycle();
        return new ImageVector.Builder(null, m7611constructorimpl, m7611constructorimpl2, namedFloat, namedFloat2, j, i2, namedBoolean, 1, null);
    }

    /* renamed from: getStrokeLineCap-CSYIeUk, reason: not valid java name */
    private static final int m5528getStrokeLineCapCSYIeUk(int i, int i2) {
        return i != 0 ? i != 1 ? i != 2 ? i2 : StrokeCap.Companion.m5137getSquareKaPHkGw() : StrokeCap.Companion.m5136getRoundKaPHkGw() : StrokeCap.Companion.m5135getButtKaPHkGw();
    }

    /* renamed from: getStrokeLineCap-CSYIeUk$default, reason: not valid java name */
    public static /* synthetic */ int m5529getStrokeLineCapCSYIeUk$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StrokeCap.Companion.m5135getButtKaPHkGw();
        }
        return m5528getStrokeLineCapCSYIeUk(i, i2);
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA, reason: not valid java name */
    private static final int m5530getStrokeLineJoinkLtJ_vA(int i, int i2) {
        return i != 0 ? i != 1 ? i != 2 ? i2 : StrokeJoin.Companion.m5145getBevelLxFBmk8() : StrokeJoin.Companion.m5147getRoundLxFBmk8() : StrokeJoin.Companion.m5146getMiterLxFBmk8();
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA$default, reason: not valid java name */
    public static /* synthetic */ int m5531getStrokeLineJoinkLtJ_vA$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StrokeJoin.Companion.m5146getMiterLxFBmk8();
        }
        return m5530getStrokeLineJoinkLtJ_vA(i, i2);
    }

    public static final boolean isAtEnd(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    private static final Brush obtainBrushFromComplexColor(uj ujVar) {
        Shader shader = ujVar.a;
        int i = ujVar.b;
        if (shader == null && i == 0) {
            return null;
        }
        return shader != null ? BrushKt.ShaderBrush(shader) : new SolidColor(ColorKt.Color(i), null);
    }

    public static final void parseClipPath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA());
        List emptyPath = string2 == null ? VectorKt.getEmptyPath() : PathParser.pathStringToNodes$default(androidVectorParser.pathParser, string2, null, 2, null);
        obtainAttributes.recycle();
        ImageVector.Builder.addGroup$default(builder, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, emptyPath, 254, null);
    }

    public static final int parseCurrentVectorNode(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i) {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !SHAPE_GROUP.equals(androidVectorParser.getXmlParser().getName())) {
                return i;
            }
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                builder.clearGroup();
            }
            return 0;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name == null) {
            return i;
        }
        int hashCode = name.hashCode();
        if (hashCode == -1649314686) {
            if (!name.equals(SHAPE_CLIP_PATH)) {
                return i;
            }
            parseClipPath(androidVectorParser, resources, theme, attributeSet, builder);
            return i + 1;
        }
        if (hashCode == 3433509) {
            if (!name.equals(SHAPE_PATH)) {
                return i;
            }
            parsePath(androidVectorParser, resources, theme, attributeSet, builder);
            return i;
        }
        if (hashCode != 98629247 || !name.equals(SHAPE_GROUP)) {
            return i;
        }
        parseGroup(androidVectorParser, resources, theme, attributeSet, builder);
        return i;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(androidVectorParser, resources, attributeSet, theme, builder, i);
    }

    public static final void parseGroup(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "rotation", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f2 = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "translateX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "translateY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        obtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f, f2, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }

    public static final void parsePath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (!p10.v(androidVectorParser.getXmlParser(), "pathData")) {
            o.m("No path data available");
            return;
        }
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA());
        List<? extends PathNode> emptyPath = string2 == null ? VectorKt.getEmptyPath() : PathParser.pathStringToNodes$default(androidVectorParser.pathParser, string2, null, 2, null);
        uj namedComplexColor = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "fillColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "fillAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
        int m5528getStrokeLineCapCSYIeUk = m5528getStrokeLineCapCSYIeUk(androidVectorParser.getNamedInt(obtainAttributes, "strokeLineCap", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), StrokeCap.Companion.m5135getButtKaPHkGw());
        int m5530getStrokeLineJoinkLtJ_vA = m5530getStrokeLineJoinkLtJ_vA(androidVectorParser.getNamedInt(obtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), StrokeJoin.Companion.m5146getMiterLxFBmk8());
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 4.0f);
        uj namedComplexColor2 = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float namedFloat6 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float namedFloat7 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        int namedInt = androidVectorParser.getNamedInt(obtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
        obtainAttributes.recycle();
        builder.m5493addPathoIyEayM(emptyPath, namedInt == 0 ? PathFillType.Companion.m5058getNonZeroRgk1Os() : PathFillType.Companion.m5057getEvenOddRgk1Os(), str, obtainBrushFromComplexColor(namedComplexColor), namedFloat, obtainBrushFromComplexColor(namedComplexColor2), namedFloat3, namedFloat4, m5528getStrokeLineCapCSYIeUk, m5530getStrokeLineJoinkLtJ_vA, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
    }

    public static final XmlPullParser seekToStartTag(XmlPullParser xmlPullParser) {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}

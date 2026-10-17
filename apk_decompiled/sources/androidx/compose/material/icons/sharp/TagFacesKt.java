package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TagFacesKt {
    private static ImageVector _tagFaces;

    public static final ImageVector getTagFaces(Icons.Sharp sharp) {
        ImageVector imageVector = _tagFaces;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TagFaces", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.01f, 2.0f);
        b.curveTo(6.49f, 2.0f, 2.02f, 6.48f, 2.02f, 12.0f);
        b.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        b.curveToRelative(5.53f, 0.0f, 10.01f, -4.48f, 10.01f, -10.0f);
        b.reflectiveCurveTo(17.54f, 2.0f, 12.01f, 2.0f);
        b.close();
        b.moveTo(12.02f, 20.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        b.close();
        b.moveTo(15.52f, 11.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveTo(16.35f, 8.0f, 15.52f, 8.0f);
        b.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        b.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        b.close();
        b.moveTo(8.52f, 11.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveTo(9.35f, 8.0f, 8.52f, 8.0f);
        b.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        b.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        b.close();
        b.moveTo(12.02f, 17.5f);
        b.curveToRelative(2.33f, 0.0f, 4.31f, -1.46f, 5.11f, -3.5f);
        b.lineTo(6.91f, 14.0f);
        b.curveToRelative(0.8f, 2.04f, 2.78f, 3.5f, 5.11f, 3.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tagFaces = build;
        build.getClass();
        return build;
    }
}

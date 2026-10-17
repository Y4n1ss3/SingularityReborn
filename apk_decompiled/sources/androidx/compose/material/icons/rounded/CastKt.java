package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CastKt {
    private static ImageVector _cast;

    public static final ImageVector getCast(Icons.Rounded rounded) {
        ImageVector imageVector = _cast;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cast", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.0f, 3.0f, 3.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(2.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        i.lineTo(3.0f, 6.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        i.horizontalLineToRelative(-5.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(6.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(23.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.close();
        i.moveTo(2.14f, 14.09f);
        i.curveToRelative(-0.6f, -0.1f, -1.14f, 0.39f, -1.14f, 1.0f);
        i.curveToRelative(0.0f, 0.49f, 0.36f, 0.9f, 0.85f, 0.98f);
        i.curveToRelative(2.08f, 0.36f, 3.72f, 2.0f, 4.08f, 4.08f);
        i.curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f);
        i.curveToRelative(0.61f, 0.0f, 1.09f, -0.54f, 1.0f, -1.14f);
        i.curveToRelative(-0.48f, -2.96f, -2.82f, -5.29f, -5.77f, -5.77f);
        uo.C(i, 1.0f, 18.0f, 3.0f, 3.0f);
        i.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        i.close();
        i.moveTo(2.1f, 10.05f);
        i.curveToRelative(-0.59f, -0.05f, -1.1f, 0.41f, -1.1f, 1.0f);
        i.curveToRelative(0.0f, 0.51f, 0.38f, 0.94f, 0.88f, 0.99f);
        i.curveToRelative(4.27f, 0.41f, 7.67f, 3.81f, 8.08f, 8.08f);
        i.curveToRelative(0.05f, 0.5f, 0.48f, 0.87f, 0.99f, 0.87f);
        i.curveToRelative(0.6f, 0.0f, 1.06f, -0.52f, 1.0f, -1.11f);
        i.curveToRelative(-0.53f, -5.19f, -4.66f, -9.31f, -9.85f, -9.83f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cast = build;
        build.getClass();
        return build;
    }
}
